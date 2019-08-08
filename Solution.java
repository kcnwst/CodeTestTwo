
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[] = {3,1,2,4,3};
		
		System.out.println(solution(test));
	}

	public static int solution(int[] A) {
		long result;
		int n = A.length;
		long[] temp = new long[n-1];
		
		long left = 0, right = 0;
		
		for(int i = 0; i < n-1; i++) {
			left += A[i];
			temp[i] = left;
		}
		
		result = left - right;
		
		for(int j = n-1; j > 0; j--) {
			right += A[j];

			if(Math.abs(temp[j-1] - right) < result) {
				result = (int) Math.abs(temp[j-1] - right);
			}
		}
		
		return (int) result;
	}
}
