package com.dunaevi.service;

import java.util.List;

import com.dunaevi.controller.to.OutputItemTo;


public interface OutputItemService {

	public List<OutputItemTo> getOutputItem();
	
	public void saveOutputItem(OutputItemTo outputItemTo);

	OutputItemTo getOutputItemOutputItem(int id);

	void deleteOutputItem(int id);
	
}
