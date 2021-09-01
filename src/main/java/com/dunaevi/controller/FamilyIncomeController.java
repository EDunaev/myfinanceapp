package com.dunaevi.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.mapper.FamilyIncomeMapper;
import com.dunaevi.service.FamilyIncomeService;

@RestController
public class FamilyIncomeController {

	@Autowired
	private FamilyIncomeService familyIncomeService;

	@Autowired
	private FamilyIncomeMapper familyIncomeMapper;

	@GetMapping("/income")
	public List<FamilyIncomeTo> listIncomes() {

		List<FamilyIncome> list = familyIncomeService.getFamilyIncome();
		List<FamilyIncomeTo> result = list.stream().map(entity -> familyIncomeMapper.mapEntityToTo(entity))
				.collect(Collectors.toList());
		return result;

	}

	@GetMapping("/income/{id}")
	public FamilyIncomeTo findIncome(@PathVariable(value = "id") int incomeId) {

		FamilyIncomeTo result = familyIncomeMapper.mapEntityToTo(familyIncomeService.getFamilyIncome(incomeId));
		return result;

	}

	@PostMapping("/income")
	public String saveCustomer(@Valid @RequestBody FamilyIncomeTo incomeTo) {

		return incomeTo.getFamilyMember().getName();
	}

	@DeleteMapping("/income/{id}")
	public boolean deleteCustomer(@PathVariable(value = "id") int incomeId) {

		return incomeId == 1;
	}
}
