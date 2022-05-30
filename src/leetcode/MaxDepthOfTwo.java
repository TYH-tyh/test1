package leetcode;

/**
 * @Author 田义会
 * @Date 2022-05-29 15:18
 * @Description leetcode 104、二叉树的最大深度
 */
public class MaxDepthOfTwo {
    public static int maxDepthOfTwo(TreeNodeOfTwo root) {

        if (root == null) {
            return 0;
        }
        //int maxChildDepth = 0;
        TreeNodeOfTwo left = root.left;
        TreeNodeOfTwo right = root.right;
        int leftDepth = maxDepthOfTwo(left);
        int rightDepth = maxDepthOfTwo(right);
        //maxChildDepth = Math.max(maxChildDepth, leftDepth);
        //   maxChildDepth = Math.max(maxChildDepth, rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

//Definition for a binary tree node.
class TreeNodeOfTwo {
    int val;
    TreeNodeOfTwo left;
    TreeNodeOfTwo right;

    TreeNodeOfTwo() {

    }

    TreeNodeOfTwo(int val) {
        this.val = val;
    }

    TreeNodeOfTwo(int val, TreeNodeOfTwo left, TreeNodeOfTwo right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

