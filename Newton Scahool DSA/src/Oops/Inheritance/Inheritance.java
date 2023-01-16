package Oops.Inheritance;
//base class
 class Animal{
     void eat(){
         System.out.println("eats");
     }

     void breathe(){
         System.out.println("breathes");
     }
 }
 //Derived class


class Fish extends Animal{
     int fins;
     void swim(){
         System.out.println("swims in water");
     }
}


