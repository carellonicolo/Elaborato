package Main;

import java.util.GregorianCalendar;
import java.util.UUID;


public class Articolo {
    private final UUID ID;
    private float prezzo;
    private GregorianCalendar data;
    private TipoArticolo x;

    
    //se non viene passata nessuna data sarà il chiamante la funzione che mi deve passare unda data in formato GregorianCalendar
    public Articolo(float price, GregorianCalendar data, TipoArticolo x){//CON DATA
        this.prezzo = price;
        this.x = x;
        this.data = data;//Salvo la data se mi viene passata
        this.ID = UUID.randomUUID();
    }
    
    
    public Articolo(float price, TipoArticolo x){//CON DATA
        this.prezzo = price;
        this.x = x;
        this.data = new GregorianCalendar();
        this.ID = UUID.randomUUID();
    }
    
    
    
    
    /**************************METODI GET*******************************/
    
    public String getID(){
        return ID.toString();
    }
    
    public float getPrezzo(){
        return prezzo;
    }
    
    public GregorianCalendar getData(){
        return data;
    }
   
    public TipoArticolo getTipoArticolo() {
        return x;
    }
    
    
    
    
    /**************************METODI SET*******************************/
 
    public void setTipoArticolo(TipoArticolo x){
            this.x=x;
    }
    
    public void setPrezzo(float p){
        prezzo=p;
    }
    
    public void setData(GregorianCalendar d){
            data = d;
    }
    
    public void setData(){//se non mi viene passata una data me la prendo io quella odierna
        data = new GregorianCalendar();
    }
    
    
    
    
    @Override
    public String toString(){
        return "ID Articolo: "+ID+"\nPrezzo: " + prezzo + "\nData: " + data;
    }

    
}