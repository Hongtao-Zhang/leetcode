package com.flybird.p002;

/**
 * Created by hzhang.
 */


import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;

        int carryOver = 0;
        ListNode currentNode = null;
        while (l1 != null && l2 != null) {
            int v = l1.val + l2.val + carryOver;
            if (v > 9) {
                carryOver = 1;
                v = v - 10;
            }
            else {
                carryOver = 0;
            }

            ListNode node = new ListNode(v);
            if (root == null) {
                root = node;
            }

            if (currentNode != null) {
                currentNode.next = node;
            }

            currentNode = node;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode l = (l1 == null) ? l2 : l1;
        while(carryOver > 0 && l != null) {
            int v = l.val + carryOver;
            if (v > 9) {
                carryOver = 1;
                v = v - 10;
            }
            else {
                carryOver = 0;
            }

            ListNode node = new ListNode(v);
            if (root == null) {
                root = node;
            }

            if (currentNode != null) {
                currentNode.next = node;
            }

            currentNode = node;
            l = l.next;
        }

        if (carryOver > 0)
            currentNode.next = new ListNode(carryOver);
        else
            currentNode.next = l;


        return root;
    }
}

// Although the solution is correct. There are two problem in the testing
// 1. The running time is 6 ms, which only beats 4.35% submissions
// 2. The test cannot handle maximum integer case.

// The second solution finishes in 4 ms. improve from 6ms.
