import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args){
    try {
      File file = new File("ReadFile.java");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String temp = input.nextLine();
        if (temp.contains("{")){
          System.out.println(temp);
        }
      }
      input.close();
    } catch(FileNotFoundException ex){
      System.out.println("File not found");
      return;
    }
  }
}
