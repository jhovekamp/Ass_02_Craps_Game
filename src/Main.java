import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //if, if then else, while loop
        //Random numbers simulations - gaussian vs linear probability
        //Java random & util for dice rolls

        //Craps Game Rules
        //Two Dice
        //Generate die rolls
        //Throw both and add, results possible 2 - 12

        //Case 1 or 2 -Instant win/ loss
        //Craps = 2, 3, or 12 - craps out - Lose
        //Natural 7 or 11 - Win
        //Ask if want to play again

        //Case 3
        //Other value 4,5,6,8,9,10 - becomes points by adding dice together
        //Continue to roll and add to points, 7 lose, match point win
        //while loop keep rolling for point
        //Keep rolling if you want to continue to play

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int point = 0;
        String continueYN = "";
        boolean roll = true;
        do{
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapRoll = die1 + die2;

        System.out.println("You rolled " + die1 + " + " + die2 + " = " + crapRoll + ".");

            if (crapRoll == 7 || crapRoll == 11) {
                System.out.println("You rolled " + crapRoll + ". That is a Natural. You win!");
                roll = false;
            } else if (crapRoll == 2 || crapRoll == 3 || crapRoll == 12) {
                System.out.println("You rolled " + crapRoll + ". That is craps. You lose. The Game is over.");
                roll = false;
            } else {
                System.out.println("Point = " + crapRoll + ". Keep rolling for point.");
                point = crapRoll;
                roll = true;
            }
            while (roll) {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                crapRoll = die1 + die2;

                if (crapRoll == point) {
                    System.out.println("You rolled " + crapRoll + ". That is point. You WIN!");
                    roll = false;
                } else if (crapRoll == 7) {
                    System.out.println("You rolled a " + crapRoll + ". You LOSE!");
                    roll = false;
                } else {
                    System.out.println("You rolled a " + crapRoll + ". Roll again.");
                }  }
            System.out.print("Do you want to play again? [Y/N]? ");
            continueYN = in.nextLine();
            System.out.println("________________________________");
        }
        while (continueYN.equalsIgnoreCase("Y"));
    }
}