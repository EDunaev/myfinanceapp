package com.dunaevi.service;

import java.util.List;

import com.dunaevi.entity.OutputItem;


public interface OutputItemService {

	public List<OutputItem> getOutputItem();
	
	public void saveOutputItem(OutputItem familyIncome);

	OutputItem getOutputItemOutputItem(int id);

	void deleteOutputItem(int id);
	
}
