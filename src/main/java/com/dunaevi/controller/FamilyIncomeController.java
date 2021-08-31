package com.dunaevi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.service.FamilyIncomeService;

//import de.dunaev.dao.DaoException;
//import de.dunaev.dao.DaoFactory;
//import de.dunaev.dao.WindelSchichtDao;

//@Path("/windel")
@RestController
public class FamilyIncomeController {

    @Autowired
    private FamilyIncomeService familyIncomeService;

    @GetMapping("/income")
    public List<FamilyIncome> listCustomers(Model theModel) {

        return familyIncomeService.getFamilyIncome();
    }
}
