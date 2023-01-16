package linklist;
class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;

    }
}

class linklist{
    Node head;
    linklist(){
        head = null;
    }
    public void add(int val){
        if(head == null){
            head = new Node(val);
        }else{
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Main list = new Main();
       /* list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        */
    }
}
public class Main {
    public static void main(String[] args) {
        Main list = new Main();
       /* list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        */


        /*
        class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }

}
class LinkList{
   Node head;
   int size;
   
   LinkList(){
       head = null;
       size = 0;
    }


   public void add(int val, int pos){
        if(pos == 1){
            add(val);
            return;
        }

        if(pos > size+1){
            System.out.println("Sorry size excceded for list, The curract size is - "+ size);
            return;
        }

        if(pos <= 0){
            System.out.println("Please enter a pos graeter then zero");
            return;
        }

        Node prev = head;
        for(int i=1; i<pos-1; i++){
            prev = prev.next;
        }
        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
   }
   public void add(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

   public void delete(){
       if(head == null){
           return;
        }
       head = head.next;
       size--;
   }

   public void delete(int pos){
        if(size == 0){
            System.out.println("Sorry the list is currently empty");
            return;
        }

        if(pos <= 0){
            System.out.println("Pleae enter position greater than 0");
            return;
        }

        if(pos == 1){
            delete();
            return;
        }
        Node prev = head;
        for(int i=1; i<pos-1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

   }

   public int getSize(){
       return this.size;
   }

   public void print(){
       Node temp = head;
       System.out.print("Head : ");
       while(temp != null){
           System.out.print(temp.val + " -> ");
           temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Main{
	public static void main(String[] args) {
	    LinkList list = new LinkList();
	   for(int i=5; i>=1; i--){
	       list.add(i);
	   }
	   list.add(6,3);
	   list.add(7,7);
	   list.add(8);

	    list.print();



	    list.delete(4);
	    list.delete(3);

	    list.print();

	    //System.out.println("The size of the list is  "+ list.getSize());
	}
}

        */

       // one.next.next = three;
//
//        System.out.println(one.data);
//        System.out.println(one.next.data);
//        System.out.println(one.next.next.data);
//        while(head != null){
//            System.out.println(one.data);
//            head = head.next;
//        }
    }
}
