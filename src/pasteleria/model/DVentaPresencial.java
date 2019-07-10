package pasteleria.model;

public class DVentaPresencial {
    private int IdDVentPres;
    private int idVentPres;
    private int IdProducto;
    //Se agrega solo para mostrar el nombre del producto en VentasPresencial View
    //No impacta en el modelo de BD
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private double importe;

    public DVentaPresencial() {
    }

    public DVentaPresencial(int IdDVentPres, int idVentPres, int IdProducto, double precio, int cantidad, double importe) {
        this.IdDVentPres = IdDVentPres;
        this.idVentPres = idVentPres;
        this.IdProducto = IdProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    
    public DVentaPresencial(int IdDVentPres, int idVentPres, int IdProducto, String nombreProducto, double precio, int cantidad, double importe) {
        this.IdDVentPres = IdDVentPres;
        this.idVentPres = idVentPres;
        this.IdProducto = IdProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "DVentaPresencial{" + "IdDVentPres=" + IdDVentPres + ", idVentPres=" + idVentPres + ", IdProducto=" + IdProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", cantidad=" + cantidad + ", importe=" + importe + '}';
    }
    
    
    
}
