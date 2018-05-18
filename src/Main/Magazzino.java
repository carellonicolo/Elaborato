package Main;

import java.util.*;

public class Magazzino {
    
    private Map<Ordine, Uscita> ordineUscita ;
    private Set<Ingresso> ingressi;
    private Map<Articolo, TipoArticolo> articoli;
    
    private Set<Ingresso> ingressiMensili;
    private Set<Uscita> usciteMensili;

    private Set<Utente> users;
    
    //COSTRUTTORE
    public Magazzino() {
        this.ordineUscita = new HashMap<>();
        this.usciteMensili = new TreeSet<>();
        this.ingressiMensili = new TreeSet<>();
        this.users = new HashSet<>();
        this.ingressi = new HashSet<>();
    }
    
    public void addUser(Utente u){
        users.add(u);
    }
    
    public boolean removeUser(Utente u){
        return users.remove(u);
    }
    
    public int login(Utente u){
        
        for(Utente X: users){
            if(X.checkPass(X, u))
                return X.getTypeInt();
        }
        
        return -1; //non è stata trovata una corrispondenza tra un utente esistente e quello inserito dall'utente!
    }
    
    
    
    

    public void addIngresso(Ingresso i){
        ingressi.add(i);
    }
    
    public boolean removeIngresso(Ingresso i){
        return ingressi.remove(i);
    }
    
    
    
    public boolean addUscitaOrdine(Ordine o, Uscita u){//inserisco nuova uscita ordine
            if(ordineUscita.containsKey(o)){
            ordineUscita.put(o, u);
            usciteMensili.add(u);
            return true;
            }
        return false;
    }//addUscitaOrdine
    
    public void resetMounth(){//server per resettare il totale degli ingressi e uscite in un anno
        ingressiMensili.clear();
        usciteMensili.clear();
    }//resetMounth
    
}
