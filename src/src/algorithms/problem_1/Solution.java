package algorithms.problem_1;

import java.util.HashMap;

// BruteForce Solution

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int [] answer = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    answer[0] = i;
//                    answer[1] = j;
//                    return answer;
//                }
//            }
//        }
//        return answer;
//    }
//}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> helpMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            helpMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (helpMap.containsKey(target - nums[i]) && helpMap.get(target - nums[i]) != i) {
                return new int[]{i, helpMap.get(target - nums[i])};
            }
        }

        return new int[]{};
    }
}