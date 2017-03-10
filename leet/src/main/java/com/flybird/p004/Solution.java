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

        // If both arrays are empty, just return 0
        if (length1 == 0)
            return getMediumForOneArray(nums2, 0, length2 - 1);
        else if (length2 == 0) {
            return getMediumForOneArray(nums1, 0, length1 - 1);
        }

        int targetIndex = (length1 + length2 - 1) / 2;

        int startIndex1 = 0;
        int startIndex2 = 0;
        int endIndex1 = length1 - 1;
        int endIndex2 = length2 - 1;

        // now we need to cut through the elements
        while (length1 > 0 && length2 > 0) {
            int targetIndex1 = startIndex1 + (length1 - 1) / 2;
            int targetIndex2 = startIndex2 + (length2 - 1) / 2;

            if (nums1[targetIndex1] < nums2[targetIndex2]) {
                if ()
            }
        }

        return 0.0;
    }

    // Solve a general problem of find the targetIndex in the combined arrys of two given range
    private double findIndexSortedArrays(int[] nums1, int start1, int end1,
                                         int[] nums2, int start2, int end2,
                                         int targetIndex) {
        int startIndex1 = start1;
        int endIndex1 = end1;
        int startIndex2 = start2;
        int endIndex2 = end2;
        int searchIndex = targetIndex;


        return 0.0;
    }

    private double getMediumForOneArray(int[] num, int startIndex, int endIndex) {
        int length = endIndex - startIndex + 1;
        if (length <= 0)
            return 0.0;

        boolean isEven = ((length % 2) == 0);
        int lowerIndex = startIndex + (length - 1) / 2;
        if (isEven) {
            return 0.5 * (num[lowerIndex] + num[lowerIndex + 1]);
        }
        else {
            return num[lowerIndex];
        }
    }
}
