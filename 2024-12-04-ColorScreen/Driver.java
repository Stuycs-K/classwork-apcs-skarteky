public class Driver{
  public static void main(String[] args){
    for(int i = 0; i < 40; i++){
      Text.color(Text.background(Text.RED));
      System.out.println(".");
      Text.color(Text.background(Text.BLUE));
      System.out.println(".");

    }
    Text.color(Text.RESET);
  }
}
