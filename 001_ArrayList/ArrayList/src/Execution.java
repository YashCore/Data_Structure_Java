import java.util.ArrayList;
import java.util.Scanner;

/**
 * Execution
 */
public class Execution {
    
    private ArrayList<String> list = new ArrayList<String>();
    private Scanner input = new Scanner(System.in);
    
    public void process(){
        boolean flag= true;
        int choice=0;

        do{

            System.out.println("1) Add a new student");
            System.out.println("2) Remove a student");
            System.out.println("3) Show all student");
            System.out.println("4) Delete all student");
            System.out.println("5) Change student name"); 
            System.out.println("6) Exit"); 
                String str = input.nextLine();
                choice = Integer.parseInt(str);


            switch (choice) {
                case 1:
                    System.out.println("Enter Student name:");
                    str=input.nextLine();
                    list.add(str);
                    break;
            
                case 2: 
                    System.out.println("Enter Student name to remove:");
                    str=input.nextLine();
                    list.remove(str);                   
                    break;

                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;    

                case 4:
                    list.clear();
                    break;
                
                case 5:
                    System.out.println("Enter Student name to change:");
                    str=input.nextLine();
                    System.out.println("Enter Student name :");
                    String str0=input.nextLine();

                    changeData(str, str0);
                    break;

                case 6:
                    flag = false;  
                    System.out.println("Thanks for testing the programm.");
                    break;
                
                default: choice = 0;
                         System.out.println("_Not_a_valid_choice_!_");
                    break;
            }

        }while(flag);

        
        input.close();

    }


    private void changeData(String str,String str0){
        boolean flag0=true;
        for (int i = 0; i < list.size() && flag0; i++) 
            if(list.get(i).equalsIgnoreCase(str))
                list.set(i, str0); flag0=false;

        if (!flag0) {
                System.out.println("Student "+str+" does not exit!\n"
                                    +"Do you want to add "+str0+" as a new student? \n Y|N");
                str=input.nextLine(); 
                if(str.equalsIgnoreCase("Y"))
                    list.add(str0); 
                           
                
        }
    }
}







/*add, size, remove, clear, get e set. */