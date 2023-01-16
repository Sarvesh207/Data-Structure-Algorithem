package Oops.Classes_and_Object;

public class Constructor {
  public static void main(String[] args) {
    Studentinfo s1 = new Studentinfo("sarvesh");
    System.out.println(s1.name);
  }
}
class Studentinfo{
    String name;
    int roll;
    Studentinfo(){
        System.out.println("constructor is called ...");
    }
    Studentinfo(int roll){
        this.roll = roll;
    }
    Studentinfo(String name){
     this.name = name;
    }
  }
