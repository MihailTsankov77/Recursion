package Tail;

public class Zad123 {
	
	
	public static void main(String[] args) {

		System.out.println("Pow is " + powRecursive(5, 3));
		System.out.println("Sum is " + xMethod(5));
		System.out.println(NOD (15 ,20) );
	}
	
	
	
    public static int NOD (int x, int y)
    {
       if (y == 0)
             return x;
       else
             return NOD(y, x % y);
    }

	
  
    public static int xMethod(int n) {
    	return xMethodFunc(n, 0);
    }
	

    public static int xMethodFunc(int n, int result) {
        if (n == 0)
            return result;
        else
            return  xMethodFunc(n - 1, n + result);
    }
    
    public static int powRecursive( int x, int n) {
    	return powRecursiveFunc( x, n , 1);
    }
    
    public static int powRecursiveFunc( int x, int n , int result) {
        if (n == 0) {
            return result;
        }
        
        return  powRecursiveFunc(x, n - 1, x * result);
    }


	

}

