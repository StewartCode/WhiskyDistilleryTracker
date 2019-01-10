package com.codeclan.example.whiskydistillery.repositories;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
//import com.sun.org.apache.xpath.internal.operations.String;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class WhiskyRepositoryImpl  implements WhiskyRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    public List<Whisky> findAllWhiskiesByYear(int year){
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("year", year));
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }

    public List<Whisky> findAllWhiskiesByRegion(String region){
        List<Whisky> result = null;
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

    public List<Whisky> findAllWhiskiesByDistilleryAndAge(String distillery, int age){
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("name", distillery));
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }

}
