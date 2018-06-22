package Main;

public interface UserInterface {
    boolean setUser(String newUser);
    boolean setPassword(String newPassword);
    boolean checkPass(Utente x, Utente y);
    String getUsr();
    boolean setType(int newType);
    @Override String toString();
    @Override int hashCode();
}
