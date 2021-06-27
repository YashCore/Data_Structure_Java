package central;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {
    public static void main(String[] args){

        HashSet<Integer> setA = new HashSet<Integer>();
        HashSet<Integer> setB = new HashSet<Integer>();

        unione(setA, setB);
        intersezione(setA, setB);
        differenza(setA, setB);

    }

    private static void unione(HashSet setA, HashSet setB) {
        randomIntialize(setA);
        randomIntialize(setB);
        System.out.println("\n\n-------------SET GENERATI-------------");
        System.out.println(setA+"\n"+setB);


        System.out.println("\n\n-------------UNIONE-------------");
        // UNION
        setA.addAll(setB);
        setB.addAll(setA);
        System.out.println("Unione in A: "+setA);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
    }

    private static void differenza(HashSet setA, HashSet setB) {
        randomIntialize(setA);
        randomIntialize(setB);
        System.out.println("\n\n-------------SET GENERATI-------------");
        System.out.println(setA+"\n"+setB);

        
        System.out.println("\n\n-------------DIFFERENZA-------------");
        setA.removeAll(setB);
        System.out.println("Differenza in A :"+ setA);
        setB.removeAll(setA);
        System.out.println("Differenza in B :"+ setB);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
    }

    private static void intersezione(HashSet setA, HashSet setB) {
        randomIntialize(setA);
        randomIntialize(setB);
        System.out.println("\n\n-------------SET GENERATI-------------");
        System.out.println(setA+"\n"+setB);

        
        // INTERSEZIONE
        System.out.println("\n\n-------------INTERSEZIONE-------------");
        setA.retainAll(setB);
        System.out.println("Intersezione :"+ setA);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
    }


    private static void randomIntialize(HashSet set){
        Random rand = new Random();
        for (int i = 0; i < rand.nextInt(15-1)+1; i++)
            set.add(rand.nextInt(20));
    }
}
