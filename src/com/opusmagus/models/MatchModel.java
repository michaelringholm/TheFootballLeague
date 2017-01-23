package com.opusmagus.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opusmagus.dao.MatchDAO;
import com.opusmagus.entity.Match;

@Component
public class MatchModel {

	@Autowired
	MatchDAO matchDao;
	
	public Match getMatch(String user) {
		return matchDao.getMatch(user);
	}

	public Match advance(String user) {
		Match match = matchDao.getMatch(user);
		match.advance();
		return match;
	}

}
