package Arrays_and_Hashing;

import java.util.HashMap;

class twoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differencesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (differencesMap.containsKey(difference)) {
                return new int[] {differencesMap.get(difference), i};
            }
            differencesMap.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
