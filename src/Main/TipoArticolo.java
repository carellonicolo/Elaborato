package Main;

public class TipoArticolo {
    
    public final String sportArray[]= {"NUOTO", "CALCIO", "PALESTRA", "TENNIS", "SCII", "BASKET", "Cannottaggio", "Ciclismo", "Ping Pong", "Atletica", "Air Hockey", "Golf", "Pallavolo", "Danza", "Judo"};
    public final String arrayMateriali[] = {"Poliestere", "Silicone", "Finta Pelle"};
            
    private String nome;
    private String descrizione;
    private int numSport;
    private int numMateriali;
    
    
    public TipoArticolo(String name, String description, int numberOfSport, int numberOfMaterial) throws Exception{
        if(!" ".equals(name) && !"".equals(name)){
            if(!" ".equals(description) && !"".equals(description)){
                if(numberOfSport >=0 && numberOfMaterial >= 0){
                    this.nome = name;
                    this.descrizione = description;
                    this.numSport = numberOfSport;
                    this.numMateriali = numberOfMaterial;
                }else{
                    throw new Exception("parametro non valido");
                }
            }else{
                throw new Exception("parametro non valido");
            }
        }else{
            throw new Exception("parametro non valido");
        }
    }//Costruttore

    
    
    
    
    /**************--METODI SET-******************/
  
    public String getName(){
        return nome;
    }
    
    public String getDescription(){
        return descrizione;
    }
    
    public String getSports(){
        return sportArray[numSport];
    }
    
    public String getMaterial(){
        return arrayMateriali[numMateriali];
    }
    
    
    
    
    
    /*************METODI SET******************/
    
    public boolean setNome(String newName){
        if(!" ".equals(newName) && !"".equals(newName)){
            this.nome = newName;
            return true;
        }
        return false;
    }//SETNOME
    
    public boolean setDescription(String newDescritpion){
        if(!" ".equals(newDescritpion) && !"".equals(newDescritpion)){
            this.descrizione = newDescritpion;
            return true;
        }
        return false;
    }//SETDESCRIPTION
    
    public boolean setSport(int s){
        if(s>=0){//da aggiungere controllo su numero massimo di sport disponibili
            this.numSport = s;
            return true;
        }
        return false;
    }//SETSPORT
    
    public boolean setMaterial(int m){
        if(m>=0){//da aggiungere controllo su numero massimo di sport disponibili
            this.numMateriali = m;
            return true;
        }
        return false;
    }//SETMATERIAL
    
    
    
    
    
    
    
    //----------------------TO STRING--------------------------//
    @Override
    public String toString(){
        return "Nome: "+ nome + "\nDescrizione: "+ descrizione + "\nSport: "+ this.arrayMateriali[numSport] + "/nMateriali: " + this.arrayMateriali[numMateriali];
    }
    
}//ARTICOLO
