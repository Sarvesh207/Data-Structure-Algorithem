package Stack;
import java.util.*;

//push at the botom of the stack

public class StackB {
        public static void pushBottom(Stack<Integer> s,int data){

                if(s.isEmpty()){
                        s.push(data);
                        return;
                }
               int top =  s.pop();
                pushBottom(s,data);
                s.push(top);
        }


        //reverse stack

        public static void reverseStack(Stack<Integer> s){

                if(s.isEmpty()){
                        return;
                }
                int top = s.pop();
                reverseStack(s);
                pushBottom(s,top);
        }

        public static void print(Stack<Integer> s){
                while(!s.isEmpty()){
                        System.out.println(s.pop());
                }
        }

        public static void main(String[] args) {
                Stack<Integer> s = new Stack<>();
                s.push(1);
                s.push(2);
                s.push(3);
                reverseStack(s);
                print(s);
//                pushBottom(s,4);
//                while(!s.isEmpty()){
//                        System.out.print(s.pop()+" ");
//                }

        }
}
