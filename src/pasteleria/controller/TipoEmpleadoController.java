package pasteleria.controller;

import java.util.List;
import pasteleria.model.TipoEmpleado;
import pasteleria.service.TipoEmpleadoService;
import pasteleria.service.TipoEmpleadoServiceImpl;
import pasteleria.util.Constante;

public class TipoEmpleadoController {
    TipoEmpleadoService service;

    public TipoEmpleadoController() {
        service = new TipoEmpleadoServiceImpl();
    }

    //metodos de negocio
    public List<TipoEmpleado> TipoEmpleadoListar() throws Exception {
        return service.readAll();
    }

    public TipoEmpleado TipoEmpleadoBuscar(int id) throws Exception {
        return service.findForId(id);
    }
    public TipoEmpleado TipoEmpleadoBuscar(String nombre) throws Exception {
        return service.findForName(nombre);
    }
    
    public String TipoEmpleadoProcesar(TipoEmpleado oTipoEmpleado, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(oTipoEmpleado);
                msg = "Tipo empleado registrado con éxito";
                break;
            case Constante.UPD:
                service.update(oTipoEmpleado);
                msg = "Tipo empleado actualizado con éxito";
                break;
            case Constante.DEL:
                service.delete(oTipoEmpleado);
                msg = "Tipo empleado eliminado con éxito";
                break;
        }
        return msg;
    }
}
