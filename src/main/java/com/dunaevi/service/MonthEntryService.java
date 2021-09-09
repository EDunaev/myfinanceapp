package com.dunaevi.service;

import java.util.List;

import com.dunaevi.controller.to.MonthEntryTo;

public interface MonthEntryService {

    List<MonthEntryTo> getMonthEntry();

    void saveMonthEntry(MonthEntryTo monthEntryTo);

    MonthEntryTo getMonthEntry(int id);

    void deleteMonthEntry(int id);

}
