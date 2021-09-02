package com.dunaevi.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.service.FamilyIncomeService;

@RestController
public class FamilyIncomeController {

	@Autowired
	private FamilyIncomeService familyIncomeService;

	@GetMapping("/income")
	public List<FamilyIncomeTo> listIncomes() {

		return familyIncomeService.getFamilyIncome();

	}

	@GetMapping("/income/{id}")
	public FamilyIncomeTo findIncome(@PathVariable(value = "id") int incomeId) {

		return familyIncomeService.getFamilyIncome(incomeId);

	}

	@PostMapping("/income")
	public String saveCustomer(@Valid @RequestBody FamilyIncomeTo incomeTo) {

		return familyIncomeService.saveFamilyIncome(incomeTo).getFamilyMember().getName();
	}

	@DeleteMapping("/income/{id}")
	public boolean deleteCustomer(@PathVariable(value = "id") int incomeId) {

	    familyIncomeService.deleteFamilyIncome(incomeId);
		return true;
	}
}
