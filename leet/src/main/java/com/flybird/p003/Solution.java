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

        int length = s.length();
        if (length < 2)
            return length;

        byte[] bytes = s.getBytes();
        Map<Byte, Integer> byteMap = new HashMap<>();
        int maxLength = 1;
        int startingIndex = 0;
        byteMap.put(bytes[0], 0);

        for(int i = 1; i<length; i++) {
            byte current = bytes[i];
            if (byteMap.containsKey(current)) {
                int oldIndex = byteMap.get(current);
                if (oldIndex >= startingIndex) {
                    int currentLength = i - startingIndex;
                    if (currentLength > maxLength)
                        maxLength = currentLength;
                    startingIndex = oldIndex + 1;
                }
            }

            byteMap.put(current, i);
        }
        int lastLength = length - startingIndex;
        if (lastLength > maxLength) {
            return lastLength;
        }

        return maxLength;
    }
}

// The first solution store all the visited chars. This should not be the case. any character that is
// out of the starting substring char should be ignored

// tested null and one char string, but not tested with empty string.

// Failed again. This time forgot the calculation and ignore the index that is before the starting index

/**
 * use bytes, improved from 20ms to 19ms. is there other way to improve it?
 *
 * Checked the solution. If we know the charset is ascii we can use array instead of map.
 */

