package solution_1;

import java.util.Arrays;

class Sol1 {
  /**
   * @param {number[]} nums
   * @param {number}   target
   * @return {number[]}
   */
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == complement) {
          return new int[] { i, j };
        }
      }
    }
    throw new IllegalArgumentException("No match found, crap.");
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    Sol1 sol1 = new Sol1();
    int[] res = sol1.twoSum(nums, target);
    System.out.println(Arrays.toString(res));
  }
}
