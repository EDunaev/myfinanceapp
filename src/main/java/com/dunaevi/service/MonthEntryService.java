package com.dunaevi.service;

import java.util.List;

import com.dunaevi.controller.to.MonthEntryTo;

public interface MonthEntryService {

    public List<MonthEntryTo> getMonthEntry();

    public void saveMonthEntry(MonthEntryTo monthEntryTo);

    MonthEntryTo getMonthEntry(int id);

    void deleteMonthEntry(int id);

}
