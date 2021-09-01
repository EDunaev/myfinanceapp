package com.dunaevi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dunaevi.dao.FamilyIncomeDao;
import com.dunaevi.entity.FamilyIncome;

@Repository
@Transactional
public class FamilyIncomeDaoImlp implements FamilyIncomeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<FamilyIncome> getFamilyIncome() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<FamilyIncome> query = currentSession
                .createQuery("from FamilyIncome", FamilyIncome.class);
        List<FamilyIncome> result = query.getResultList();
        return result;
    }

    @Override
    public void saveFamilyIncome(FamilyIncome familyIncome) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(familyIncome);

    }

    @Override
    public FamilyIncome getFamilyIncome(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        FamilyIncome familyIncome = currentSession.get(FamilyIncome.class, id);
        return familyIncome;
    }

    @Override
    public void deleteFamilyIncome(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession
                .createQuery("delete from FamilyIncome where id=:theId");
        query.setParameter("theId", id);

        query.executeUpdate();

    }

}
