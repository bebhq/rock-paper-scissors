import java.util.Random;
import java.util.Scanner;

public class User {

    private String humanMove;
    private int computerMove;
    private int counter;
    Scanner user_input = new Scanner(System.in);

    public void setChoiceFromInput(){
        System.out.println("Rock, paper or scissors?");
        this.humanMove = user_input.next();

    }

    public void ComputerChoice(){
        System.out.println("Computer, make your choice!");
        Random random = new Random();
        this.computerMove = random.nextInt(3);

    }

    public int getComputerMove(){
        return computerMove;
    }

    public String getHumanMove(){
        return humanMove;
    }


}
