import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                count += 2;     // Pair found
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        // If there's any unpaired character left, we can add 1 in the center
        return set.isEmpty() ? count : count + 1;
    }
}
