package Main;

import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Ordine {

    private final int ID;
    private Negozio ordinante;
    private GregorianCalendar data;
    private float prezzoTotale;
    
    private Map<Articolo, Integer> mappa = new HashMap<>();
    
    Random r = new Random(); 
    
    
    
    
    /*-------------COSTRUTTORI---------------------*/
    
  
    
    public Ordine(Negozio n, int day, int month, int year, Map<Articolo, Integer> m){//DATA PASSATA IN INTERO 
        this.prezzoTotale = 0;
        this.ID = Integer.parseInt(""+data.get(data.HOUR)+"99"+data.get(data.MINUTE)+data.get(data.SECOND)+r.nextInt(1543))+r.nextInt(99);
        this.ordinante = n;
        this.mappa = m;
        this.data = new GregorianCalendar(year, month, year);
        
        //Calcolo il costo totale degli articoli nella mappa
        calcolaPrezzo();
        
    }//costruttore con data come parametri interi
    
    
    
    
    
    
    
    
    //------------------METODI-GET-------------------//
    public Negozio getOrdinante(){
        return ordinante;
    }
    
    public int getID(){
        return ID;
    }
    
    public float getTotalPrice(){
        return prezzoTotale;
    }
    
    public String getArticoli_e_quantità(){
        String s = "";
        for(Map.Entry<Articolo, Integer> entry: mappa.entrySet()){
            Articolo a = entry.getKey();
            int q = entry.getValue();
            s = ""+a.getID()+ " " +a.getTipoArticolo().getName() + " " + q;
        }
        return s;
    }//getArticoli_e_quantità
    
    
    
    /*--------------MANCANO I METODI SET--------------*/
    
    public boolean setNegozio(Negozio n){
        if(n instanceof Negozio){
            ordinante = n;
            return true;
        }
        return false;
    }
    
    
    public boolean addArticle(Articolo a, int q){
        if(a instanceof Articolo)
            if(mappa.containsKey(a))
                return false;// se la mappa ha già l'articolo
            else{
                mappa.put(a, q);
                calcolaPrezzo();
                return true;
            }
        return false;//se a non è istanza di Articolo
    }
    
    public boolean setArticle(Articolo a, int q){ //se q = 0 allora rimuovo l'articolo //se q > 0 modifico la quantità dell'articolo 

        if(q==0)
            if(a instanceof Articolo)
                 if(mappa.containsKey(a)){
                    mappa.remove(a);
                    calcolaPrezzo();
                    return true;
                 }
                     
                     
        if(q>0)   
        if(a instanceof Articolo)
            if(mappa.containsKey(a)){
                mappa.replace(a, q);
                calcolaPrezzo();
                return true;
            }

        
        //altrimenti se q<0
       return false;
    }//set article
    
    
    
    private void calcolaPrezzo(){
        //Calcolo il costo totale degli articoli nella mappa
        for(Map.Entry<Articolo, Integer> entry: mappa.entrySet()){
            Articolo a = entry.getKey();
            int q = entry.getValue();
            this.prezzoTotale = q*a.getPrezzo();
        } 
    }
    
}//fine ordine
