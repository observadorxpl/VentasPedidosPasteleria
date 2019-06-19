package pasteleria.model;

public class DVentaPresencial {
    private int IdDVentPres;
    private int idVentPres;
    private int IdProducto;
    private double precio;
    private int cantidad;
    private double importe;

    public DVentaPresencial() {
    }

    public DVentaPresencial(int IdDVentPres, int idVentPres, double precio, int cantidad, double importe) {
        this.IdDVentPres = IdDVentPres;
        this.idVentPres = idVentPres;
        this.IdProducto = IdProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public DVentaPresencial(int aInt, int aInt0, int aInt1, double aDouble, int aInt2, double aDouble0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdDVentPres() {
        return IdDVentPres;
    }

    public void setIdDVentPres(int IdDVentPres) {
        this.IdDVentPres = IdDVentPres;
    }

    public int getIdVentPres() {
        return idVentPres;
    }

    public void setIdVentPres(int idVentPres) {
        this.idVentPres = idVentPres;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }
    
}
