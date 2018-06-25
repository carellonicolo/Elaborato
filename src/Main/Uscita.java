package Main;

import java.util.GregorianCalendar;

public class Uscita extends WerehouseMovement implements Comparable<Uscita>{

    private final Ordine ordine;
    
    public Uscita( Ordine ordine){
        this.ordine = ordine;
        data = new GregorianCalendar();
    }
    
    public Uscita( Ordine ordine, GregorianCalendar data){
        this.ordine = ordine;
        this.data = data;
    }

  
    
    public Ordine getOrdine(){
        return ordine;
    }
    
    
    
    @Override
    public int hashCode(){
        return data.hashCode()^ordine.hashCode();
    }
    
    @Override
    public boolean equals(Object other){
        return other instanceof Uscita && ((Uscita)other).data.equals(data) && ((Uscita)other).ordine.equals(ordine);
    }

    @Override
    public int compareTo(Uscita other){//ordino per data
        return data.compareTo(other.data) == 0? data.compareTo(other.data): ordine.compareTo(other.ordine);
    }
    
    @Override
    public String toString(){
        return "Ordine:\n" + ordine.toString() + "\n\nEffettuato il: "+data;
    }
    
}//uscita
