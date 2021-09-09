package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.MonthEntry;

public interface MonthEntryDao {

    List<MonthEntry> getMontEntries();

    void saveMonthEntry(MonthEntry monthEntry);

    MonthEntry getMonthEntry(int id);

    void deleteMonthEntry(int id);
}
