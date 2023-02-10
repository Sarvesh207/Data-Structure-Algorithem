package Binary_Search_Trees;

public class printBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }
    public static Node insertinBST(Node root, int val){
        if (root == null){
            root = new Node(val);
            return  root;

        }
        if(root.data  > val){
            root.left = insertinBST(root.left, val);
        }else {
            root.right   =insertinBST(root.right, val);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {

        int values[] = {6, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        Node root = null;
        for(int i=0; i<values.length; i++){
          root =   insertinBST(root, values[i]);
        }
        Inorder(root);

    }
}
