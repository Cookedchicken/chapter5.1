package practice;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String result;
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1-for door One\n2-for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
		{
			System.out.println("Door 1 good choice amoung the following Chests.");
			System.out.println("1- For Chest One\n2-For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) {
				result = "a pile of gold";
			}
			else if(chestChoice == 2) 
			{
				result = "OH, get yeeted";
			}
		}
	else if (doorChoice == 2)
	{
		result = "burro!, Wait, why is there a donkey?";
	}
	else if (doorChoice == 3)
	{
		result ="a long fast food line!";
	}
	else if (doorChoice == 999) {
		System.out.println("You enter a special room with 3 books on the table, there are no +" + "words on the cover. Do you choose Book 1, Book 2 or Book 3?" );
		bookChoice = input.next();
		if()
	else
	{
		result = "nothing because that was not a choice!";	
				
	}
	
	
	public static void displayMessage(String result) 
	{
		System.out.println("You won" + result);
	}
}