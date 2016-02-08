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

package com.portalez.web.tramite.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TramiteService}.
 *
 * @author Jorge Loayza-Soloisolo
 * @see TramiteService
 * @generated
 */
public class TramiteServiceWrapper implements TramiteService,
	ServiceWrapper<TramiteService> {
	public TramiteServiceWrapper(TramiteService tramiteService) {
		_tramiteService = tramiteService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tramiteService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tramiteService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tramiteService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TramiteService getWrappedTramiteService() {
		return _tramiteService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTramiteService(TramiteService tramiteService) {
		_tramiteService = tramiteService;
	}

	@Override
	public TramiteService getWrappedService() {
		return _tramiteService;
	}

	@Override
	public void setWrappedService(TramiteService tramiteService) {
		_tramiteService = tramiteService;
	}

	private TramiteService _tramiteService;
}