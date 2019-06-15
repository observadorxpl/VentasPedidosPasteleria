package pasteleria.model;

public class Empleado {
    private int idEmpleado;
    private int idTipoEmpleado;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;

    public Empleado() {
    }

    public Empleado(int idEmpleado, int idTipoEmpleado, 
                    String nombre, String apePaterno, String apeMaterno) {
        this.idEmpleado = idEmpleado;
        this.idTipoEmpleado = idTipoEmpleado;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }
    
}
