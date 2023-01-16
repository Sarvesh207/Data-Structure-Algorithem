package com.Apnacollege;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Toney");
       //System.out.println(sb);
//        System.out.println(sb.charAt(0));
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
        sb.insert(2,'S');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println();

    }
}
