package com.portalez.web.silence.portlet;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.portalez.web.tramite.model.Tramite;
import com.portalez.web.tramite.service.TramiteLocalServiceUtil;

import java.io.IOException;
import java.util.Date;

import javax.mail.internet.AddressException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class SilenceViewPortlet extends MVCPortlet {

	
	public void submitTramite(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			AddressException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		
		String nombre = ParamUtil.getString(actionRequest,
				"nombre");
		
		String apellido = ParamUtil.getString(actionRequest,
				"apellido");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Tramite.class.getName(), actionRequest);
		
		try {
			Tramite tramite = TramiteLocalServiceUtil
					.createTramite(CounterLocalServiceUtil.increment());
			
			tramite.setCompanyId(themeDisplay.getCompanyId());
			tramite.setGroupId(themeDisplay.getScopeGroupId());
			
			tramite.setNombre(nombre);
			tramite.setApellido(apellido);
			
			tramite.setStatus(WorkflowConstants.STATUS_DRAFT);
			tramite.setUserId(themeDisplay.getUserId());
			tramite.setStatusByUserId(themeDisplay.getUserId());
			tramite.setStatusDate(new Date());
			
			tramite = TramiteLocalServiceUtil.addTramite(tramite);
			
			WorkflowDefinitionLink workflowDefinitionLink = null;
			
			try {
				
				workflowDefinitionLink = WorkflowDefinitionLinkLocalServiceUtil
						.getDefaultWorkflowDefinitionLink(
								themeDisplay.getCompanyId(),
								Tramite.class.getName(), 0, 0);
				
			} catch (Exception e) {
				if (e instanceof NoSuchWorkflowDefinitionLinkException) {
					SessionMessages.add(actionRequest.getPortletSession(),
							"workflow-not-enabled");
				}
				e.printStackTrace();
			}
			// checking workflow defintion is enabled to tramite asset or not
			if (tramite != null && workflowDefinitionLink != null) {
				// add feedback asset in asset entry table
//				AssetEntryLocalServiceUtil.updateEntry(
//						themeDisplay.getUserId(), tramite.getGroupId(),
//						Feedback.class.getName(), tramite.getFeedbackId(),
//						serviceContext.getAssetCategoryIds(),
//						serviceContext.getAssetTagNames());
				// start workflow instance to tramite.
				WorkflowHandlerRegistryUtil.startWorkflowInstance(
						tramite.getCompanyId(), tramite.getGroupId(),
						themeDisplay.getUserId(), Tramite.class.getName(),
						tramite.getPrimaryKey(), tramite, serviceContext);
			}
			
			if (tramite == null) {
				SessionErrors.add(actionRequest.getPortletSession(),
						"tramite-submit-failed");
			} else {
				SessionMessages.add(actionRequest.getPortletSession(),
						"tramite-submit-success");
			}
		} catch (Exception e) {
			if (e instanceof NoSuchWorkflowDefinitionLinkException) {
				SessionMessages.add(actionRequest.getPortletSession(),
						"workflow-not-enabled");
			}
			e.printStackTrace();
		}
		//actionResponse.setRenderParameter("mvcPath","/html/workflow/feedback.jsp");
	}

}
