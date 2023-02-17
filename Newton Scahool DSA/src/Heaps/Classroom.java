package Heaps;
import  java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Classroom {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public  Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(new Student(name:"A", rank:4));
//        pq.add(new Student(name:"A", rank:4));
//        pq.add(new Student(name:"A", rank:4));
//        pq.add(new Student(name:"A", rank:4));//O(logn)
//        while (!pq.isEmpty()){
//            System.out.print(pq.peek()+" ");  //o(1)
//            pq.remove();
//        }
    }
}
