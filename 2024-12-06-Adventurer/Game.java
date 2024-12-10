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
    while(user.getHP() > 0 && opp.getHP() > 0){
      System.out.println("Turn " + turn);

      System.out.println(user.toString() + " - " + user.getHP() + "/" + user.getmaxHP() + "HP - " + user.getSpecial() + "/" + user.getSpecialMax() + " " + user.getSpecialName());
      System.out.println(opp.toString() + " - " + opp.getHP() + "/" + opp.getmaxHP() + "HP - " + opp.getSpecial() + "/" + opp.getSpecialMax() + " " + opp.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();
     while( !move.equals("a") && !move.equals("attack") && !move.equals("su") && !move.equals("support") && !move.equals("sp") && !move.equals("special") && !move.equals("q") && !move.equals("quit") ) {
         System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
         move = userInput.nextLine();
     }
      if(move.equals("a") || move.equals("attack")){
        System.out.println(user.attack(opp));
      }
      if(move.equals("sp") || move.equals("special")){
    	  System.out.println(user.specialAttack(user));
      }
      if(move.equals("su") || move.equals("support")){
    	  System.out.println("Support 1 or 2");
    	  String choose = userInput.nextLine();
    	  if(choose.equals("1")) {
    		  System.out.println(user.support()); 
    	  }else {
    		  System.out.println(user.support(user));
    	  }
      }
      if(move.equals("quit")){
        user.setHP(0);
        opp.setHP(0);
        System.out.println("Game Quit.");
        break;
      }
      int temp = (int)(Math.random() * 3);
      if(temp == 0) {
    	  System.out.println(opp.attack(user));
      }
      if(temp == 1) {
    	  int temp2 = (int)(Math.random() * 2);
    	  if(temp2 == 0) {
    		  System.out.println(opp.support());
    	  }else {
    		  System.out.println(opp.support(opp));
    	  }
      }
      if(temp == 2) {
    	  System.out.println(opp.specialAttack(user));
      }
      turn++;

    }
    String loser = "";
    if(user.getHP() < 1) {
    	loser = userName;
    }else {
    	loser = oppName;
    }
    System.out.println("Game over! " + loser + " loses!");
  }
}
