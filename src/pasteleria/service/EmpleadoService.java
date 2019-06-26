package pasteleria.service;
import pasteleria.model.Empleado;

public interface EmpleadoService extends ICRUD<Empleado>{
    public Empleado findForName(String nombre) throws Exception;
  
}
