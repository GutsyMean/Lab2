package lab2;

import java.util.Random;

public class Hero 
{
	String name;
	String hClass;
	int level;
	int experience;
	static final int MAX_LEVEL = 10;
	static final int[] LEVELS = {5, 10, 15, 20, 30, 40, 50, 75, 100, 150};
	Random rand = new Random();
	
	
	public Hero(String name)
	{
		this.name = name;
		hClass = "";
		level = 1;
		experience = 0;
	}
	
	public String getName()
	{
		return name;
	}
	public String gethClass()
	{
		return hClass;
	}
	public int getLevel()
	{
		return level;
	}
	
	public void sethClass(String hClass)
	{
		this.hClass = hClass;
	}
	public void setLevel(int level)
	{
		this.level = level;
	}
	public void setRandomLevel()
	{
		level = rand.nextInt(10)+1;
	}
	
	public void gainExperience(int experience)
	{
		this.experience = experience;
		while (level != MAX_LEVEL)
		{
			for (int i = 0; i<LEVELS.length && this.experience > LEVELS[i]; i++)  
			{
				this.experience -= LEVELS[i];
				level++;
			}
		}
	}
	
}






