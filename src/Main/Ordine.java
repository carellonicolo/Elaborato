package Main;

import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.Random;


public class Ordine {

    private int ID;
    private Negozio ordinante;
    private Articolo articoli[];
    private GregorianCalendar data;
    private int quantità[];
    private int totale;
    
    Random random = new Random(); 
    
    /*-------------COSTRUTTORI---------------------*/
    
    public Ordine(Negozio n, int totale, Articolo a[], int q[]){//se non mi viene passata la data mi prendo la data odierna 
        ID = random.nextInt(1000000);
        ordinante = n;
        this.totale=totale;
        articoli = a;
        quantità = q;
        data = new GregorianCalendar();//prendo la data odierna
    }//costruttore senza data
    
    public Ordine(Negozio n, int totale, Articolo a[], int q[], int day, int month, int year){//se non mi viene passata la data mi prendo la data odierna 
        ID = random.nextInt(1000000);
        ordinante = n;
        this.totale=totale;
        articoli = a;
        quantità = q;
        data = new GregorianCalendar(year, month, year);
    }//costruttore con data come parametri interi
    
    public Ordine(Negozio n, int totale, Articolo a[], int q[], GregorianCalendar d){//La data viene passata come paramentro gregorianCalendar
        ID = random.nextInt(1000000);
        ordinante = n;
        this.totale=totale;
        articoli = a;
        quantità = q;
        data = d;
    }//costruttore con data in formato gregorianCalendar
    
    //------------------METODI-GET-------------------//
    public Negozio getOrdinante(){
        return ordinante;
    }
    
    public int getID(){
        return ID;
    }
    
    public int getTotalPrice(){
        return totale;
    }
    
    public String getArticoli_e_quantità(){
        //sappiamo che l'array articoli e l'array quantità sono uguali
        
        String s = "";
        int i = 0;
        for(Articolo X: articoli){
            
        }
        return s;
    }//getArticoli_e_quantità
    
    /*--------------MANCANO I METODI SET--------------*/
    
    
    
    
}//fine ordine
