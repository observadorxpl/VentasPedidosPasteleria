package pasteleria.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pasteleria.database.AccesoDB;

import pasteleria.model.Usuario;

public class UsuarioServiceImpl implements UsuarioService {

    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Usuario oUsuario;
    String sql;

    @Override
    public void create(Usuario t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> readAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario findForId(int t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario login(Usuario usuario) throws SQLException{
        System.out.println(usuario.toString());
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_USUARIO, ID_ROL, ID_EMPLEADO FROM USUARIO "
                    + "WHERE USUARIO = ? AND CONTRASENIA = ? ";
            ps = cn.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario().trim());
            ps.setString(2, usuario.getContrasenia().trim());
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("---");
                oUsuario = new Usuario(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                System.out.println(oUsuario.toString());
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("sqlException");
        } finally {
            cn.close();
        }
        return oUsuario;
    }

}
