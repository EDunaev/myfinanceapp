package com.dunaevi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.dao.OutputItemDao;
import com.dunaevi.entity.OutputItem;
import com.dunaevi.mapper.OutputItemMapper;
import com.dunaevi.service.OutputItemService;

@Service
public class OutputItemServiceImpl implements OutputItemService {

    @Autowired
    private OutputItemDao outputItemDao;

    @Autowired
    private OutputItemMapper outputItemMapper;

    @Override
    public List<OutputItemTo> getOutputItem() {

        List<OutputItem> list = outputItemDao.getOutputItem();
        return list.stream()
                .map(entity -> outputItemMapper.mapEntityToTo(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void saveOutputItem(OutputItemTo familyIncome) {

        OutputItem oi = outputItemMapper.mapToToEntity(familyIncome);
        outputItemDao.saveOutputItem(oi);

    }

    @Override
    public OutputItemTo getOutputItemOutputItem(int id) {

        return outputItemMapper.mapEntityToTo(outputItemDao.getOutputItem(id));
    }

    @Override
    public void deleteOutputItem(int id) {

        outputItemDao.deleteOutputItem(id);

    }

}
