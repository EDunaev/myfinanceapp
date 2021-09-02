package com.dunaevi.mapper;

import org.mapstruct.Mapper;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.entity.MonthEntry;

@Mapper(componentModel = "spring")
public interface MonthEntryMapper {

    MonthEntryTo mapEntityToTo(MonthEntry source);

    MonthEntry mapToToEntity(MonthEntryTo source);
}
