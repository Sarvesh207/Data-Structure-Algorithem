package Strings;

public class LargestString {
    public static void findLargestString( String [] fruit){
        String largest  = fruit[0];
        for(int i=1; i<fruit.length-1; i++){
            largest.compareTo(fruit[i]);
            largest = fruit[i];
        }

    }
    public static void main(String[] args) {
        String [] fruit = {"appple","mango","banana"};
      //  String largest  = fruit[0];
        String largest  = fruit[0];
        for(int i=1; i<fruit.length-1; i++){
            largest.compareTo(fruit[i]);
            largest = fruit[i];
        }

        System.out.println(largest);
    }
}
