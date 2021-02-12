package First;

public class zad2 {
	
	
	public static void main(String[] args) {
		
		int num = 1234567;
		
		StringBuilder rev = new StringBuilder();
        rev.append(Integer.toString(num));
 
        rev.reverse();
 
        System.out.println(rev);
        
        while(num>0) {
			System.out.print(num % 10);
            num /= 10;
		}
        System.out.println();
        
        xMethod(1234567);
	}

	public static void xMethod(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod(n / 10);
        }
	}

}
