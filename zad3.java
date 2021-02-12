package First;

public class zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.pow(2, 5));
		System.out.println(itr(5));
		System.out.println(rec(5));
	}
	
	
	public static int itr(int n) {
		int value =1;
		for(int i =1; i<=n;i++) value*=2;
		return value;
	}
	
	public static int rec(int n) {
		if(n==1) {
			return 2;
		}else {
			return 2*rec(n-1);
		}
	}

}
