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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Tramite}.
 * </p>
 *
 * @author Jorge Loayza-Soloisolo
 * @see Tramite
 * @generated
 */
public class TramiteWrapper implements Tramite, ModelWrapper<Tramite> {
	public TramiteWrapper(Tramite tramite) {
		_tramite = tramite;
	}

	@Override
	public Class<?> getModelClass() {
		return Tramite.class;
	}

	@Override
	public String getModelClassName() {
		return Tramite.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tramiteId", getTramiteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("apellido", getApellido());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tramiteId = (Long)attributes.get("tramiteId");

		if (tramiteId != null) {
			setTramiteId(tramiteId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellido = (String)attributes.get("apellido");

		if (apellido != null) {
			setApellido(apellido);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	* Returns the primary key of this tramite.
	*
	* @return the primary key of this tramite
	*/
	@Override
	public long getPrimaryKey() {
		return _tramite.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tramite.
	*
	* @param primaryKey the primary key of this tramite
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tramite.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tramite ID of this tramite.
	*
	* @return the tramite ID of this tramite
	*/
	@Override
	public long getTramiteId() {
		return _tramite.getTramiteId();
	}

	/**
	* Sets the tramite ID of this tramite.
	*
	* @param tramiteId the tramite ID of this tramite
	*/
	@Override
	public void setTramiteId(long tramiteId) {
		_tramite.setTramiteId(tramiteId);
	}

	/**
	* Returns the group ID of this tramite.
	*
	* @return the group ID of this tramite
	*/
	@Override
	public long getGroupId() {
		return _tramite.getGroupId();
	}

	/**
	* Sets the group ID of this tramite.
	*
	* @param groupId the group ID of this tramite
	*/
	@Override
	public void setGroupId(long groupId) {
		_tramite.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tramite.
	*
	* @return the company ID of this tramite
	*/
	@Override
	public long getCompanyId() {
		return _tramite.getCompanyId();
	}

	/**
	* Sets the company ID of this tramite.
	*
	* @param companyId the company ID of this tramite
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tramite.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tramite.
	*
	* @return the user ID of this tramite
	*/
	@Override
	public long getUserId() {
		return _tramite.getUserId();
	}

	/**
	* Sets the user ID of this tramite.
	*
	* @param userId the user ID of this tramite
	*/
	@Override
	public void setUserId(long userId) {
		_tramite.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tramite.
	*
	* @return the user uuid of this tramite
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramite.getUserUuid();
	}

	/**
	* Sets the user uuid of this tramite.
	*
	* @param userUuid the user uuid of this tramite
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tramite.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tramite.
	*
	* @return the user name of this tramite
	*/
	@Override
	public java.lang.String getUserName() {
		return _tramite.getUserName();
	}

	/**
	* Sets the user name of this tramite.
	*
	* @param userName the user name of this tramite
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tramite.setUserName(userName);
	}

	/**
	* Returns the create date of this tramite.
	*
	* @return the create date of this tramite
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _tramite.getCreateDate();
	}

	/**
	* Sets the create date of this tramite.
	*
	* @param createDate the create date of this tramite
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_tramite.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tramite.
	*
	* @return the modified date of this tramite
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _tramite.getModifiedDate();
	}

	/**
	* Sets the modified date of this tramite.
	*
	* @param modifiedDate the modified date of this tramite
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_tramite.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the nombre of this tramite.
	*
	* @return the nombre of this tramite
	*/
	@Override
	public java.lang.String getNombre() {
		return _tramite.getNombre();
	}

	/**
	* Sets the nombre of this tramite.
	*
	* @param nombre the nombre of this tramite
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_tramite.setNombre(nombre);
	}

	/**
	* Returns the apellido of this tramite.
	*
	* @return the apellido of this tramite
	*/
	@Override
	public java.lang.String getApellido() {
		return _tramite.getApellido();
	}

	/**
	* Sets the apellido of this tramite.
	*
	* @param apellido the apellido of this tramite
	*/
	@Override
	public void setApellido(java.lang.String apellido) {
		_tramite.setApellido(apellido);
	}

	/**
	* Returns the status of this tramite.
	*
	* @return the status of this tramite
	*/
	@Override
	public int getStatus() {
		return _tramite.getStatus();
	}

	/**
	* Sets the status of this tramite.
	*
	* @param status the status of this tramite
	*/
	@Override
	public void setStatus(int status) {
		_tramite.setStatus(status);
	}

	/**
	* Returns the status by user ID of this tramite.
	*
	* @return the status by user ID of this tramite
	*/
	@Override
	public long getStatusByUserId() {
		return _tramite.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this tramite.
	*
	* @param statusByUserId the status by user ID of this tramite
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_tramite.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this tramite.
	*
	* @return the status by user uuid of this tramite
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tramite.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this tramite.
	*
	* @param statusByUserUuid the status by user uuid of this tramite
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_tramite.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this tramite.
	*
	* @return the status by user name of this tramite
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _tramite.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this tramite.
	*
	* @param statusByUserName the status by user name of this tramite
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_tramite.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this tramite.
	*
	* @return the status date of this tramite
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _tramite.getStatusDate();
	}

	/**
	* Sets the status date of this tramite.
	*
	* @param statusDate the status date of this tramite
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_tramite.setStatusDate(statusDate);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _tramite.getApproved();
	}

	/**
	* Returns <code>true</code> if this tramite is approved.
	*
	* @return <code>true</code> if this tramite is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _tramite.isApproved();
	}

	/**
	* Returns <code>true</code> if this tramite is denied.
	*
	* @return <code>true</code> if this tramite is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _tramite.isDenied();
	}

	/**
	* Returns <code>true</code> if this tramite is a draft.
	*
	* @return <code>true</code> if this tramite is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _tramite.isDraft();
	}

	/**
	* Returns <code>true</code> if this tramite is expired.
	*
	* @return <code>true</code> if this tramite is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _tramite.isExpired();
	}

	/**
	* Returns <code>true</code> if this tramite is inactive.
	*
	* @return <code>true</code> if this tramite is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _tramite.isInactive();
	}

	/**
	* Returns <code>true</code> if this tramite is incomplete.
	*
	* @return <code>true</code> if this tramite is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _tramite.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this tramite is pending.
	*
	* @return <code>true</code> if this tramite is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _tramite.isPending();
	}

	/**
	* Returns <code>true</code> if this tramite is scheduled.
	*
	* @return <code>true</code> if this tramite is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _tramite.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _tramite.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tramite.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tramite.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tramite.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tramite.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tramite.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tramite.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tramite.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tramite.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tramite.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tramite.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TramiteWrapper((Tramite)_tramite.clone());
	}

	@Override
	public int compareTo(com.portalez.web.tramite.model.Tramite tramite) {
		return _tramite.compareTo(tramite);
	}

	@Override
	public int hashCode() {
		return _tramite.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.portalez.web.tramite.model.Tramite> toCacheModel() {
		return _tramite.toCacheModel();
	}

	@Override
	public com.portalez.web.tramite.model.Tramite toEscapedModel() {
		return new TramiteWrapper(_tramite.toEscapedModel());
	}

	@Override
	public com.portalez.web.tramite.model.Tramite toUnescapedModel() {
		return new TramiteWrapper(_tramite.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tramite.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tramite.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tramite.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TramiteWrapper)) {
			return false;
		}

		TramiteWrapper tramiteWrapper = (TramiteWrapper)obj;

		if (Validator.equals(_tramite, tramiteWrapper._tramite)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Tramite getWrappedTramite() {
		return _tramite;
	}

	@Override
	public Tramite getWrappedModel() {
		return _tramite;
	}

	@Override
	public void resetOriginalValues() {
		_tramite.resetOriginalValues();
	}

	private Tramite _tramite;
}