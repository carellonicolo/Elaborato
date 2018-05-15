package elaboratojava;

public class Utente implements UserInterface{
    
    public static final String typeOfUsers[] = {"Magazziniere", "Segreteria Amministrativa", "Responsabile Negozi"};
    
    private String usr;
    private String pwd;
    private int t; 
    
    public Utente(String user, String password, int type) throws Exception{
        usr = user;
        pwd = password;
        this.t = type;
    }
    
    @Override
    public boolean setUser(String newUser){
        if(!" ".equals(newUser) && !"".equals(newUser)){
            usr = newUser;
            return true;
        }else return false;
    }//fine setUser
    
    @Override
    public boolean setPassword(String newPassword){//La stringa deve essere almeno lunga 8 caratteri
        if(newPassword.length()>8){
         pwd = newPassword;
         return true;
        }else
        return false;
    }//setPassword

    
    @Override
    public boolean checkPass(Utente x, String usr, String pwd){
        return x.getUsr().equals(usr) && x.pwd.equals(pwd);
    }
        
    @Override
    public String getUsr(){
        return usr;
    }
            
    @Override
    public boolean setType(int newType){
        switch(newType){
            case 1: 
            case 2:
            case 3: t=newType; return true;
            default: return false;
        }//switch   
    }//fine setType
    
    @Override
    public String toString(){//per sicurezza non passo la password in chiaro
        return "nome: "+usr+"\nPassword: "+"********\n"+"Tipo Account: "+t+" - "+typeOfUsers[t];
    }

}//fine Utente
