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
	  int[][] test8 = {{-2,-3},{-1,4},{3,4}};
      System.out.println("are Arrays.deepToString(test8) and arrToString(test8) the same: " + Arrays.deepToString(test8).equals(arrToString(test8)));
	
	  int[][] test9 = {};
	  System.out.println(Arrays.deepToString(test9) + " expected 0 got: " + countZeros2D(test9));
	  int[][] test10 = {{1,2,0},{3,4,0},{5,6,0}};
	  System.out.println(Arrays.deepToString(test10) + " expected 3 got: " + countZeros2D(test10));
	  int[][] test11 = {{0,0,1},{0,0,2}};
	  System.out.println(Arrays.deepToString(test11) + " expected 4 got: " + countZeros2D(test11));
	  int[][] test12 = {{1,1,2},{4,0},{0}};
	  System.out.println(Arrays.deepToString(test12) + " expected 2 got: " + countZeros2D(test12));
	  int[][] test13 = {{},{0},{1,0},{2,1,0}};
	  System.out.println(Arrays.deepToString(test13) + " expected 3 got: " + countZeros2D(test13));
	  
	  System.out.println("Original: " + Arrays.deepToString(test6) + " result: " + Arrays.deepToString(swapRC(test6)));
	  System.out.println("Original: " + Arrays.deepToString(test8) + " result: " + Arrays.deepToString(swapRC(test8)));
	  System.out.println("Original: " + Arrays.deepToString(test10) + " result: " + Arrays.deepToString(swapRC(test10)));
	  System.out.println("Original: " + Arrays.deepToString(test11) + " result: " + Arrays.deepToString(swapRC(test11)));
	  int[][] test14 = {{-1,-2,3},{-4,-4,-4},{-4,-5,-6}};
	  System.out.println("Original: " + Arrays.deepToString(test14) + " result: " + Arrays.deepToString(swapRC(test14)));
	  
	  System.out.println(htmlTable(test6));
	  System.out.println(htmlTable(test7));
	  System.out.println(htmlTable(test8));
	  System.out.println(htmlTable(test10));
	  System.out.println(htmlTable(test11));
	  System.out.println(htmlTable(test12));
	  System.out.println(htmlTable(test13));
	  System.out.println(htmlTable(test14));
	
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
  	String result = "[";
  	for (int i = 0; i < ary.length;i++) {
  		result += arrToString(ary[i]);
  		if (i != ary.length - 1) {
  			result += ", ";
  		}
  	}
  	return result + "]";
    }
	public static int countZeros2D(int[][] nums){
	int result = 0;
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums[i].length; j++) {
			if (nums[i][j] == 0) {
				result++;
			}
		}
	}
    return result;
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
	public static int[][] swapRC(int[][]nums){
		int[][] result = new int[nums[0].length][nums.length];
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length;j++) {
				result[j][i] = nums[i][j];
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		}
    return result;
	}
	
	 public static String htmlHelper(int[] nums) {
		 String result = "";
		 for (int i = 0; i < nums.length; i++) {
			 result = result + "<td>" + nums[i] + "</td>";
		 }
		 return result;
	 }
	
	 public static String htmlTable(int[][]nums){
		String result = "<table>";
		for (int i = 0; i < nums.length; i++) {
			 result = result + "<tr>" + htmlHelper(nums[i]) + "</tr>";
		}
		return result + "</table>";
	}
	
}
