package Main;

import java.util.*;//gregorianCalendar e tutti i tipi di collezzione set, treeset,treemap,arraylist, linkedlist, hashmap, hashset...

public class Ordine {

    private Negozio ordinante;
    private GregorianCalendar data;
    private float prezzoTotale;
    private final UUID ID;

    private Map<Articolo, Integer> mappa = new HashMap<>();

    /*-------------COSTRUTTORI---------------------*/
    public Ordine(Negozio n, int day, int month, int year, Map<Articolo, Integer> m) {//DATA PASSATA IN INTERO 
        this.prezzoTotale = 0;
        this.ordinante = n;
        this.mappa = m;
        this.data = new GregorianCalendar(year, month, year);
        //Calcolo il costo totale degli articoli nella mappa
        calcolaPrezzo();
        this.ID = UUID.randomUUID();
    }//costruttore con data come parametri interi

    public Ordine(Negozio n) {//se non mi viene passata la data prendo la data odieran
        this.ordinante = n;
        this.data = new GregorianCalendar();
        this.ID = UUID.randomUUID();
    }

    public Ordine(Negozio n, GregorianCalendar data) {
        this.ordinante = n;
        this.data = data;
        this.ID = UUID.randomUUID();
    }
    
    public Ordine(Negozio n, GregorianCalendar data, Map<Articolo, Integer> m) {
        this.ordinante = n;
        this.data = data;
        this.ID = UUID.randomUUID();
        mappa.putAll(m);
    }
    
    @Override
    public String toString() {
        String s = "ciao";
        Set<Articolo> set = new HashSet<>();
        set.addAll(mappa.keySet());
        for(Articolo X: set)
            s = s.concat(X.getTipoArticolo().getName()+": "+mappa.get(X) + "pezzi" + "\n");
        
        return s;
    }

    //------------------METODI-GET-------------------//
    public Negozio getNegozio() {
        return ordinante;
    }

    public String getID() {
        return ID.toString();
    }

    public float getTotalPrice() {
        return prezzoTotale;
    }

    public String getArticoli_e_quantità() {
        String s = "";
        if(mappa.isEmpty())
            return null;
        
        for (Map.Entry<Articolo, Integer> entry : mappa.entrySet()) {
            Articolo a = entry.getKey();
            int q = entry.getValue();
            s = "" + a.getID() + " " + a.getTipoArticolo().getName() + " " + q + "\n";
        }
        return s;
    }//getArticoli_e_quantità

    public String getData() {
        return "" + data.get(GregorianCalendar.DATE) + "-" + data.get(GregorianCalendar.MONTH) + "-" + data.get(GregorianCalendar.YEAR);
    }

    
    
    
    
    
    /*--------------MANCANO I METODI SET--------------*/
    public boolean setNegozio(Negozio n) {
        if (n instanceof Negozio) {
            ordinante = n;
            return true;
        }
        return false;
    }

    public boolean addArticle(Articolo a, int q) {
        if (a instanceof Articolo) {
            if (mappa.containsKey(a)) {
                return false;// se la mappa ha già l'articolo
            } else {
                mappa.put(a, q);
                calcolaPrezzo();
                return true;
            }
        }
        return false;//se a non è istanza di Articolo
    }

    public boolean setArticle(Articolo a, int q) { //se q = 0 allora rimuovo l'articolo //se q > 0 modifico la quantità dell'articolo 

        if (q == 0) {
            if (a instanceof Articolo) {
                if (mappa.containsKey(a)) {
                    mappa.remove(a);
                    calcolaPrezzo();
                    return true;
                }
            }
        }

        if (q > 0) {
            if (a instanceof Articolo) {
                if (mappa.containsKey(a)) {
                    mappa.replace(a, q);
                    calcolaPrezzo();
                    return true;
                }
            }
        }

        //altrimenti se q<0
        return false;
    }//set article

    private void calcolaPrezzo() {
        //Calcolo il costo totale degli articoli nella mappa
        for (Map.Entry<Articolo, Integer> entry : mappa.entrySet()) {
            Articolo a = entry.getKey();
            int q = entry.getValue();
            this.prezzoTotale = q * a.getPrezzo();
        }
    }

}//fine ordine
