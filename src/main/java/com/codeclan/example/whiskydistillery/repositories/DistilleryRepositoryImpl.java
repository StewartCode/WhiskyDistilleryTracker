package com.codeclan.example.whiskydistillery.repositories;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom{


    @Autowired
    EntityManager entityManager;

    public List<Whisky> findAllWhiskies(Distillery distillery){
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("distillery", distillery));
            result = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }

    public List<Distillery> findAllDistilleries(String region){
        List<Distillery> result = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("region", region));
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }

}
