package com.dunaevi.controller.to;

public class OutputItemTo {

	private Integer id;

	private String name;

	private Integer entryPrice;

	private String itemComment;

	private String itemType;
	
	private Boolean isPaid;

	private MonthEntryTo monthEntryId;

	public OutputItemTo() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(Integer entryPrice) {
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

    public Boolean getIsPaid() {
    
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
    
        this.isPaid = isPaid;
    }

}
