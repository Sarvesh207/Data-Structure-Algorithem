package Heaps;

import java.util.ArrayList;

public class insertInHeap {
   static  class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            //add at last index
            arr.add(data);

            int x = arr.size()-1;//x is a child
            int par = (x-1)/2;//par index

            while (arr.get(x) < arr.get(par)){//O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {

    }
}
