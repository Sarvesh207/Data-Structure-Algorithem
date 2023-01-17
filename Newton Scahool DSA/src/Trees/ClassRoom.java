package Trees;

public class ClassRoom {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int dat){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    //Height of tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    //Count no of nodes in tree

    public static int count(Node root){
        if(root == null){
            return  0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        int treeCount = leftCount + rightCount + 1;

        return treeCount;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right  = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree "+height(root));
        System.out.println("Number nodes in tree "+count(root));


    }
}
