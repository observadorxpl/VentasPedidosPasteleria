package pasteleria.controller;

import java.util.List;
import pasteleria.model.Producto;
import pasteleria.service.ProductoService;
import pasteleria.service.ProductoServiceImpl;
import pasteleria.util.Constante;

public class ProductoController {
    ProductoService service;

    public ProductoController() {
        service = new ProductoServiceImpl();
    }

    //metodos de negocio
    public List<Producto> ProductoListar() throws Exception {
        return service.readAll();
    }

    public Producto ProductoBuscar(int id) throws Exception {
        return service.findForId(id);
    }
    public Producto ProductoBuscar(String nombre) throws Exception {
        return service.findForName(nombre);
    }
    
    public String ProductoProcesar(Producto pro, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(pro);
                msg = "Producto registrado con exito";
                break;
            case Constante.UPD:
                service.update(pro);
                msg = "Producto actualizado con exito";
                break;
            case Constante.DEL:
                service.delete(pro);
                msg = "Producto eliminado con exito";
                break;
        }
        return msg;
    }
}
