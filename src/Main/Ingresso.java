package Main; //main

//MAIN 

import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.HashMap;
import java.util.Map;



public class Ingresso extends WerehouseMovement implements Comparable<Ingresso>{
    
    private final Map<Articolo, Integer> posizioni;
    private Map<Articolo, Integer> quantita;
    public static int i;
    
    //COSTRUTTORE
    public Ingresso(Articolo... article){//se non viene passata la data specificata prendo la data odierna
        data = new GregorianCalendar(); 
        posizioni = new HashMap<>();
        
        for(Articolo X: article){
            posizioni.put(X, 1);

            //posizione magazzino = getLastPosition()+i
        }
    }
    
 
    
    public int getPosition(Articolo a){
        if(a instanceof Articolo)
            if(posizioni.containsKey(a))
                return posizioni.get(a);
        return -1;//se non esiste un articolo così nella mappa restituisci  -1
    }
    
    public Articolo getArticle(int i){
        if(i>=0 && i<this.i && posizioni.containsValue(i))
            for(Map.Entry<Articolo, Integer> entry: posizioni.entrySet())//scorro la mappa come fosse una lista
                if(entry.getValue() == i)//quando trovo l'associazione posizione-articolo
                    return entry.getKey();
        return null;//se non esiste un'associazione posizione-articolo
    }
    
    public void addArticle(Articolo a){
           posizioni.put(a, i);
            i++;//incrementare sempre la posizione ad ogni aggiunta
    }
    
    
    @Override
    public int hashCode(){//DEBUG
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
  
    @Override
    public String toString() {
        return "";
    }

    @Override
    public int compareTo(Ingresso o) {
        return 2;
    }
}//fine ingresso
