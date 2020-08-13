package algorithm.tree;


/**
 * @author linyilong
 * @createTime 2020/8/3 5:46 下午
 * @description
 */
public class Traverse {
    // 先序遍历
    public static void preOrderTraverse(Node node) {
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }
    // 中序遍历
    public static void inOrderTraverse(Node node) {
        if (node == null){
            return;
        }
        inOrderTraverse(node.left);
        System.out.print(node.data + " ");
        inOrderTraverse(node.right);
    }
    // 后序遍历
    public static void postOrderTraverse(Node node) {
        if (node == null){
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.data + " ");
    }

    class Node{
        private Node left;
        private Node right;
        private String data;
    }
}
