package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.TipoEmpleado;

public class TipoEmpleadoServiceImpl implements TipoEmpleadoService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    TipoEmpleado oTipoEmpleado;
    String sql;

    public TipoEmpleadoServiceImpl() {
    }
    
    
    @Override
    public void create(TipoEmpleado t) throws Exception {
       try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO TIPOEMPLEADO (ID_TIPOEMPLEADO, DESCRIPCION) VALUES (SQ_TIPOEMPLEADO.NEXTVAL, ? )";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getDescripcion());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(TipoEmpleado t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE TIPOEMPLEADO "
                    + "SET DESCRIPCION = ? "
                    + "WHERE ID_TIPOEMPLEADO = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getDescripcion());
            ps.setInt(2, t.getIdTipoEmpleado());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(TipoEmpleado t) throws Exception {
        //Eliminacion logica, en construccion UPDATE SET ESTADO = 0
    }

    @Override
    public List<TipoEmpleado> readAll() throws Exception {
        List<TipoEmpleado> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_TIPOEMPLEADO, DESCRIPCION FROM TIPOEMPLEADO";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                oTipoEmpleado = new TipoEmpleado(rs.getInt(1), rs.getString(2));
                lista.add(oTipoEmpleado);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }
    

    @Override
    public TipoEmpleado findForId(int t) throws Exception {
         try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_TIPOEMPLEADO, DESCRIPCION FROM TIPOEMPLEADO WHERE ID_TIPOEMPLEADO = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                oTipoEmpleado = new TipoEmpleado(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return oTipoEmpleado;
    }

    @Override
    public TipoEmpleado findForName(String nombre) throws Exception {
        oTipoEmpleado = null;
        try {
            cn = AccesoDB.getConnection();
             sql = "SELECT ID_TIPOEMPLEADO, DESCRIPCION FROM TIPOEMPLEADO WHERE DESCRIPCION = ?";
            ps=cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            oTipoEmpleado=null;
            if (rs.next()) {                
                oTipoEmpleado = new TipoEmpleado(rs.getInt(1), rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            cn.close();
        }
        return oTipoEmpleado;
    }
}
