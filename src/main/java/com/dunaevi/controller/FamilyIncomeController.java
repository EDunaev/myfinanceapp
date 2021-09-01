package com.dunaevi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.mapper.FamilyIncomeMapper;
import com.dunaevi.service.FamilyIncomeService;

//import de.dunaev.dao.DaoException;
//import de.dunaev.dao.DaoFactory;
//import de.dunaev.dao.WindelSchichtDao;

//@Path("/windel")
@RestController
public class FamilyIncomeController {

    @Autowired
    private FamilyIncomeService familyIncomeService;

    @Autowired
    private FamilyIncomeMapper familyIncomeMapper;

    @GetMapping("/income")
    public List<FamilyIncomeTo> listCustomers(Model theModel) {

        List<FamilyIncome> list = familyIncomeService.getFamilyIncome();
        List<FamilyIncomeTo> result = list.stream()
                .map(entity -> familyIncomeMapper.mapEntityToTo(entity))
                .collect(Collectors.toList());
        return result;
        
//        List<FamilyIncomeTo> result = new ArrayList<FamilyIncomeTo>();
//        list.forEach(income -> {
//    		FamilyIncomeTo to = new FamilyIncomeTo();
//    		FamilyMemberTo memberTo = new FamilyMemberTo();
//    		to.setId(income.getId());
//    		to.setIncome(income.getIncome());
//    		memberTo.setId(income.getFamilyMember().getId());
//    		memberTo.setName(income.getFamilyMember().getName());
//    		to.setFamilyMember(memberTo);
//    		result.add(to);
//    	});
    }
}
