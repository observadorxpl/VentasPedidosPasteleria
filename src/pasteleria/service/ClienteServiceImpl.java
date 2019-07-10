package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.Cliente;

public class ClienteServiceImpl implements ClienteService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Cliente oCliente;
    String sql;

    public ClienteServiceImpl() {
    }
    
    
    @Override
    public void create(Cliente t) throws Exception {
        System.out.println(t.toString());
       try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO CLIENTE "
                    + "(ID_CLIENTE, RAZONSOCIAL, DIRECCION, "
                    + "RUCDNI,TELEFONO) "
                    + "VALUES (SQ_CLIENTE.NEXTVAL, ?, ? , ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getRazonSocial());
            ps.setString(2, t.getDireccion());
            ps.setString(3, t.getRuc_dni());
            ps.setString(4, t.getTelefono());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(Cliente t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE CLIENTE SET "
                    + "RAZONSOCIAL = ?, DIRECCION = ? ,"
                    + "RUCDNI = ?, TELEFONO = ? "
                    + "WHERE ID_CLIENTE = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getRazonSocial());
            ps.setString(2, t.getDireccion());
            ps.setString(3, t.getRuc_dni());
            ps.setString(4, t.getTelefono());
            ps.setInt(5, t.getIdCliente());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(Cliente t) throws Exception {
        //Eliminacion logica, en construccion UPDATE SET ESTADO = 0
    }

    @Override
    public List<Cliente> readAll() throws Exception {
        List<Cliente> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_CLIENTE, RAZONSOCIAL, DIRECCION, RUCDNI, TELEFONO "
                    + "FROM CLIENTE ";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                oCliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
                lista.add(oCliente);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }
    

    @Override
    public Cliente findForId(int t) throws Exception {
         try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_CLIENTE, RAZONSOCIAL, DIRECCION, RUCDNI, TELEFONO "
                    + "FROM CLIENTE "
                    + "WHERE ID_CLIENTE = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                oCliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return oCliente;
    }

    @Override
    public Cliente findForName(String nombre) throws Exception {
        oCliente = null;
        try {
            cn = AccesoDB.getConnection();
             sql = "SELECT ID_CLIENTE, RAZONSOCIAL, DIRECCION, RUCDNI, TELEFONO "
                    + "FROM CLIENTE "
                    + "WHERE RAZONSOCIAL = ?";
            ps=cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            oCliente=null;
            if (rs.next()) {                
                oCliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            cn.close();
        }
        return oCliente;
    }
}
