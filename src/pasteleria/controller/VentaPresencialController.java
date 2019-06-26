package pasteleria.controller;

import java.util.List;
import pasteleria.model.VentaPresencial;
import pasteleria.service.VentaPresencialService;
import pasteleria.service.VentaPresencialServiceImpl;
import pasteleria.util.Constante;

public class VentaPresencialController {
    VentaPresencialService service;

    public VentaPresencialController() {
        service = new VentaPresencialServiceImpl();
    }

    //metodos de negocio
    public List<VentaPresencial> VentaPresencialListar() throws Exception {
        return service.readAll();
    }

    public VentaPresencial VentaPresencialBuscar(int id) throws Exception {
        return service.findForId(id);
    }

    public String VentaPresencialProcesar(VentaPresencial vp, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(vp);
                msg = "Venta registrado con exito";
                break;
            case Constante.UPD:
                service.update(vp);
                msg = "Venta actualizado con exito";
                break;
            case Constante.DEL:
                service.delete(vp);
                msg = "Venta eliminado con exito";
                break;
        }
        return msg;
    }
}
