package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;

/*题目描述
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
@Slf4j
public class shorteastpath {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        node.right = node1;
        node.left = node2;
        node2.left = node3;
        int res = new shorteastpath().getShortestpath(node);
        log.info("{}",res);
    }
    private int getShortestpath(TreeNode node){
        if (node == null ) return 0;
        if (node.left == null) return getShortestpath(node.right) + 1;
        if (node.right == null) return getShortestpath(node.left) + 1;
        int right = getShortestpath(node.right) + 1;
        int left = getShortestpath(node.left) +1;
        return (right > left) ? left : right;
    }
    static class TreeNode {
          int val;
         TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
}
