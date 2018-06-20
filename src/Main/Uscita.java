package Main;

import java.util.GregorianCalendar;
import java.util.Random;
import java.util.UUID;

public class Uscita {
    
    private final UUID ID;
    private final GregorianCalendar data;
    private final Ordine o;
    
    private final Random r = new Random();

    public Uscita(String corriere, Ordine o){
        this.ID = UUID.randomUUID();
        this.o = o;
        data = new GregorianCalendar();
    }
    

    public GregorianCalendar getData(){
        return data;
    }
    
    public Ordine getOrdine(){
        return o;
    }
    
    
    public String getBolla(){
        return ID.toString();
    }
    
}//uscita
