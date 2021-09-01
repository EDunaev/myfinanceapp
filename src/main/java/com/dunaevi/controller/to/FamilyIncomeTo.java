package com.dunaevi.controller.to;

public class FamilyIncomeTo {
	
	private int id;
	
	private int income;
	
	private FamilyMemberTo familyMember;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public FamilyMemberTo getFamilyMember() {
		return familyMember;
	}

	public void setFamilyMember(FamilyMemberTo familyMember) {
		this.familyMember = familyMember;
	}
	
	

}
