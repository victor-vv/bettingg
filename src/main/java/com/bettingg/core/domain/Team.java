package com.bettingg.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "teams", schema = "bettingg", catalog = "")
public class Team {
    private int teamId;
    private String name;
    private String city;

    @Id
    @Column(name = "TEAM_ID", nullable = false)
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "TEAM_NAME", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String teamName) {
        this.name = teamName;
    }

    @Basic
    @Column(name = "TEAM_CITY", nullable = false, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String teamCity) {
        this.city = teamCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team that = (Team) o;

        if (teamId != that.teamId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
