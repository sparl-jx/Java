public class TedtDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        Node root=binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        binaryTree.getSize1(root);
        System.out.println("节点个数"+BinaryTree.size);

        binaryTree.getSize2(root);
        System.out.println("节点个数"+binaryTree.getSize2(root));

        binaryTree.getLeafSize(root);
        System.out.println("叶子结点个数"+BinaryTree.leafSize);

        binaryTree.getLeafSize2(root);
        System.out.println("叶子结点个数"+binaryTree.getLeafSize2(root));

        System.out.println( binaryTree.getKLeveSize(root,3));
        System.out.println( binaryTree.getKLeveSize(root,5));

        Node ret=binaryTree.find(root,'C');
        System.out.println(ret.val);

        binaryTree.levelOrderTraversal(root);
    }
}
