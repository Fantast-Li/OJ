package 剑指offer;
//题目描述
//操作给定的二叉树，将其变换为源二叉树的镜像。
//输入描述:
//二叉树的镜像定义：源二叉树
//    	    8
//    	   /  \
//    	  6   10
//    	 / \  / \
//    	5  7 9 11
//    	镜像二叉树
//    	    8
//    	   /  \
//    	  10   6
//    	 / \  / \
//    	11 9 7  5

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree_18 {
    public void Mirror(TreeNode root) {
        //递归算法
        if (root == null) {
            return;
        }
        //进行左右节点交换
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp ;
        Mirror(root.left);
        Mirror(root.right);
    }
    //非递归
    public void Mirror1 (TreeNode root) {
        if (root ==null) {
            return;
        }
        TreeNode cur , temp;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length ; i++) {
                //交换左右子树
                cur = queue.poll();
                temp = cur.right ;
                cur.right = cur.left;
                cur.left = temp;
                if (cur.left!=null) {
                    queue.offer(cur.left);
                }
                if (cur.right!= null) {
                    queue.offer(cur.right);
                }
            }
        }
    }
}
