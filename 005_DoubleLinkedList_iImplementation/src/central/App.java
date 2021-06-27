package central;

import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);
    private static  List list = new List();
    
    public static void main(String[] args){
       
        
        int choice=0;
        int esito=0;
        String str = null;
        
       

        do{
            
            System.out.println("1.Add Element\n");
            System.out.println("2.Erase Elment\n");
            System.out.println("3.Show All Element\n");
            System.out.println("4.Exit\n");
            str = input.nextLine();
            choice = Integer.parseInt(str);

            switch(choice){
                case 1:
                    esito=add();
                    if(esito!=0)
                        System.out.println("Entry Error!\n\n");
                    else
                        System.out.println("Successfully Added!\n\n");
                    break;

                case 2:
                    esito = erase();
                    if(esito != 0)
                        System.out.println("Remove Error!\n\n");
                    else
                        System.out.println("Successfully Removed!\n\n");
                    break;

                case 3:
                    viewAll();
                    break;
                case 4:
                    System.out.println("Thanks for testing the program");
                    break;

                default: System.out.println("Wrong choice");

            }
        }while(choice != 4);


    }



    // Method to add a item user
    private static int add(){
        int choice  = 0;
        int esito=0;
        String str = null;
        Node item = list.create();
                 
        
        // Insermento da
        System.out.println("Enter name: "); 
        item.setName(input.nextLine());
        System.out.println("Enter Surname: ");
        item.setSurname(input.nextLine());
        System.out.println("Enter age: ");
        item.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter your job: "); 
        item.setJob(input.nextLine());
        System.out.println("1.Add Head\n2.Add Bottom\n3.Add Sorted");
        str = input.nextLine();
        choice = Integer.parseInt(str);

        switch(choice){
            case 1: esito = list.addHead(item);
                break;
    
            case 2: esito = list.addBottom(item);
                break;
    
            case 3: esito = list.addSort(item);
                break;
        }
        return esito;
    }

    // Method to ask what to remove
    private static int erase(){
        int choice  = 0;
        String key = null, str = null;
        int esito = 0;

        System.out.println("Enter Name to be eliminated:\n");
        key = input.nextLine();
        System.out.println("1.Add Head\n2.Add Bottom\n3.Add Sorted");
        str = input.nextLine();
        choice = Integer.parseInt(str);
        

        switch(choice){
            case 1: esito = list.removeHead();
                break;
    
            case 2: esito = list.removeBottom();
                break;
    
            case 3: esito = list.removeSort(key);
                break;
        }
        return esito;
    }

// Method to see all the content
    private static void viewAll(){
        if(list.getRoot() == null) 
                System.out.println("Empty list.\n");
        else{
            Node current;
            for(current = list.getRoot(); current != null; current = current.getNext()) 
               System.out.println("Name: "+current.getName()+" Surname: "+current.getSurname()+" Age:"+current.getAge()+" Job:"+current.getJob() );
            System.out.println("\n");
        }
    }
    
}




