public class Fibonacci{
	public static int fib(int i) {
		if(i < 2) {
			if(i == 0) {
				return 0;
			}else {
				return 1;
			}
		}else {
		return fib(i - 1) + fib(i - 2);	
		}
	}
	
	public static int count8(int n) {
		  if(n < 10){
		    if(n == 8){
		      return 1;
		    }else {
		      return 0;
		    }
		  }else {
		    if(n%100 == 88){
		      return 3 + count8(n/100);
		    }else{
		      if(n%10 == 8){
		        return 1 + count8(n/10);
		      }else {
		        return count8(n/10);
		      }
		    }
		  }
		}

	
	public static void main(String[] args) {
		System.out.println(fib(10));
		System.out.println(count8(88888));
	}
}	
