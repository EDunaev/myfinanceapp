package com.dunaevi.controller.to;

public class OutputItemTo {

	private int id;

	private String name;

	private int entryPrice;

	private String itemComment;

	private String itemType;

	private MonthEntryTo monthEntryId;

	public OutputItemTo() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(int entryPrice) {
		this.entryPrice = entryPrice;
	}

	public String getItemComment() {
		return itemComment;
	}

	public void setItemComment(String itemComment) {
		this.itemComment = itemComment;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public MonthEntryTo getMonthEntryId() {
		return monthEntryId;
	}

	public void setMonthEntryId(MonthEntryTo monthEntryId) {
		this.monthEntryId = monthEntryId;
	}

}
