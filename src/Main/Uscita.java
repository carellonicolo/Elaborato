package Main;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Uscita {
    
    private final int bolla;
    private Set<Articolo> articoli;
    private String corriere;
    private Negozio negozio;
    private GregorianCalendar data;
    private Ordine o;
    
    private final Random r = new Random();

    public Uscita(String corriere, int ID, Ordine o){
        this.bolla = ID;
        this.corriere = corriere;
        this.articoli = new HashSet<>();
        this.o = o;
    }
    
    public boolean addArticoli(Articolo i){
        return articoli.add(i);
    }
    
    public void setOrdine(Ordine o){
        this.o = o;
    }
    
    public Ordine getOrdine(){
        return o;
    }
    
    public boolean removeArticoli(Articolo i){
        return articoli.remove(i);
    }
    
    public int getBolla(){
        return bolla;
    }
    
    public String getCorriere(){
        return corriere;
    }
    
    public void setCorriere(String s){
        corriere = s;
    }
}
