package com.dunaevi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "month_entry")
public class MonthEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "entry_year")
	private Integer entryYear;

	@Column(name = "entry_month")
	private Integer entryMonth;

	@Column(name = "expected_state")
	private Integer expectedState;

	@Column(name = "real_state")
	private Integer realState;

	@Column(name = "actual_state")
	private Integer actualState;

	@OneToMany(mappedBy = "monthEntryId", fetch = FetchType.LAZY)
	private List<OutputItem> outputItems;

	public MonthEntry() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEntryYear() {
		return entryYear;
	}

	public void setEntryYear(Integer entryYear) {
		this.entryYear = entryYear;
	}

	public Integer getEntryMonth() {
		return entryMonth;
	}

	public void setEntryMonth(Integer entryMonth) {
		this.entryMonth = entryMonth;
	}

	public Integer getExpectedState() {
		return expectedState;
	}

	public void setExpectedState(Integer expectedState) {
		this.expectedState = expectedState;
	}

	public Integer getRealState() {
		return realState;
	}

	public void setRealState(Integer realState) {
		this.realState = realState;
	}

	public Integer getActualState() {
		return actualState;
	}

	public void setActualState(Integer actualState) {
		this.actualState = actualState;
	}

	public List<OutputItem> getOutputItems() {
		return outputItems;
	}

	public void setOutputItems(List<OutputItem> outputItems) {
		this.outputItems = outputItems;
	}

	public void add(OutputItem outputItem) {

		if (outputItems == null) {
			outputItems = new ArrayList<>();
		}

		outputItems.add(outputItem);

		outputItem.setMonthEntryId(this);
	}
}
