package com.bettingg.core.service;

import com.bettingg.core.dao.TeamDao;
import com.bettingg.core.domain.Team;

import java.util.List;

public class TeamService {

    private TeamDao teamDao;

    public TeamService(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public List<Team> getCurrentTeams() {
        return teamDao.getCurrentTeams();
    }
}
