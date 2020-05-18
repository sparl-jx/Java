import java.util.LinkedList;
import java.util.Queue;

class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    public Node buildTree() {
        Node A=new Node('A');
        Node B=new Node('B');
        Node C=new Node('C');
        Node D=new Node('D');
        Node E=new Node('E');
        Node F=new Node('F');
        Node G=new Node('G');
        Node H=new Node('H');

        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.left=H;
        return A;
    }

    void preOrderTraversal(Node root) {
        if(root==null) {
            return;
        }
        System.out.println(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void inOrderTraversal(Node root) {
        if(root==null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val+" ");
        inOrderTraversal(root.right);
    }


    void postOrderTraversal(Node root) {
        if(root==null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val+" ");
    }

    //求节点
    static int size=0;
    void getSize1(Node root) {
        if(root==null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }

    int getSize2(Node root) {
        if(root==null) {
            return 0;
        }
        return getSize2(root.left)+getSize2(root.right)+1;
    }

    //求叶子节点
    static int leafSize=0;
    void getLeafSize(Node root) {
        if(root==null) {
            return;
        }
        if(root.left==null && root.right==null) {
            leafSize++;
        } else {
            getLeafSize(root.left);
            getLeafSize(root.right);
        }
    }

    int getLeafSize2(Node root) {
        if(root==null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            return 1;
        } else {
            return getLeafSize2(root.left)+getLeafSize2(root.right);
        }
    }

    //求第k层节点个数（子问题思路）
    int getKLeveSize(Node root,int k) {
        if(root==null) {
            return 0;
        } else if(k==1) {
            return 1;
        } else {
            return getKLeveSize(root.left,k-1)+getKLeveSize(root.right,k-1);
        }
    }

    //求树的高度
    int getHeight(Node root) {
        if(root==null) {
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return leftHeight>rightHeight ? leftHeight+1 : rightHeight+1;
    }

    //查找val所在节点 没找到返回null，（按根左右的顺序），找到立即返回，不再继续查找
    Node find(Node root,char val) {
        if(root==null) {
            return null;
        }
        if(root.val==val) {
            return root;
        }
        Node left=find(root.left,val);
        if(left!=null) {
            return left;
        }
        Node right=find(root.right,val);
        if(right!=null) {
            return right;
        }
        return null;
    }

    //层序遍历
    void levelOrderTraversal(Node root) {
        if(root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            Node cur=queue.poll();
            System.out.println(cur.val+" ");
            if(cur.left!=null) {
                queue.offer(root.left);
            }
           if(cur.right!=null) {
               queue.offer(root.right);
           }
        }
    }

}
