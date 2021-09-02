package com.dunaevi.mapper;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.controller.to.FamilyMemberTo;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.entity.FamilyMember;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-02T09:56:05+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
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

    protected FamilyMember familyMemberToToFamilyMember(FamilyMemberTo familyMemberTo) {
        if ( familyMemberTo == null ) {
            return null;
        }

        FamilyMember familyMember = new FamilyMember();

        familyMember.setId( familyMemberTo.getId() );
        familyMember.setName( familyMemberTo.getName() );

        return familyMember;
    }
}
