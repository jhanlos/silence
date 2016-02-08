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

package com.portalez.web.tramite.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.portalez.web.tramite.model.Tramite;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tramite in entity cache.
 *
 * @author Jorge Loayza-Soloisolo
 * @see Tramite
 * @generated
 */
public class TramiteCacheModel implements CacheModel<Tramite>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{tramiteId=");
		sb.append(tramiteId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellido=");
		sb.append(apellido);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tramite toEntityModel() {
		TramiteImpl tramiteImpl = new TramiteImpl();

		tramiteImpl.setTramiteId(tramiteId);
		tramiteImpl.setGroupId(groupId);
		tramiteImpl.setCompanyId(companyId);
		tramiteImpl.setUserId(userId);

		if (userName == null) {
			tramiteImpl.setUserName(StringPool.BLANK);
		}
		else {
			tramiteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tramiteImpl.setCreateDate(null);
		}
		else {
			tramiteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tramiteImpl.setModifiedDate(null);
		}
		else {
			tramiteImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			tramiteImpl.setNombre(StringPool.BLANK);
		}
		else {
			tramiteImpl.setNombre(nombre);
		}

		if (apellido == null) {
			tramiteImpl.setApellido(StringPool.BLANK);
		}
		else {
			tramiteImpl.setApellido(apellido);
		}

		tramiteImpl.setStatus(status);
		tramiteImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			tramiteImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			tramiteImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			tramiteImpl.setStatusDate(null);
		}
		else {
			tramiteImpl.setStatusDate(new Date(statusDate));
		}

		tramiteImpl.resetOriginalValues();

		return tramiteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tramiteId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
		apellido = objectInput.readUTF();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tramiteId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellido == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(apellido);
		}

		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public long tramiteId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
	public String apellido;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
}