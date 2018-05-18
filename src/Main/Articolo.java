package Main;

import java.util.GregorianCalendar;
import java.util.Random;


public class Articolo {
    private final int ID;
    private float prezzo;
    private GregorianCalendar data;
    private TipoArticolo x;
    Random r = new Random(); 

    
    //se non viene passata nessuna data sarà il chiamante la funzione che mi deve passare unda data in formato GregorianCalendar
    public Articolo(float price, GregorianCalendar data){//CON DATA
        this.prezzo = price;
        this.data = data;//Salvo la data se mi viene passata
        ID = Integer.parseInt(""+data.get(data.HOUR)+"99"+data.get(data.MINUTE)+data.get(data.SECOND)+r.nextInt(1543))+r.nextInt(99);
    }
    
    
    
    
    /**************************METODI GET*******************************/
    
    public int getID(){
        return ID;
    }
    
    public float getPrezzo(){
        return prezzo;
    }
    
    public GregorianCalendar getData(){
        return data;
    }
   
    public TipoArticolo getTipoArticolo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
    
    
    @Override
    public String toString(){
        return "ID Articolo: "+ID+"\nPrezzo: " + prezzo + "\nData: " + data;
    }

    
}