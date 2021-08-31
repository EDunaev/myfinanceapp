package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.FamilyIncome;

public interface FamilyIncomeDao {

    public List<FamilyIncome> getFamilyIncome();
    
    public void saveFamilyIncome(FamilyIncome familyIncome);

    FamilyIncome getFamilyIncome(int id);

    void deleteFamilyIncome(int id);
}
