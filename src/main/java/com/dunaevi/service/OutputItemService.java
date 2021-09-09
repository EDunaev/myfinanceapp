package com.dunaevi.service;

import java.util.List;

import com.dunaevi.controller.to.OutputItemTo;


public interface OutputItemService {

	List<OutputItemTo> getOutputItem();
	
	List<OutputItemTo> findOutputItemByMonthId(Integer id);
	
	void saveOutputItem(OutputItemTo outputItemTo);

	OutputItemTo getOutputItemOutputItem(int id);

	void deleteOutputItem(int id);
	
}
