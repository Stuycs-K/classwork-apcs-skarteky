public class ArrayMethods{
  /* Kevin Li kevinl687@nycstudents.net
     Selina Lin selinal50@nyystem.out.println("Expected [[10, 15, 8, -3, 0], []] " + arrToString({10, 15, 8, -3, 0}, {}));cstudents.net */
  public static void main(String args[]) {
    System.out.println("Expected [[1, 2], [3]] " + arrToString({1,2}, {3}));
    System.out.println("Expected [[4], [5, 6]] " + arrToString({4}, {5,6}));
    System.out.println("Expected [[-2, -3, 4], [5]] " + arrToString({-2,-3,4}, {5}));
    System.out.println("Expected [[-1], [5], [-3], [4], [7]] " + arrToString({-1}, {5}, {-3}, {4}, {7}));
    System.out.println("Expected [[10, 15, 8, -3, 0], []] " + arrToString({10, 15, 8, -3, 0}, {}));

    System.out.println("Expected 40 " + arr2DSum({{10,5},{20,5}}));
    System.out.println("Expected -15 " + arr2DSum({{-5,-5},{-5}}));
    System.out.println("Expected 40 " + arr2DSum({{10,5},{20,5}}));
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
  return "";
  }
  public static int arr2DSum(int[][]nums){

  return null;
  }
}
