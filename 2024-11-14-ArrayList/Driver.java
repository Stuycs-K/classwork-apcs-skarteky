import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    System.out.println(ArrayListPractice.createRandomArray(10).toString());
    ArrayList<String> temp1 = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(temp1);
    System.out.println(temp1.toString());
    System.out.println(ArrayListPractice.makeReversedList(temp1).toString());

    ArrayList<String> temp2 = ArrayListPractice.createRandomArray(14);
    ArrayListPractice.replaceEmpty(temp2);
    System.out.println(temp2.toString());
    System.out.println(ArrayListPractice.makeReversedList(temp2).toString());

    ArrayList<String> temp3 = ArrayListPractice.createRandomArray(7);
    ArrayListPractice.replaceEmpty(temp3);
    System.out.println(temp3.toString());
    System.out.println(ArrayListPractice.makeReversedList(temp3).toString());


  }
}
