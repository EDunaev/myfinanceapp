package com.dunaevi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.service.MonthEntryService;

@CrossOrigin
@RestController
public class MonthEntryController {

	@Autowired
	private MonthEntryService monthEntryService;

	@GetMapping("/api/month-entry")
	public List<MonthEntryTo> monthEntryTos(Model theModel) {

		return monthEntryService.getMonthEntry();

	}

	@GetMapping("/api/month-entry/{id}")
	public MonthEntryTo findMonthEntry(@PathVariable(value = "id") int outputItemId) {

		return monthEntryService.getMonthEntry(outputItemId);

	}

	@PostMapping("/api/month-entry")
	public void saveMonthEntry(@Valid @RequestBody MonthEntryTo outputItemTo) {

		monthEntryService.saveMonthEntry(outputItemTo);

	}

	@PatchMapping("/api/month-entry/{id}")
	public void updateMonthEntry(@Valid @RequestBody MonthEntryTo outputItemTo) {
		monthEntryService.saveMonthEntry(outputItemTo);

	}

	@DeleteMapping("/api/month-entry/{id}")
	public boolean deleteMonthEntry(@PathVariable(value = "id") int outputItemId) {

		monthEntryService.deleteMonthEntry(outputItemId);
		return true;
	}
}
