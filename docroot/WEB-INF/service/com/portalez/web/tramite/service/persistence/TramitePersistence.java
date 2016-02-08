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

import com.liferay.portal.service.persistence.BasePersistence;

import com.portalez.web.tramite.model.Tramite;

/**
 * The persistence interface for the tramite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza-Soloisolo
 * @see TramitePersistenceImpl
 * @see TramiteUtil
 * @generated
 */
public interface TramitePersistence extends BasePersistence<Tramite> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TramiteUtil} to access the tramite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tramites where apellido = &#63;.
	*
	* @param apellido the apellido
	* @return the matching tramites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portalez.web.tramite.model.Tramite> findByApellido(
		java.lang.String apellido)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tramites where apellido = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portalez.web.tramite.model.impl.TramiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param apellido the apellido
	* @param start the lower bound of the range of tramites
	* @param end the upper bound of the range of tramites (not inclusive)
	* @return the range of matching tramites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portalez.web.tramite.model.Tramite> findByApellido(
		java.lang.String apellido, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tramites where apellido = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portalez.web.tramite.model.impl.TramiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param apellido the apellido
	* @param start the lower bound of the range of tramites
	* @param end the upper bound of the range of tramites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tramites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portalez.web.tramite.model.Tramite> findByApellido(
		java.lang.String apellido, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite findByApellido_First(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException;

	/**
	* Returns the first tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tramite, or <code>null</code> if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite fetchByApellido_First(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite findByApellido_Last(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException;

	/**
	* Returns the last tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tramite, or <code>null</code> if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite fetchByApellido_Last(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tramites before and after the current tramite in the ordered set where apellido = &#63;.
	*
	* @param tramiteId the primary key of the current tramite
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite[] findByApellido_PrevAndNext(
		long tramiteId, java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException;

	/**
	* Removes all the tramites where apellido = &#63; from the database.
	*
	* @param apellido the apellido
	* @throws SystemException if a system exception occurred
	*/
	public void removeByApellido(java.lang.String apellido)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tramites where apellido = &#63;.
	*
	* @param apellido the apellido
	* @return the number of matching tramites
	* @throws SystemException if a system exception occurred
	*/
	public int countByApellido(java.lang.String apellido)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tramite in the entity cache if it is enabled.
	*
	* @param tramite the tramite
	*/
	public void cacheResult(com.portalez.web.tramite.model.Tramite tramite);

	/**
	* Caches the tramites in the entity cache if it is enabled.
	*
	* @param tramites the tramites
	*/
	public void cacheResult(
		java.util.List<com.portalez.web.tramite.model.Tramite> tramites);

	/**
	* Creates a new tramite with the primary key. Does not add the tramite to the database.
	*
	* @param tramiteId the primary key for the new tramite
	* @return the new tramite
	*/
	public com.portalez.web.tramite.model.Tramite create(long tramiteId);

	/**
	* Removes the tramite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tramiteId the primary key of the tramite
	* @return the tramite that was removed
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite remove(long tramiteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException;

	public com.portalez.web.tramite.model.Tramite updateImpl(
		com.portalez.web.tramite.model.Tramite tramite)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tramite with the primary key or throws a {@link com.portalez.web.tramite.NoSuchTramiteException} if it could not be found.
	*
	* @param tramiteId the primary key of the tramite
	* @return the tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite findByPrimaryKey(
		long tramiteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException;

	/**
	* Returns the tramite with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tramiteId the primary key of the tramite
	* @return the tramite, or <code>null</code> if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portalez.web.tramite.model.Tramite fetchByPrimaryKey(
		long tramiteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tramites.
	*
	* @return the tramites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portalez.web.tramite.model.Tramite> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tramites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portalez.web.tramite.model.impl.TramiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tramites
	* @param end the upper bound of the range of tramites (not inclusive)
	* @return the range of tramites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portalez.web.tramite.model.Tramite> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tramites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portalez.web.tramite.model.impl.TramiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tramites
	* @param end the upper bound of the range of tramites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tramites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portalez.web.tramite.model.Tramite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tramites from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tramites.
	*
	* @return the number of tramites
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}