import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Code{


  public static int getNum(String input){
    int positionX = 1;
    int positionY = 1;
    int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9}};
    Scanner direct = new Scanner(input);
    while(direct.hasNextChar()){
      char nextMove = direct.nextChar();
      if(nextMove == 'L'){
        positionX--;
      }
      if(nextMove == 'R'){
        positionX++;
      }
      if(nextMove == 'D'){
        positionY--;
      }
      if(nextMove == 'U'){
        positionY++;
      }
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
    }catch(Exception e){
      return null;
    }
  }
  public static void main(String[] args){
    System.out.println(findCode("input2.txt"));
  }
}
