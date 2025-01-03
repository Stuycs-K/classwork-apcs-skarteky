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

  public static void main(String args[]){
    makeWords(3, "", "abc");
  }
}
