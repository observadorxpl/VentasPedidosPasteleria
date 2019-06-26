package pasteleria.service;
import pasteleria.model.Linea;

public interface LineaService extends ICRUD<Linea>{
    public Linea findForName(String nombre) throws Exception;
  
}
