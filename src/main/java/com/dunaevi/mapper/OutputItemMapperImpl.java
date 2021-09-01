package com.dunaevi.mapper;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.controller.to.OutputItemTo;
import com.dunaevi.entity.MonthEntry;
import com.dunaevi.entity.OutputItem;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-01T20:03:54+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class OutputItemMapperImpl implements OutputItemMapper {

    @Override
    public OutputItemTo mapEntityToTo(OutputItem source) {
        if ( source == null ) {
            return null;
        }

        OutputItemTo outputItemTo = new OutputItemTo();

        outputItemTo.setId( source.getId() );
        outputItemTo.setName( source.getName() );
        outputItemTo.setEntryPrice( source.getEntryPrice() );
        outputItemTo.setItemComment( source.getItemComment() );
        outputItemTo.setItemType( source.getItemType() );
        outputItemTo.setMonthEntryId( monthEntryToMonthEntryTo( source.getMonthEntryId() ) );

        return outputItemTo;
    }

    protected MonthEntryTo monthEntryToMonthEntryTo(MonthEntry monthEntry) {
        if ( monthEntry == null ) {
            return null;
        }

        MonthEntryTo monthEntryTo = new MonthEntryTo();

        monthEntryTo.setId( monthEntry.getId() );
        monthEntryTo.setEntryYear( monthEntry.getEntryYear() );
        monthEntryTo.setEntryMonth( monthEntry.getEntryMonth() );
        monthEntryTo.setExpectedState( monthEntry.getExpectedState() );
        monthEntryTo.setRealState( monthEntry.getRealState() );
        monthEntryTo.setActualState( monthEntry.getActualState() );

        return monthEntryTo;
    }
}
