import java.util.Arrays;
public class ArrayDemo {
    public static void main(String args[]) {
      int[] test1 = {};
      System.out.println("are Arrays.toString(test1) and arrToString(test1) the same: " + Arrays.toString(test1).equals(arrToString(test1)));
      int[] test2 = {1,2,3};
      System.out.println("are Arrays.toString(test2) and arrToString(test2) the same: " + Arrays.toString(test2).equals(arrToString(test2)));
      int[] test3 = {-4,-5,-6};
      System.out.println("are Arrays.toString(test3) and arrToString(test3) the same: " + Arrays.toString(test3).equals(arrToString(test3)));
      int[] test4 = {-7,8,9,-10};
      System.out.println("are Arrays.toString(test4) and arrToString(test4) the same: " + Arrays.toString(test4).equals(arrToString(test4)));
      int[][] test5 = {};
      System.out.println("are Arrays.deepToString(test5) and arrToString(test5) the same: " + Arrays.deepToString(test5).equals(arrToString(test5)));
	  int[][] test6 = {{2,3},{-4,-4}};
      System.out.println("are Arrays.deepToString(test6) and arrToString(test6) the same: " + Arrays.deepToString(test6).equals(arrToString(test6)));
	  int[][] test7 = {{1},{2,3},{4,5,6}};
      System.out.println("are Arrays.deepToString(test7) and arrToString(test7) the same: " + Arrays.deepToString(test7).equals(arrToString(test7)));
	  int[][] test8 = {{},{-1},{3,4}};
      System.out.println("are Arrays.deepToString(test8) and arrToString(test8) the same: " + Arrays.deepToString(test8).equals(arrToString(test8)));
	
	}
    public static String arrToString(int[] nums) {
      String result = "[";
      for(int i = 0; i < nums.length; i++) {
        result = result + nums[i];
        if (i != nums.length - 1) {
          result = result + ", ";
        }
      }
      return result + "]";
    }
    public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
  	String result = "[";
  	for (int i = 0; i < ary.length;i++) {
  		result += arrToString(ary[i]);
  		if (i != ary.length - 1) {
  			result += ", ";
  		}
  	}
  	return result + "]";
    }
    public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
    }
    public static void replaceNegative(int[][] vals) {
      for(int i = 0; i < vals.length; i++){
        for(int j = 0; j < vals[i].length; j++) {
          if (vals[i][j] < 0) {
            if (i == j) {
              vals[i][j] = 1;
            } else {
              vals[i][j] = 0;
            }
          }
        }
      }
    }
    public static int[] copy(int[] nums) {
      int[] result = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i];
      }
      return result;
    }
    public static int[][] copy(int[][] nums){
      int[][] result = new int[nums.length][];
      for (int i = 0; i < nums.length; i++) {
        result[i] = copy(nums[i]);
      }
      return result;
    }
}
