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

package com.portalez.web.tramite.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.portalez.web.tramite.model.Tramite;
import com.portalez.web.tramite.service.TramiteLocalServiceUtil;

/**
 * @author Jorge Loayza-Soloisolo
 * @generated
 */
public abstract class TramiteActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public TramiteActionableDynamicQuery() throws SystemException {
		setBaseLocalService(TramiteLocalServiceUtil.getService());
		setClass(Tramite.class);

		setClassLoader(com.portalez.web.tramite.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("tramiteId");
	}
}