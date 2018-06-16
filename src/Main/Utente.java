package Main;

public class Utente implements UserInterface{
    
    public static final String typeOfUsers[] = {"Magazziniere", "Segreteria Amministrativa", "Responsabile Negozi"};
    
    private String usr;
    private String pwd;
    private int t; 
    
    
    /*********************COSTRUTTORE**********************/
    public Utente(String user, String password, int type){
                    usr = user;
                    pwd = password;
                    this.t = type;

    }

    
    /*********************METODI SE*********************/
    @Override
    public boolean setUser(String newUser){
        if(!" ".equals(newUser) && !"".equals(newUser)){
            usr = newUser;
            return true;
        }else return false;
    }//fine setUser
    
    @Override
    public boolean setPassword(String newPassword){//La password deve essere almeno lunga 8 caratteri
        if( !"".equals(newPassword) && !"".equals(newPassword) ){
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
    public boolean checkPass(Utente x, Utente y){
        return x.getUsr().equals(y.getUsr()) && x.pwd.equals(y.getPin());
    }
        
    
    
    
    
    /*********************METODI GET**********************/
    @Override
    public String getUsr(){
        return usr;
    }
            
    public int getTypeInt(){
        return t;
    }
    
    public String getPin(){
        return pwd;
    }

    
    
    
    /*********************TO-STRING**********************/
    @Override
    public String toString(){//per sicurezza non passo la password in chiaro
        return "nome: "+usr+"\nPassword: "+"********\n"+"Tipo Account: "+t+" - "+typeOfUsers[t];
    }

}//fine Utente
