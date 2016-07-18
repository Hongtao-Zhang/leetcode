package com.flybird.p003;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hzhang.
 */
public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        int maxLength = solution.lengthOfLongestSubstring(null);
        Assert.assertEquals(0, maxLength);

        maxLength = solution.lengthOfLongestSubstring("a");
        Assert.assertEquals(1, maxLength);

        maxLength = solution.lengthOfLongestSubstring("aaaaab");
        Assert.assertEquals(2, maxLength);

        maxLength = solution.lengthOfLongestSubstring("abcabcabc");
        Assert.assertEquals(3, maxLength);
    }
}