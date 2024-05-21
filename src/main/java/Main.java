import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Create your users
        //Enter your choice


        Scanner scanner = new Scanner(System.in);
        User user1 = new User();
        User user2 = new User();


        //assigning strings to a number
        int[] numbers1 = {1, 2};
        String[] choices = {"Rock", "Paper", "Scissors"};


        System.out.println("Enter your choice");

        user1.setChoiceFromInput();
        String move = user1.getHumanMove();

        user2.ComputerChoice();
        int computerMove = user2.getComputerMove();
        String computerMoveString = choices[computerMove];


        if (user1.equals(computerMoveString)) {
            System.out.println("It's a tie!");
        {
            if (computerMoveString.equals("Scissors")) {
                System.out.println("You win! Rock beats Scissors.");
            } else {
                System.out.println("You lose! Paper beats Rock.");
            }


        }
        }
    }
}
