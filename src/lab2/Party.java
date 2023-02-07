package lab2;

public class Party 
{
	Hero[] heroes;
	
	public Party()
	{
		heroes = new Hero[3];
	}
	
	public void addHero(int index, Hero hero)
	{
		this.heroes[index] = hero;
	}
	public Hero removeHero(int index)
	{
		return this.heroes[index] = null;
	}
	public Hero getHero(int index)
	{
		return this.heroes[index];
	}
	public void gainExperience(int experience)
	{
		for (int i = 0; i< heroes.length; i++)
		{
			heroes[i].gainExperience(experience);
		}
	}
	public String toString()
	{
		String str = "";
		for (int i = 0; i< heroes.length; i++)
		{
			str += heroes[i].toString() + "\n";
		}
		return str;
	}
}
