package arraylist;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(1,85);
        arr.add(20);
        arr.add(30);

        arr.add(3,80);
        arr.add(4,75);
        arr.add(5,70);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        System.out.println("With loop");
        for(int i= 0; i< arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        arr.remove(2);
        System.out.println();
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
