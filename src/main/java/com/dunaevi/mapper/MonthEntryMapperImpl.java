package com.dunaevi.mapper;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.entity.MonthEntry;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-02T16:47:46+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
public class MonthEntryMapperImpl implements MonthEntryMapper {

    @Override
    public MonthEntryTo mapEntityToTo(MonthEntry source) {
        if ( source == null ) {
            return null;
        }

        MonthEntryTo monthEntryTo = new MonthEntryTo();

        monthEntryTo.setId( source.getId() );
        monthEntryTo.setEntryYear( source.getEntryYear() );
        monthEntryTo.setEntryMonth( source.getEntryMonth() );
        monthEntryTo.setExpectedState( source.getExpectedState() );
        monthEntryTo.setRealState( source.getRealState() );
        monthEntryTo.setActualState( source.getActualState() );

        return monthEntryTo;
    }

    @Override
    public MonthEntry mapToToEntity(MonthEntryTo source) {
        if ( source == null ) {
            return null;
        }

        MonthEntry monthEntry = new MonthEntry();

        monthEntry.setId( source.getId() );
        monthEntry.setEntryYear( source.getEntryYear() );
        monthEntry.setEntryMonth( source.getEntryMonth() );
        monthEntry.setExpectedState( source.getExpectedState() );
        monthEntry.setRealState( source.getRealState() );
        monthEntry.setActualState( source.getActualState() );

        return monthEntry;
    }
}
