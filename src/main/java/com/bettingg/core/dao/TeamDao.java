package com.bettingg.core.dao;

import com.bettingg.core.domain.Team;
import com.bettingg.core.util.HibernateFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class TeamDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Team findById(int id) {
        return HibernateFactory.getSessionFactory().openSession().get(Team.class, id);
    }

    public List<Team> getCurrentTeams() {
        Session session = HibernateFactory.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Team.class);
        return criteria.list();
    }
}
