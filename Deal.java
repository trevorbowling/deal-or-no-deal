/*
* Date: July 22, 2014
* Purpose: Deal or No Deal Game
*/

import java.util.Scanner;

public class Deal
{

private int round = 1;
private int offer;
private Case case = new Case[25]
private int amount;
private int amountOfCases = 26;
private boolean continueGame = false;
private boolean quit = false;


public static void main(String[] args)
{

Scanner input = new Scanner(System.in);

System.out.print("There are 26 cases to choose from.");
System.out.println("Each case contains an amount of money ranging from one cent to one million dollars.";
System.out.println("Please choose the case yo belive has the million dollars in it: ");
int selection = input.nextInt();
System.out.print("The following cases have now been eliminated ffrom the game: " + );

System.out.println("Pick another case: ");
System.out.print(You chose case #" + selection");
System.out.println("Case #" + selection + " has " + '' + "in it");

System.out.println("1) Deal");
System.out.println("or");
System.out.println("2) No Deal");

System.out.println("Howie says you chose to stop at case # " + '' + " and risk losing " + '' + "? Howie says: ");


System.out.println("Case # " + selection + " contains " + amount " . Sorry! You made a bad deal. Howie says thanks for playing.");

System.out.println("You have won " + amount ". Howie says thanks for playing.");
double casevalue1[] = {50, 1000, 500000, 750, 25000, 500, 5, 0.01, 750000, 400, 300, 100000, 200000};

double casevalue2[] = {1000000, 1, 5000, 10, 75000, 25, 200, 400000, 50, 75, 200, 300000, 100};

Case[] cases = new Case[25];


for (int i = 0; i < cases.length; i++)
{
	int amount = values.get(i);
	cases[i] = new Case(amount, i + 1);
}

for (int j = 0; j < cases.length; j++)
{
	System.out.println("\t[" + cases[j].get() + "] ");
}


picks[numberOfPicks - 1] = guess;

}
}

