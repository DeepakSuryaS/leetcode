package solution_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sol2 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> nums_map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (nums_map.containsKey(complement)) {
        return new int[] { nums_map.get(complement), i };
      }
      nums_map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No match found, crap.");
  }

  public static void main(String[] args) {
    int[] nums = { 3, 3 };
    int target = 6;

    Sol2 sol2 = new Sol2();
    int[] res = sol2.twoSum(nums, target);
    System.out.println(Arrays.toString(res));
  }
}
