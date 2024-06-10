
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String[] strs = reader.readLine().split(" ");
		int[] nums = new int[strs.length];
		int top = 0;
		for (int i = 0; i < strs.length; i++) {
			switch (strs[i].charAt(0)) {
			case '+':
				top--;
				nums[top-1] = nums[top - 1] + nums[top];
				break;
			case '-':
				top--;
				nums[top-1] = nums[top - 1] - nums[top];
				break;
			case '*':
				top--;
				nums[top-1] = nums[top - 1] * nums[top];
				break;
			default:
				
				nums[top] = Integer.parseInt(strs[i]);
				top++;
				break;
			}
			/*System.out.println(Arrays.toString(nums));*/
		}
		System.out.println(nums[0]);

	}
}