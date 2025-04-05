package Arrays_and_Hashing;

import Arrays_and_Hashing.*;

/*
 * This is a test class for the Arrays and Hashing solutions.
 */
public class ArraysHashTest  {
  public static void main(String[] args) {
    int[] nums = {3, 4, 5, 6};
    
    twoSumSolution twoSum = new twoSumSolution();
    int[] result = twoSum.twoSum(nums, 9);
    System.out.println("Two Sum Result: " + result[0] + ", " + result[1]);

  }

  
}
