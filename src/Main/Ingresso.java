package Main; //main

//MAIN 

import java.io.Serializable;
import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.*;



public class Ingresso extends WarehouseMovement implements Serializable{
    
    private final Map<Articolo, Integer> posizioni;
    private Map<Articolo, Integer> quantita;
    public static int i;
    
    
    //COSTRUTTORE
    public Ingresso(Articolo... article){//se non viene passata la data specificata prendo la data odierna
        this.posizioni = new TreeMap<>();
        this.quantita = new TreeMap<>();
        this.data = new GregorianCalendar();
    }
    
    public Ingresso(Map<Articolo, Integer> quantita, Map<Articolo, Integer> posizioni){
        this.quantita = quantita;
        this.posizioni = posizioni;
        this.data = new GregorianCalendar();
    }
    
    public Ingresso(int d, int m, int y){
        this.posizioni = new TreeMap<>();
        this.quantita = new TreeMap<>();
        this.data = new GregorianCalendar(y, m, d);
    }
    
    public Ingresso(Map<Articolo, Integer> quantita, Map<Articolo, Integer> posizioni, GregorianCalendar data){
        this.quantita = quantita;
        this.posizioni = posizioni;
        this.data = data;
    }
    
    public Ingresso(Map<Articolo, Integer> quantita, Map<Articolo, Integer> posizioni, int d, int m, int y){
        this.quantita = quantita;
        this.posizioni = posizioni;
        this.data = new GregorianCalendar(y, m, d);
    }
 
    
    
    
    
    
    
    public int getPosition(Articolo a){
        if(a instanceof Articolo)
            if(posizioni.containsKey(a))
                return posizioni.get(a);
        return -1;//se non esiste un articolo così nella mappa restituisci  -1
    }
    
    
    public Articolo getArticleFromPosition(int i){//restituisce l'articolo nella posizione i 
        if(posizioni.containsValue(i))
            for(Articolo X: posizioni.keySet())
                if(posizioni.get(X) == i)
                    return X;
        return null;
    }
    
    public Map<Articolo, Integer> getQuantitaMap(){
        return this.quantita;
    }
    
    public Map<Articolo, Integer> getPositionMap(){
        return this.posizioni;
    }
    
    
    @Override
    public int getID(){
        return hashCode();
    }
    

    
    @Override
    public int hashCode(){//DEBUG
        return quantita.hashCode() ^ posizioni.hashCode() ^ data.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Ingresso && ((Ingresso) other).posizioni.equals(posizioni) && ((Ingresso) other).quantita.equals(quantita) && ((Ingresso) other).data.equals(data);
    }
  
    @Override
    public String toString() {
        String s ="";
        for(Articolo X: (quantita.keySet()) )
            s += "Articolo: " + X.getTipoArticolo().getName() + "\tquantità: " + this.quantita.get(X) + " pezzi\tposizione: " + this.posizioni.get(X)+"\n";
        return s;
    }

}//fine ingresso
