package com.dunaevi.controller.to;

public class MonthEntryTo {

	private Integer id;

	private Integer entryYear;

	private Integer entryMonth;

	private Integer expectedState;

	private Integer realState;

	private Integer actualState;

	public MonthEntryTo() {

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

}
