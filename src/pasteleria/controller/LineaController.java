package pasteleria.controller;

import java.util.List;
import pasteleria.model.Linea;
import pasteleria.service.LineaService;
import pasteleria.service.LineaServiceImpl;
import pasteleria.util.Constante;

public class LineaController {
    LineaService service;

    public LineaController() {
        service = new LineaServiceImpl();
    }

    //metodos de negocio
    public List<Linea> LineaListar() throws Exception {
        return service.readAll();
    }

    public Linea LineaBuscar(int id) throws Exception {
        return service.findForId(id);
    }
    public Linea LineaBuscar(String nombre) throws Exception {
        return service.findForName(nombre);
    }
    
    public String LineaProcesar(Linea oLinea, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                service.create(oLinea);
                msg = "Linea registrada con éxito";
                break;
            case Constante.UPD:
                service.update(oLinea);
                msg = "Linea actualizada con éxito";
                break;
            case Constante.DEL:
                service.delete(oLinea);
                msg = "Linea eliminada con éxito";
                break;
        }
        return msg;
    }
}
