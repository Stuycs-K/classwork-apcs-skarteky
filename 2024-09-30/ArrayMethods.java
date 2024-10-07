public class ArrayMethods{
  /* Kevin Li kevinl687@nycstudents.net
     Selina Lin selinal50@nycstudents.net */
  public static void main(String args[]) {
    System.out.println("Expected [[1, 2], [3]] " + arrToString(new int[][]{{1,2}, {3}}));
    System.out.println("Expected [[4], [5, 6]] " + arrToString(new int[][]{{4}, {5,6}}));
    System.out.println("Expected [[-2, -3, 4], [5]] " + arrToString(new int[][]{{-2,-3,4}, {5}}));
	System.out.println("Expected [[-2, -3], [4, 5]] " + arrToString(new int[][]{{-2,-3}, {4,5}}));
    System.out.println("Expected [[-1], [5], [-3], [4], [7]] " + arrToString(new int[][]{{-1}, {5}, {-3}, {4}, {7}}));
	System.out.println("Expected [[10, 15, 8, -3, 0], []] " + arrToString(new int[][]{{10, 15, 8, -3, 0}, {}}));

    System.out.println("Expected 40 " + arr2DSum(new int[][]{{10,5},{20,5}}));
    System.out.println("Expected -15 " + arr2DSum(new int[][]{{-5,-5},{-5}}));
    System.out.println("Expected 40 " + arr2DSum(new int[][]{{10,5},{20,5}}));
	System.out.println("Expected 40 " + arr2DSum(new int[][]{{10,5},{20,5}}));
	System.out.println("Expected 40 " + arr2DSum(new int[][]{{40,0},{}}));
	System.out.println("Expected 40 " + arr2DSum(new int[][]{{10,15},{20,-5}}));
	System.out.println("Expected 40 " + arr2DSum(new int[][]{{15},{5},{20}}));

	int[][] test1 = {{-2,-2,10}, {-3,-3,11}, {-4,12,-4}};
	replaceNegative(test1);
    System.out.println("Expected [[1,0,10], [0, 1, 11], [0, 12, 1]] " + arrToString(test1));
	int[][] test2 = {{2,-1},{3,-2},{-2,-12}};
	replaceNegative(test2);
    System.out.println("Expected [[2, 0], [3, 1], [0, 0]] " + arrToString(test2));
	int[][] test3 = {{-1, 0, 4},{2, 3},{1, -3, 5}};
	replaceNegative(test3);
    System.out.println("Expected [[1, 0, 4], [2, 3], [1, 0, 5]] " + arrToString(test3));
	int[][] test4 = {{0},{-4,-2},{-3,2,-1}};
	replaceNegative(test4);
    System.out.println("Expected [[0], [0, 1], [0, 2, 1]] " + arrToString(test4));
	int[][] test5 = {{-2,-1,0},{4, 4},{3}};
	replaceNegative(test5);
    System.out.println("Expected [[1, 0, 0], [4, 4], [3]] " + arrToString(test5));
	int[][] test6 = {{},{1,-2},{3,3,4}};
	replaceNegative(test6);
    System.out.println("Expected [[], [1, 1],[3, 3, 4]] " + arrToString(test6));
	int[][] test7 = {{-4},{},{}};
	replaceNegative(test7);
    System.out.println("Expected [[1], [], []] " + arrToString(test7));

	System.out.println("Are " + arrToString(test1) + " and " + arrToString(copy(test1)) + " not the same: " + (test1 != copy(test1)));
	System.out.println("Are " + arrToString(test2) + " and " + arrToString(copy(test2)) + " not the same: " + (test2 != copy(test2)));
	System.out.println("Are " + arrToString(test3) + " and " + arrToString(copy(test3)) + " not the same: " + (test3 != copy(test3)));
	System.out.println("Are " + arrToString(test4) + " and " + arrToString(copy(test4)) + " not the same: " + (test4 != copy(test4)));
	System.out.println("Are " + arrToString(test5) + " and " + arrToString(copy(test5)) + " not the same: " + (test5 != copy(test5)));
	System.out.println("Are " + arrToString(test6) + " and " + arrToString(copy(test6)) + " not the same: " + (test6 != copy(test6)));
	System.out.println("Are " + arrToString(test7) + " and " + arrToString(copy(test7)) + " not the same: " + (test7 != copy(test7)));
	int[][] test8 = {{-1,-1},{-2,-2},{-5,-5}};
	System.out.println("Are " + arrToString(test8) + " and " + arrToString(copy(test8)) + " not the same: " + (test8 != copy(test8)));
	int[][] test9 = {{},{},{}};
	System.out.println("Are " + arrToString(test9) + " and " + arrToString(copy(test9)) + " not the same: " + (test9 != copy(test9)));
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
		result += arrayToString(ary[i]);
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
