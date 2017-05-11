/**
 * Created by Joice Miranda on 11/05/2017.
 */

public class Usuario {
    private String user;
    private String contrasena;

    public String getUser() {
        return user;
    }
    public void setNombre(String user) {
        this.user = user;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Usuario(String user, String contrasena) {
        this.user = user;
        this.contrasena = contrasena;
    }
}
