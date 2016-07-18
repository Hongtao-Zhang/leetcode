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
        while (l1 != null || l2 != null) {
            int v = ((l1 == null)? 0 :l1.val) + ((l2==null)?0:l2.val) + carryOver;
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
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }

        if (carryOver == 1) {
            currentNode.next = new ListNode(carryOver);
        }

        return root;
    }
}
