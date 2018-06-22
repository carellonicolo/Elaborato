package Main;

import java.util.*;//gregorianCalendar e tutti i tipi di collezzione set, treeset,treemap,arraylist, linkedlist, hashmap, hashset...

public class Ordine implements Comparable<Ordine>{

    private Negozio negozio;
    private GregorianCalendar data;
    private float prezzo;

    private Map<Articolo, Integer> mappa = new HashMap<>();

    /*-------------COSTRUTTORI---------------------*/
    public Ordine(Negozio n, int day, int month, int year, Map<Articolo, Integer> m) {//DATA PASSATA IN INTERO 
        this.prezzo = 0;
        this.negozio = n;
        this.mappa = m;
        this.data = new GregorianCalendar(year, month, year);
        //Calcolo il costo totale degli articoli nella mappa
        calcolaPrezzo();
    }//costruttore con data come parametri interi

    public Ordine(Negozio n) {//se non mi viene passata la data prendo la data odieran
        this.negozio = n;
        this.data = new GregorianCalendar();
        calcolaPrezzo();
    }

    public Ordine(Negozio n, GregorianCalendar data) {
        this.negozio = n;
        this.data = data;
        calcolaPrezzo();
    }
    
    public Ordine(Negozio n, GregorianCalendar data, Map<Articolo, Integer> m) {
        this.negozio = n;
        this.data = data;
        mappa.putAll(m);
        calcolaPrezzo();
    }
    
    

    //------------------METODI-GET-------------------//
    public Negozio getNegozio() {
        return negozio;
    }

    public String getID() {
        return ""+hashCode();
    }

    public float getTotalPrice() {
        return prezzo;
    }

    public String getData() {
        return "" + data.get(GregorianCalendar.DATE) + "-" + data.get(GregorianCalendar.MONTH) + "-" + data.get(GregorianCalendar.YEAR);
    }
        
        
    /*
    public String getArticoli_e_quantità() { 
       String s = "";
        int quantità = 0;
        
        if(mappa.isEmpty())
            return null;
        
        
        Set<Articolo> articoli = new TreeSet<>(mappa.keySet());
        
        for(Articolo x: articoli){
            quantità = mappa.get(x);
            s += x.getTipoArticolo().getName()+": "+quantità + " pezzi";
        }

        return s;
        
    }//getArticoli_e_quantità
*/
    
    


    
    
    
    
    
    /*--------------MANCANO I METODI SET--------------*/
    public void setNegozio(Negozio negozio) {
        this.negozio = negozio;
    }

    public boolean addArticle(Articolo a, int q) {
            if (mappa.containsKey(a)) {
                return false;// se la mappa ha già l'articolo
            } else {
                mappa.put(a, q);
                calcolaPrezzo();
                return true;
            }
    }

    public boolean setArticle(Articolo a, int q) { //se q = 0 allora rimuovo l'articolo //se q > 0 modifico la quantità dell'articolo 

        if (q == 0) {
                if (mappa.containsKey(a)) {
                    mappa.remove(a);
                    calcolaPrezzo();
                    return true;
                }
            
        }

        if (q > 0) {
                if (mappa.containsKey(a)) {
                    mappa.replace(a, q);
                    calcolaPrezzo();
                    return true;
                }
        }

        //altrimenti se q<0
        return false;
    }//set article
    
    public void setData(GregorianCalendar data){
        this.data = data;
    }
    
    public void setData(){
        this.data = new GregorianCalendar();
    }
    
    public void setData(int d, int m, int y){
        this.data = new GregorianCalendar(y,m,d);
    }

    private void calcolaPrezzo() {
        //Calcolo il costo totale degli articoli nella mappa
        for (Map.Entry<Articolo, Integer> entry : mappa.entrySet()) {
            Articolo a = entry.getKey();
            int q = entry.getValue();
            this.prezzo = q * a.getPrezzo();
        }
    }
    
    
    
    @Override
    public int hashCode(){
        return data.hashCode() ^ mappa.hashCode() ^ ( int )prezzo;
    }

    
    @Override
    public boolean equals(Object other){
        return other instanceof Ordine && ((Ordine)other).data.equals(data) && ((Ordine)other).mappa.equals(mappa) && negozio.equals((Ordine)other) && ((Ordine)other).prezzo ==  prezzo;
    }
    
    @Override
    public int compareTo(Ordine other){
        //ordino per data, poi nella stessa data ordino per negozio, si veda il compareTo di negozio per gli ordinamenti di negozio,
        // nello stesso negozio ordino per prezzo totale poi per dimensione della mappa di articoloe quantità
        int diff = data.compareTo(other.data);
        if ( diff != 0 )
            return diff;
        
        diff = negozio.compareTo(other.negozio);
        if( diff != 0)
            return diff;
        
        float diffF = prezzo - other.prezzo;
        if ( diffF != 0)
            return ( int )diffF;
        
        return other.mappa.size() - mappa.size();//ordino per ordini con meno articoli fino a quelli con più ordini
        
    }
    
    @Override
    public String toString() {
        String s = "";
        Set<Articolo> set = new HashSet<>(mappa.keySet());

        for(Articolo X: set)
            s = s.concat(X.getTipoArticolo().getName()+": "+mappa.get(X) + "pezzi" + "\n");
        
        return s;
    }
}//fine ordine
