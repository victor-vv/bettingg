package com.bettingg.core;

import com.bettingg.core.dao.TeamDao;
import com.bettingg.core.domain.Team;
import com.bettingg.core.service.TeamService;

public class Application {

    public static void main(String[] args) {

        TeamService teamService = new TeamService(new TeamDao());
        for (Team team : teamService.getCurrentTeams()) {
            System.out.println(team.getName());
        }
    }
}
