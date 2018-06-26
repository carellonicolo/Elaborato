package Main;

import java.util.*;

//GLI ARRAYLIST, COME PER GLI ARRAY, PARTONO DA 0
public class Magazzino {

    private final List<Uscita> uscite;
    private final List<Ordine> ordini;
    private final List<Articolo> articoli;
    private final List<Ingresso> ingressi;
    private final List<Negozio> negozi;
    private final List<Utente> users;
    private final Set<Ingresso> ingressiMensili;
    private final Set<Uscita> usciteMensili;
    private final Map<Articolo, Integer> quantita;
    private final Map<Articolo, Integer> posizione;

    
    
    /**
     * *********************************** CONSTRUCT
     * ***********************************
     */
    public Magazzino() {
        this.negozi = new ArrayList();
        this.uscite = new ArrayList<>();
        this.usciteMensili = new TreeSet<>();
        this.ingressiMensili = new TreeSet<>();
        this.users = new ArrayList<>();
        this.ingressi = new ArrayList<>();
        this.articoli = new ArrayList<>();
        this.ordini = new ArrayList<>();
        quantita = new HashMap<>();
        posizione = new HashMap<>();
    }
    
    
    
    
    
    
    

    /**
     * *********************************** USERS
     * ***********************************
     */
    public boolean addUser(Utente u) {
        return users.add(u);
    }

    public boolean removeUser(Utente u) {
        return users.remove(u);
    }

    public void removeUser(int i) {
        users.remove(i);
        //users.equals(i); Per effettuare il login 
    }

    public Utente getUser(int i) {
        return users.get(i);
    }

    public boolean usersIsEmpty() {
        return users.isEmpty();
    }

    public int login(Utente u) {
        for (Utente X : users) {
            if (X.checkPass(X, u)) {
                return X.getTypeInt();
            }
        }
        return -1; //non è stata trovata una corrispondenza tra un utente esistente e quello inserito dall'utente!
    }

    /**
     * *********************************** USERS ***********************************
     */
    
    
    
    
    /**
     * *******************************ARTICOLI*******************************************
     */
    public boolean addArticolo(Articolo a) {
        if (articoli.contains(a)) {
            return false;
        }
        articoli.add(a);
        return true;
    }

    public boolean removeArticolo(Articolo u) {
        if (articoli.contains(u)) {
            return articoli.remove(u);
        }
        return false;
    }

    public boolean removeArticolo(int i) {
        if (articoli.contains(i)) {
            articoli.remove(i);
            return true;
        }
        return false;
    }

    public Articolo getArticolo(int i) {
        return articoli.get(i);
    }

    public boolean articoliIsEmpty() {
        return articoli.isEmpty();
    }

    public int articoliSize() {
        return articoli.size();
    }

    public boolean exist(Articolo a) {
        return articoli.contains(a);
    }

    public Articolo articoloContainedByName(String s) {
        for (Articolo X : articoli) {
            if (X.getTipoArticolo().getName().equals(s)) {
                return X;
            }
        }
        return null;
    }
    
    
    //POSIZIONI E QUANTITA
    public int getQuantita(Articolo a){
        if(!articoli.contains(a)) 
            return -1;
        return quantita.get(a);
    }
    
    public int getPosition(Articolo a){
        if(!articoli.contains(a)) 
            return -1;
        return posizione.get(a);// se l'articolo è contenuto nell'arraylist allora sicuramente si troca in posizione
    }
    
    public boolean setPosition(Articolo a, int posizione){
        if(!articoli.contains(a)) //se l'articolo esiste nel magazzino
            return false;
        if(this.posizione.containsValue(posizione))//se la posizione è già occupata
            return false;
        this.posizione.put(a, posizione); //sovrascrivo la coppia articolo, posizione
        return true;
    }
    
    public boolean setQuantity(Articolo a, int quantita){
        if(!articoli.contains(a)) //se l'articolo esiste nel magazzino
            return false;
        this.quantita.put(a, quantita);
        return true;
    }

    /**
     * *******************************ARTICOLI*******************************************
     */
    
    
    
    
 
    
    /**
     * ***************************************** NEGOZI
     * **********************************************************
     */
    public boolean addNegozi(Negozio i) {
        return negozi.add(i);
    }

    public boolean removeNegozi(Negozio i) {
        return negozi.remove(i);
    }

    public Negozio getNegozi(int i) {
        return negozi.get(i);
    }

    public void removeNegozio(int i) {
        negozi.remove(i);
    }

    public boolean negoziIsEmpty() {
        return negozi.isEmpty();
    }

    public int negoziSize() {
        return negozi.size();
    }

    public boolean exist(Negozio n) {
        return negozi.contains(n);
    }

    public Negozio negozioContainedByName(String s) { //controlla se esiste un negozio con quel nome
        for (Negozio X : negozi) {
            if (X.getNome().equals(s)) {
                return X;
            }
        }
        return null;
    }

    /**
     * ***************************************** NEGOZI
     * **********************************************************
     */
    /**
     * ****************************************** INGRESSO
     * *******************************************************
     */
    public boolean addIngresso(Map<Articolo, Integer> quantitaParameter, Map<Articolo, Integer> posizioneParameter) {
        int tmpQuantita;
        int tmpPosizione;
        
        if(!quantitaParameter.keySet().equals(posizioneParameter.keySet()))
            return false;//controllo se gli articoli sono identici nelle due mappe
            
        for(Articolo X: quantitaParameter.keySet())
            if(!articoli.contains(X))
                return false;//controllo per ogni articolo presente in uno dei due parametri è contenuto nell'ARRAYLIST degli articoli
        
        for(Articolo X: quantitaParameter.keySet()){
            if(this.quantita.containsKey(X)){
                tmpQuantita = this.quantita.get(X);
                this.quantita.put( X , ( tmpQuantita+quantitaParameter.get(X) ) );
            } else{
                this.quantita.put(X, quantitaParameter.get(X));
                this.posizione.putIfAbsent(X, posizioneParameter.get(X));
            }
            //debug
            //ingressi.add(new Ingresso());
            
        }//for
        
        return true;
    }

    public boolean removeIngresso(Ingresso i) {
        return ingressi.remove(i);
    }

    public void removeIngresso(int i) {
        ingressi.remove(i);
    }

    public boolean ingressiIsEmpty() {
        return ingressi.isEmpty();
    }

    public Ingresso getIngresso(int i) {
        return ingressi.get(i);
    }

    public int ingressiSize(){
        return ingressi.size();
    }
    
    
    /**
     * ****************************************** INGRESSO
     * *******************************************************
     */
    /**
     * ****************************************** USCITE
     * *******************************************************
     */
    public boolean addUscita(Uscita u, Ordine n) {
        return uscite.add(u);
    }

    public boolean removeUscita(Uscita u) {
        return uscite.remove(u);
    }

    public Uscita removeUscita(int i) {
        return uscite.remove(i);
    }

    public Uscita getUscita(int i) {
        return uscite.get(i);
    }

    public boolean usciteIsEmpty() {
        return uscite.isEmpty();
    }

    /**
     * ****************************************** USCITE
     * *******************************************************
     */
    /**
     * ****************************************** ORDINI
     * *******************************************************
     */
    public boolean addOrdine(Ordine o) {
        return ordini.add(o);
    }

    public boolean removeOrdine(Ordine o) {
        return ordini.remove(o);
    }

    public void removeOrdine(int i) {
        ordini.remove(i);
    }

    public Ordine getOrdine(int i) {
        return ordini.get(i);
    }

    public boolean ordineIsEmpty() {
        return ordini.isEmpty();
    }

    public int ordineSize() {
        return ordini.size();
    }

    public void resetMounth() {//server per resettare il totale degli ingressi e uscite in un anno
        ingressiMensili.clear();
        usciteMensili.clear();
    }//resetMounth
    /**
     * ****************************************** ORDINI
     * *******************************************************
     */

}//Magazzino
