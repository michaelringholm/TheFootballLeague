package com.opusmagus.models;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.opusmagus.entity.League;
import com.opusmagus.entity.Team;

@Component
public class LeagueModel {

	public League getLeague(int divisionIndex) {
		League league = new League();
		league.DivisionIndex = divisionIndex;
		league.DivisionName = "Copper League 5";
		league.Teams = new ArrayList<Team>();
		league.Teams.add(new Team(1, 1, "Blue Eagles"));
		league.Teams.add(new Team(2, 1, "Blue Eagles"));
		league.Teams.add(new Team(3, 1, "Blue Eagles"));
		league.Teams.add(new Team(4, 1, "Blue Eagles"));
		league.Teams.add(new Team(5, 1, "Blue Eagles"));
		league.Teams.add(new Team(6, 1, "Blue Eagles"));
		league.Teams.add(new Team(7, 1, "Blue Eagles"));
		league.Teams.add(new Team(8, 1, "Blue Eagles"));
		league.Teams.add(new Team(9, 1, "Blue Eagles"));
		league.Teams.add(new Team(10, 1, "Blue Eagles"));
		league.Teams.add(new Team(11, 1, "Blue Eagles"));
		league.Teams.add(new Team(12, 1, "Blue Eagles"));
		league.Teams.add(new Team(13, 1, "Blue Eagles"));
		league.Teams.add(new Team(14, 1, "Blue Eagles"));
		league.Teams.add(new Team(15, 1, "Blue Eagles"));
		league.Teams.add(new Team(16, 1, "Blue Eagles"));
		league.Teams.add(new Team(17, 1, "Blue Eagles"));
		league.Teams.add(new Team(18, 1, "Blue Eagles"));
		
		return league;
	}

}
