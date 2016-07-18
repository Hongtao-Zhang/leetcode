package com.flybird.p001;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hzhang.
 */
public class SolutionTest {

    @Test
    public void testFailedCase1() {
        Solution solution = new Solution();

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