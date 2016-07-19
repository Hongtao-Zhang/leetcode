package com.flybird.p001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzhang.
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2)
            return null;

        Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>(nums.length);
        elementMap.put(nums[0], 0);

        for(int i=1; i<nums.length; i++) {
            // first check if there is an matching element exists
            int targetValue = target - nums[i];
            if (elementMap.containsKey(targetValue)) {
                int[] result = new int[2];

                result[0] = elementMap.get(targetValue);
                result[1] = i;

                return result;
            }

            elementMap.put(nums[i], i);
        }

        return null;
    }
}

// The first submission failed because I forgot to add the array element into the map after testing for solution
// That is the first code I put into the array when I typing!
