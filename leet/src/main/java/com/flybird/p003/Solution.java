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
        int currentLength = 1;
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        charMap.put(s.charAt(0), 0);
        for(int i = 1; i<s.length(); i++) {
            char current = s.charAt(i);
            if (charMap.containsKey(current)) {
                if (currentLength > maxLength)
                    maxLength = currentLength;
                currentLength = i - charMap.get(current);
            }
            else {
                currentLength += 1;
            }
            charMap.put(current, i);
        }

        return maxLength;
    }
}
