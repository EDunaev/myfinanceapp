package com.dunaevi.dao;

import java.util.List;

import com.dunaevi.entity.FamilyMember;

public interface FamilyMemberDao {

    public List<FamilyMember> getFamilyMember();
    
    public void saveFamilyMember(FamilyMember familyMember);

    FamilyMember getFamilyMember(int id);

    void deleteFamilyMember(int id);
}
