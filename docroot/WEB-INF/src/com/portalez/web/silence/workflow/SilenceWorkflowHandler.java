package com.portalez.web.silence.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.security.permission.ResourceActionsUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.portalez.web.tramite.model.Tramite;
import com.portalez.web.tramite.service.TramiteLocalServiceUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class SilenceWorkflowHandler extends BaseWorkflowHandler {

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType(Locale locale) {
		return ResourceActionsUtil.getModelResource(locale, getClassName());
	}

    @Override
    public Object updateStatus(int status,
            Map<String, Serializable> workflowContext) throws PortalException,
            SystemException {

		long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		
		long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		
		Tramite tramite = TramiteLocalServiceUtil.getTramite(resourcePrimKey);
		tramite.setStatus(status);
		tramite.setStatusByUserId(userId);
		tramite.setStatusDate(new Date());
		
		tramite = TramiteLocalServiceUtil.updateTramite(tramite);
		
//		if (status == WorkflowConstants.STATUS_APPROVED) {
//			AssetEntryLocalServiceUtil.updateVisible(Tramite.class.getName(),
//					resourcePrimKey, true);
//		} else {
//			AssetEntryLocalServiceUtil.updateVisible(Tramite.class.getName(),
//					resourcePrimKey, false);
//		}
		
		return tramite;

    }

	public static final String CLASS_NAME = Tramite.class.getName();
}
