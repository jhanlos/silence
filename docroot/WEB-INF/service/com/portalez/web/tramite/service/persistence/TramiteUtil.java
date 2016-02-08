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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.portalez.web.tramite.model.Tramite;

import java.util.List;

/**
 * The persistence utility for the tramite service. This utility wraps {@link TramitePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza-Soloisolo
 * @see TramitePersistence
 * @see TramitePersistenceImpl
 * @generated
 */
public class TramiteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Tramite tramite) {
		getPersistence().clearCache(tramite);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tramite> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tramite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tramite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Tramite update(Tramite tramite) throws SystemException {
		return getPersistence().update(tramite);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Tramite update(Tramite tramite, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tramite, serviceContext);
	}

	/**
	* Returns all the tramites where apellido = &#63;.
	*
	* @param apellido the apellido
	* @return the matching tramites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.portalez.web.tramite.model.Tramite> findByApellido(
		java.lang.String apellido)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApellido(apellido);
	}

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
	public static java.util.List<com.portalez.web.tramite.model.Tramite> findByApellido(
		java.lang.String apellido, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApellido(apellido, start, end);
	}

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
	public static java.util.List<com.portalez.web.tramite.model.Tramite> findByApellido(
		java.lang.String apellido, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApellido(apellido, start, end, orderByComparator);
	}

	/**
	* Returns the first tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite findByApellido_First(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException {
		return getPersistence().findByApellido_First(apellido, orderByComparator);
	}

	/**
	* Returns the first tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tramite, or <code>null</code> if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite fetchByApellido_First(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByApellido_First(apellido, orderByComparator);
	}

	/**
	* Returns the last tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite findByApellido_Last(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException {
		return getPersistence().findByApellido_Last(apellido, orderByComparator);
	}

	/**
	* Returns the last tramite in the ordered set where apellido = &#63;.
	*
	* @param apellido the apellido
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tramite, or <code>null</code> if a matching tramite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite fetchByApellido_Last(
		java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByApellido_Last(apellido, orderByComparator);
	}

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
	public static com.portalez.web.tramite.model.Tramite[] findByApellido_PrevAndNext(
		long tramiteId, java.lang.String apellido,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException {
		return getPersistence()
				   .findByApellido_PrevAndNext(tramiteId, apellido,
			orderByComparator);
	}

	/**
	* Removes all the tramites where apellido = &#63; from the database.
	*
	* @param apellido the apellido
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByApellido(java.lang.String apellido)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByApellido(apellido);
	}

	/**
	* Returns the number of tramites where apellido = &#63;.
	*
	* @param apellido the apellido
	* @return the number of matching tramites
	* @throws SystemException if a system exception occurred
	*/
	public static int countByApellido(java.lang.String apellido)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByApellido(apellido);
	}

	/**
	* Caches the tramite in the entity cache if it is enabled.
	*
	* @param tramite the tramite
	*/
	public static void cacheResult(
		com.portalez.web.tramite.model.Tramite tramite) {
		getPersistence().cacheResult(tramite);
	}

	/**
	* Caches the tramites in the entity cache if it is enabled.
	*
	* @param tramites the tramites
	*/
	public static void cacheResult(
		java.util.List<com.portalez.web.tramite.model.Tramite> tramites) {
		getPersistence().cacheResult(tramites);
	}

	/**
	* Creates a new tramite with the primary key. Does not add the tramite to the database.
	*
	* @param tramiteId the primary key for the new tramite
	* @return the new tramite
	*/
	public static com.portalez.web.tramite.model.Tramite create(long tramiteId) {
		return getPersistence().create(tramiteId);
	}

	/**
	* Removes the tramite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tramiteId the primary key of the tramite
	* @return the tramite that was removed
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite remove(long tramiteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException {
		return getPersistence().remove(tramiteId);
	}

	public static com.portalez.web.tramite.model.Tramite updateImpl(
		com.portalez.web.tramite.model.Tramite tramite)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tramite);
	}

	/**
	* Returns the tramite with the primary key or throws a {@link com.portalez.web.tramite.NoSuchTramiteException} if it could not be found.
	*
	* @param tramiteId the primary key of the tramite
	* @return the tramite
	* @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite findByPrimaryKey(
		long tramiteId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portalez.web.tramite.NoSuchTramiteException {
		return getPersistence().findByPrimaryKey(tramiteId);
	}

	/**
	* Returns the tramite with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tramiteId the primary key of the tramite
	* @return the tramite, or <code>null</code> if a tramite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portalez.web.tramite.model.Tramite fetchByPrimaryKey(
		long tramiteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tramiteId);
	}

	/**
	* Returns all the tramites.
	*
	* @return the tramites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.portalez.web.tramite.model.Tramite> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.portalez.web.tramite.model.Tramite> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.portalez.web.tramite.model.Tramite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tramites from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tramites.
	*
	* @return the number of tramites
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TramitePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TramitePersistence)PortletBeanLocatorUtil.locate(com.portalez.web.tramite.service.ClpSerializer.getServletContextName(),
					TramitePersistence.class.getName());

			ReferenceRegistry.registerReference(TramiteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TramitePersistence persistence) {
	}

	private static TramitePersistence _persistence;
}