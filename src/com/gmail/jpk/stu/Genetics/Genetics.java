package com.gmail.jpk.stu.Genetics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gmail.jpk.stu.People.Person;
import com.gmail.jpk.stu.People.Trait;

public class Genetics {
	
	private static List<Person> People = new ArrayList<Person>();
	private static Person player;
	public static int Counter = 1;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 1000; i++)
			People.add(new Person()); // Create person
		while(true)
			GetCommand(); // Main loop
	}
	
	private static void GetCommand() {
		String input = ""; // The all encompassing variable
		String cmd = ""; // The command part of the variable
		String arg = ""; // The arguments of the command
		System.out.print("Input command: ");
		input = scan.nextLine(); // Get input
		if(input.contains(" ")) { // If input has a space
			arg = input.substring(input.indexOf(" ") + 1); // Grabs argument
			cmd = input.substring(0, input.indexOf(" "));  // Grabs command
		}
		else {
			cmd = input; // Command is the input
		}
		switch(cmd.toLowerCase()) { // Whatever the command is
			default:
				break;
			case "count":
				int percent = (int)((CountPeople(arg) / 1000F) * 100); // Gets percentage
				System.out.println(String.format("There are %s people who have the trait %s.\nThat's %d percent of the population!", CountPeople(arg), arg, percent));
				break;
		}
	}
	
	private static int CountPeople(String traitName)
	{
		int counter = 0;
		for(Person p : People)
		{
			if(!traitName.equals("")) // If the trait isn't nothing.
			{
				for(Trait t : p.getAllTraits()) // For all traits
				{
					if(t.getName().toLowerCase().equals(traitName.toLowerCase())) // If our string is the same as their traitname string
						counter++; // Increase our counter by one.
				}
			}
			else
			{
				//if(p.getAllTraits().size() == 0)
					//counter++;
			}
		}
		return counter;
	}
	
	private static Person GetPerson(String traitName, int index)
	{
		for(Person p : People)
		{
			for(Trait t : p.getAllTraits())
			{
				if(t.getName().toLowerCase().equals(traitName.toLowerCase()))
				{
					if(index <= 0)
					{
						return p;
					}
					else
					{
						index--;
						break;
					}
				}
			}
		}
		return null;
	}
}
