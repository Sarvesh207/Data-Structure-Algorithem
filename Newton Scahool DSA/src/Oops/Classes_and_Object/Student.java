package Oops.Classes_and_Object;

public class Student {
   private  int rollNumber;
   private String name;
   private int standard;
   private   char section;
    public Student(){

    }
    public Student(String s, int st){
        name = s;
        standard = st;

    }
    public Student(String s, char se){
        name = s;
        section = se;
    }
    public Student(String s, int rl, int st, char se){
        name = s;
        rollNumber = rl;
        standard = st;
        section = se;
    }
    public void setName(String s){
        name = s;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public void setStandard(int standard){
        this.standard = standard;
    }
    public void setSection(char section){
         this.section = section;
    }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public int getStandard(){
        return standard;
    }
    public char getSection(){
        return section;
    }

    /*public static void main(String[] args) {
        Student s1 = new Student("Sarvesh",15,12,'A');
        Student s2 = new Student("Hardik",120,11,'B');
        Student s3 = new Student("Devesh",12);
        Student s4 = new Student("Dollsy",10);
        Student s5 = new Student("Payal",'B');
        Student s6 = new Student();






    }

     */
}
