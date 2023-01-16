package Oops;

import java.util.HashMap;
import java.util.HashSet;

public class Teacher {
    private String name;
    private String subject;
    private HashMap<Integer, HashSet<Character>>teaches;

      public Teacher(){
         this.name = "";
          this.subject = "";
         this.teaches = new HashMap<>();
      }
      public Teacher(String name, String subject ){
          this.name = name;
          this.subject = subject;
          this.teaches = new HashMap<>();
      }
      public String getName(){
          return this.name;
      }
      public String getSubject(){
          return this.subject;
      }
      public void setName(String name){
          this.name = name;
      }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void addSubjectTeacher(int standard, char section){
     if(!this.teaches.containsKey(standard)){
         //Initilize new hashset to syore sections for the stanadard
         this.teaches.put(standard,new HashSet<>());
     }
    }
}
