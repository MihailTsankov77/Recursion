package Tail;

public class ArrSrAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(value(new int[]{21, 2, 3, 8, 97, 85, 5, 1, 1, 1, 0}));
	}

	
	public static Double value(int[] arr) {
		
		if(arr.length>1) {
			return Double.valueOf(valueFunc(arr, 0, 0))/arr.length;
		}else if(arr.length > 0){
			return Double.valueOf(arr[0]);
		}else {
			return null;
		}
			
		
	}
	
	public static int valueFunc(int[] arr, int n, int result) {
		
		if(n==arr.length/2)
			return (arr.length%2==0)? result : result + arr[arr.length/2];
			
		return valueFunc(arr, n+1, arr[n] + arr[arr.length-1-n] + result);
		
	}
}
