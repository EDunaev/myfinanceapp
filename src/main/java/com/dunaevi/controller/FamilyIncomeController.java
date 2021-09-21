package com.dunaevi.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.service.FamilyIncomeService;

@CrossOrigin
@RestController
public class FamilyIncomeController {

	@Autowired
	private FamilyIncomeService familyIncomeService;

	@GetMapping("/api/incomes")
	public List<FamilyIncomeTo> listIncomes() {

		return familyIncomeService.getFamilyIncome();

	}

	@GetMapping("/api/income")
	public List<FamilyIncomeTo> findIncomesByMonthId(@RequestParam(value = "monthEntry.id") Integer monthId) {

		return familyIncomeService.findIncomeByMonthId(monthId);

	}

	@GetMapping("/api/income/{id}")
	public FamilyIncomeTo findIncome(@PathVariable(value = "id") int incomeId) {

		return familyIncomeService.getFamilyIncome(incomeId);

	}

	@PostMapping("/api/income")
	public String saveIncome(@Valid @RequestBody FamilyIncomeTo incomeTo) {

		return familyIncomeService.saveFamilyIncome(incomeTo).getFamilyMember().getName();
	}

	@PatchMapping("/api/income/{id}")
	public void updateIncome(@Valid @RequestBody FamilyIncomeTo incomeTo) {

		familyIncomeService.saveFamilyIncome(incomeTo);
	}

	@DeleteMapping("/api/income/{id}")
	public boolean deleteIncome(@PathVariable(value = "id") int incomeId) {

		familyIncomeService.deleteFamilyIncome(incomeId);
		return true;
	}
}
