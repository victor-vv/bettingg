package com.bettingg.core;

import com.bettingg.core.dao.TeamDao;
import com.bettingg.core.domain.Team;
import com.bettingg.core.service.TeamService;
import com.bettingg.core.util.HibernateFactory;
import org.hibernate.Session;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateFactory.getSessionFactory().openSession();

        session.beginTransaction();

        TeamService teamService = new TeamService(new TeamDao());
//        Team team = new Team();
//        team.setName("AMKAR");
//        team.setCity("PERM");
//        session.save(team);
//        session.getTransaction().commit();
        for (Team team : teamService.getCurrentTeams()) {
            System.out.println(team.getName());
        }
        session.close();


    }
}
