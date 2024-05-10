import java.util.Arrays;

public class oops_12 {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        for(int i = 0; i<10; i++){
            myStack1.push(i);
        }
        for(int i=0; i<10; i++) {
            System.out.println(myStack1);
        }
    }
}
class Stack{
    int stck[] = new int[10];
    int top;
    //Initializing top of the stack
    Stack(){
        top = -1;
    }
    //push an item into the stack
    void push(int item){
        if(top==9)
            System.out.println("Stack is full");
        else
            stck[++top] = item;
    }
    //pop an item from the stack
    int pop(){
        if(top==-1) {
            System.out.println("Stack under flow");
            return 0;
        }
        else
            return stck[top--];
    }
}
