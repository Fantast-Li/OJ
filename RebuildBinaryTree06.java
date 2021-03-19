package 剑指offer;

import java.util.Arrays;

/**
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 示例1
 * 输入
 * 复制
 * [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 * 返回值
 * 复制
 * {1,2,5,3,4,6,7}
 */


public class RebuildBinaryTree06 {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    //思路:1.如果二个数组都为空的时候直接返回一个空的节点
    // 前序遍历的第一个节点为树的根节点然后找到第二个数组的那个值，找到那个值的需要 将他分为在分为二个数组
    // 使用递归.
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length==0||in.length==0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length ; i++) {
            //找出在根节点在第二个数组的值
            if (in[i]==pre[0]){
                //左子树 copyOfRang 左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),
                        Arrays.copyOfRange(in,0,i));
                //右子树1
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
                        Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return root;
}
}
