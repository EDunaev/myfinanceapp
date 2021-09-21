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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.service.OutputItemService;

@CrossOrigin
@RestController
public class OutputItemController {

	@Autowired
	private OutputItemService outpuItemService;

	@GetMapping("/api/outputs")
	public List<OutputItemTo> outputItemTos(Model theModel) {

		return outpuItemService.getOutputItem();

	}

	@GetMapping("/api/output")
	public List<OutputItemTo> findIncomesByMonthId(@RequestParam(value = "monthEntryId.id") Integer monthId) {

		return outpuItemService.findOutputItemByMonthId(monthId);

	}

	@GetMapping("/api/output/{id}")
	public OutputItemTo findOutputItem(@PathVariable(value = "id") int outputItemId) {

		return outpuItemService.getOutputItemOutputItem(outputItemId);

	}

	@PostMapping("/api/output")
	public OutputItemTo saveOutputItem(@Valid @RequestBody OutputItemTo outputItemTo) {

		return outpuItemService.saveOutputItem(outputItemTo);

	}

	@PatchMapping("/api/output/{id}")
	public OutputItemTo updateOutputItem(@Valid @RequestBody OutputItemTo outputItemTo) {

		return outpuItemService.saveOutputItem(outputItemTo);

	}

	@DeleteMapping("/api/output/{id}")
	public boolean deleteOutputItem(@PathVariable(value = "id") int outputItemId) {

		outpuItemService.deleteOutputItem(outputItemId);
		return true;

	}
}
