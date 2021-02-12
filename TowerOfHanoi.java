package First;


public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(4, 1, 3);
	}
	
	public static void solve(int disks, int start, int end) {
		if(disks == 1) {
			System.out.println("Move disk " + disks + " from tower " + start + " to tower " + end);
		}else {
			solve(disks-1, start, (end+start<=3)? end+start : Math.abs(end-start));
			System.out.println("Move disk " + disks + " from tower " + start + " to tower " + end);
			solve(disks-1, (end+start<=3)? end+start : Math.abs(end-start), end);
		}
			
// 			3 2 3  2 2 1
//						
//			
//			
//			
//			
//			
//			
	}

}
