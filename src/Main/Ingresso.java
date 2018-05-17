package Main;

import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.Random; 
import java.util.Arrays; //mi serve dopo per convertire un array in stringa
import java.util.TreeMap;

public class Ingresso {
    private final int ID;
    private GregorianCalendar data;
    private Articolo articolo[];
    private int posizioneMagazzino;
    
    private TreeMap<Integer, Articolo> articoloPosizione;
    Random r = new Random(); 
    
    
    
    //COSTRUTTORE
    public Ingresso( Articolo... article){//se non viene passata la data specificata prendo la data odierna
        ID = Integer.parseInt(""+data.get(data.HOUR)+"99"+data.get(data.MINUTE)+data.get(data.SECOND)+r.nextInt(1543))+r.nextInt(99);
        data = new GregorianCalendar(); 
        articoloPosizione = new TreeMap<>();
        int i = 0;
        for(Articolo X: article){
            articoloPosizione.put(i, X);
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
    
    public int getPosition(){
        return posizioneMagazzino;
    }
    
    
    //DA TESTARE
    public String getArticolo(){
        return Arrays.toString(articolo);
    }
    
    //
    //MANCANO I METODI SET!! 
    //
    //
    //
    //
    //
    
   
    
}//fine ingresso
