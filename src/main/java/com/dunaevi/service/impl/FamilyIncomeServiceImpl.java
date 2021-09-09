package com.dunaevi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.dao.FamilyIncomeDao;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.mapper.FamilyIncomeMapper;
import com.dunaevi.service.FamilyIncomeService;

@Service
public class FamilyIncomeServiceImpl implements FamilyIncomeService {

    @Autowired
    private FamilyIncomeDao familyIncomeDao;

    @Autowired
    private FamilyIncomeMapper familyIncomeMapper;

    @Override
    public List<FamilyIncomeTo> getFamilyIncome() {

        List<FamilyIncome> list = familyIncomeDao.getFamilyIncome();
        return list.stream()
                .map(entity -> familyIncomeMapper.mapEntityToTo(entity))
                .collect(Collectors.toList());
    }

    @Override
    public FamilyIncomeTo saveFamilyIncome(FamilyIncomeTo familyIncome) {
       
        FamilyIncome fi = familyIncomeMapper.mapToToEntity(familyIncome);
        familyIncomeDao.saveFamilyIncome(fi);
        return familyIncomeMapper.mapEntityToTo(fi);
    }

    @Override
    public FamilyIncomeTo getFamilyIncome(int id) {

        return familyIncomeMapper.mapEntityToTo(familyIncomeDao.getFamilyIncome(id));
    }

    @Override
    public void deleteFamilyIncome(int id) {

        familyIncomeDao.deleteFamilyIncome(id);

    }

	@Override
	public List<FamilyIncomeTo> findIncomeByMonthId(Integer id) {
		List<FamilyIncome> list = familyIncomeDao.getIncomeByMonthId(id);
        return list.stream()
                .map(entity -> familyIncomeMapper.mapEntityToTo(entity))
                .collect(Collectors.toList());
	}

}
