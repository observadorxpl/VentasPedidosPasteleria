package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.Empleado;

public class EmpleadoServiceImpl implements EmpleadoService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Empleado oEmpleado;
    String sql;

    public EmpleadoServiceImpl() {
    }
    
    
    @Override
    public void create(Empleado t) throws Exception {
        System.out.println(t.toString());
       try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO EMPLEADO "
                    + "(ID_EMPLEADO, ID_TIPOEMPLEADO, NOMBRE, "
                    + "PATERNO,MATERNO) "
                    + "VALUES (SQ_EMPLEADO.NEXTVAL, ?, ? , ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdTipoEmpleado());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getApePaterno());
            ps.setString(4, t.getApeMaterno());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(Empleado t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE EMPLEADO SET "
                    + "ID_TIPOEMPLEADO = ?, NOMBRE = ? ,"
                    + "PATERNO = ?, MATERNO = ? "
                    + "WHERE ID_EMPLEADO = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdTipoEmpleado());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getApePaterno());
            ps.setString(4, t.getApeMaterno());
            ps.setInt(5, t.getIdEmpleado());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(Empleado t) throws Exception {
        //Eliminacion logica, en construccion UPDATE SET ESTADO = 0
    }

    @Override
    public List<Empleado> readAll() throws Exception {
        List<Empleado> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_EMPLEADO, ID_TIPOEMPLEADO, NOMBRE, PATERNO, MATERNO "
                    + "FROM EMPLEADO ";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                oEmpleado = new Empleado(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
                lista.add(oEmpleado);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }
    

    @Override
    public Empleado findForId(int t) throws Exception {
         try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_EMPLEADO, ID_TIPOEMPLEADO, NOMBRE, PATERNO, MATERNO "
                    + "FROM EMPLEADO "
                    + "WHERE ID_EMPLEADO = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                oEmpleado = new Empleado(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return oEmpleado;
    }

    @Override
    public Empleado findForName(String nombre) throws Exception {
        oEmpleado = null;
        try {
            cn = AccesoDB.getConnection();
             sql = "SELECT ID_EMPLEADO, ID_TIPOEMPLEADO, NOMBRE, PATERNO, MATERNO "
                    + "FROM EMPLEADO "
                    + "WHERE DESCRIPCION = ?";
            ps=cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            oEmpleado=null;
            if (rs.next()) {                
                oEmpleado = new Empleado(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            cn.close();
        }
        return oEmpleado;
    }
}
