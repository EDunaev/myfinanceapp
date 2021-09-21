package com.dunaevi.mapper;

import org.mapstruct.Mapper;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.entity.FamilyIncome;

//@Mapper(componentModel = "spring")
public interface FamilyIncomeMapper {

    FamilyIncomeTo mapEntityToTo(FamilyIncome source);

    FamilyIncome mapToToEntity(FamilyIncomeTo source);
}
