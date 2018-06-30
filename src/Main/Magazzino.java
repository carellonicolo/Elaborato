package Main;

import java.util.*;
import Exception.*; //importo tutte le mie eccezzioni
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

//GLI ARRAYLIST, COME PER GLI ARRAY, PARTONO DA 0
public class Magazzino implements Serializable{

<<<<<<< HEAD
    private List<Uscita> uscite;
    private List<Ordine> ordini;
    private List<Articolo> articoli;
    private List<Ingresso> ingressi;
    private List<Negozio> negozi;
    private List<Utente> utenti;
    private Set<Ingresso> ingressiMensili;
    private Set<Uscita> usciteMensili;
    private Map<Articolo, Integer> quantita;
    private Map<Articolo, Integer> posizione;
=======
    private final List<Uscita> uscite;
    private final List<Ordine> ordini;
    private final List<Articolo> articoli;
    private final List<Ingresso> ingressi;
    private final List<Negozio> negozi;
    private final List<Utente> utenti;
    private final Map<Articolo, Integer> quantita, posizione, ingressiMensili, usciteMensili;
>>>>>>> 0871467f33f26d5b99f1bbf83b52f243399e7ef7

    public static final Magazzino INSTANCE = new Magazzino();

    /**
     * *********************************** CONSTRUCT
     * ***********************************
     */
    private Magazzino() {
	this.negozi = new ArrayList();
	this.uscite = new ArrayList<>();
	this.usciteMensili = new TreeMap<>();
	this.ingressiMensili = new TreeMap<>();
	this.utenti = new ArrayList<>();
	this.ingressi = new ArrayList<>();
	this.articoli = new ArrayList<>();
	this.ordini = new ArrayList<>();
	this.quantita = new TreeMap<>();
	this.posizione = new TreeMap<>();
    }

    /**
     * *********************************** USERS
     * ***********************************
     */
    public void addUser(Utente u) throws UserAlreadyExist {
	for (Utente X : utenti) {
	    if (u.equals(X)) {
		throw new UserAlreadyExist("L'utente passato è già presente nella lista degli utenti!");
	    }
	}
	utenti.add(u);
    }

    public boolean removeUser(Utente u) {
	return utenti.remove(u);
    }

    public void removeUser(int i) {
	utenti.remove(i);
	//users.equals(i); Per effettuare il login 
    }

    public Utente getUser(int i) {
	return utenti.get(i);
    }

    public boolean usersIsEmpty() {
	return utenti.isEmpty();
    }

    public int loginHashCode(Utente u) throws UserNotFoundException {
	for (Utente X : utenti) {
	    if (u.hashCode() == X.hashCode()) {
		return X.getTypeInt();
	    }
	}
	throw new UserNotFoundException("Utente non trovato! \n Username o Password errata!");
    }

    /**
     * *********************************** USERS
     * ***********************************
     */
    /**
     * *******************************ARTICOLI*******************************************
     */
    public void addArticolo(Articolo a) throws ArticleAlreadyExistException {
	if (articoli.contains(a)) {
	    throw new ArticleAlreadyExistException("L'articolo è già presente nella lista!");
	}
	articoli.add(a);
        posizione.put(a, 0);
        quantita.put(a, 0);
    }

    public boolean removeArticolo(Articolo u) {
	if (articoli.contains(u)) {
	    return articoli.remove(u);
	}
	return false;
    }

    public void removeArticolo(int i) {
	    posizione.remove(articoli.get(i));
            quantita.remove(articoli.get(i));
            articoli.remove(i);
    }

    public Articolo getArticolo(int i) throws IndexOutOfBoundsException {
	if (i >= 0 && i < articoli.size()) {
	    return articoli.get(i);
	} else if (i < 0) {
	    throw new IndexOutOfBoundsException("Non sono acettati indici con numeri negativi");
	} else {
	    throw new IndexOutOfBoundsException("Indice troppo grande!");
	}
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

    public Articolo articoloContainedByName(String s) throws ArticleDontExistInWareHouseException {
	for (Articolo X : articoli) {
	    if (X.getTipoArticolo().getName().equals(s)) {
		return X;
	    }
	}
	throw new ArticleDontExistInWareHouseException("Nome articolo non trovato!");
    }

    //POSIZIONI E QUANTITA
    public int getQuantita(Articolo a) throws ArticleDontExistInWareHouseException {
	if (!articoli.contains(a))
	    throw new ArticleDontExistInWareHouseException("Articolo inesistente!");
            return quantita.get(a);
    }

    public int getPosition(Articolo a) throws ArticleDontExistInWareHouseException {
	if (!articoli.contains(a)) 
	    throw new ArticleDontExistInWareHouseException("Articolo inesistente!");
	return posizione.get(a);// se l'articolo è contenuto nell'arraylist allora sicuramente si troca in posizione
    }

    public void setPosition(Articolo a, int posizione) throws ArticleDontExistInWareHouseException, PositionAlreadyOccupiedException {
	if (!articoli.contains(a)) //se l'articolo non esiste nel magazzino
	{
	    throw new ArticleDontExistInWareHouseException("Articolo inesistente!");
	}//non controllo se la posizione esiste già, ci possono essere posizioni doppie per ora 
	this.posizione.put(a, posizione); //sovrascrivo la coppia articolo, posizione
    }

    public void setQuantity(Articolo a, int quantita) throws ArticleDontExistInWareHouseException {
	if (!articoli.contains(a)) //se l'articolo esiste nel magazzino
	{
	    throw new ArticleDontExistInWareHouseException("Articolo inesistente!");
	}
	this.quantita.put(a, quantita);
    }

    /**
     * *******************************ARTICOLI*******************************************
     */
    /**
     * ***************************************** NEGOZI
     * **********************************************************
     */
    public boolean addNegozi(Negozio i) throws ShopAlreadyExistException {
	for (Negozio X : negozi) {
	    if (X.equals(i)) {
		throw new ShopAlreadyExistException("Il negozio non esiste nel Database!");
	    }
	}
	return negozi.add(i);
    }

    public void removeNegozi(Negozio i) throws ShopAlreadyExistException {
	if (!negozi.remove(i)) {
	    throw new ShopAlreadyExistException("Il negozio non esiste nel Database!");
	}
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
    public boolean addIngresso(Map<Articolo, Integer> quantitaParameter, Map<Articolo, Integer> posizioneParameter, GregorianCalendar data) {
	int tmpQuantita;
	int tmpPosizione;

	if (!quantitaParameter.keySet().equals(posizioneParameter.keySet())) {
            return false;//controllo se gli articoli sono identici nelle due mappe
	}
	for (Articolo X : quantitaParameter.keySet()) {
	    if (articoli.contains(X) == false) {
                return false;//controllo che ogni articolo presente in uno dei due parametri sia contenuto nell'ARRAYLIST degli articoli
	    }
	}
	for (Articolo X : quantitaParameter.keySet()) {//itero su quantitaparameter tanto se arrivo qui so per certo che hanno gli stessi articoli
	    if (this.quantita.containsKey(X)) {
		tmpQuantita = this.quantita.get(X);
		this.quantita.put(X, (tmpQuantita + quantitaParameter.get(X)));
		this.posizione.put(X, posizioneParameter.get(X));
	    } else {
		this.quantita.put(X, quantitaParameter.get(X));
		this.posizione.putIfAbsent(X, posizioneParameter.get(X));
	    }

	}//for
	ingressi.add(new Ingresso(quantitaParameter, posizioneParameter, data));
	return true;
    }
    
    public boolean ingressiIsEmpty() {
	return ingressi.isEmpty();
    }

    public Ingresso getIngresso(int i) {
	return ingressi.get(i);
    }

    public int ingressiSize() {
	return ingressi.size();
    }

    public int getIndex(Ingresso i) {
	//ritorna l'indica della prima occorrenza dell'ingresso specificato nella lista
	return ingressi.indexOf(i);
    }

    /**
     * ****************************************** INGRESSO
     * *******************************************************
     */
    /**
     * ****************************************** USCITE
     * *******************************************************
     */
    public void createExit(Ordine n) throws OrderNotFound, ArticleNotFound, OrderImpossibleToCreate {
	boolean isPossible = true;
        
	for (Ordine x : ordini)//scorro array ordini per vedere se l'ordine esiste
	{
	    if (x.equals(n)) {//ho trovato l'ordine nella lista

		Map<Articolo, Integer> mappaOrdine = x.getArticle();//mi preno la mappa degli articoli dell'ordine
		Set<Articolo> listaArticoli = mappaOrdine.keySet();

		for (Articolo a : listaArticoli)//scorro tutti gli articoli della lista delle quantita in ordine
		{
		    if (quantita.containsKey(a)) {//controllo che la mappa delle quantità contenga l'articolo
			if (mappaOrdine.get(a) > quantita.get(a))//se la quantità richiesta è maggiore della quantità in magazzino 
			{
			    isPossible = false;
			}
		    } else//se la mappa non contiene l'articolo
		    {
			throw new ArticleNotFound("Articolo non presente in magazzino, attendere un ingresso di questo articolo e poi ritentare l'uscita!");
		    }
		}

		//finito il ciclo controllo allora se è possibile effettuare l'uscita
		if (isPossible) {
		    for (Articolo articoloOrdine : listaArticoli) {
			quantita.replace(articoloOrdine, quantita.get(articoloOrdine) - mappaOrdine.get(articoloOrdine));
		    }

		    uscite.add(new Uscita(n));
		    n.createShip();
		    return;
		} else {
		    throw new OrderImpossibleToCreate("Quantità in magazzino insufficenti per effettuare spedire l'ordine!");
		}

	    }//if equals
	}
	throw new OrderNotFound("Impossibile generare l'uscita per l'ordine indicato!\nL'ordine non si trova nella lista degli ordini!");
    }//createExit()

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

    public void resetMounth() {//serve per resettare il totale degli ingressi e uscite in un anno
	ingressiMensili.clear();
	usciteMensili.clear();
    }//resetMounth

    public boolean isShipped(int i) {
	return ordini.get(i).isShipped();
    }

    public boolean isShipped(Ordine o) throws OrderNotFound {
	if (ordini.contains(o)) {
	    for (Ordine X : ordini) {
		if (X.equals(o)) {
		    return X.isShipped();
		}
	    }
	}
	throw new OrderNotFound("Impossibile trovare l'ordine specificato!");
    }

    /**
     * ****************************************** ORDINI
     * *******************************************************
     */
    
    
    /**
     * SAVE DATA IN FILE
     */
    public void save() {
	try {
	    JFileChooser jfc = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("File dati binari (.dat)", "dat");
	    jfc.setFileFilter(filter);
	    int buttonPressed = jfc.showSaveDialog(null);
	    File file;

	    if (buttonPressed == JFileChooser.APPROVE_OPTION) {
		try {
		    file = jfc.getSelectedFile();
		    ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream((file)));
		    fileOut.writeObject(this.articoli);
		    fileOut.writeObject(this.ingressi);
		    fileOut.writeObject(this.ingressiMensili);
		    fileOut.writeObject(this.negozi);
		    fileOut.writeObject(this.ordini);
		    fileOut.writeObject(this.posizione);
		    fileOut.writeObject(this.quantita);
		    fileOut.writeObject(this.uscite);
		    fileOut.writeObject(this.usciteMensili);
		    fileOut.writeObject(this.utenti);
		    fileOut.flush();
		    fileOut.close();
		    JOptionPane.showMessageDialog(null, "Salvataggio riuscito");
		} catch (Exception e) {
		    JOptionPane.showMessageDialog(null, "Salvataggio non riuscito");
		}
	    }

	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Errore nell'aprire il file");
	}
    }
    
    protected void upload(List<Articolo> articoliLoad, List<Ingresso> ingressiLoad, Set<Ingresso> ingressiMensiliLoad, List<Negozio> negoziLoad, List<Ordine> ordiniLoad, 
	    Map<Articolo, Integer> posizioneLoad, Map<Articolo, Integer> quantitaLoad, List<Uscita> usciteLoad, Set<Uscita> usciteMensiliLoad, List<Utente> utentiLoad){
	
	this.articoli = articoliLoad;
	this.ingressi = ingressiLoad;
	this.ingressiMensili = ingressiMensiliLoad;
	this.negozi = negoziLoad;
	this.ordini = ordiniLoad;
	this.posizione = posizioneLoad;
	this.quantita = quantitaLoad;
	this.uscite = usciteLoad;
	this.usciteMensili = usciteMensiliLoad;
	this.utenti = utentiLoad;
	
    }

}//MAGAZZINO




/************************************************************ FINE **************************************************************************/
