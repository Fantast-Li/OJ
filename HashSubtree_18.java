package 剑指offer;
//题目描述
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
//示例1
//输入
//复制
//{8,8,#,9,#,2,#,5},{8,9,#,2}
//返回值
//复制
//true
public class HashSubtree_18 {
    public boolean hasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val) {
            // 判断root1 和 root2 子树是否相同
            result = hasSubtreeHelper(root1,root2);
        }
        // result 为真 分别看他们左右子树是不是root2 的数
        if (!result) {
            result =hasSubtree(root1.left, root2);
        }
        if (!result) {
            result =hasSubtree(root1.right,root2);
        }
        return  result;
    }
    public Boolean hasSubtreeHelper (TreeNode r1,TreeNode r2) {
        if (r2 == null) {
            return true ;
        }
        if (r1 == null) {
            return false ;
        }
        if (r1.val !=r2.val) {
            return false;
        }
        return hasSubtreeHelper(r1.left,r2.left) && hasSubtreeHelper(r1.right,r2.right);
    }
}
