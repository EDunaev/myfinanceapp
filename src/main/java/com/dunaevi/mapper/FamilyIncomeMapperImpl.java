package com.dunaevi.mapper;

import com.dunaevi.controller.to.FamilyIncomeTo;
import com.dunaevi.controller.to.FamilyMemberTo;
import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.entity.FamilyMember;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-01T20:03:54+0200",
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

        return familyIncomeTo;
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
}
