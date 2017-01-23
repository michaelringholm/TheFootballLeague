package com.opusmagus.models;

import org.springframework.stereotype.Component;

import com.opusmagus.entity.Ball;
import com.opusmagus.entity.Match;

@Component
public class MatchModel {

	public Match getMatch(long teamId) {
		Match match = new Match(1, 1, 2, 1, 0, 1);
		match.Ball = new Ball(70,30,100,60);
		return match;
	}

}
