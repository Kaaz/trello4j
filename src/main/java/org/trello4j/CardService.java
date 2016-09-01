package org.trello4j;

import org.trello4j.model.*;
import org.trello4j.model.Card.Attachment;
import org.trello4j.model.Checklist.CheckItem;

import java.util.List;
import java.util.Map;

/**
 * The Interface CardService.
 *
 * @author
 */
public interface CardService {

	Card getCard(String cardId);

	List<Action> getActionsByCard(String cardId);

	List<Attachment> getAttachmentsByCard(String cardId);

	Board getBoardByCard(String cardId, String... filter);

	List<CheckItem> getCheckItemStatesByCard(String cardId);

	List<Checklist> getChecklistByCard(String cardId);

	org.trello4j.model.List getListByCard(String cardId, String... filter);

	List<Member> getMembersByCard(String cardId);

	/**
	 * Add a new {@link Card} with the optional keyValue pairs.
	 *
	 * @param idList     Id of the {@link org.trello4j.model.List}
	 *                   the card should be added to.
	 * @param name       Name of the new card.
	 * @param keyValeMap Map of the optional key-value-pairs.
	 */
	Card createCard(String idList, String name, Map<String, String> keyValeMap);

	void deleteCard(String cardId);

	/**
	 * Associate Member(s) to the Card.
	 *
	 * @param cardId   the card id
	 * @param memberId the id of member(s) to be added
	 */
	void addMemberToCard(String cardId, String memberId);

	/**
	 * Move Card card across lists.
	 *
	 * @param cardId the card id
	 * @param listId the id of the list where the card is to be moved
	 */
	void moveCardToList(String cardId, String listId);

	/**
	 * Set description on a Card.
	 *
	 * @param cardId the card id
	 * @param desc   the description text
	 */
	void setCardDesc(String cardId, String desc);

	/**
	 * Add Label to a Card by color.
	 *
	 * @param cardId     the card id
	 * @param labelValue the color of the Label to add
	 */
	void addLabelToCard(String cardId, String labelValue);

	/**
	 * Add Label to a Card by name.
	 *
	 * @param cardId    the card id
	 * @param labelName the name of the Label to add
	 */
	void addLabelNameToCard(String cardId, String labelName);

	/**
	 * Add Card to Archive.
	 *
	 * @param cardId the card id
	 */
	void archiveCard(String cardId);

	/**
	 * Send Archived Card to Board.
	 *
	 * @param cardId the card id
	 */
	void restoreCard(String cardId);

	/**
	 * Upload Attachment to Card.
	 *
	 * @param cardId   the card id
	 * @param fileName Absolute Path of the File Path to attach
	 */
	void addAttachment(String cardId, String fileName);

	/**
	 * Add Attachment to Card.
	 *
	 * @param cardId the card id
	 * @param url    url of the file to add as attachment
	 */
	void addAttachmentUrl(String cardId, String url);

	/**
	 * Delete a Specific Attachment from Card.
	 *
	 * @param cardId       the card id
	 * @param attachmentId Id of the Attachment to delete
	 */
	void deleteAttachment(String cardId, String attachmentId);

	/**
	 * Add a comment to a card.
	 */
	Action createComment(String idCard, String text);
}
