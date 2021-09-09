package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.OutputItem;

public interface OutputItemDao {

	List<OutputItem> getOutputItem();

	List<OutputItem> findOutputItemByMonthId(Integer id);

	void saveOutputItem(OutputItem outputItem);

	OutputItem getOutputItem(int id);

	void deleteOutputItem(int id);
}
