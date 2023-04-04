package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);
//        System.out.println(set.size());

//        if(set.contains(2)){
//            System.out.println("set contains 2");
//        }
//        if(set.contains(4)){
//            System.out.println("set contains 3");
//        }
//        set.clear();
//        System.out.println(!set.isEmpty());
        HashSet<String > cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengluru");
        cities.add("Noida");
        cities.add("Gurugram");
//
//        Iterator it = cities.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        for (String s:cities
             ) {
            System.out.println(s+" ");

        }

    }
}
