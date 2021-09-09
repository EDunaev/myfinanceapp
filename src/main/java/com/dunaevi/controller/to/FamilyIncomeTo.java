package com.dunaevi.controller.to;

public class FamilyIncomeTo {
	
	private Integer id;
	
	private Integer income;
	
	private FamilyMemberTo familyMember;
	
	private MonthEntryTo monthEntry;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public FamilyMemberTo getFamilyMember() {
		return familyMember;
	}

	public void setFamilyMember(FamilyMemberTo familyMember) {
		this.familyMember = familyMember;
	}

	public MonthEntryTo getMonthEntry() {
		return monthEntry;
	}

	public void setMonthEntry(MonthEntryTo monthEntry) {
		this.monthEntry = monthEntry;
	}
	
	

}
