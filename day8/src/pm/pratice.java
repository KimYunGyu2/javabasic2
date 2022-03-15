package pm;

public class pratice {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] b = new int[2];		
		for(int i =0; i < nums.length - 1; i++) {
			if(nums[i]+nums[i+1]==target) {
				b[0] = i;
				b[1] = i+1;
			}
		}
		System.out.println("output : " + b[0] + ", " + b[1]);
	}
}