package linklist;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Method
    //Add first
    public void addFirst(int data){
        //Creat new Node
        Node newNode = new Node(data);
        if(head == null){
            head=tail = newNode;
            size++;
            return;
        }
        //link new node next  to head node
        newNode.next = head;
        size++;
        //make new ro head
        head = newNode;
    }
    //Add last in linkList
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
        }
        tail.next = newNode;
        size++;
        tail = newNode;

    }

    //Print->LinkList
    public void printList(){
        if(head == null){
            System.out.print("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    //add in middle of linklist
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        size++;
        temp.next = newNode;
    }

    //remove first in linklist
    public int removeFirst(){
        if(size == 0){
            return Integer.MIN_VALUE;

        }
        if(size  == 1 ){
            head = tail = null;
            size = 0;
        }
        int val = head.data;
        head = head.next;
        size--;
    return val;
    }
    //remove last in list
    public int removeLast(){
        int val;
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            val = head.data;
            head = tail = null;
            size--;
            return val;
        }
         Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        val = prev.next.data;
        size--;
        prev.next = null;
        tail = prev;
        return val;
    }
    public int irterrativeSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;

            }
            temp = temp.next;
            i++;

        }
        return -1;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //detedt cycle
        Node slow = head;
        Node prev = null;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null){
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        //find meeeting point
        slow = head;
        prev = fast;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
//        LinkedList ll = new LinkedList();
//       // ll.printList();
//        ll.addFirst(2);
//       // ll.printList();
//        ll.addFirst(1);
//       // ll.printList();
//        ll.addLast(4);
//        //ll.printList();
//        ll.addLast(5);
//        ll.printList();
//        ll.add(2,3);
//        ll.printList();
//        System.out.println(ll.size);
//
////        ll.removeFirst();
////        ll.printList();
////        System.out.println(ll.size);
////        ll.removeLast();
////        ll.printList();
////        System.out.println(ll.size);
//        System.out.println(ll.irterrativeSearch(3));
//        System.out.println(ll.irterrativeSearch(10));


    }
}
