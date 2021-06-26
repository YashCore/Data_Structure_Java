package central;

/*
 * Execution class = Contains the Menu
 */

import java.util.Scanner;

public class Execution {

    // for keyboard input
    Scanner input =new Scanner(System.in);

    // Mehthod that contins the switch for user interface  
    public void process(){
        /* Key = menu 
         * internalKey = internal menu
         * data = data that is going in the queue or stack
         */ 
        int key = 0,internalKey = 0, data = 0;

        // Flag for the menu
        boolean flag=true;

        // variable of support
        String holder = null;

        // The two type of Storge
        Pila stack = new Pila();
        Coda queue = new Coda();

        // menu
        do {
            // input user choice
            System.out.println("-------------------------------------------");
            System.out.println("\n1.Add Data.\n"
                              +"2.Pop Data\n"
                              +"3.Is empty\n"
                              +"4.Show Data\n"
                              +"5.Exit");
            holder=input.nextLine();
            key = Integer.parseInt(holder);

            switch (key) {

                // case that adds data to stack or queue
                case 1:
                    System.out.println("1.Stack\n"
                                      +"2.Queue");
                    holder=input.nextLine();
                    internalKey = Integer.parseInt(holder);
                                                      
                    switch (internalKey) {
                        case 1:
                            System.out.println("Enter data");
                            holder=input.nextLine();
                            data = Integer.parseInt(holder);
                            stack.add(data);
                            break;

                        case 2:
                            System.out.println("Enter data");
                            holder=input.nextLine();
                            data = Integer.parseInt(holder);
                            queue.add(data);
                            break;

                        default:
                            System.out.println("'"+internalKey+"' Is not a Choice! Pleas select one of the given choices");
                            internalKey=0;
                            break;
                    }
                    break;

                // case that pops data to stack or queue
                case 2:
                    System.out.println("1.Stack\n"
                                      +"2.Queue");
                    holder=input.nextLine();
                    internalKey = Integer.parseInt(holder);
                          
                    switch (internalKey) {
                        case 1:
                            System.out.println("Poped from stack: "+stack.pop());
                            break;

                        case 2:
                            System.out.println("Poped from queue: "+queue.pop());
                            break;

                        default:
                            System.out.println("'"+internalKey+"' Is not a Choice! Pleas select one of the given choices");
                            internalKey=0;                           
                            break;
                    }
                    break;

                // case that checks if the stack or queue is empty
                case 3:
                    System.out.println("1.Stack\n"
                                      +"2.Queue");
                    holder=input.nextLine();
                    internalKey = Integer.parseInt(holder);

                    switch (internalKey) {
                        case 1:
                            System.out.println(stack.isEmpty());
                            break;

                        case 2:
                            System.out.println(queue.isEmpty());
                            break;

                        default:
                            System.out.println("'"+internalKey+"' Is not a Choice! Pleas select one of the given choices");
                            internalKey=0;
                            break;
                    }
                    break;

                // case that shows data of stack or queue
                case 4:
                    System.out.println("1.Stack\n"
                                      +"2.Queue");
                    holder=input.nextLine();
                    internalKey = Integer.parseInt(holder);

                    switch (internalKey) {
                        case 1:
                            stack.show();
                            break;

                        case 2:
                            queue.show();
                            break;

                        default:
                            System.out.println("'"+internalKey+"' Is not a Choice! Pleas select one of the given choices");
                            internalKey=0;
                            break;
                    }
                    break;

                // EXIT
                case 5: 
                    flag=false;
                    System.out.println("Thanks for testing!");
            
                default:
                    System.out.println("'"+key+"' Is not a Choice! Pleas select one of the given choices");
                    break;
            }
            
        } while (flag);

    }
    
}
