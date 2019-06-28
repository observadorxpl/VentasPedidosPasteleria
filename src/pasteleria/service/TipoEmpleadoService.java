package pasteleria.service;
import pasteleria.model.TipoEmpleado;

public interface TipoEmpleadoService extends ICRUD<TipoEmpleado>{
    public TipoEmpleado findForName(String nombre) throws Exception;
  
}
