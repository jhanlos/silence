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

package com.portalez.web.tramite.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.portalez.web.tramite.service.http.TramiteServiceSoap}.
 *
 * @author Jorge Loayza-Soloisolo
 * @see com.portalez.web.tramite.service.http.TramiteServiceSoap
 * @generated
 */
public class TramiteSoap implements Serializable {
	public static TramiteSoap toSoapModel(Tramite model) {
		TramiteSoap soapModel = new TramiteSoap();

		soapModel.setTramiteId(model.getTramiteId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellido(model.getApellido());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static TramiteSoap[] toSoapModels(Tramite[] models) {
		TramiteSoap[] soapModels = new TramiteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TramiteSoap[][] toSoapModels(Tramite[][] models) {
		TramiteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TramiteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TramiteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TramiteSoap[] toSoapModels(List<Tramite> models) {
		List<TramiteSoap> soapModels = new ArrayList<TramiteSoap>(models.size());

		for (Tramite model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TramiteSoap[soapModels.size()]);
	}

	public TramiteSoap() {
	}

	public long getPrimaryKey() {
		return _tramiteId;
	}

	public void setPrimaryKey(long pk) {
		setTramiteId(pk);
	}

	public long getTramiteId() {
		return _tramiteId;
	}

	public void setTramiteId(long tramiteId) {
		_tramiteId = tramiteId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellido() {
		return _apellido;
	}

	public void setApellido(String apellido) {
		_apellido = apellido;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private long _tramiteId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _apellido;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
}