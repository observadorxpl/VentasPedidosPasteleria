package pasteleria.controller;

import java.util.List;
import pasteleria.model.Cliente;
import pasteleria.service.ClienteService;
import pasteleria.service.ClienteServiceImpl;
import pasteleria.util.Constante;

public class ClienteController {
    ClienteService service;

    public ClienteController() {
        service = new ClienteServiceImpl();
    }

    //metodos de negocio
    public List<Cliente> ClienteListar() throws Exception {
        return service.readAll();
    }

    public Cliente ClienteBuscar(int id) throws Exception {
        return service.findForId(id);
    }
    public Cliente ClienteBuscar(String nombre) throws Exception {
        return service.findForName(nombre);
    }
    
    public String ClienteProcesar(Cliente pro, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(pro);
                msg = "Cliente registrado con exito";
                break;
            case Constante.UPD:
                service.update(pro);
                msg = "Cliente actualizado con exito";
                break;
            case Constante.DEL:
                service.delete(pro);
                msg = "Cliente eliminado con exito";
                break;
        }
        return msg;
    }
}
