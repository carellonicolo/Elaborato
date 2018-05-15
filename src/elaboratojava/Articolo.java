/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaboratojava;

/**
 *
 * @author nicolocarello
 */
 

public class Articolo {
    
    public final String sportArray[]= {"NUOTO", "CALCIO", "PALESTRA", "TENNIS", "SCII", "BASKET", "RAFTING", "CICLISMO", "Ping Pong"};
    public final String arrayMateriali[] = {"Poliestere", "Silicone", "Finta Pelle"};
    
    private String Nome;
    private String Descrizione;
    private int numSport;
    private int numMateriali;
    
    
    public Articolo(String name, String description, int numberOfSport, int numberOfMaterial){
        this.Nome = name;
        this.Descrizione = description;
        this.numSport = numberOfSport;
        this.numMateriali = numberOfMaterial;
    }
    
    public String getName(){
        return Nome;
    }
    
    public String getDescription(){
        return Descrizione;
    }
    
    public String getSports(){
        return sportArray[numSport];
    }
    
    public String getMaterial(){
        return arrayMateriali[numMateriali];
    }
    
    /*************--METODI SET--********************/
    
    public void setNome(String newName){
        this.Nome = newName;
    }
    
    public void setDescription(String newDescritpion){
        this.Descrizione = newDescritpion;
    }
    
  
    
}
