import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Code{


  public static int getNum(String input){
    int positionX = 1;
    int positionY = 1;
    int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9}};
    int i = 0;
    while(i < input.length()){
      char nextMove = input.charAt(i);
      if(nextMove == 'L'){
        if(positionX != 0) positionX--;
      }
      if(nextMove == 'R'){
        if(positionX != 2)positionX++;
      }
      if(nextMove == 'D'){
        if(positionY != 0)positionY--;
      }
      if(nextMove == 'U'){
        if(positionY != 2)positionY++;
      }
      i++;
    }
    return keypad[positionY][positionX];
  }
  public static String findCode(String filename){
    String code = "";
    try{File file = new File(filename);
    Scanner input = new Scanner(file);
    while(input.hasNextLine()){
      String in = input.nextLine();
      code+=getNum(in);
    }
    return code;
    }catch(FileNotFoundException e){
      return null;
    }
  }
  public static void main(String[] args){
    System.out.println(findCode("input2.txt"));
  }
}
