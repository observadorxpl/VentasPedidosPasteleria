package pasteleria.model;
public class Producto {
    private int idProducto;
    private int idLinea;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Producto() {
    }

    public Producto(int idProducto, int idLinea, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.idProducto = idProducto;
        this.idLinea = idLinea;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", idLinea=" + idLinea + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", stock=" + stock + '}';
    }
    
}
