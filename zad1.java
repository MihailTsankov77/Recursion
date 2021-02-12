package First;

public class zad1 {


	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=5;i>=1;i--) {
			sum+=i;
		}
		System.out.println("Sum is " + sum);
		
//        System.out.println("Sum is " + xMethod(5));
	}	

	public static int xMethod(int n) {
	        if (n == 1)
	            return 1;
	        else
	            return n + xMethod(n - 1);
	}

}
