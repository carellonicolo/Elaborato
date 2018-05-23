package Main;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class Uscita {
    
    private final UUID ID;
    private Set<Articolo> articoli;
    private String corriere;
    private Negozio negozio;
    private GregorianCalendar data;
    private Ordine o;
    
    private final Random r = new Random();

    public Uscita(String corriere, Ordine o){
        this.ID = UUID.randomUUID();
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
    
    public String getBolla(){
        return ID.toString();
    }
    
    public String getCorriere(){
        return corriere;
    }
    
    public void setCorriere(String s){
        corriere = s;
    }
}
