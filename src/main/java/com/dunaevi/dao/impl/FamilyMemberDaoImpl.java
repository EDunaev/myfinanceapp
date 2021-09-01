package com.dunaevi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dunaevi.dao.FamilyMemberDao;
import com.dunaevi.entity.FamilyMember;

@Repository
@Transactional
public class FamilyMemberDaoImpl implements FamilyMemberDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<FamilyMember> getFamilyMember() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<FamilyMember> query = currentSession
                .createQuery("from FamilyMember", FamilyMember.class);
        List<FamilyMember> result = query.getResultList();
        return result;
    }

    @Override
    public void saveFamilyMember(FamilyMember familyMember) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(familyMember);

    }

    @Override
    public FamilyMember getFamilyMember(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        FamilyMember familyMember = currentSession.get(FamilyMember.class, id);
        return familyMember;
    }

    @Override
    public void deleteFamilyMember(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession
                .createQuery("delete from FamilyMember where id=:theId");
        query.setParameter("theId", id);

        query.executeUpdate();

    }

}
