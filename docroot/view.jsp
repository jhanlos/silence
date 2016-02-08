
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.portalez.web.tramite.service.TramiteLocalServiceUtil"%>
<%@page import="com.portalez.web.tramite.model.Tramite"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%
	/**
	 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
	 *
	 * The contents of this file are subject to the terms of the Liferay Enterprise
	 * Subscription License ("License"). You may not use this file except in
	 * compliance with the License. You can obtain a copy of the License by
	 * contacting Liferay, Inc. See the License for the specific language governing
	 * permissions and limitations under the License, including but not limited to
	 * distribution rights of the Software.
	 *
	 *
	 *
	 */
%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="submitTramite"
	windowState="<%=LiferayWindowState.NORMAL.toString()%>" name="submitTramite">
</portlet:actionURL>

<a href="<portlet:renderURL />">&laquo;Home</a>

<div class="separator"></div>

<fieldset>
	<legend>Tramite Form</legend>
	<c:if
		test='<%=SessionMessages.contains(
						renderRequest.getPortletSession(),
						"tramite-submit-success")%>'>
		<liferay-ui:success key="feedback-submit-success"
			message="Tramite has been submited successfully." />
	</c:if>
	<c:if
		test='<%=SessionMessages.contains(
						renderRequest.getPortletSession(),
						"workflow-not-enabled")%>'>
		<liferay-ui:success key="workflow-not-enabled"
			message="Tramite not enabled with workflow please enable workflow." />
	</c:if>
	
	<c:if
		test='<%=SessionErrors.contains(
						renderRequest.getPortletSession(),
						"tramite-submit-failed")%>'>
		<liferay-ui:success key="feedback-submit-failed"
			message="There is problem of submit tramite please try again.." />
	</c:if>
	<aui:form action="<%=submitTramite%>" method="post" name="tramiteForm">
		<aui:layout>
			<aui:column>
				<aui:input label="Tramite Nombre" name="nombre"
					id="tramiteNombre" type="text" style="width:600px;height:20px;">
					<aui:validator name="required" />
				</aui:input>
			</aui:column>
		</aui:layout>

		<aui:layout>
			<aui:input name="apellido" id="apellido"
				label="Tramite Apellido" type="textarea"
				style="width:600px;height:100px;">
				<aui:validator name="required" />
			</aui:input>
			<span style="float: left;">Characters Left&nbsp;</span>
			<p id="<portlet:namespace/>textCounter"></p>
		</aui:layout>
		<aui:layout>
			<aui:column>
&nbsp;
</aui:column>
		</aui:layout>
		<aui:layout>
			<aui:column>
				<aui:button type="submit" value="Submit Tramite" name="submit"></aui:button>
			</aui:column>
		</aui:layout>
	</aui:form>
</fieldset>
<aui:script>
	AUI().use('aui-char-counter', function(A) {
		new A.CharCounter({
			counter : '#<portlet:namespace/>textCounter',
			input : '#<portlet:namespace/>apellido',
			maxLength : 75,
			on : {
				maxLength : function(event) {
					alert('The max length limit was reached');
				}
			}
		});
	});
</aui:script>


<div class="separator"></div>

<fieldset>	

<liferay-portlet:renderURL varImpl="iteratorURL" />

<liferay-ui:search-container emptyResultsMessage="there-are-no-students"
headerNames="Nombre, Apellido, Stauts" iteratorURL="<%=iteratorURL %>" delta="10" deltaConfigurable="true">

		<liferay-ui:search-container-results>
			<%
				List<Tramite> tramiteList = TramiteLocalServiceUtil.getTramites(-1, -1);
						results = ListUtil.subList(tramiteList,
								searchContainer.getStart(),
								searchContainer.getEnd());
						searchContainer.setTotal(tramiteList.size());
						searchContainer.setResults(results);
			%>
		</liferay-ui:search-container-results>
		
		<liferay-ui:search-container-row className="Tramite" keyProperty="tramiteId" modelVar="currentTramite">
			<liferay-ui:search-container-column-text name="Nombre" property="nombre" />
			<liferay-ui:search-container-column-text name="Apellido" property="apellido" />
			<liferay-ui:search-container-column-text name="status" property="status" />
			
		</liferay-ui:search-container-row>
		
		<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		
</liferay-ui:search-container>

</fieldset>
