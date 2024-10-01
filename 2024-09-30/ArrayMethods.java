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
}
