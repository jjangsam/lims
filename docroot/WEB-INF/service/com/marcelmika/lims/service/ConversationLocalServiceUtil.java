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

package com.marcelmika.lims.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the conversation local service. This utility wraps {@link com.marcelmika.lims.service.impl.ConversationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConversationLocalService
 * @see com.marcelmika.lims.service.base.ConversationLocalServiceBaseImpl
 * @see com.marcelmika.lims.service.impl.ConversationLocalServiceImpl
 * @generated
 */
public class ConversationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.marcelmika.lims.service.impl.ConversationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the conversation to the database. Also notifies the appropriate model listeners.
	*
	* @param conversation the conversation
	* @return the conversation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.Conversation addConversation(
		com.marcelmika.lims.model.Conversation conversation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addConversation(conversation);
	}

	/**
	* Creates a new conversation with the primary key. Does not add the conversation to the database.
	*
	* @param cid the primary key for the new conversation
	* @return the new conversation
	*/
	public static com.marcelmika.lims.model.Conversation createConversation(
		long cid) {
		return getService().createConversation(cid);
	}

	/**
	* Deletes the conversation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cid the primary key of the conversation
	* @return the conversation that was removed
	* @throws PortalException if a conversation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.Conversation deleteConversation(
		long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConversation(cid);
	}

	/**
	* Deletes the conversation from the database. Also notifies the appropriate model listeners.
	*
	* @param conversation the conversation
	* @return the conversation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.Conversation deleteConversation(
		com.marcelmika.lims.model.Conversation conversation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConversation(conversation);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.marcelmika.lims.model.Conversation fetchConversation(
		long cid) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchConversation(cid);
	}

	/**
	* Returns the conversation with the primary key.
	*
	* @param cid the primary key of the conversation
	* @return the conversation
	* @throws PortalException if a conversation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.Conversation getConversation(
		long cid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getConversation(cid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the conversations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of conversations
	* @param end the upper bound of the range of conversations (not inclusive)
	* @return the range of conversations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.marcelmika.lims.model.Conversation> getConversations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConversations(start, end);
	}

	/**
	* Returns the number of conversations.
	*
	* @return the number of conversations
	* @throws SystemException if a system exception occurred
	*/
	public static int getConversationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConversationsCount();
	}

	/**
	* Updates the conversation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conversation the conversation
	* @return the conversation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.Conversation updateConversation(
		com.marcelmika.lims.model.Conversation conversation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateConversation(conversation);
	}

	/**
	* Updates the conversation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conversation the conversation
	* @param merge whether to merge the conversation with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the conversation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.marcelmika.lims.model.Conversation updateConversation(
		com.marcelmika.lims.model.Conversation conversation, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateConversation(conversation, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.marcelmika.lims.model.Conversation addConversation(
		long userId, java.lang.String conversationId,
		java.lang.String conversationType,
		java.lang.String conversationVisibility,
		java.lang.String conversationName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addConversation(userId, conversationId, conversationType,
			conversationVisibility, conversationName);
	}

	public static void removeConversation(long userId,
		java.lang.String conversationId) {
		getService().removeConversation(userId, conversationId);
	}

	public static java.util.List<com.marcelmika.lims.model.Conversation> getAllConversations(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllConversations(userId);
	}

	public static com.marcelmika.lims.model.Conversation getRoom(long userId,
		java.lang.String conversationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.marcelmika.lims.NoSuchConversationException {
		return getService().getRoom(userId, conversationId);
	}

	public static com.marcelmika.lims.model.Conversation getConversation(
		long userId, java.lang.String conversationId) {
		return getService().getConversation(userId, conversationId);
	}

	public static void incrementUnreadMessages(long userId,
		java.lang.String conversationId) {
		getService().incrementUnreadMessages(userId, conversationId);
	}

	public static void setUnreadMessages(long userId,
		java.lang.String conversationId, int unreadMessages) {
		getService().setUnreadMessages(userId, conversationId, unreadMessages);
	}

	public static void clearService() {
		_service = null;
	}

	public static ConversationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ConversationLocalService.class.getName());

			if (invokableLocalService instanceof ConversationLocalService) {
				_service = (ConversationLocalService)invokableLocalService;
			}
			else {
				_service = new ConversationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ConversationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(ConversationLocalService service) {
	}

	private static ConversationLocalService _service;
}