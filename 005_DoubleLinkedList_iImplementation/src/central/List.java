package central;

public class List {
  
    Node root = null;

    public Node getRoot(){
        return root;
    }

    // Restitiuisce new Node
    public Node create(){
        return (new Node());
    }

    // Scorrimento
    public Node travers(){
        Node current = null;
	    for(current = root; current.getNext() != null; current = current.getNext());
        return current;
    }


    // Inserimento in testa 
    int addHead(Node item){

        // Verificare sempre se la lista sia vuota o no
        if(root == null)
            root=item;
        else{
            root.setPrev(item);
            item.setNext(root);
            root=item;
        }
        return 0;
    }

    // Inserimento in coda 
    int addBottom(Node item){
        Node last = null;
        
        if(root == null){
            root = item;
            return 0;
        }
        
        last = travers(); // last punta al ultimo elemento della lista
        
        last.setNext(item);
        item.setPrev(last);
        return 0;
    }

    // Rimozione in testa 
    int removeHead(){
        if(root == null){
            return 1;
        }
        
        root = root.getNext();
        root.setPrev(null);
        
        return 0;
    }

    // Rimozione in coda 
    int removeBottom(){

        if(root == null)
            return 1;
        
        Node last = travers();
        last.getPrev().setNext(null);
        
        
        return 0;
    }

    // Aggiungi ordinato
    public int addSort(Node item){
        if(root == null){
            root = item;
            return -1;
        }

        if(root.getName().compareTo(item.getName())>0){
            item.setNext(root);
            root.setPrev(item);;
            root = item;
            return 0;
        }	

        Node current = null;
	
        // CASO #3: Inserimento in Mezzo O Coda
        current = search(item);
        item.setNext(current.getNext());
        item.setPrev(current);
        current.setNext(item); 
        return 0;	
    }

    // Ricerca nodo 
    Node search(Node item){
        /*
        * Restituisce il puntatore all'elemento precedente a
        * quello da inserire;
        *
        * la Key dipende dal tipo di ordiantamento (campo)
        */
        Node current = null;
        
        for(current = root; (current.getNext() != null) && (current.getNext().getName().compareTo(item.getName()))<0 ; current = current.getNext());
        
        return current; 
    }

    // Rimozione Ordinata
    int removeSort(String key){
        
        // CASO#1 : Lista vuota
        if(root == null)
            return -1;
            
        // CASO#2 : Rimozione testa	
        if(root.getName().compareTo(key) == 0){
            root = root.getNext();
            return 0;
        }	

        
        Node saveRef = null;		
        // CASO#3 : Rimozione mezzo o in coda
        for(saveRef = root;(saveRef.getNext() != null) && (saveRef.getNext().getName().compareTo(key) >0); saveRef = saveRef.getNext());
        
        if(saveRef.getNext().getNext() != null){
            saveRef.getPrev().setNext(saveRef.getNext());
            return 0;
        }
        return -2;

        
    }


}
