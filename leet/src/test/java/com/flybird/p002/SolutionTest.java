package com.flybird.p002;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by hzhang.
 */
public class SolutionTest {

    private static Random random = new Random();

    @Test
    public void addTwoNumbers() throws Exception {
        int v1 = random.nextInt(200000);
        int v2 = random.nextInt(300000);

        long sum = v1 + v2;

        Solution solution = new Solution();
        ListNode resultNode = solution.addTwoNumbers(createListNode(v1), createListNode(v2));
        long result = convertNodeToInt(resultNode);

        Assert.assertEquals(sum, result);
    }


    private ListNode createListNode(int v) {
        ListNode root = null;

        ListNode currentNode = null;
        while (v > 0) {
            int val = v % 10;
            ListNode node = new ListNode(val);

            if (root == null)
                root = node;

            if (currentNode != null) {
                currentNode.next = node;
            }

            currentNode = node;
            v = v/10;
        }

        return root;
    }

    private long convertNodeToInt(ListNode node) {
        StringBuilder builder = new StringBuilder();
        while(node != null) {
            if (builder.length() == 0) {
                builder.append(node.val);
            }
            else {
                builder.insert(0, node.val);
            }

            node = node.next;
        }

        return Long.parseLong(builder.toString());
    }

}