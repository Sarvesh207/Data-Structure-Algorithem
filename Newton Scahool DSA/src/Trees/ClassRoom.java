package Trees;

import Queue.QueueC;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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

    public static int Sum(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = Sum(root.left);
        int rightSum = Sum(root.left);

        return leftSum + rightSum + root.data;


    }


    //diameyter of tree

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt +1;
         return Math.max(selfDiam, Math.max(leftDiam, rightDiam));


    }

    public static class Info {
        int diam;
        int ht;
        public  Info(int diam,int  ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht , rightInfo.ht)+1;
        return new Info(diam, ht);

    }

    //  is subtree indintical
    public static boolean isIndentical(Node node , Node subRoot){
        if(node == null && subRoot == null){
            return true;
        } else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIndentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIndentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if (isIndentical(root, subRoot) ) {

                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.left, subRoot);
    }
    static class Info2 {
        Node node;
        int hd;
        public Info2(Node node, int ht){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info2(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info2 curr= q.remove();
            if (curr == null){
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info2(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null){
                    q.add(new Info2(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

            for(int i=min; i<=max; i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();

        }

    }


    public static void main(String[] args) {

        /*    1
            /    \
           2      3
         /   \    /  \
        4     5   6    7
        * */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right  = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
//        subRoot.right = new Node(5);
//        System.out.println("Height of tree "+height(root));
//        System.out.println("Number nodes in tree "+count(root));
//        System.out.println("Sum of nodes is : " + Sum(root))
//        System.out.println(diameter2(root));
//        System.out.println(diameter(root).diam);
        // is subtree indientical
//        System.out.println(isSubtree(root, subRoot));
        topView(root);

    }
}
