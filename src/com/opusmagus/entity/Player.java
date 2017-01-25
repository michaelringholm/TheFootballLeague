package com.opusmagus.entity;

public class Player {
	public Player(int id, String name, PositionEnum position) {
		Id = id;
		Name = name;
		Position = position;
	}
	public long Id;
	public String Name;
	public int Shooting;
	public int Tackling;
	public int Passing;
	public int Heading;
	public int Keeping;
	public int Height;
	public int Weight;
	public int Strength;
	public int MarketValue;
	public int ContractDaysLeft;
	public int Age;
	public int Speed;
	public int MonthlyWage;
	public PositionEnum Position;
	
	public enum PositionEnum {None, Bench, Keeper, Defence, Midfield, Attack}
}
