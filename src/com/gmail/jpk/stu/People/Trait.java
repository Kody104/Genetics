package com.gmail.jpk.stu.People;

public class Trait {
	
	private String Name;
	private boolean MustPass;
	private int CharMod; //Charisma Modifier
	private int KindMod; //Kindness Modifier
	private int DrivMod; //Drive Modifier
	private int SkepMod; //Skepticism Modifier
	
	public Trait(Traits t)
	{
		this.Name = t.getName();
		this.MustPass = t.getMustPass();
		this.CharMod = t.getChar();
		this.KindMod = t.getKind();
		this.DrivMod = t.getDriv();
		this.SkepMod = t.getSkep();
	}
	
	public String getName()
	{
		return Name;
	}
	
	public boolean getMustPass()
	{
		return MustPass;
	}
	
	public int getCharMod()
	{
		return CharMod;
	}
	
	public int getKindMod()
	{
		return KindMod;
	}
	
	public int getDrivMod()
	{
		return DrivMod;
	}
	
	public int getSkepMod()
	{
		return SkepMod;
	}
}
