public class MyArrays {
  public static void main(String args[]) {
    int[] test = {1,2,3};
    int[] test 2 = {4,5.6};
System.out.println(arrayToString(test));

System.out.println("Is returnCopy(test) different from test: " + (returnCopy(test) != test));
System.out.println("Did concatArray(test,test2) combine both: " + (arrayToString(concatArray(test, test2)).equals(arrayToString(test).substring(0,test.length-2)+ ", " + arrayToString(test2).substring(1)) );
  }

  public static String arrayToString(int[] nums) {
    String result = "[";
    for(int i = 0; i < nums.length; i++) {
      result = result + nums[i];
      if (i != nums.length - 1) {
        result = result + ", ";
      }
    }
    return result + "]";
  }
}
