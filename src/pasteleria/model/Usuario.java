package pasteleria.model;
public class Usuario {
    private int idUsuario;
    private int idRol;
    private int idEmpleado;
    private String usuario;
    private String contrasenia;

    public Usuario(int idUsuario, int idRol, int idEmpleado, String usuario, String contrasenia) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(int idUsuario, int idRol, int idEmpleado) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.idEmpleado = idEmpleado;
    }

    public Usuario(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", idRol=" + idRol + ", idEmpleado=" + idEmpleado + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }
    
    
}
