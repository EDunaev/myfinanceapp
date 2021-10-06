package com.dunaevi.mapper;

import org.mapstruct.Mapper;

import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.entity.OutputItem;

@Mapper(componentModel = "spring")
public interface OutputItemMapper {

    OutputItemTo mapEntityToTo(OutputItem source);

    OutputItem mapToToEntity(OutputItemTo source);
}
