package com.flybird.p003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzhang.
 */
public class Solution {


    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;

        if (s.length() == 1)
            return 1;

        int maxLength = 1;
        int startingIndex = 0;
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        charMap.put(s.charAt(0), 0);

        for(int i = 1; i<s.length(); i++) {
            char current = s.charAt(i);
            if (charMap.containsKey(current)) {
                if ((i - startingIndex) > maxLength)
                    maxLength = i - startingIndex;
                startingIndex = charMap.get(current) + 1;
            }

            charMap.put(current, i);
        }
        if ((s.length() - startingIndex) > maxLength) {
            maxLength = s.length() - startingIndex;
        }

        return maxLength;
    }
}

// The first solution store all the visited chars. This should not be the case. any character that is
// out of the starting substring char should be ignored