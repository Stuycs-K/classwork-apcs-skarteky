import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    Cleric user = new Cleric(userName);
    //Do something with the input
    System.out.println("Username is: " + userName);
    System.out.println("Enter opponent's name");
    //Read one line of user input
    String oppName = userInput.nextLine();
    CodeWarrior opp = new CodeWarrior(oppName);
    //Do something with the input
    System.out.println("Opponent is: " + oppName);
  }
}
