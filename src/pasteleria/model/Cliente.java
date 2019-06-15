package pasteleria.model;

public class Cliente {
    private int idCliente;
    private String razonSocial;
    private String direccion;
    private String ruc_dni;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int idCliente, String razonSocial, String direccion, 
                   String ruc_dni, String telefono) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.ruc_dni = ruc_dni;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc_dni() {
        return ruc_dni;
    }

    public void setRuc_dni(String ruc_dni) {
        this.ruc_dni = ruc_dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
