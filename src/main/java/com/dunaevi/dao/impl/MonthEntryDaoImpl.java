package com.dunaevi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dunaevi.dao.MonthEntryDao;
import com.dunaevi.entity.MonthEntry;

@Repository
public class MonthEntryDaoImpl implements MonthEntryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<MonthEntry> getMontEntries() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<MonthEntry> query =
                currentSession.createQuery("from MonthEntry", MonthEntry.class);
        List<MonthEntry> result = query.getResultList();
        return result;
    }

    @Override
    public void saveMonthEntry(MonthEntry monthEntry) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(monthEntry);

    }

    @Override
    public MonthEntry getMonthEntry(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        MonthEntry monthEntry = currentSession.get(MonthEntry.class, id);
        return monthEntry;
    }

    @Override
    public void deleteMonthEntry(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession
                .createQuery("delete from FamilyMember where id=:theId");
        query.setParameter("theId", id);

        query.executeUpdate();

    }

}
