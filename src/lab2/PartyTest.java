package lab2;

import java.util.Random;
import java.util.Scanner;

public class PartyTest 
{
	public static void main(String[] args)
	{
		Party party = new Party();
		String[] classNames = {"Warrior", "Mage", "Thief", "Archer"};
		
		
		Hero hero1 = new Hero("Aria");
		Hero hero2 = new Hero("Ethan");
		Hero hero3 = new Hero("Liam");
		Hero hero4 = new Hero("Emma");
		
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<4; i++)
		{
			boolean validClass = false;
			String chosenClass;
			Hero currentHero;
			if (i == 0) {
				currentHero = hero1;
			  } else if (i == 1) {
			    currentHero = hero2;
			  } else if (i == 2) {
			    currentHero = hero3;
			  } else {
			    currentHero = hero4;
			  }
			  
			System.out.println("The available classes are:");
			for (int j = 0; j < classNames.length; j++) 
			{
				System.out.println(classNames[j]);
		    }
			System.out.println("\nChoose a class for " + currentHero.getName());
			
			chosenClass = sc.nextLine();
			chosenClass = chosenClass.toLowerCase();
			for (int j = 0; j < classNames.length; j++)
			{
				if (chosenClass.equals(classNames[j].toLowerCase()))
				{
					validClass = true;
				}
			}
			if (!validClass) 
			{
				System.out.println("That is not a valid class, but I admire your creativity.");
		        System.out.println("Please enter a valid class for " + currentHero.getName());
		        chosenClass = sc.nextLine();
		    }
			
			currentHero.sethClass(chosenClass);
		}

		party.addHero(0, hero1);
		party.addHero(1, hero2);
		party.addHero(2, hero3);

		//randomly set level
		Random rand = new Random();
		int randomHero = rand.nextInt(3);
		Hero currentRandomHero = party.getHero(randomHero);
		currentRandomHero.setRandomLevel();
		System.out.println(currentRandomHero.getName() + "'s level was randomized to " + currentRandomHero.getLevel());
		System.out.println(currentRandomHero.getName() + " was added to the party.");

		//Give the party experience
		int partyExperience =61;
		System.out.println("The party gained " + partyExperience + " experience.");
		party.gainExperience(partyExperience);
		System.out.println(party.toString());
	}
}
