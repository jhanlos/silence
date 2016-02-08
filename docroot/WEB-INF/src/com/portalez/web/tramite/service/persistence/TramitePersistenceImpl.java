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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.portalez.web.tramite.NoSuchTramiteException;
import com.portalez.web.tramite.model.Tramite;
import com.portalez.web.tramite.model.impl.TramiteImpl;
import com.portalez.web.tramite.model.impl.TramiteModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tramite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jorge Loayza-Soloisolo
 * @see TramitePersistence
 * @see TramiteUtil
 * @generated
 */
public class TramitePersistenceImpl extends BasePersistenceImpl<Tramite>
	implements TramitePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TramiteUtil} to access the tramite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TramiteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteModelImpl.FINDER_CACHE_ENABLED, TramiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteModelImpl.FINDER_CACHE_ENABLED, TramiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APELLIDO = new FinderPath(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteModelImpl.FINDER_CACHE_ENABLED, TramiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApellido",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APELLIDO =
		new FinderPath(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteModelImpl.FINDER_CACHE_ENABLED, TramiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApellido",
			new String[] { String.class.getName() },
			TramiteModelImpl.APELLIDO_COLUMN_BITMASK |
			TramiteModelImpl.NOMBRE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APELLIDO = new FinderPath(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApellido",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tramites where apellido = &#63;.
	 *
	 * @param apellido the apellido
	 * @return the matching tramites
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tramite> findByApellido(String apellido)
		throws SystemException {
		return findByApellido(apellido, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Tramite> findByApellido(String apellido, int start, int end)
		throws SystemException {
		return findByApellido(apellido, start, end, null);
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
	@Override
	public List<Tramite> findByApellido(String apellido, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APELLIDO;
			finderArgs = new Object[] { apellido };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APELLIDO;
			finderArgs = new Object[] { apellido, start, end, orderByComparator };
		}

		List<Tramite> list = (List<Tramite>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Tramite tramite : list) {
				if (!Validator.equals(apellido, tramite.getApellido())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TRAMITE_WHERE);

			boolean bindApellido = false;

			if (apellido == null) {
				query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_1);
			}
			else if (apellido.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_3);
			}
			else {
				bindApellido = true;

				query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TramiteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApellido) {
					qPos.add(apellido);
				}

				if (!pagination) {
					list = (List<Tramite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Tramite>(list);
				}
				else {
					list = (List<Tramite>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Tramite findByApellido_First(String apellido,
		OrderByComparator orderByComparator)
		throws NoSuchTramiteException, SystemException {
		Tramite tramite = fetchByApellido_First(apellido, orderByComparator);

		if (tramite != null) {
			return tramite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("apellido=");
		msg.append(apellido);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramiteException(msg.toString());
	}

	/**
	 * Returns the first tramite in the ordered set where apellido = &#63;.
	 *
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tramite, or <code>null</code> if a matching tramite could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite fetchByApellido_First(String apellido,
		OrderByComparator orderByComparator) throws SystemException {
		List<Tramite> list = findByApellido(apellido, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tramite findByApellido_Last(String apellido,
		OrderByComparator orderByComparator)
		throws NoSuchTramiteException, SystemException {
		Tramite tramite = fetchByApellido_Last(apellido, orderByComparator);

		if (tramite != null) {
			return tramite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("apellido=");
		msg.append(apellido);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTramiteException(msg.toString());
	}

	/**
	 * Returns the last tramite in the ordered set where apellido = &#63;.
	 *
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tramite, or <code>null</code> if a matching tramite could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite fetchByApellido_Last(String apellido,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByApellido(apellido);

		if (count == 0) {
			return null;
		}

		List<Tramite> list = findByApellido(apellido, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tramite[] findByApellido_PrevAndNext(long tramiteId,
		String apellido, OrderByComparator orderByComparator)
		throws NoSuchTramiteException, SystemException {
		Tramite tramite = findByPrimaryKey(tramiteId);

		Session session = null;

		try {
			session = openSession();

			Tramite[] array = new TramiteImpl[3];

			array[0] = getByApellido_PrevAndNext(session, tramite, apellido,
					orderByComparator, true);

			array[1] = tramite;

			array[2] = getByApellido_PrevAndNext(session, tramite, apellido,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tramite getByApellido_PrevAndNext(Session session,
		Tramite tramite, String apellido, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRAMITE_WHERE);

		boolean bindApellido = false;

		if (apellido == null) {
			query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_1);
		}
		else if (apellido.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_3);
		}
		else {
			bindApellido = true;

			query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TramiteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApellido) {
			qPos.add(apellido);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tramite);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tramite> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tramites where apellido = &#63; from the database.
	 *
	 * @param apellido the apellido
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByApellido(String apellido) throws SystemException {
		for (Tramite tramite : findByApellido(apellido, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tramite);
		}
	}

	/**
	 * Returns the number of tramites where apellido = &#63;.
	 *
	 * @param apellido the apellido
	 * @return the number of matching tramites
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByApellido(String apellido) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APELLIDO;

		Object[] finderArgs = new Object[] { apellido };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRAMITE_WHERE);

			boolean bindApellido = false;

			if (apellido == null) {
				query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_1);
			}
			else if (apellido.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_3);
			}
			else {
				bindApellido = true;

				query.append(_FINDER_COLUMN_APELLIDO_APELLIDO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApellido) {
					qPos.add(apellido);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_APELLIDO_APELLIDO_1 = "tramite.apellido IS NULL";
	private static final String _FINDER_COLUMN_APELLIDO_APELLIDO_2 = "tramite.apellido = ?";
	private static final String _FINDER_COLUMN_APELLIDO_APELLIDO_3 = "(tramite.apellido IS NULL OR tramite.apellido = '')";

	public TramitePersistenceImpl() {
		setModelClass(Tramite.class);
	}

	/**
	 * Caches the tramite in the entity cache if it is enabled.
	 *
	 * @param tramite the tramite
	 */
	@Override
	public void cacheResult(Tramite tramite) {
		EntityCacheUtil.putResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteImpl.class, tramite.getPrimaryKey(), tramite);

		tramite.resetOriginalValues();
	}

	/**
	 * Caches the tramites in the entity cache if it is enabled.
	 *
	 * @param tramites the tramites
	 */
	@Override
	public void cacheResult(List<Tramite> tramites) {
		for (Tramite tramite : tramites) {
			if (EntityCacheUtil.getResult(
						TramiteModelImpl.ENTITY_CACHE_ENABLED,
						TramiteImpl.class, tramite.getPrimaryKey()) == null) {
				cacheResult(tramite);
			}
			else {
				tramite.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tramites.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TramiteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TramiteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tramite.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tramite tramite) {
		EntityCacheUtil.removeResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteImpl.class, tramite.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Tramite> tramites) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Tramite tramite : tramites) {
			EntityCacheUtil.removeResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
				TramiteImpl.class, tramite.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tramite with the primary key. Does not add the tramite to the database.
	 *
	 * @param tramiteId the primary key for the new tramite
	 * @return the new tramite
	 */
	@Override
	public Tramite create(long tramiteId) {
		Tramite tramite = new TramiteImpl();

		tramite.setNew(true);
		tramite.setPrimaryKey(tramiteId);

		return tramite;
	}

	/**
	 * Removes the tramite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tramiteId the primary key of the tramite
	 * @return the tramite that was removed
	 * @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite remove(long tramiteId)
		throws NoSuchTramiteException, SystemException {
		return remove((Serializable)tramiteId);
	}

	/**
	 * Removes the tramite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tramite
	 * @return the tramite that was removed
	 * @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite remove(Serializable primaryKey)
		throws NoSuchTramiteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Tramite tramite = (Tramite)session.get(TramiteImpl.class, primaryKey);

			if (tramite == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTramiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tramite);
		}
		catch (NoSuchTramiteException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Tramite removeImpl(Tramite tramite) throws SystemException {
		tramite = toUnwrappedModel(tramite);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tramite)) {
				tramite = (Tramite)session.get(TramiteImpl.class,
						tramite.getPrimaryKeyObj());
			}

			if (tramite != null) {
				session.delete(tramite);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tramite != null) {
			clearCache(tramite);
		}

		return tramite;
	}

	@Override
	public Tramite updateImpl(com.portalez.web.tramite.model.Tramite tramite)
		throws SystemException {
		tramite = toUnwrappedModel(tramite);

		boolean isNew = tramite.isNew();

		TramiteModelImpl tramiteModelImpl = (TramiteModelImpl)tramite;

		Session session = null;

		try {
			session = openSession();

			if (tramite.isNew()) {
				session.save(tramite);

				tramite.setNew(false);
			}
			else {
				session.merge(tramite);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TramiteModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tramiteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APELLIDO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tramiteModelImpl.getOriginalApellido()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APELLIDO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APELLIDO,
					args);

				args = new Object[] { tramiteModelImpl.getApellido() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APELLIDO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APELLIDO,
					args);
			}
		}

		EntityCacheUtil.putResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
			TramiteImpl.class, tramite.getPrimaryKey(), tramite);

		return tramite;
	}

	protected Tramite toUnwrappedModel(Tramite tramite) {
		if (tramite instanceof TramiteImpl) {
			return tramite;
		}

		TramiteImpl tramiteImpl = new TramiteImpl();

		tramiteImpl.setNew(tramite.isNew());
		tramiteImpl.setPrimaryKey(tramite.getPrimaryKey());

		tramiteImpl.setTramiteId(tramite.getTramiteId());
		tramiteImpl.setGroupId(tramite.getGroupId());
		tramiteImpl.setCompanyId(tramite.getCompanyId());
		tramiteImpl.setUserId(tramite.getUserId());
		tramiteImpl.setUserName(tramite.getUserName());
		tramiteImpl.setCreateDate(tramite.getCreateDate());
		tramiteImpl.setModifiedDate(tramite.getModifiedDate());
		tramiteImpl.setNombre(tramite.getNombre());
		tramiteImpl.setApellido(tramite.getApellido());
		tramiteImpl.setStatus(tramite.getStatus());
		tramiteImpl.setStatusByUserId(tramite.getStatusByUserId());
		tramiteImpl.setStatusByUserName(tramite.getStatusByUserName());
		tramiteImpl.setStatusDate(tramite.getStatusDate());

		return tramiteImpl;
	}

	/**
	 * Returns the tramite with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tramite
	 * @return the tramite
	 * @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTramiteException, SystemException {
		Tramite tramite = fetchByPrimaryKey(primaryKey);

		if (tramite == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTramiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tramite;
	}

	/**
	 * Returns the tramite with the primary key or throws a {@link com.portalez.web.tramite.NoSuchTramiteException} if it could not be found.
	 *
	 * @param tramiteId the primary key of the tramite
	 * @return the tramite
	 * @throws com.portalez.web.tramite.NoSuchTramiteException if a tramite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite findByPrimaryKey(long tramiteId)
		throws NoSuchTramiteException, SystemException {
		return findByPrimaryKey((Serializable)tramiteId);
	}

	/**
	 * Returns the tramite with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tramite
	 * @return the tramite, or <code>null</code> if a tramite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Tramite tramite = (Tramite)EntityCacheUtil.getResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
				TramiteImpl.class, primaryKey);

		if (tramite == _nullTramite) {
			return null;
		}

		if (tramite == null) {
			Session session = null;

			try {
				session = openSession();

				tramite = (Tramite)session.get(TramiteImpl.class, primaryKey);

				if (tramite != null) {
					cacheResult(tramite);
				}
				else {
					EntityCacheUtil.putResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
						TramiteImpl.class, primaryKey, _nullTramite);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TramiteModelImpl.ENTITY_CACHE_ENABLED,
					TramiteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tramite;
	}

	/**
	 * Returns the tramite with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tramiteId the primary key of the tramite
	 * @return the tramite, or <code>null</code> if a tramite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Tramite fetchByPrimaryKey(long tramiteId) throws SystemException {
		return fetchByPrimaryKey((Serializable)tramiteId);
	}

	/**
	 * Returns all the tramites.
	 *
	 * @return the tramites
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Tramite> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Tramite> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Tramite> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Tramite> list = (List<Tramite>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRAMITE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRAMITE;

				if (pagination) {
					sql = sql.concat(TramiteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Tramite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Tramite>(list);
				}
				else {
					list = (List<Tramite>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tramites from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Tramite tramite : findAll()) {
			remove(tramite);
		}
	}

	/**
	 * Returns the number of tramites.
	 *
	 * @return the number of tramites
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRAMITE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the tramite persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.portalez.web.tramite.model.Tramite")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Tramite>> listenersList = new ArrayList<ModelListener<Tramite>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Tramite>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TramiteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TRAMITE = "SELECT tramite FROM Tramite tramite";
	private static final String _SQL_SELECT_TRAMITE_WHERE = "SELECT tramite FROM Tramite tramite WHERE ";
	private static final String _SQL_COUNT_TRAMITE = "SELECT COUNT(tramite) FROM Tramite tramite";
	private static final String _SQL_COUNT_TRAMITE_WHERE = "SELECT COUNT(tramite) FROM Tramite tramite WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tramite.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tramite exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tramite exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TramitePersistenceImpl.class);
	private static Tramite _nullTramite = new TramiteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Tramite> toCacheModel() {
				return _nullTramiteCacheModel;
			}
		};

	private static CacheModel<Tramite> _nullTramiteCacheModel = new CacheModel<Tramite>() {
			@Override
			public Tramite toEntityModel() {
				return _nullTramite;
			}
		};
}