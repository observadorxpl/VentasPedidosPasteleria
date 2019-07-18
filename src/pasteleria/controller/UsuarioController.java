package pasteleria.controller;

import pasteleria.service.UsuarioService;
import pasteleria.service.UsuarioServiceImpl;
import pasteleria.model.Usuario;

public class UsuarioController {
    UsuarioService service;

    public UsuarioController() {
        service = new UsuarioServiceImpl();
    }

    //metodos de negocio
    public Usuario Login(Usuario usuario) throws Exception {
        return service.login(usuario);
    }
}
