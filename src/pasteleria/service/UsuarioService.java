package pasteleria.service;

import java.sql.SQLException;
import pasteleria.model.Usuario;

public interface UsuarioService extends ICRUD<Usuario>{
    Usuario login(Usuario usuario) throws SQLException ;
}
