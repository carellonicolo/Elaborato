/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaboratojava;

public class Utenti {
    
    public static final String typeOfUsers[] = {"Magazziniere", "Segreteria Amministrativa", "Responsabile Negozi"};
    
    private String usr;
    private String pwd;
    private int t; 
    
    public Utenti(String user, String password, int type) throws Exception{
        usr = user;
        pwd = password;
        this.t = type;
    }
    
    public boolean setUser(String newUser){
        if(!" ".equals(newUser) && !"".equals(newUser)){
            usr = newUser;
            return true;
        }else return false;
    }//fine setUser
    
    public boolean setPassword(String newPassword){//La stringa deve essere almeno lunga 8 caratteri
        if(newPassword.length()>8){
         pwd = newPassword;
         return true;
        }else
        return false;
    }//fine setPassword

        
    public boolean setType(int newType){
        switch(newType){
            case 1: 
            case 2:
            case 3: t=newType; return true;
            default: return false;
        }//switch   
    }//fine setType

}//fine Utenti
