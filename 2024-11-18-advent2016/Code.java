import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Code{


  public static int getNum(String input, int x, int y){
    int positionX = x;
    int positionY = y;
    int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9}};
    int i = 0;
    while(i < input.length()){
      char nextMove = input.charAt(i);
      if(nextMove == 'L'){
        if(positionX != 0) positionX--;
      }
      if(nextMove == 'R'){
        if(positionX < 2)positionX++;
      }
      if(nextMove == 'D'){
        if(positionY < 2)positionY++;
      }
      if(nextMove == 'U'){
        if(positionY > 0)positionY--;
      }
      i++;
    }
    return keypad[positionY][positionX];
  }
  public static int getX(String input, int x, int y){
    int positionX = x;
    int i = 0;
    while(i < input.length()){
      char nextMove = input.charAt(i);
      if(nextMove == 'L'){
        if(positionX != 0) positionX--;
      }
      if(nextMove == 'R'){
        if(positionX != 2)positionX++;
      }
      i++;
    }
    System.out.println(positionX);
    return positionX;
  }
  public static int getY(String input, int x, int y){
    int positionY = y;
    int i = 0;
    while(i < input.length()){
      char nextMove = input.charAt(i);
      if(nextMove == 'D'){
          if(positionY < 2)positionY++;
        }
        if(nextMove == 'U'){
          if(positionY > 0)positionY--;
        }
      i++;
    }
    System.out.println(positionY);
    return positionY;
  }
  public static String findCode(String filename){
    String code = "";
    int x = 1;
    int y = 1;
    try{File file = new File(filename);
    Scanner input = new Scanner(file);
    while(input.hasNextLine()){
      String in = input.nextLine();
      code+=getNum(in, x, y);
      x = getX(in, x, y);
      y = getY(in, x, y);
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
