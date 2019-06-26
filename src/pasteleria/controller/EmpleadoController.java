package pasteleria.controller;

import java.util.List;
import pasteleria.model.Empleado;
import pasteleria.service.EmpleadoService;
import pasteleria.service.EmpleadoServiceImpl;
import pasteleria.util.Constante;

public class EmpleadoController {
    EmpleadoService service;

    public EmpleadoController() {
        service = new EmpleadoServiceImpl();
    }

    //metodos de negocio
    public List<Empleado> EmpleadoListar() throws Exception {
        return service.readAll();
    }

    public Empleado EmpleadoBuscar(int id) throws Exception {
        return service.findForId(id);
    }
    public Empleado EmpleadoBuscar(String nombre) throws Exception {
        return service.findForName(nombre);
    }
    
    public String EmpleadoProcesar(Empleado pro, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(pro);
                msg = "Empleado registrado con exito";
                break;
            case Constante.UPD:
                service.update(pro);
                msg = "Empleado actualizado con exito";
                break;
            case Constante.DEL:
                service.delete(pro);
                msg = "Empleado eliminado con exito";
                break;
        }
        return msg;
    }
}
