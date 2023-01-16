package Oops.Classes_and_Object;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();  // created a pen objected
        p1.setColour("Blue");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.colour = "yellow";
        System.out.println(p1.colour);

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Sarvesh";
        myAcc.passWard = "abcdef";
    }
}
//Access Specifire

class BankAccount{
  public String userName;
   String passWard;
  void setpassward(String pwd){
  }
}
class Pen{
    //propertis + function
    String colour;
    int tip;
    String getColour(){
        return this.colour;
    }

    void setColour(String  newColour){
       colour = newColour;
    }
    void setTip(int newTip){
    tip = newTip;
    }
}
