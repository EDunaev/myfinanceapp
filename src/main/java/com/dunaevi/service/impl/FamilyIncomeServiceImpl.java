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
		familyIncomeDao.saveFamilyIncome(familyIncome);

	}

	@Override
	public FamilyIncome getFamilyIncome(int id) {
		return familyIncomeDao.getFamilyIncome(id);
	}

	@Override
	public void deleteFamilyIncome(int id) {
		familyIncomeDao.deleteFamilyIncome(id);

	}

}
