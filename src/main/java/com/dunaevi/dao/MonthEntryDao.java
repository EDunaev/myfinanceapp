package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.MonthEntry;

public interface MonthEntryDao {

    public List<MonthEntry> getMontEntries();

    public void saveMonthEntry(MonthEntry monthEntry);

    MonthEntry getMonthEntry(int id);

    void deleteMonthEntry(int id);
}
