public class Words{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters == 0){
      System.out.println(result);
    }else {
      for(int i = 0; i < alphabet.length(); i++){
        makeWords(remainingLetters-1, result + alphabet.charAt(i), alphabet);
      }
    }
  }

  public static String toWords(int n){
    if(n < 12){
      if(n== 12){
        return "twelve";
      }
      if(n== 11){
        return "eleven";
      }
      if(n==10){
        return "ten";
      }
      if(n==9){
        return "nine";
      }
      if(n==8){
        return "eight";
      }
      if(n==7){
        return "seven";
      }
      if(n==6){
        return "six";
      }
      if(n==5){
        return "five";
      }
      if(n==4){
        return "four";
      }
      if(n==3){
        return "three";
      }
      if(n==2){
        return "two";
      }
      if(n==1){
        return "one";
      }
      if(n==0){
        return "zero";
      }
    }
  }

  public static void main(String args[]){
    makeWords(3, "", "xy");
  }
}
