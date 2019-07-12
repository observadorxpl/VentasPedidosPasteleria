package pasteleria.controller;

import java.util.List;
import pasteleria.model.Venta;
import pasteleria.service.VentaService;
import pasteleria.service.VentaServiceImpl;
import pasteleria.util.Constante;

public class VentaController {
    VentaService service;

    public VentaController() {
        service = new VentaServiceImpl();
    }

    //metodos de negocio
    public List<Venta> VentaPresencialListar() throws Exception {
        return service.readAll();
    }

    public Venta VentaPresencialBuscar(int id) throws Exception {
        return service.findForId(id);
    }

    public String VentaPresencialProcesar(Venta va, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(va);
                msg = "Venta registrado con exito";
                break;
            case Constante.UPD:
                service.update(va);
                msg = "Venta actualizado con exito";
                break;
            case Constante.DEL:
                service.delete(va);
                msg = "Venta eliminado con exito";
                break;
        }
        return msg;
    }
}
