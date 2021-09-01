package com.dunaevi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dunaevi.dao.OutputItemDao;
import com.dunaevi.entity.OutputItem;
import com.dunaevi.service.OutputItemService;

@Service
public class OutputItemServiceImpl implements OutputItemService {

	@Autowired
	private OutputItemDao outputItemDao;

	@Override
	public List<OutputItem> getOutputItem() {
		return outputItemDao.getOutputItem();
	}

	@Override
	public void saveOutputItem(OutputItem familyIncome) {
		outputItemDao.saveOutputItem(familyIncome);

	}

	@Override
	public OutputItem getOutputItemOutputItem(int id) {
		return outputItemDao.getOutputItem(id);
	}

	@Override
	public void deleteOutputItem(int id) {
		outputItemDao.deleteOutputItem(id);

	}

}
