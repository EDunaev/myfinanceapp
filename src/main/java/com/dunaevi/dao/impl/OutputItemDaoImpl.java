package com.dunaevi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dunaevi.dao.OutputItemDao;
import com.dunaevi.entity.OutputItem;

@Repository
@Transactional
public class OutputItemDaoImpl implements OutputItemDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<OutputItem> getOutputItem() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<OutputItem> query = currentSession
                .createQuery("from OutputItem", OutputItem.class);
        List<OutputItem> result = query.getResultList();
        return result;
    }

    @Override
    public void saveOutputItem(OutputItem outputItem) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(outputItem);

    }

    @Override
    public OutputItem getOutputItem(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        OutputItem outputItem = currentSession.get(OutputItem.class, id);
        return outputItem;
    }

    @Override
    public void deleteOutputItem(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession
                .createQuery("delete from OutputItem where id=:theId");
        query.setParameter("theId", id);

        query.executeUpdate();

    }

}
