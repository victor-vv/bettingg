package com.bettingg.core.dao;

import com.bettingg.core.domain.Team;
import com.bettingg.core.util.HibernateFactory;

import java.util.List;

public class TeamDao {

    public Team findById(int id) {
        return HibernateFactory.getSessionFactory().openSession().get(Team.class, id);
    }

    public List<Team> getCurrentTeams() {
        return HibernateFactory.getSessionFactory().openSession().createQuery("From Team").list();
    }
}
