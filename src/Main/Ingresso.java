package Main;

import java.util.GregorianCalendar; //In caso si vogliano fare delle manipolazione sulle date
import java.util.Random; 
import java.util.Arrays; //mi serve dopo per convertire un array in stringa

public class Ingresso {
    private int ID;
    private GregorianCalendar data;
    private Articolo articolo[];
    private int posizioneMagazzino;
    
    Random random = new Random(); 
    
    public Ingresso(int position, Articolo... article){//se non viene passata la data specificata prendo la data odierna
        ID = random.nextInt(1000000);
        data = new GregorianCalendar(); 
        posizioneMagazzino = position;
        articolo = article;
        int i = 0;
        for(Articolo X: article){
            articolo[i] = X;
            i++;
        }
    }
    
    public Ingresso(int position, int day, int month, int year, Articolo... article){//se mi viene specificata la data la configuro
        ID = random.nextInt(1000000);
        data = new GregorianCalendar(year, month, day); 
        posizioneMagazzino = position;
        int i = 0;
        for(Articolo X: article){
            articolo[i] = X;
            i++;
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
