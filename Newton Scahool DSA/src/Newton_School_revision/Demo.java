package Newton_School_revision;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

class Student {
    public String name;
    public Integer id;
    public Integer rollNumber;
    public Integer marks ;

    public Student (int id, String name, int rollNumber, int marks){
        this.id = id;
        this.name = name;
        this.rollNumber= rollNumber;
        this.marks = marks;
    }
    public void PrintStudentDetails(){
        System.out.println("********************Details****************");
        System.out.println("name :"+name);
        System.out.println("id :"+id);
        System.out.println("rollNumber :"+rollNumber);
                                                                         System.out.println("marks :"+marks);
    }
}
