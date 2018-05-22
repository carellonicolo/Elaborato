package Main;

import java.util.*;


//GLI ARRAYLIST, COME PER GLI ARRAY, PARTONO DA 0

public class Magazzino {

    private List<Uscita> uscite;
    private List<Ordine> ordini;
    private List<Articolo> articoli;
    private List<Ingresso> ingressi;
    private List<Negozio> negozi;
    private Set<Ingresso> ingressiMensili;
    private Set<Uscita> usciteMensili;
    private List<Utente> users;

    //COSTRUTTORE
    public Magazzino() {
        this.negozi = new ArrayList();
        this.uscite = new ArrayList<>();
        this.usciteMensili = new TreeSet<>();
        this.ingressiMensili = new TreeSet<>();
        this.users = new ArrayList<>();
        this.ingressi = new ArrayList<>();
        this.articoli = new ArrayList<>();
        this.ordini = new ArrayList<>();
    }

    
    
    //          UTENTI
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
    
    public boolean usersIsEmpty(){
        return users.isEmpty();
    }

    
    //          ARTICOLI
    public boolean addArticolo(Articolo a) {
        return articoli.add(a);
    }

    public boolean removeArticolo(Articolo u) {
        return articoli.remove(u);
    }

    public void removeArticolo(int i) {
        articoli.remove(i);
    }

    public Articolo getArticolo(int i) {
        return articoli.get(i);
    }
    
    public boolean articoliIsEmpty(){
        return articoli.isEmpty();
    }

    
    //      NEGOZI
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

    public boolean negoziIsEmpty(){
        return negozi.isEmpty();
    }

    
    //      INGRESSI
    public boolean addIngresso(Ingresso i) {
        return ingressi.add(i);
    }

    public boolean removeIngresso(Ingresso i) {
        return ingressi.remove(i);
    }

     public void removeIngresso(int i) {
        ingressi.remove(i);
    }

    public boolean ingressiIsEmpty(){
        return ingressi.isEmpty();
    }

    public Ingresso getIngresso(int i){
        return ingressi.get(i);
    }
    
    
    //      USCITE
    public boolean addUscita(Uscita u, Ordine n){
        
        return uscite.add(u);
    }
    
    public boolean removeUscita(Uscita u){
        return uscite.remove(u);
    }
    
    public Uscita removeUscita(int i){
        return uscite.remove(i);
    }
    
    public Uscita getUscita(int i ){
        return uscite.get(i);
    }
    
    public boolean usciteIsEmpty(){
        return uscite.isEmpty();
    }
    
    
    //      ORDINI
    
    public boolean addOrdine(Ordine o){
        return ordini.add(o);
    }
    
    public boolean removeOrdine(Ordine o){
        return ordini.remove(o);
    }
    
    public void removeOrdine(int i){
        ordini.remove(i);
    }
    
    public Ordine getOrdine(int i){
        return ordini.get(i);
    }
    
    public boolean ordineIsEmpty(){
        return ordini.isEmpty();
    }
    
    public int ordineSize(){
        return ordini.size();
    }
    
    public void resetMounth() {//server per resettare il totale degli ingressi e uscite in un anno
        ingressiMensili.clear();
        usciteMensili.clear();
    }//resetMounth

    
    public int login(Utente u) {
        for (Utente X : users)
            if (X.checkPass(X, u)) 
                return X.getTypeInt();
        return -1; //non è stata trovata una corrispondenza tra un utente esistente e quello inserito dall'utente!
    }
    

}//Magazzino
