package Arrays_and_Hashing;

import java.util.HashMap;
class isAnagramSolutionSolution {
    // Time Complexity: O(n)
    // Space Complexity: O(s + t)
    // This solution uses two hash maps to count the occurrences of each character in both strings.
    // It then compares the two hash maps to determine if the strings are anagrams.
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
    

    
}
