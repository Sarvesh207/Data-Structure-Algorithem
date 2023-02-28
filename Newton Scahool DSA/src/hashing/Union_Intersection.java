package hashing;

import java.util.*;


public class Union_Intersection {
    public static void unionOfArray(int arr1[] , int arr2[]){
        int n = arr1.length;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println(set.size());
        for (Integer i:set
             ) {
            System.out.print(i+" ");
        }
    }
    public static void intersectionOfArray(int arr1[], int arr2[]){
        HashSet<Integer> set= new HashSet<>();
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
                set.remove(arr2[i]);
                count++;
            }
        }
        for (Integer i:list
        ) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Number Intersection element:- "+count);
    }
    public static void main(String[] args) {
        int arr1 [] = {7, 3, 9, 4};
        int arr2 [] = {6, 3, 9, 2, 9, 4};
//        unionOfArray(arr1, arr2);
        intersectionOfArray(arr1, arr2);

    }
}
