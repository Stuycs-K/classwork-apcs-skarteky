public class MyArrays {
  public static void main(String args[]) {
    int[] test = {1,2,3};
    int[] test2 = {4,5,6};
System.out.println(arrayToString(test));


System.out.println("Original: " + arrayToString(test) + " Copy: " + arrayToString(returnCopy(test)) +
"Is returnCopy(test) different from test: " + (returnCopy(test) != test));
System.out.println("New ary: " + arrayToString(concatArray(test,test2)) + 
" Did concatArray(test,test2) combine both: " + (arrayToString(concatArray(test, test2)).equals(arrayToString(test).substring(0,(arrayToString(test)).length()-1)+ ", " + arrayToString(test2).substring(1))));
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
  
  public static int[] returnCopy(int[]ary) {
	int[] result = new int[ary.length];
	for(int i = 0; i < ary.length; i++) {
		result[i] = ary[i];
	}
	return result;
  }
  
  public static int[] concatArray(int[]ary1,int[]ary2) {
	  int[] result = new int[ary1.length + ary2.length];
	  for (int i = 0; i < ary1.length; i++) {
		  result[i] = ary1[i];
	  }
	  for (int j = 0; j < ary2.length; j++) {
		  result[ary1.length + j] = ary2[j];
	  }
	  return result;
  }
}
