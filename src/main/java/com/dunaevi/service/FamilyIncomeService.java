package com.dunaevi.service;

import java.util.List;

import com.dunaevi.controller.to.FamilyIncomeTo;


public interface FamilyIncomeService {

	public List<FamilyIncomeTo> getFamilyIncome();
	
	public FamilyIncomeTo saveFamilyIncome(FamilyIncomeTo familyIncome);

	FamilyIncomeTo getFamilyIncome(int id);

	void deleteFamilyIncome(int id);
	
}
