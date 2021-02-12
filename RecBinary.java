package Second;

public class RecBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dec2Bin(64)); 
		System.out.println(dec2Bin(189)); 
	}
	
	public static String dec2Bin ( int value ) {
		if(value==0) return "";
		return dec2Bin((int)Math.floor(value/2)) + value%2;
	}


}
