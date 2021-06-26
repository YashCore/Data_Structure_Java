package core;

public class Execution {

	public void process(){
        Pila stack = new Pila();

        System.out.println("Is the stack emtpy = "+stack.isEmpty());
        
        stack.push(10);
        stack.push(1);
        stack.push(99);

        System.out.println("Poped: "+stack.pop());
        System.out.println("Stack size: "+stack.size());
        System.out.println("Is the stack emtpy = "+stack.isEmpty());
        stack.show();
    }
}
