package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.FamilyIncome;

public interface FamilyIncomeDao {

    List<FamilyIncome> getFamilyIncome();
    
    List<FamilyIncome> getIncomeByMonthId(Integer Id);
    
    void saveFamilyIncome(FamilyIncome familyIncome);

    FamilyIncome getFamilyIncome(int id);

    void deleteFamilyIncome(int id);
}
