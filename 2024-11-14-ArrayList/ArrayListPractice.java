import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> arr = new ArrayList<String>(size);
    for(int i = 0; i < size; i++) {
      String temp = "";
      int tempInt = (int)(11 * Math.random());
      if(tempInt != 0) {
        temp+=tempInt;
      }
      arr.add(temp);
    }
    return arr;
  }

  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original){
    ArrayList<String> result = new ArrayList<String>(original.size());
    for (int i = original.size()-1; i > -1; i--){
      result.add(original.get(i));
    }
    return result;
  }
}
