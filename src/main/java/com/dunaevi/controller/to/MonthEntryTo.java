package com.dunaevi.controller.to;

public class MonthEntryTo {

	private int id;

	private int entryYear;

	private int entryMonth;

	private int expectedState;

	private int realState;

	private int actualState;

	public MonthEntryTo() {

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

}
