package com.dunaevi.mapper;

import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.entity.MonthEntry;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-15T14:42:40+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 11.0.8 (Oracle Corporation)"
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
