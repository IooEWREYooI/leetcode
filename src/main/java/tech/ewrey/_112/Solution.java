package tech.ewrey._112;

import tech.ewrey.util.TreeNode;

import javax.swing.tree.DefaultMutableTreeNode;

public class Solution {

    public static void main(String[] args) {
        System.out.println(hasPathSum(
                new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                        new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))
                ), 10));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        System.out.println(root);
        var leftNode = root.left;
        while (leftNode != null) {
            leftNode = leftNode.left;

        }
        return false;
    }

}
