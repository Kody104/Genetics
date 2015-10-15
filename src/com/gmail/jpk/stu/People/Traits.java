package com.gmail.jpk.stu.People;

public enum Traits {
	KindHearted("Kind-Hearted", 1, 35, false, 0, 2, 0, -1),
	CruelHearted("Cruel-Hearted", 1, 35, false, 0, -2, 0, 1),
	Greedy("Greedy", 2, 35, false, -1, -1, 2, 0),
	Charitable("Charitable", 2, 35, false, 1, 1, 0, 0),
	Genius("Genius", 3, 1, false, 2, 0, 2, 3),
	Imbecile("Imbecile", 3, 3, true, -3, -3, 0, -3),
	Lunatic("Lunatic", 4, 3, false, -1, -2, 3, 0),
	Rational("Rational", 4, 10, true, 1, 0, 1, 2),
	GoodMannered("Good-Mannered", 5, 35, false, 1, 1, 0, 0),
	IllMannered("Ill-Mannered", 5, 35, false, -1, -1, 0, 0),
	Depression("Depression", 6, 7, true, 0, 0, -3, 0),
	Happiness("Happiness", 6, 10, false, 2, 0, 3, 0);
	
	private String Name;
	private int ClassId;
	private int GainChance;
	private boolean MustPass;
	private int Char;
	private int Kind;
	private int Driv;
	private int Skep;
	
	Traits(String Name, int ClassId, int GainChance, boolean MustPass, int Char, int Kind, int Driv, int Skep)
	{
		this.Name = Name;
		this.ClassId = ClassId;
		this.GainChance = GainChance;
		this.MustPass = MustPass;
		this.Char = Char;
		this.Kind = Kind;
		this.Driv = Driv;
		this.Skep = Skep;
	}
	
	protected int getClassId()
	{
		return ClassId;
	}
	
	protected String getName()
	{
		return Name;
	}
	
	protected int getGainChance()
	{
		return GainChance;
	}
	
	protected boolean getMustPass()
	{
		return MustPass;
	}
	
	protected int getChar()
	{
		return Char;
	}
	
	protected int getKind()
	{
		return Kind;
	}
	
	protected int getDriv()
	{
		return Driv;
	}
	
	protected int getSkep()
	{
		return Skep;
	}
	
}
