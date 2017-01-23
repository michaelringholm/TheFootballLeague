package com.opusmagus.entity;

public class Team {
	public Team(long id, long divisionId, String name, int leaguePosition, int goalsScored, int goalsConceeded) {
		Id = id;
		Name = name;
		DivisionId = divisionId;
		LeaguePosition = leaguePosition;
		GoalsScored = goalsScored;
		GoalsConceeded = goalsConceeded;
		
	}
	public long Id;
	public long DivisionId;
	public String Name;
	public int LeaguePosition;
	public int GoalsConceeded;
	public int GoalsScored;
	public int getGoalDifference() {
		return GoalsScored-GoalsConceeded;
	}
}
