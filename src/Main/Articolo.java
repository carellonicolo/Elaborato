package Main;


import java.util.GregorianCalendar;
import java.util.UUID;


public class Articolo {
    private final UUID ID;
    private float prezzo;
    private GregorianCalendar data;
    private TipoArticolo x;


    /**
     *se non viene passata nessuna data sarà il chiamante la funzione che mi deve passare unda data in formato GregorianCalendar
     * @param price
     * @param data
     * @param x
     */
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
    
    public String getData(){
        return ""+data.get(GregorianCalendar.DATE)+"-"+data.get(GregorianCalendar.MONTH)+"-"+data.get(GregorianCalendar.YEAR);
    }
    
    public String getDay(){
        return ""+data.get(GregorianCalendar.DATE);
    }
   
    public String getMonth(){
        return ""+data.get(GregorianCalendar.MONTH);
    }
    
    public String getYear(){
        return ""+data.get(GregorianCalendar.YEAR);
    }
    
    public TipoArticolo getTipoArticolo() {
        return x;
    }
    
    
    
    
    /**************************METODI SET*******************************/
 
    /**
     * @param x
     */
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
    
    public void setData(int d, int m, int y){
        data = new GregorianCalendar(d, m, y);
    }
    
    
    
    
    @Override
    public String toString(){
        return "ID Articolo: "+ID+"\nPrezzo: " + prezzo + "\nData: " + data;
    }

    
}