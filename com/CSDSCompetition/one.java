import java.util.ArrayList;
import java.util.Queue;

public class one {
    public static void main(String[] args) {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');

        A.left = B;
        A.right = C;

        C.right = E;
        E.left = F;

        B.left = D;
        D.right = F;

        F.left = E;

        traverse(A);
    }

    static void traverse(Node node) {
        if (node.value == 'E') {
            System.out.println(node.value);
            return;
        }
        System.out.println(node.value);

        if (node.left != null) {
            traverse(node.left);
        }
        if (node.right != null) {
            if(!(node.right.value == 'C')) {
            traverse(node.right);
            }
        }
    }

    static class Node {
        public Character value;
        public Node left;
        public Node right;

        public Node(Character value) {
            this.value = value;
        }
    }
}
