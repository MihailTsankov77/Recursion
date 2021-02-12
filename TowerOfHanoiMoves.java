package Second;

public class TowerOfHanoiMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MinMoves(5));
		
	}

	public static int MinMoves(int n) {
		return (int)Math.pow(2, n) - 1;
	}
}
