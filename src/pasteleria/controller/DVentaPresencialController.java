package pasteleria.controller;

import java.util.List;
import pasteleria.model.DVentaPresencial;
import pasteleria.service.DVentaPresencialService;
import pasteleria.service.DVentaPresencialServiceImpl;
import pasteleria.util.Constante;

public class DVentaPresencialController {
    DVentaPresencialService service;

    public DVentaPresencialController() {
        service = new DVentaPresencialServiceImpl();
    }

    //metodos de negocio
    public List<DVentaPresencial> DVentaPresencialListar() throws Exception {
        return service.readAll();
    }

    public DVentaPresencial DVentaPresencialBuscar(int id) throws Exception {
        return service.findForId(id);
    }

    public String DVentaPresencialProcesar(DVentaPresencial dvp, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(dvp);
                msg = "DVentaPresencial registrado con exito";
                break;
            case Constante.UPD:
                service.update(dvp);
                msg = "DVentaPresencial actualizado con exito";
                break;
            case Constante.DEL:
                service.delete(dvp);
                msg = "DVentaPresencial eliminado con exito";
                break;
        }
        return msg;
    }
}
