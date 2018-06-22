package Main;

public class TipoArticolo implements Comparable<TipoArticolo>{
    
    public final String sportArray[]= {"Nuoto", "Calcio", "Palestra", "Tennis", "Scii", "Basket", "Rafting", "Ciclismo", "Rugby", "Atletica", "Hockey", "Golf", "Pallavolo", "Danza"};
    public final String arrayMateriali[] = {"Poliestere", "Silicone", "Finta Pelle", "GORE-TEX", "Elastan", "Polietilene", "Poliammide"};
            
    private String nome;
    private String descrizione;
    private int numSport;
    private int numMateriali;
    
    
    public TipoArticolo(String name, String description, int numberOfSport, int numberOfMaterial){
                    this.nome = name;
                    this.descrizione = description;
                    this.numSport = numberOfSport;
                    this.numMateriali = numberOfMaterial;
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
        if(s>=0 && s<sportArray.length){//da aggiungere controllo su numero massimo di sport disponibili
            this.numSport = s;
            return true;
        }
        return false;
    }//SETSPORT
    
    public boolean setMaterial(int m){
        if(m>=0 && m < arrayMateriali.length){//da aggiungere controllo su numero massimo di sport disponibili
            this.numMateriali = m;
            return true;
        }
        return false;
    }//SETMATERIAL
    
    
    
    @Override
    public int hashCode(){
        return nome.hashCode() ^ descrizione.hashCode() ^ numSport ^ numMateriali;
    }
    
    @Override
    public boolean equals(Object other){//ignoro il controllo sulla descrizione, non è importante
        return other instanceof TipoArticolo && ((TipoArticolo)other).nome == nome && ((TipoArticolo)other).numSport == numSport && ((TipoArticolo)other).numMateriali == numMateriali;
    }
    
    @Override
    public int compareTo(TipoArticolo other){
        int diff = numSport - other.numSport;
        if(diff != 0)
            return diff;
        
        diff = numMateriali - other.numMateriali;
        if(diff != 0)
            return diff;
        
        return nome.compareTo(other.nome);
    }
    
    
    
    
    //----------------------TO STRING--------------------------//
    @Override
    public String toString(){
        return "Nome: "+ nome + "\nDescrizione: "+ descrizione + "\nSport: "+ this.arrayMateriali[numSport] + "/nMateriali: " + this.arrayMateriali[numMateriali];
    }
    
}//ARTICOLO
