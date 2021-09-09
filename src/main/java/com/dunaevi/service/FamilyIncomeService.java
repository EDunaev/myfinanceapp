package com.dunaevi.service;

import java.util.List;

import com.dunaevi.controller.to.FamilyIncomeTo;


public interface FamilyIncomeService {

	List<FamilyIncomeTo> getFamilyIncome();
	
	List<FamilyIncomeTo> findIncomeByMonthId(Integer Id);
	
	FamilyIncomeTo saveFamilyIncome(FamilyIncomeTo familyIncome);

	FamilyIncomeTo getFamilyIncome(int id);

	void deleteFamilyIncome(int id);
	
}
