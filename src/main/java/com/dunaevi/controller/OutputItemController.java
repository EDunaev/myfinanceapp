package com.dunaevi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.entity.OutputItem;
import com.dunaevi.mapper.OutputItemMapper;
import com.dunaevi.service.OutputItemService;

@RestController
public class OutputItemController {

	@Autowired
	private OutputItemService outpuItemService;

	@Autowired
	private OutputItemMapper outputItemMapper;

	@GetMapping("/output")
	public List<OutputItemTo> listCustomers(Model theModel) {

		List<OutputItem> list = outpuItemService.getOutputItem();
		List<OutputItemTo> result = list.stream().map(entity -> outputItemMapper.mapEntityToTo(entity))
				.collect(Collectors.toList());
		return result;

	}
}
