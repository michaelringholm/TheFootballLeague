package com.opusmagus.models;

import org.springframework.stereotype.Component;

import com.opusmagus.entity.Match;

@Component
public class MatchModel {

	public Match getMatch(long teamId) {
		Match match = new Match(1, 1, 2, 1, 0, 1);
		return match;
	}

}
