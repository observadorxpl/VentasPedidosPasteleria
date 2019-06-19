package pasteleria.service;
import pasteleria.model.Producto;

public interface ProductoService extends ICRUD<Producto>{
    public Producto findForName(String nombre) throws Exception;
  
}
