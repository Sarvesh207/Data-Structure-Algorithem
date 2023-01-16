package coding_ninja.classes_and_object;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Sarvesh";
        s1.rollNumber= 123;
        Student s2 = new Student();
        s2.name = "Manisha";
        s2.rollNumber = 312;
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s2.name);
        System.out.println(s2.rollNumber);
    }
}
