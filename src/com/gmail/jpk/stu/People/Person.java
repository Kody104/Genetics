package com.gmail.jpk.stu.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gmail.jpk.stu.Genetics.Genetics;

public class Person {

	private String Name;
	private List<Trait> All_Traits = new ArrayList<Trait>();
	private boolean isMale;
	private int Age;

	public Person(Person mom, Person dad) { // If I ever incorporate a passing down of traits
		Random r = new Random();
		isMale = r.nextBoolean();
		if (isMale) {
			Name = dad.getName();
		}
		else {
			Name = mom.getName();
		}
		Age = 0;

		for (Trait t : mom.getAllTraits()) {
			if (t.getMustPass()) {
				All_Traits.add(t);
			} else {
				int chance = r.nextInt(101);
				if (chance <= 45) {
					All_Traits.add(t);
				}
			}
		}
		for (Trait t : dad.getAllTraits()) {
			for (Trait tt : All_Traits) {
				if (t.equals(tt)) {
					break;
				}
			}
			if (t.getMustPass()) {
				All_Traits.add(t);
			} else {
				int chance = r.nextInt(101);
				if (chance <= 45) {
					All_Traits.add(t);
				}
			}
		}
	}

	public Person() {
		Random r = new Random();
		isMale = r.nextBoolean();
		Name = "Person " + Genetics.Counter;
		Genetics.Counter++;
		Age = 18;

		int curClass = 1;

		for (int i = 0; i < Traits.values().length; i++) {
			int chance = 0;
			chance = r.nextInt(101);

			if (curClass < Traits.values()[i].getClassId()) {
				curClass++;
			}
			if (curClass == Traits.values()[i].getClassId()) {
				if (chance <= Traits.values()[i].getGainChance()) {
					All_Traits.add(new Trait(Traits.values()[i]));
					curClass++;
				}
			}
		}
	}

	@Override
	public String toString() {
		int Charisma = 0;
		int Kindness = 0;
		int Drive = 0;
		int Skeptic = 0;

		for (Trait t : All_Traits) {
			Charisma += t.getCharMod();
			Kindness += t.getKindMod();
			Drive += t.getDrivMod();
			Skeptic += t.getSkepMod();
			System.out.println(t.getName());
		}
		return String.format(
				"%s:: Charisma: %d   Kindness: %d   Drive: %d   Skeptic: %d\n",
				Name, Charisma, Kindness, Drive, Skeptic);
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public List<Trait> getAllTraits() {
		return All_Traits;
	}
}
