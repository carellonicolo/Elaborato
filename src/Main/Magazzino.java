package Main;

import java.util.*;

public class Magazzino {
    
    private Map<Ordine, Uscita> ordineUscita ;
    private Ingresso ingressi[];

    private Set<Ingresso> ingressiMensili;
    private Set<Uscita> usciteMensili;

    //COSTRUTTORE
    public Magazzino() {
        this.ordineUscita = new HashMap<>();
        this.usciteMensili = new TreeSet<>();
        this.ingressiMensili = new TreeSet<>();
    }
    
    public boolean addIngresso(Ingresso i){
        if(i instanceof Ingresso){
            return true;
        }
        return false;
    }
    
    public boolean addUscitaOrdine(Ordine o, Uscita u){//inserisco nuova uscita ordine
        if(u instanceof Uscita && o instanceof Ordine){
            if(ordineUscita.containsKey(o)){
            ordineUscita.put(o, u);
            usciteMensili.add(u);
            return true;
            }
        }
        return false;
    }
    
    public void resetYear(){
        ingressiMensili.clear();
        usciteMensili.clear();
    }
    
}
