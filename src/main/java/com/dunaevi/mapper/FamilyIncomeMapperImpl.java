package com.dunaevi.mapper;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.controller.to.FamilyMemberTo;
import com.dunaevi.controller.to.MonthEntryTo;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.entity.FamilyMember;
import com.dunaevi.entity.MonthEntry;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-21T11:55:23+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class FamilyIncomeMapperImpl implements FamilyIncomeMapper {

    @Override
    public FamilyIncomeTo mapEntityToTo(FamilyIncome source) {
        if ( source == null ) {
            return null;
        }

        FamilyIncomeTo familyIncomeTo = new FamilyIncomeTo();

        familyIncomeTo.setId( source.getId() );
        familyIncomeTo.setIncome( source.getIncome() );
        familyIncomeTo.setFamilyMember( familyMemberToFamilyMemberTo( source.getFamilyMember() ) );
        familyIncomeTo.setMonthEntry( monthEntryToMonthEntryTo( source.getMonthEntry() ) );
        familyIncomeTo.setRealIncome( source.getRealIncome() );

        return familyIncomeTo;
    }

    @Override
    public FamilyIncome mapToToEntity(FamilyIncomeTo source) {
        if ( source == null ) {
            return null;
        }

        FamilyIncome familyIncome = new FamilyIncome();

        familyIncome.setId( source.getId() );
        familyIncome.setIncome( source.getIncome() );
        familyIncome.setFamilyMember( familyMemberToToFamilyMember( source.getFamilyMember() ) );
        familyIncome.setMonthEntry( monthEntryToToMonthEntry( source.getMonthEntry() ) );
        familyIncome.setRealIncome( source.getRealIncome() );

        return familyIncome;
    }

    protected FamilyMemberTo familyMemberToFamilyMemberTo(FamilyMember familyMember) {
        if ( familyMember == null ) {
            return null;
        }

        FamilyMemberTo familyMemberTo = new FamilyMemberTo();

        familyMemberTo.setId( familyMember.getId() );
        familyMemberTo.setName( familyMember.getName() );

        return familyMemberTo;
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

    protected FamilyMember familyMemberToToFamilyMember(FamilyMemberTo familyMemberTo) {
        if ( familyMemberTo == null ) {
            return null;
        }

        FamilyMember familyMember = new FamilyMember();

        familyMember.setId( familyMemberTo.getId() );
        familyMember.setName( familyMemberTo.getName() );

        return familyMember;
    }

    protected MonthEntry monthEntryToToMonthEntry(MonthEntryTo monthEntryTo) {
        if ( monthEntryTo == null ) {
            return null;
        }

        MonthEntry monthEntry = new MonthEntry();

        monthEntry.setId( monthEntryTo.getId() );
        monthEntry.setEntryYear( monthEntryTo.getEntryYear() );
        monthEntry.setEntryMonth( monthEntryTo.getEntryMonth() );
        monthEntry.setExpectedState( monthEntryTo.getExpectedState() );
        monthEntry.setRealState( monthEntryTo.getRealState() );
        monthEntry.setActualState( monthEntryTo.getActualState() );

        return monthEntry;
    }
}
