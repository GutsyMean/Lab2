package lab2;

import java.util.Random;

public class Hero 
{	
	Random rand = new Random();
	private String name;
    private String hClass;
    private int level;
    private int experience;
	public static final int MAX_LEVEL = 10;
	public static final int[] LEVELS = {5, 10, 15, 20, 30, 40, 50, 75, 100, 150};

	
	public Hero(String name)
	{
		this.name = name;
		this.hClass = "";
		this.level = 1;
		this.experience = 0;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String gethClass()
	{
		return this.hClass;
	}
	public int getLevel()
	{
		return this.level;
	}
	
	public void setName(String name)
	{
		this.name = name;
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
		this.level = rand.nextInt(10)+1;
	}
	
	public void gainExperience(int experience) 
    {
        this.experience += experience;
        while (this.experience >= LEVELS[this.level - 1]) 
        {
            this.level++;
            this.experience = 0;
        }
    }
	
	public String toString() 
	{
        return this.name + " the " + this.hClass + " is level " + this.level + " with " + this.experience + " experience";
	}
}








