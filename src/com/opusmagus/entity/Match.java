package com.opusmagus.entity;

public class Match {
	
	public Match(long matchId, long homeTeamId, long awayTeamId, int round, int minutesGone, int half) {
		MatchId = matchId;
		HomeTeamId = homeTeamId;
		AwayTeamId = awayTeamId;
		Round = round;
		MinutesGone = minutesGone;
		Half = half;
	}
	
	public long MatchId;
	public long HomeTeamId;
	public long AwayTeamId;
	public int Round;
	public int MinutesGone;
	public int Half;
	public Ball Ball;
}
