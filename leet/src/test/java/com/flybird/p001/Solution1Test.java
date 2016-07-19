package com.flybird.p001;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hzhang.
 */
public class Solution1Test {

    @Test
    public void testFailedCase1() {
        Solution1 solution = new Solution1();

        int[] case1 = new int[3];
        case1[0] = 3;
        case1[1] = 2;
        case1[2] = 4;

        int[] result = solution.twoSum(case1, 6);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, 2);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 2);
    }

}