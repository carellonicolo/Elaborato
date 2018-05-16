package Main;

public interface UserInterface {
    boolean setUser(String newUser);
    boolean setPassword(String newPassword);
    boolean checkPass(Utente x, String usr, String pwd);
    String getUsr();
    boolean setType(int newType);
    @Override
    String toString();
}
