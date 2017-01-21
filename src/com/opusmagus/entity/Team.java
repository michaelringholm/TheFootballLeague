package com.opusmagus.entity;

public class Team {
	public Team(long id, long divisionId, String name) {
		Id = id;
		Name = name;
		DivisionId = divisionId;
	}
	public long Id;
	public long DivisionId;
	public String Name;
}
