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

import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.service.OutputItemService;

@RestController
public class OutputItemController {

	@Autowired
	private OutputItemService outpuItemService;

	@GetMapping("/output")
	public List<OutputItemTo> outputItemTos(Model theModel) {

		return outpuItemService.getOutputItem();

	}

	@GetMapping("/output/{id}")
	public OutputItemTo findOutputItem(@PathVariable(value = "id") int outputItemId) {

		return outpuItemService.getOutputItemOutputItem(outputItemId);

	}

	@PostMapping("/output")
	public void saveOutputItem(@Valid @RequestBody OutputItemTo outputItemTo) {

		outpuItemService.saveOutputItem(outputItemTo);

	}

	@PatchMapping("/output")
	public void updateOutputItem(@Valid @RequestBody OutputItemTo outputItemTo) {

		outpuItemService.saveOutputItem(outputItemTo);

	}

	@DeleteMapping("/output/{id}")
	public boolean deleteOutputItem(@PathVariable(value = "id") int outputItemId) {

		outpuItemService.deleteOutputItem(outputItemId);
		return true;

	}
}
