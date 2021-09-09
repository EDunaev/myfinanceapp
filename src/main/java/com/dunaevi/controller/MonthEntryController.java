package com.dunaevi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.service.MonthEntryService;

@RestController
public class MonthEntryController {

	@Autowired
	private MonthEntryService monthEntryService;

	@GetMapping("/month-entry")
	public List<MonthEntryTo> monthEntryTos(Model theModel) {

		return monthEntryService.getMonthEntry();

	}

	@GetMapping("/month-entry/{id}")
	public MonthEntryTo findMonthEntry(@PathVariable(value = "id") int outputItemId) {

		return monthEntryService.getMonthEntry(outputItemId);

	}

	@PostMapping("/month-entry")
	public void saveMonthEntry(@Valid @RequestBody MonthEntryTo outputItemTo) {

		monthEntryService.saveMonthEntry(outputItemTo);

	}

	@PatchMapping("/month-entry/{id}")
	public void updateMonthEntry(@Valid @RequestBody MonthEntryTo outputItemTo) {
		monthEntryService.saveMonthEntry(outputItemTo);

	}

	@DeleteMapping("/month-entry/{id}")
	public boolean deleteMonthEntry(@PathVariable(value = "id") int outputItemId) {

		monthEntryService.deleteMonthEntry(outputItemId);
		return true;
	}
}
