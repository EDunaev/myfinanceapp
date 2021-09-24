package com.dunaevi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.result.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.dao.MonthEntryDao;
import com.dunaevi.entity.MonthEntry;
import com.dunaevi.mapper.MonthEntryMapper;
import com.dunaevi.service.MonthEntryService;
import com.dunaevi.service.OutputItemService;

@Service
public class MonthEntryServiceImpl implements MonthEntryService {

    @Autowired
    private MonthEntryDao monthEntryDao;
    
    @Autowired OutputItemService outputItemService;

    @Autowired
    private MonthEntryMapper monthEntryMapper;

    @Override
    public List<MonthEntryTo> getMonthEntry() {

        List<MonthEntry> list = monthEntryDao.getMontEntries();
        return list.stream()
                .map(entity -> monthEntryMapper.mapEntityToTo(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void saveMonthEntry(MonthEntryTo monthEntryTo) {

        MonthEntry oi = monthEntryMapper.mapToToEntity(monthEntryTo);
        monthEntryDao.saveMonthEntry(oi);
    }

    @Override
    public MonthEntryTo getMonthEntry(int id) {

        return monthEntryMapper.mapEntityToTo(monthEntryDao.getMonthEntry(id));
    }

    @Override
    public void deleteMonthEntry(int id) {

        monthEntryDao.deleteMonthEntry(id);

    }

	@Override
	public Boolean fillMonthEntry(int id) {

		MonthEntryTo month = monthEntryMapper.mapEntityToTo(monthEntryDao.getMonthEntry(id));
		if(month == null) {
			return false;
		}
		List<OutputItemTo> defaultItems = outputItemService.findOutputItemByMonthId(0);
		
		defaultItems.forEach(output -> {
			output.setMonthEntryId(month);
			output.setId(null);
			outputItemService.saveOutputItem(output);
		});
		return true;

	}

}
