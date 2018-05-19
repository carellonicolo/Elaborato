package Main;

import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.HashMap;
import java.util.Map;
import java.util.Random; 


public class Ingresso {
    private final int ID;
    private GregorianCalendar data;
    private static int i = 0; 
    
    private Map<Articolo, Integer> articoloPosizione;
    Random r = new Random(); 
    
    
    
    //COSTRUTTORE
    public Ingresso(Articolo... article){//se non viene passata la data specificata prendo la data odierna
        ID = Integer.parseInt(""+data.get(data.HOUR)+"99"+data.get(data.MINUTE)+data.get(data.SECOND)+r.nextInt(1543))+r.nextInt(99);
        data = new GregorianCalendar(); 
        articoloPosizione = new HashMap<>();
        
        for(Articolo X: article){
            articoloPosizione.put(X, i);
            i++;
            //posizione magazzino = getLastPosition()+i
        }
    }
    
    
    public int getID(){
        return ID;
    }
    
    public String getData(){
        return ""+data.get(GregorianCalendar.DATE)+"-"+data.get(GregorianCalendar.MONTH)+"-"+data.get(GregorianCalendar.YEAR);
    }
    
    public int getPosition(Articolo a){
        if(a instanceof Articolo)
            if(articoloPosizione.containsKey(a))
                return articoloPosizione.get(a);
        return -1;//se non esiste un articolo così nella mappa restituisci  -1
    }
    
    public Articolo getArticle(int i){
        if(i>=0 && i<this.i && articoloPosizione.containsValue(i))
            for(Map.Entry<Articolo, Integer> entry: articoloPosizione.entrySet())//scorro la mappa come fosse una lista
                if(entry.getValue() == i)//quando trovo l'associazione posizione-articolo
                    return entry.getKey();
        return null;//se non esiste un'associazione posizione-articolo
    }
    
    public void addArticle(Articolo a){
           articoloPosizione.put(a, i);
            i++;//incrementare sempre la posizione ad ogni aggiunta
    }
    
}//fine ingresso
