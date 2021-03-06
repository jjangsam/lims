/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.marcelmika.lims.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.marcelmika.lims.model.OpenedConversation;

import java.util.List;

/**
 * The persistence utility for the opened conversation service. This utility wraps {@link OpenedConversationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OpenedConversationPersistence
 * @see OpenedConversationPersistenceImpl
 * @generated
 */
public class OpenedConversationUtil {
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
	public static void clearCache(OpenedConversation openedConversation) {
		getPersistence().clearCache(openedConversation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OpenedConversation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OpenedConversation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OpenedConversation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static OpenedConversation update(
		OpenedConversation openedConversation, boolean merge)
		throws SystemException {
		return getPersistence().update(openedConversation, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static OpenedConversation update(
		OpenedConversation openedConversation, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(openedConversation, merge, serviceContext);
	}

	/**
	* Caches the opened conversation in the entity cache if it is enabled.
	*
	* @param openedConversation the opened conversation
	*/
	public static void cacheResult(
		com.marcelmika.lims.model.OpenedConversation openedConversation) {
		getPersistence().cacheResult(openedConversation);
	}

	/**
	* Caches the opened conversations in the entity cache if it is enabled.
	*
	* @param openedConversations the opened conversations
	*/
	public static void cacheResult(
		java.util.List<com.marcelmika.lims.model.OpenedConversation> openedConversations) {
		getPersistence().cacheResult(openedConversations);
	}

	/**
	* Creates a new opened conversation with the primary key. Does not add the opened conversation to the database.
	*
	* @param ocid the primary key for the new opened conversation
	* @return the new opened conversation
	*/
	public static com.marcelmika.lims.model.OpenedConversation create(long ocid) {
		return getPersistence().create(ocid);
	}

	/**
	* Removes the opened conversation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ocid the primary key of the opened conversation
	* @return the opened conversation that was removed
	* @throws com.marcelmika.lims.NoSuchOpenedConversationException if a opened conversation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation remove(long ocid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence().remove(ocid);
	}

	public static com.marcelmika.lims.model.OpenedConversation updateImpl(
		com.marcelmika.lims.model.OpenedConversation openedConversation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(openedConversation, merge);
	}

	/**
	* Returns the opened conversation with the primary key or throws a {@link com.marcelmika.lims.NoSuchOpenedConversationException} if it could not be found.
	*
	* @param ocid the primary key of the opened conversation
	* @return the opened conversation
	* @throws com.marcelmika.lims.NoSuchOpenedConversationException if a opened conversation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation findByPrimaryKey(
		long ocid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence().findByPrimaryKey(ocid);
	}

	/**
	* Returns the opened conversation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ocid the primary key of the opened conversation
	* @return the opened conversation, or <code>null</code> if a opened conversation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation fetchByPrimaryKey(
		long ocid) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ocid);
	}

	/**
	* Returns the opened conversation where userId = &#63; and conversationId = &#63; or throws a {@link com.marcelmika.lims.NoSuchOpenedConversationException} if it could not be found.
	*
	* @param userId the user ID
	* @param conversationId the conversation ID
	* @return the matching opened conversation
	* @throws com.marcelmika.lims.NoSuchOpenedConversationException if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation findByUserId_ConversationId(
		long userId, java.lang.String conversationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence()
				   .findByUserId_ConversationId(userId, conversationId);
	}

	/**
	* Returns the opened conversation where userId = &#63; and conversationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param conversationId the conversation ID
	* @return the matching opened conversation, or <code>null</code> if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation fetchByUserId_ConversationId(
		long userId, java.lang.String conversationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserId_ConversationId(userId, conversationId);
	}

	/**
	* Returns the opened conversation where userId = &#63; and conversationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param conversationId the conversation ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching opened conversation, or <code>null</code> if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation fetchByUserId_ConversationId(
		long userId, java.lang.String conversationId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserId_ConversationId(userId, conversationId,
			retrieveFromCache);
	}

	/**
	* Returns all the opened conversations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.OpenedConversation> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the opened conversations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of opened conversations
	* @param end the upper bound of the range of opened conversations (not inclusive)
	* @return the range of matching opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.OpenedConversation> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the opened conversations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of opened conversations
	* @param end the upper bound of the range of opened conversations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.OpenedConversation> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first opened conversation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching opened conversation
	* @throws com.marcelmika.lims.NoSuchOpenedConversationException if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first opened conversation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching opened conversation, or <code>null</code> if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last opened conversation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching opened conversation
	* @throws com.marcelmika.lims.NoSuchOpenedConversationException if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last opened conversation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching opened conversation, or <code>null</code> if a matching opened conversation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the opened conversations before and after the current opened conversation in the ordered set where userId = &#63;.
	*
	* @param ocid the primary key of the current opened conversation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next opened conversation
	* @throws com.marcelmika.lims.NoSuchOpenedConversationException if a opened conversation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation[] findByUserId_PrevAndNext(
		long ocid, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(ocid, userId, orderByComparator);
	}

	/**
	* Returns all the opened conversations.
	*
	* @return the opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.OpenedConversation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the opened conversations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of opened conversations
	* @param end the upper bound of the range of opened conversations (not inclusive)
	* @return the range of opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.OpenedConversation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the opened conversations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of opened conversations
	* @param end the upper bound of the range of opened conversations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.OpenedConversation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the opened conversation where userId = &#63; and conversationId = &#63; from the database.
	*
	* @param userId the user ID
	* @param conversationId the conversation ID
	* @return the opened conversation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.OpenedConversation removeByUserId_ConversationId(
		long userId, java.lang.String conversationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchOpenedConversationException {
		return getPersistence()
				   .removeByUserId_ConversationId(userId, conversationId);
	}

	/**
	* Removes all the opened conversations where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes all the opened conversations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of opened conversations where userId = &#63; and conversationId = &#63;.
	*
	* @param userId the user ID
	* @param conversationId the conversation ID
	* @return the number of matching opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId_ConversationId(long userId,
		java.lang.String conversationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByUserId_ConversationId(userId, conversationId);
	}

	/**
	* Returns the number of opened conversations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the number of opened conversations.
	*
	* @return the number of opened conversations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OpenedConversationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OpenedConversationPersistence)PortletBeanLocatorUtil.locate(com.marcelmika.lims.service.ClpSerializer.getServletContextName(),
					OpenedConversationPersistence.class.getName());

			ReferenceRegistry.registerReference(OpenedConversationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(OpenedConversationPersistence persistence) {
	}

	private static OpenedConversationPersistence _persistence;
}