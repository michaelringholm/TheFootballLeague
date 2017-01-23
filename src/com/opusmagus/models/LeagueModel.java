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
		league.Index = divisionIndex;
		league.Name = "Copper League 5";
		league.Teams = new ArrayList<Team>();
		league.Teams.add(new Team(1001, 1, "Blue Eagles", 1, 33, 5));
		league.Teams.add(new Team(1002, 1, "The Angels", 2, 31, 5));
		league.Teams.add(new Team(1003, 1, "Bad Boys", 3, 23, 5));
		league.Teams.add(new Team(1004, 1, "Snowmen", 4, 23, 15));
		league.Teams.add(new Team(1005, 1, "Vikings", 5, 33, 5));
		league.Teams.add(new Team(1006, 1, "The Brotherhood", 6, 33, 5));
		league.Teams.add(new Team(1007, 1, "Blue Eagles", 7, 33, 5));
		league.Teams.add(new Team(1008, 1, "Blue Eagles", 8, 33, 5));
		league.Teams.add(new Team(1009, 1, "Blue Eagles", 9, 33, 5));
		league.Teams.add(new Team(1010, 1, "Blue Eagles", 10, 33, 5));
		league.Teams.add(new Team(1001, 1, "Blue Eagles", 11, 33, 5));
		league.Teams.add(new Team(1011, 1, "Blue Eagles", 12, 33, 5));
		league.Teams.add(new Team(1012, 1, "Blue Eagles", 13, 33, 5));
		league.Teams.add(new Team(1013, 1, "Blue Eagles", 14, 33, 5));
		
		return league;
	}

}
