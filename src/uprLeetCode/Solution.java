package uprLeetCode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 7, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] resultArray = new int[2];
        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length; j++){
                if (i == j){
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = j;
                    resultArray[1] = i;
                }
            }
        }
        return resultArray;
    }
}
