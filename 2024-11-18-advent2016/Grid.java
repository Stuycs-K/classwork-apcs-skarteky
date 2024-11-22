import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Grid{


  public static int move(String movement, int direct){
    int direction = direct;
    if(movement.charAt(0) == 'L'){
      direction--;
    }else {
      direction++;
    }
    return direction;
  }
  
  public static String getDist(String m) {
	  String result = "";
	  for(int i = 0; i < m.length();i++) {
		  if(m.charAt(i) > 47 && m.charAt(i)< 58) {
			  result+= m.charAt(i);
		  }
	  }
	  return result;
  }

  public static int distance(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int xCoord = 0;
      int yCoord = 0;
      int direction = 1;
      while(input.hasNext()){
        String movement = input.next();
        direction = move(movement, direction);
        int dist = Integer.parseInt(getDist(movement));
        if(direction % 4 == 0){
          xCoord = xCoord - dist;
        }else{ if(direction % 2 == 0){
          xCoord = xCoord + dist;
        	}
        }
        if(direction %  4 == 3 || direction % 4 == -1){
          yCoord = yCoord - dist;
        }else{if(direction %  4 == 1 || direction % 4 == -3) {
        	yCoord = yCoord + dist;
        	} 
        }
      }
      return Math.abs(xCoord) + Math.abs(yCoord);
    }catch(FileNotFoundException ex){
        System.out.println("file not found");
        return 0;
    }
  }
  public static void main(String[] args){
    System.out.println(distance("input.txt"));
  }
}
