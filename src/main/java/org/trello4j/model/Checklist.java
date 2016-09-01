package org.trello4j.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A Trello checklist.
 * <p>
 * <code>
 * {
 * "id":"4f92b89ea73738db6cdd4ed7",
 * "name":"Checklist",
 * "idBoard":"4f92b80ba73738db6cdd4309",
 * "checkItems":[{
 * 		"state": "incomplete",
 * 		"id": "4eea6af1a5da7f5a490000cc",
 * 		"name": "Figure out how to use the call",
 * 		"nameData": null,
 * 		"pos": 33544
 * }, {
 * 		"state": "incomplete",
 * 		"id": "4eea6af4a5da7f5a490000e1",
 * 		"name": "Add it to the code",
 * 		"nameData": null,
 * 		"pos": 50647
 * }
 * ]
 * }
 * </code>
 */
public class Checklist extends TrelloObject {

	private String name;

	private String idBoard;

	private java.util.List<CheckItem> checkItems = new ArrayList<CheckItem>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}

	public List<CheckItem> getCheckItems() {
		return checkItems;
	}

	public void setCheckItems(List<CheckItem> checkItems) {
		this.checkItems = checkItems;
	}

	public class CheckItem extends TrelloObject {

		private String name;
		private String type;
		private String state;
		private double pos;


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getPos() {
			return pos;
		}

		public void setPos(double pos) {
			this.pos = pos;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public boolean isChecked() {
			return "complete".equals(state);
		}
	}
}
