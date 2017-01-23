package com.opusmagus.entity;

public class Match {
	
	public long MatchId;
	public long HomeTeamId;
	public long AwayTeamId;
	public int Round;
	public int MinutesGone;
	public Ball Ball;
	public Team HomeTeam;
	public Team AwayTeam;
	public Team StartingTeam;
	
	public Match(long matchId, long homeTeamId, long awayTeamId, int round) {
		MatchId = matchId;
		HomeTeamId = homeTeamId;
		AwayTeamId = awayTeamId;
		Round = round;
		MinutesGone = 0;
	}
		
	public void advance() {
		if(MinutesGone<90) {
			if(MinutesGone == 0)
				StartingTeam = HomeTeam;
			
			if(MinutesGone == 45)
				StartingTeam = AwayTeam;			
			
			MinutesGone++;
			
		}
	}
}
