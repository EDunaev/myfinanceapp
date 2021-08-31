package com.dunaevi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dunaevi.dao.FamilyIncomeDao;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.service.FamilyIncomeService;

@Service
public class FamilyIncomeServiceImpl implements FamilyIncomeService {

    @Autowired
    private FamilyIncomeDao familyIncomeDao;
    
	@Override
	public List<FamilyIncome> getFamilyIncome() {
		return familyIncomeDao.getFamilyIncome();
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
