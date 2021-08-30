package com.dunaevi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.service.FamilyIncomeService;

@Service
public class FamilyIncomeServiceImpl implements FamilyIncomeService {

	@Override
	public List<FamilyIncome> getFamilyIncome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFamilyIncome(FamilyIncome familyIncome) {
		// TODO Auto-generated method stub

	}

	@Override
	public FamilyIncome getFamilyIncome(int id) {
		// TODO Auto-generated method stub
		FamilyIncome fi = new FamilyIncome();
		fi.setIncome(1000000);
		return fi;
	}

	@Override
	public void deleteFamilyIncome(int id) {
		// TODO Auto-generated method stub

	}

}
