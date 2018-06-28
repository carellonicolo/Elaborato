package Main;

import java.util.GregorianCalendar;

public class Articolo extends WarehouseMovement implements Comparable<Articolo> {

    private float prezzo;
    private TipoArticolo tipoArticolo;

    /**
     * se non viene passata nessuna data sarà il chiamante la funzione che mi
     * deve passare unda data in formato GregorianCalendar
     *
     * @param price
     * @param data
     * @param tipoArticolo
     */
    public Articolo(float price, GregorianCalendar data, TipoArticolo tipoArticolo) {//CON DATA
        this.prezzo = price;
        this.tipoArticolo = tipoArticolo;
        this.data = data;//Salvo la data se mi viene passata
    }

    public Articolo(float price, TipoArticolo tipoArticolo) {//CON DATA
        this.prezzo = price;
        this.tipoArticolo = tipoArticolo;
        this.data = new GregorianCalendar();
    }
    
    public Articolo(float price, int day, int month, int year, TipoArticolo tipoArticolo){
        this.prezzo = price;
        this.tipoArticolo = tipoArticolo;
        this.data = new GregorianCalendar(year, month, day);
    }

    /**
     * ************************METODI GET******************************
     */

    public float getPrezzo() {
        return prezzo;
    }

    public TipoArticolo getTipoArticolo() {
        return tipoArticolo;
    }

    
    
    
    
    
    /**
     * ************************METODI SET******************************
     */
    public void setTipoArticolo(TipoArticolo tipoArticolo) {
        this.tipoArticolo = tipoArticolo;
    }

    public void setPrezzo(float p) {
        prezzo = p;
    }
    
    
    
    
    @Override
    public int hashCode() {
        return tipoArticolo.hashCode() ^ (int) prezzo ^ data.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Articolo && tipoArticolo.equals(((Articolo) other).tipoArticolo) && prezzo == ((Articolo) other).prezzo && data.equals((Articolo) other);
    }

    @Override
    public int compareTo(Articolo other) {//ordino per tipoArticolo poi per data e infine per prezzo
       
        int diff = tipoArticolo.compareTo(other.tipoArticolo);
        if (diff != 0) 
            return diff;
        
        
        diff = data.compareTo(other.data);
        if (diff != 0) 
            return diff;
        
        return (int) prezzo - (int) other.prezzo;

    }

    @Override
    public String toString() {
        return "ID Articolo: " + hashCode() + "\nPrezzo: " + prezzo + "\nData: " + getDataInString();
    }

}
