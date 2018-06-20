package Main;

import java.util.*;

//GLI ARRAYLIST, COME PER GLI ARRAY, PARTONO DA 0
public class Magazzino {

    private final List<Uscita> uscite;
    private final List<Ordine> ordini;
    private final List<Articolo> articoli;
    private final List<Ingresso> ingressi;
    private final List<Negozio> negozi;
    private final Set<Ingresso> ingressiMensili;
    private final Set<Uscita> usciteMensili;
    private final List<Utente> users;
    private final Map<Articolo, Integer> articoliInMagazzino;

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
        this.articoliInMagazzino = new HashMap();
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
     * *********************************** USERS
     * ***********************************
     */
    /**
     * *******************************ARTICOLI*******************************************
     */
    public boolean addArticolo(Articolo a) {
        if (articoli.contains(a)) {
            return false;
        }
        articoli.add(a);
        articoliInMagazzino.put(a, 0);
        return true;
    }

    public boolean removeArticolo(Articolo u) {
        if (articoli.contains(u)) {
            articoliInMagazzino.remove(u);
            return articoli.remove(u);
        }
        return false;
    }

    public boolean removeArticolo(int i) {
        if (articoli.contains(i)) {
            articoliInMagazzino.remove(articoli.get(i));
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
    public boolean addIngresso(Ingresso i) {
        return ingressi.add(i);
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
