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

    int turn = 1;
    System.out.println("Battle Start");
    while(user.getHP() != 0 && opp.getHP() != 0){
      System.out.println("Turn " + turn);

      System.out.println(user.toString() + " - " + user.getHP() + "/" + user.getmaxHP() + " - " + user.getSpecial() + "/" + user.getSpecialMax() + " " + user.getSpecialName());
      System.out.println(opp.toString() + " - " + opp.getHP() + "/" + opp.getmaxHP() + " - " + opp.getSpecial() + "/" + opp.getSpecialMax() + " " + opp.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();
      if(move.equals("a") || move.equals("attack")){
        user.attack(opp);
      }
      if(move.equals("sp") || move.equals("special")){
        user.attack(opp);
      }
      if(move.equals("su") || move.equals("support")){
        user.attack(opp);
      }
      if(move.equals("quit")){
        user.setHP(0);
        opp.setHP(0);
      }

    }
  }
}
