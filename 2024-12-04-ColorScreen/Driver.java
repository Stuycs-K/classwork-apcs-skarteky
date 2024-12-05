public class Driver{
  public static void main(String[] args){
    for(int i = 0; i < 40; i++){
      Text.color(Text.background(Text.RED));
      System.out.print("=");
      Text.color(Text.background(Text.BLUE));
      System.out.print("=");
    }
    System.out.println(Text.RESET);
    for(int i = 0; i < 15; i++) {
    	Text.color(Text.background(Text.BLUE));
        System.out.print("=");
        System.out.print(Text.RESET);
        for(int j = 0; j < 78; j++) {
        	System.out.print(" ");
        }
        Text.color(Text.background(Text.RED));
        System.out.println("=");
        
        Text.color(Text.background(Text.RED));
        System.out.print("=");
        System.out.print(Text.RESET);
        for(int j = 0; j < 78; j++) {
        	System.out.print(" ");
        }
        Text.color(Text.background(Text.BLUE));
        System.out.print("=");
        System.out.println(Text.RESET);
    }
    for(int i = 0; i < 40; i++){
        Text.color(Text.background(Text.BLUE));
        System.out.print("=");
        Text.color(Text.background(Text.RED));
        System.out.print("=");
      }
    System.out.print(Text.RESET);
    Text.go(2, 18);
    int[] random = {(int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100)};
    for(int i : random) {
    	if(i > 75) {
    		Text.color(Text.GREEN);
    		System.out.print(i);
    	}
    	if(i < 25) {
    		Text.color(Text.RED);
    		System.out.print(i);
    	}
    	if(i > 24 && i < 76){
    		System.out.print(i);
    	}
    	System.out.print(Text.RESET);
    	for(int j = 0; j < (80 - 5)/4; j++) {
    		System.out.print(" ");
    	}
    }
    Text.go(3, 2);
    for(int i = 0; i < 39; i++){
        Text.color(Text.background(Text.BLUE));
        System.out.print("-");
        Text.color(Text.background(Text.RED));
        System.out.print("-");
      }
    
    Text.go(15, 1);
    System.out.println(Text.RESET);
    
    Text.go(16, 15);
    System.out.println("  / \\______________/ \\");
    Text.go(17, 15);
    System.out.println("/                     \\ ");
    Text.go(18, 15);
    System.out.println("|                     | ");
    Text.go(19, 15);
    System.out.println("=      o        o     =");
    Text.go(20, 15);
    System.out.println("\\          w         /");
    Text.go(21, 12);
    System.out.println("-----(  )--------(   )------------");
    Text.go(18, 40);
    System.out.print(" ------------------------");
    Text.go(19, 40);
    System.out.print("<  MEOW FEED ME MEOW      |");
    Text.go(20, 40);
    System.out.print("-------------------------");
    
    
    Text.go(31, 1);
    System.out.println(Text.RESET);
  }
}
