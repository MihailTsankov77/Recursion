package First;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println((int)Math.pow(x, 5));
		System.out.println(itr(x,5));
		System.out.println(rec(x,5));
	}
	
	
	public static int itr(int x, int n) {
		int value =1;
		for(int i =1; i<=n;i++) value*=x;
		return value;
	}
	
	public static int rec(int x, int n) {
		if(n==1) {
			return x;
		}else {
			return x*rec(x, n-1);
		}
	}

}
