package com.opusmagus.dao;

import org.springframework.stereotype.Component;

import com.opusmagus.entity.Ball;
import com.opusmagus.entity.Match;
import com.opusmagus.entity.Player;
import com.opusmagus.entity.Team;

@Component
public class MatchDAO {
	
	public static Match match = new Match(1, 1, 2, 1);
	
	static {
		match.Ball = new Ball(70,30,100,60);
		match.HomeTeam = new Team(1, 1, "Greve", 1, 0, 0);
		match.HomeTeam.Players.add(new Player(1, "Per Larsen"));
		match.HomeTeam.Players.add(new Player(2, "Per Eriksen"));
		match.HomeTeam.Players.add(new Player(3, "Per Hansen"));
		match.HomeTeam.Players.add(new Player(4, "Per Toft"));
		
		match.AwayTeam = new Team(1, 1, "Herlev", 2, 0, 0);
		match.AwayTeam.Players.add(new Player(5, "Erik Madsen"));
		match.AwayTeam.Players.add(new Player(6, "Erik Knudsen"));
		match.AwayTeam.Players.add(new Player(7, "Erik Jelm"));
		match.AwayTeam.Players.add(new Player(8, "Erik Kalle"));
	}

	public Match getMatch(String user) {		
		return match;
	}

}
