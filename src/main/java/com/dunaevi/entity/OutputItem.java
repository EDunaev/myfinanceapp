package com.dunaevi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "output_item")
public class OutputItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "entry_price")
	private int entryPrice;

	@Column(name = "item_comment")
	private String itemComment;

	@Column(name = "item_type")
	private String itemType;

	@Column(name = "month_entry_id")
	private int monthEntryId;

	public OutputItem() {

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

	public int getMonthEntryId() {
		return monthEntryId;
	}

	public void setMonthEntryId(int monthEntryId) {
		this.monthEntryId = monthEntryId;
	}

}
