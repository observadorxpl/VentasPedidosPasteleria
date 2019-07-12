package pasteleria.model;

import java.util.Date;


public class Venta {
    private int IdVenta;
    private int IdCliente;
    private int IdEmpleado;
    private Date FechProd;
    private Date FechEntr;
    private double MontT;
    private char tipoV;

    public Venta() {
    }

    public Venta(int IdVenta, int IdCliente, int IdEmpleado, Date FechProd, Date FechEntr, double MontT, char tipoV) {
        this.IdVenta = IdVenta;
        this.IdCliente = IdCliente;
        this.IdEmpleado = IdEmpleado;
        this.FechProd = FechProd;
        this.FechEntr = FechEntr;
        this.MontT = MontT;
        this.tipoV = tipoV;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public Date getFechProd() {
        return FechProd;
    }

    public void setFechProd(Date FechProd) {
        this.FechProd = FechProd;
    }

    public Date getFechEntr() {
        return FechEntr;
    }

    public void setFechEntr(Date FechEntr) {
        this.FechEntr = FechEntr;
    }

    public double getMontT() {
        return MontT;
    }

    public void setMontT(double MontT) {
        this.MontT = MontT;
    }

    public char getTipoV() {
        return tipoV;
    }

    public void setTipoV(char tipoV) {
        this.tipoV = tipoV;
    }
    
}
