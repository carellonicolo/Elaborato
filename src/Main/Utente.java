package Main;

public class Utente implements UserInterface{
    
    public static final String typeOfUsers[] = {"Magazziniere", "Segreteria Amministrativa", "Responsabile Negozi"};
    
    private String usr;
    private String pwd;
    private int t; 
    
    
    /*********************COSTRUTTORE**********************/
    public Utente(String user, String password, int type) throws Exception{
        if(!" ".equals(user) && !"".equals(user)){
            if(password.length()>8){//la password deve avere almeno 8 caratteri
                if(type>=0 && type < 3){
                    usr = user;
                    pwd = password;
                    this.t = type;
                }else{
                    throw new Exception("parametro non valido");
                }
            }else{
                    throw new Exception("parametro non valido");
                }
        }else{
                    throw new Exception("parametro non valido");
                }
        
    }//costruttore
    
    
    
    
    
    /*********************METODI SET**********************/
    @Override
    public boolean setUser(String newUser){
        if(!" ".equals(newUser) && !"".equals(newUser)){
            usr = newUser;
            return true;
        }else return false;
    }//fine setUser
    
    @Override
    public boolean setPassword(String newPassword){//La password deve essere almeno lunga 8 caratteri
        if(newPassword.length()>8){
         pwd = newPassword;
         return true;
        }else
        return false;
    }//setPassword

    @Override
    public boolean setType(int newType){
        switch(newType){
            case 1: 
            case 2:
            case 3: t=newType; return true;
            default: return false;
        }//switch   
    }//fine setType
    
    
    
    
    
    
    
    /*********************CONTROLLO PASSWORD**********************/
    @Override
    public boolean checkPass(Utente x, String usr, String pwd){
        return x.getUsr().equals(usr) && x.pwd.equals(pwd);
    }
        
    
    
    
    
    /*********************METODI GET**********************/
    @Override
    public String getUsr(){
        return usr;
    }
            
    public int getTypeInt(){
        return t;
    }

    
    
    
    /*********************TO-STRING**********************/
    @Override
    public String toString(){//per sicurezza non passo la password in chiaro
        return "nome: "+usr+"\nPassword: "+"********\n"+"Tipo Account: "+t+" - "+typeOfUsers[t];
    }

}//fine Utente
