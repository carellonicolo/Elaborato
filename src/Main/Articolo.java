package Main;

import java.util.GregorianCalendar;
import java.util.Random;


public class Articolo {
    private final int ID;
    private TipoArticolo x;
    private float prezzo;
    private GregorianCalendar data;
    
    Random r = new Random(); 
    
    public Articolo(TipoArticolo x, float prezzo){//SENZA DATA
        this.prezzo = prezzo;
        this.x = x;
        data = new GregorianCalendar();//se non mi viene passata la data prendo la data odierna
        ID = Integer.parseInt(""+data.get(data.HOUR)+"99"+data.get(data.MINUTE)+data.get(data.SECOND)+r.nextInt(1543))+r.nextInt(99);
    }
    
    public Articolo(TipoArticolo x, float price, GregorianCalendar data){//CON DATA
        this.prezzo = price;
        this.x = x;
        this.data = data;//Salvo la data se mi viene passata
        ID = Integer.parseInt(""+data.get(data.HOUR)+"99"+data.get(data.MINUTE)+data.get(data.SECOND)+r.nextInt(1543))+r.nextInt(99);
    }
    
    
    
    
    /**************************METODI GET*******************************/
    public TipoArticolo getTipoArticolo(){
        return x;
    }
    
    public int getID(){
        return ID;
    }
    
    public float getPrezzo(){
        return prezzo;
    }
    
    public GregorianCalendar getData(){
        return data;
    }
   
    
    
    
    
    /**************************METODI SET*******************************/
    public boolean setTipoArticolo(TipoArticolo x){
        if(x instanceof TipoArticolo){
            this.x=x;
            return true;
        }
        return false;
    }
    
    public void setPrezzo(float p){//il prezzo, anche se sarà impossibile ma potrebbe essere negativo quindi non faccio controlli sul prezzo
        prezzo=p;
    }
    
    public boolean setData(GregorianCalendar d){
        if(d instanceof GregorianCalendar){
            data = d;
            return true;
        }
        return false;
    }
    
    public void setData(){//se non mi viene passata una data me la prendo io quella odierna
        data = new GregorianCalendar();
    }
    
    
    
    
    public String toString(){
        return "ID Articolo: "+ID+"\nPrezzo: " + prezzo + "\nData: " + data + "\nTipo di articolo: \n"+x.toString();
    }
}