package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.OutputItem;

public interface OutputItemDao {

    public List<OutputItem> getOutputItem();

    public void saveOutputItem(OutputItem outputItem);

    OutputItem getOutputItem(int id);

    void deleteOutputItem(int id);
}
