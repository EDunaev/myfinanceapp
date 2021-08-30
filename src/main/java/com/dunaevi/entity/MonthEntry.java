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
	private int id;

	@Column(name = "entry_year")
	private int entryYear;

	@Column(name = "entry_month")
	private int entryMonth;

	@Column(name = "expected_state")
	private int expectedState;

	@Column(name = "real_state")
	private int realState;

	@Column(name = "actual_state")
	private int actualState;

	@OneToMany(mappedBy = "monthEntryId", fetch = FetchType.LAZY)
	private List<OutputItem> outputItems;

	public MonthEntry() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEntryYear() {
		return entryYear;
	}

	public void setEntryYear(int entryYear) {
		this.entryYear = entryYear;
	}

	public int getEntryMonth() {
		return entryMonth;
	}

	public void setEntryMonth(int entryMonth) {
		this.entryMonth = entryMonth;
	}

	public int getExpectedState() {
		return expectedState;
	}

	public void setExpectedState(int expectedState) {
		this.expectedState = expectedState;
	}

	public int getRealState() {
		return realState;
	}

	public void setRealState(int realState) {
		this.realState = realState;
	}

	public int getActualState() {
		return actualState;
	}

	public void setActualState(int actualState) {
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
