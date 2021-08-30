package com.dunaevi.service;

import java.util.List;

import com.dunaevi.entity.FamilyIncome;


public interface FamilyIncomeService {

	public List<FamilyIncome> getFamilyIncome();
	
	public void saveFamilyIncome(FamilyIncome familyIncome);

	FamilyIncome getFamilyIncome(int id);

	void deleteFamilyIncome(int id);
	
}
