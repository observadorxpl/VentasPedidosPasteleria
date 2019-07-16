package pasteleria.model;

public class DetalleVenta {

    private int idDealleVenta;
    private int idVenta;
    private int idProducto;
    //Se agrega solo para mostrar el nombre del producto en VentasPresencial View
    //No impacta en el modelo de BD
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private double importe;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDealleVenta, int idVenta, int idProducto, double precio, int cantidad, double importe) {
        this.idDealleVenta = idDealleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public DetalleVenta(int idDealleVenta, int idVenta, int idProducto, String nombreProducto, double precio, int cantidad, double importe) {
        this.idDealleVenta = idDealleVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    

    public int getIdDealleVenta() {
        return idDealleVenta;
    }

    public void setIdDealleVenta(int idDealleVenta) {
        this.idDealleVenta = idDealleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDealleVenta=" + idDealleVenta + ", idVenta=" + idVenta + ", idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", cantidad=" + cantidad + ", importe=" + importe + '}';
    }

    

}
