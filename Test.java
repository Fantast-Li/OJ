package 二叉树;
class Node {
       public int val ;
       public Node left;
       public Node rigth;

    public Node(int val) {
        this.val = val;
    }
}
public class Test {
    public static Node buildTree() {
        //构建一个简单的树
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.rigth = c;
        b.left = d;
        b.rigth = e;
        e.left = g;
        c.rigth = f;
        return a;

    }
    public static void main(String[] args) {
        Node root = buildTree();

    }
}


