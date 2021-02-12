package Second;

public class RecOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOdd(55)); 
		System.out.println(isOdd(44));
		System.out.println(isEven(55));
		System.out.println(isEven(44));
	}
	
	
	public static boolean isOdd(int n) {
		if(n == 1 || n == 0) return n==1;
		return isOdd(n-2);
	}
	
	
	public static boolean isEven(int n) {
		return !isOdd(n);
	}

}
