package advanceDSA.Trees;

import com.sun.source.tree.Tree;
import jdk.swing.interop.SwingInterOpUtils;

public class TreeExample {
    static TreeNode buildTree(){
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.left.left = new TreeNode(4);
      root.right = new TreeNode(3);
      root.right.left = new TreeNode(5);
      root.right.right = new TreeNode(6);
      root.right.right.right = new TreeNode(7);
      return root;

    }
    //NLR
    static void preorder(TreeNode root){

        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }


    //LNR
    static void inOrder(TreeNode root){

        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);


    }
    //LRN
    static void postorder(TreeNode root){

        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {

        TreeNode root = buildTree();
      //  preorder(root);
       //inOrder(root);
        postorder(root);
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        left= right= null;
    }
}
