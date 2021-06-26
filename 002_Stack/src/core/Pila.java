package core;


public class Pila {

    // basic stack variables
    private final int CAPACITY=10;
    private int[] stack = new int[CAPACITY];
    private int top=0;
    

    // Default constructor
    public Pila(){
        for (int i = 0; i < stack.length; i++) 
            stack[i]=-1;
        
    }




    /** 
     * Push Method adds a element on the 
     * top of the stack.
     * shifting by one all the other elements
     * @param data the data given to be inserted
     * 
     */ 
    public void push(int data){
        if(top==CAPACITY)
            System.out.println("The Stack is full");
        else{    
            stack[top]=data;
            top++;
        }
    }

    /* 
     * Pop Method extracts the last inserted 
     * data and returns it if the stack is not empty
     * 
     */
    public int pop(){

        if(isEmpty())
            System.out.println("The Stack is empty");
        else{    
            top--;
            int data = 0;
            data = stack[top];
            stack[top]=-1;
            return data;
        }
        return -1;
    }


    // Method that uses the top variable to get the size depeding on the elements
    public int size(){
        return top;
    }


    // Method that uses the top variable to check is the stack is empty or not
    public boolean isEmpty(){
        return top<=0;
    }

    // method that prints all the inserted elements
    public void show(){
        System.out.print("[");
        for (int i = 0 ; i<stack.length; i++){
            if(stack[i]!=-1)
                System.out.print(" "+stack[i]+",");
        }
        System.out.print("]");
    }







    
}
