package central;

/*
 * Coda = Queue (FIFO)
 */

public class Coda {

    private static final int CAPACITY= 10;
    private static int[] queue = new int[CAPACITY];
    private int top = 0,pop = 0;


    // Default contructor
    public Coda(){
        for (int i = 0; i < queue.length; i++) 
            queue[i] = -1;
    } 
    
    /** 
     * Add Method adds a element on the 
     * top of the queue.
     * @param data the data given to be inserted
     * 
     */ 
    public void add(int data){
        if(top == CAPACITY)
            System.out.println("The Queue is full");
        else{    
            queue[top]=data;
            top++;
        }
    }

    /* 
     * Pop Method extracts the first inserted 
     * data and returns it if the stack is not empty,
     * And by extracting the data is deleted.
     */
    public int pop(){
        if(isEmpty())
            System.out.println("The Queue is empty");
        else{    
            ;
            int data = 0;
            data = queue[pop];
            queue[pop]=-1;
            pop++;
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
        for (int i = 0 ; i<queue.length; i++){
            if(queue[i]!=-1)
                System.out.print(" "+queue[i]+",");
        }
        System.out.print("]");
    }

}
