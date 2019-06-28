package pasteleria.service;
import pasteleria.model.Cliente;

public interface ClienteService extends ICRUD<Cliente>{
    public Cliente findForName(String nombre) throws Exception;
  
}
