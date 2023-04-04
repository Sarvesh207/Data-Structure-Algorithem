package Trees;

import Queue.QueueC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ClassRoom {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
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

    public static void Klevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right,level+1, k);

    }

//    public  static boolean getPath(Node root, int n, ArrayList<Node> path){
//        if(root == null){
//            return false;
//        }
//        path.add(root);
//        if(root.data == n){
//            return true;
//        }
//
//        boolean foundLeft = getPath(root.left, n, path);
//        boolean foundRight = getPath(root.right, n, path);
//
//        if(foundRight || foundLeft){
//            return true;
//        }
//
//        path.remove(path.size()-1);
//        return false;
//
//    }
//
//    public static Node lca(Node root , int n1, int n2){
//        ArrayList<Node> path1 = new ArrayList<>();
//        ArrayList<Node> path2 = new ArrayList<>();
//
//        getPath(root, n1, path1);
//        getPath(root, n2, path1);
//
//
//        int i = 0;
//        for(; i<path1.size() && i<path2.size(); i++ ){
//            if(path1.get(i) != path2.get(i)){
//                break;
//            }
//        }
//        Node lca = path1.get(i-1);
//        return lca;
//    }



        public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }

        return root;
        }

        /// min distance bet two node
        public static int localDist(Node root, int n){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;
            }

            int leftDist = localDist(root.left, n);
            int rightDist = localDist(root.right, n);

            if(leftDist == -1 && rightDist == -1){
                return -1;
            } else if(leftDist == -1){
                return rightDist+1;
            } else{
                return leftDist+1;
            }
        }
        public static int minDist(Node root, int n1, int n2){
            Node lca = lca2(root, n1, n2);
            int leftDist = localDist(lca, n1);
            int rightDist = localDist(lca, n2);

            return leftDist + rightDist;
        }


        //kth accencetor

        public static int KAncestor(Node root, int n, int k){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int leftDist = KAncestor(root.left, n, k);
            int rightDist = KAncestor(root.right, n, k);
            if(leftDist == -1 && rightDist == -1){
                return -1;
            }
            int max = Math.max(leftDist, rightDist);
            if(max+1 == k){
                System.out.println(root.data);
            }
            return max+1;
        }

        //tarnsform to sum tree
        public static int transform(Node root){
        if(root == null){
            return 0;
        }
            int leftChild = transform(root.left);
            int rightChild = transform(root.right);

            int data = root.data;

            int newLeft = root.left == null? 0 : root.left.data;
            int newRight = root.right == null? 0 : root.right.data;

            root.data  = newLeft + leftChild + newRight + rightChild;
            return data;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
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


//        Node subRoot = new Node(2);
//        subRoot.left = new Node(4);
//        subRoot.right = new Node(5);
//        System.out.println("Height of tree "+height(root));
//        System.out.println("Number nodes in tree "+count(root));
//        System.out.println("Sum of nodes is : " + Sum(root))
//        System.out.println(diameter2(root));
//        System.out.println(diameter(root).diam);
        // is subtree indientical
//        System.out.println(isSubtree(root, subRoot));
//        topView(root);
//        int k = 3;
//        Klevel(root, 1, k );

//            int n1 = 4, n2 = 6;
//        System.out.println(lca2(root, n1, n2).data);
////            System.out.println(minDist(root, n1, n2));
//       transform sum tree
//            int n = 5, k = 1;
//            KAncestor(root, n, k);

            transform(root);
            preOrder(root);


    }
}
