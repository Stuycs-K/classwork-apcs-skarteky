public class Driver{
  public static void main(String[] args){
    for(int i = 0; i < 40; i++){
      Text.color(Text.background(Text.RED));
      System.out.print(" ");
      Text.color(Text.background(Text.BLUE));
      System.out.print(" ");
    }
    System.out.println(Text.RESET);
    for(int i = 0; i < 15; i++) {
    	Text.color(Text.background(Text.BLUE));
        System.out.print(" ");
        System.out.print(Text.RESET);
        for(int j = 0; j < 78; j++) {
        	System.out.print(" ");
        }
        Text.color(Text.background(Text.RED));
        System.out.println(" ");
        
        Text.color(Text.background(Text.RED));
        System.out.print(" ");
        System.out.print(Text.RESET);
        for(int j = 0; j < 78; j++) {
        	System.out.print(" ");
        }
        Text.color(Text.background(Text.BLUE));
        System.out.print(" ");
        System.out.println(Text.RESET);
    }
    for(int i = 0; i < 40; i++){
        Text.color(Text.background(Text.BLUE));
        System.out.print(" ");
        Text.color(Text.background(Text.RED));
        System.out.print(" ");
      }
    Text.go(2, 1);
    int[] random = new int[3]
    
    
    
    System.out.println(Text.RESET);
  }
}
