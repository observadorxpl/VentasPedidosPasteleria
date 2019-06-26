package pasteleria.model;

import java.util.Date;

public class VentaPresencial {
    private int IdVentaPresencial;
    private int IdCliente;
    private int IdEmpleado;
    private Date fecha;
    private double montoT;

    public VentaPresencial() {
    }

    public VentaPresencial(int IdVentaPresencial, int IdCliente, int IdEmpleado, Date fecha, double montoT) {
        this.IdVentaPresencial = IdVentaPresencial;
        this.IdCliente = IdCliente;
        this.IdEmpleado = IdEmpleado;
        this.fecha = fecha;
        this.montoT = montoT;
    }

    public int getIdVentaPresencial() {
        return IdVentaPresencial;
    }

    public void setIdVentaPresencial(int IdVentaPresencial) {
        this.IdVentaPresencial = IdVentaPresencial;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoT() {
        return montoT;
    }

    public void setMontoT(double montoT) {
        this.montoT = montoT;
    }
    
}
