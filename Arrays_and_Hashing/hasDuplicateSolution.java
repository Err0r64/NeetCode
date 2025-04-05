package Arrays_and_Hashing;
import java.util.HashSet;
class hasDuplicateSolution {
    /* Solution for NeetCode problem: Contains Duplicate
     * Solution uses HashSet to track seen numbers
     * Time Complexity: O(n) where n is the number of elements in the array
     * Space Complexity: O(n) where n is the number of elements in the array    
     */
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1) {
            return false;
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        
        

        return false;
    }
}
