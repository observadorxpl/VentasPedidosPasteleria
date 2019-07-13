package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.Venta;
public class VentaServiceImpl implements VentaService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Venta va;
    String sql;
    public VentaServiceImpl() {
    }
    @Override
    public void create(Venta t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO VENTA "
                    + "(ID_VENTA, ID_CLIENTE, ID_EMPLEADO, "
                    + "FECHA_PRODUCIDO,FECHA_ENTREGA,MONTOTOTAL,TIPO_VENTA) "
                    + "VALUES (SQ_PRODUCTO.NEXTVAL, ?, ? , ?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdVenta());
            ps.setInt(2, t.getIdCliente());
            ps.setInt(3, t.getIdEmpleado());
            ps.setDouble(4, t.getMontT());
            ps.setString(5, t.getTipoV());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(Venta t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE VENTA "
                    + "SET ID_VENTA = ?, ID_CLIENTE = ? ,"
                    + "ID_EMPLEADO = ?, MONTOTOTAL = ?, TIPO_VENTA = ? "
                    + "WHERE ID_VENTA = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdVenta());
            ps.setInt(2, t.getIdCliente());
            ps.setInt(3, t.getIdEmpleado());
            ps.setDouble(4, t.getMontT());
            ps.setString(5, t.getTipoV());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(Venta t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> readAll() throws Exception {
        List<Venta> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_VENTA, ID_CLIENTE, ID_EMPLEADO,FECHA_PRODUCIDO,FECHA_ENTREGA, MONTOTOTAL,TIPO_VENTA,"
                    + "FROM VENTA ";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                va = new Venta(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDate(4), rs.getDate(5), rs.getDouble(6),rs.getString(7));
                lista.add(va);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }

    @Override
    public Venta findForId(int t) throws Exception {
        
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_VENTA, ID_CLIENTE, ID_EMPLEADO, FECHA_PRODUCIDO,FECHA_ENTREGA,"
                    + "MONTOTOTAL,TIPO_VENTA"
                    + "FROM VENTA "
                    + "WHERE ID_VENTA = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                va = new Venta(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDate(4), rs.getDate(5), rs.getDouble(6),rs.getString(7));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return va;
    
    }
    
}
