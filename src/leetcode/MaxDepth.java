package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 田义会
 * @Date 2022-05-29 15:18
 * @Description leetcode 559、N叉树的最大深度
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        List<TreeNode> childern=new ArrayList<>();
        childern.add(null);
        childern.add(new TreeNode(3));
        childern.add(new TreeNode(2));
        childern.add(new TreeNode(4));
        childern.add(null);
        root.children=childern;
        List<TreeNode> childern3=new ArrayList<>();
        childern.add(new TreeNode(5));
        childern.add(new TreeNode(6));
        root.children.get(1).children=childern3;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        /*if (root == null) return 0;
        int maxdepth = 0;
        int depth = 1;
        dfs(root, maxdepth, depth);
        return maxdepth;

    }

    public static void dfs(TreeNode root, int maxdepth, int depth) {
        if (root.children.size() == 0) {
            maxdepth = Math.max(maxdepth,depth);
            return;
        }

        for (TreeNode child : root.children) {
            depth++;
            dfs(child, maxdepth, depth);
        }
        depth--;
    }*/
        if (root == null) {
            return 0;
        }
        int maxChildDepth = 0;
        List<TreeNode> children = root.children;
        for (TreeNode child : children) {
            int childDepth = maxDepth(child);
            maxChildDepth = Math.max(maxChildDepth, childDepth);
        }
        return maxChildDepth + 1;
    }
}


// Definition for a Node.
class TreeNode {
    public int val;
    public List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(int _val) {
        val = _val;
    }

    public TreeNode(int _val, List<TreeNode> _children) {
        val = _val;
        children = _children;
    }
};
