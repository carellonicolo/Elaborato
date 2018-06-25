package Main;

import java.util.GregorianCalendar;

public class Articolo implements Comparable<Articolo> {

    private float prezzo;
    private GregorianCalendar data;
    private TipoArticolo tipoArticolo;

    /**
     * se non viene passata nessuna data sarà il chiamante la funzione che mi
     * deve passare unda data in formato GregorianCalendar
     *
     * @param price
     * @param data
     * @param x
     */
    public Articolo(float price, GregorianCalendar data, TipoArticolo x) {//CON DATA
        this.prezzo = price;
        this.tipoArticolo = x;
        this.data = data;//Salvo la data se mi viene passata
    }

    public Articolo(float price, TipoArticolo x) {//CON DATA
        this.prezzo = price;
        this.tipoArticolo = x;
        this.data = new GregorianCalendar();
    }

    /**
     * ************************METODI GET******************************
     */
    public String getID() {
        return "" + hashCode();
    }

    public float getPrezzo() {
        return prezzo;
    }

    public String getData() {
        return "" + data.get(GregorianCalendar.DATE) + "-" + data.get(GregorianCalendar.MONTH) + "-" + data.get(GregorianCalendar.YEAR);
    }

    public String getDay() {
        return "" + data.get(GregorianCalendar.DATE);
    }

    public String getMonth() {
        return "" + data.get(GregorianCalendar.MONTH);
    }

    public String getYear() {
        return "" + data.get(GregorianCalendar.YEAR);
    }

    public TipoArticolo getTipoArticolo() {
        return tipoArticolo;
    }

    /**
     * ************************METODI SET******************************
     */
    /**
     * @param x
     */
    public void setTipoArticolo(TipoArticolo tipoArticolo) {
        this.tipoArticolo = tipoArticolo;
    }

    public void setPrezzo(float p) {
        prezzo = p;
    }

    public void setData(GregorianCalendar d) {
        data = d;
    }

    public void setData() {//se non mi viene passata una data me la prendo io quella odierna
        data = new GregorianCalendar();
    }

    public void setData(int d, int m, int y) {
        data = new GregorianCalendar(d, m, y);
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
        return "ID Articolo: " + hashCode() + "\nPrezzo: " + prezzo + "\nData: " + data;
    }

}
