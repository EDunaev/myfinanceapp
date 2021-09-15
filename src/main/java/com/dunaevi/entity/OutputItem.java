package com.dunaevi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "output_item")
public class OutputItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "entry_price")
	private Integer entryPrice;

	@Column(name = "item_comment")
	private String itemComment;

	@Column(name = "item_type")
	private String itemType;
	
	@Column(name = "is_paid")
    private Boolean isPaid;

	@ManyToOne
	@JoinColumn(name = "month_entry_id")
	private MonthEntry monthEntryId;

	public OutputItem() {

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

	public MonthEntry getMonthEntryId() {
		return monthEntryId;
	}

	public void setMonthEntryId(MonthEntry monthEntryId) {
		this.monthEntryId = monthEntryId;
	}

    public Boolean getIsPaid() {
    
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
    
        this.isPaid = isPaid;
    }
	

}
