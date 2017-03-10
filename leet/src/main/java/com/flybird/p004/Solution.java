package com.flybird.p004;

/**
 * Created by hongtao.
 *
 * Basically we want to remove half of one array during each step. Thus
 * reduced the size of the whole elements. Once one array reduced to 1 or 2
 * we can manually find the correct element
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Just consider the normal case
        // The index of the target element(s) are (length - 1) / 2  or length / 2 for length > 0
        // for example
        // length  0  1  2  3  4  5  6  7  8  9  10
        // index1  0  0  0  1  1  2  2  3  3  4  4
        // index2        1     2     3     4     5

        int length1 = nums1.length;
        int length2 = nums2.length;

        if (length1 == 0 && length2 == 0)
            return 0.0;


        int targetIndex = (length1 + length2 - 1) / 2;

        int startIndex1 = 0;
        int startIndex2 = 0;
        int targetIndex1 = (length1 - 1) / 2;
        int targetIndex2 = (length2 - 1) / 2;

        // now we need to cut through the elements
        while (length1 > 1 && length2 > 1) {

        }

        return 0;
    }
}
