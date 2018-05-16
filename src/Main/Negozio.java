package Main;

public class Negozio {
    private String codiceFiscale;
    private String nome;
    private String indirizzo;
    private String città;
    
    public Negozio(String cf, String name, String address, String city){
        codiceFiscale = cf;
        nome = name;
        indirizzo = address;
        città = city;
    }
    
    
    /*----------------METODI SET--------------------------*/
    public boolean setCodiceFiscale(String cf){
        if(!" ".equals(cf) && !"".equals(cf)){
            codiceFiscale = cf;
            return true;
        }else return false;
    }//setCodiceFiscale
    
    public boolean setNome(String x){
        if(!" ".equals(x) && !"".equals(x)){
            nome = x;
            return true;
        }else return false;
    }//setNome
    
    public boolean setIndirizzo(String x){
        if(!" ".equals(x) && !"".equals(x)){
            indirizzo = x;
            return true;
        }else return false;
    }//setIndirizzo
    
    public boolean setCitta(String x){
        if(!" ".equals(x) && !"".equals(x)){
            città = x;
            return true;
        }else return false;
    }//setCittà
    
    
    
    /*----------------METODI GET--------------------------*/
    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getindirizzo(){
        return indirizzo;
    }
    
    public String getCitta(){
        return città;
    }
    
    
    /*----------------TO STRING--------------------------*/
    @Override
    public String toString(){
        return "Codice Fiscale: " + codiceFiscale + "\nNome: " + nome + "\nIndirizzo: " + indirizzo + "\nCittà: " + città;
    }
    
    
}//negozio
