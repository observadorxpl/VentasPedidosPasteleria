package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.DetalleVenta;
import pasteleria.model.Venta;
public class VentaServiceImpl implements VentaService{
    Connection cn;
    PreparedStatement ps, ps2;
    ResultSet rs, rs2 ;
    Venta va;
    String sql;
    public VentaServiceImpl() {
    }
    @Override
    public void create(Venta t) throws Exception {
        System.out.println("-----venta------");
        System.out.println(t.toString());
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            sql = "INSERT INTO VENTA "
                    + "(ID_VENTA, ID_CLIENTE, ID_EMPLEADO, "
                    + "FECHA_PRODUCIDO,FECHA_ENTREGA,MONTOTOTAL,TIPO_VENTA) "
                    + "VALUES (SQ_VENTA.NEXTVAL, ?, ? , SYSTIMESTAMP, SYSTIMESTAMP, ?, ?)";
            ps = cn.prepareStatement(sql);
            //ps.setInt(1, t.getIdVenta());
            ps.setInt(1, t.getIdCliente());
            ps.setInt(2, t.getIdEmpleado());
            ps.setDouble(3, t.getMontT());
            ps.setString(4, t.getTipoV());
            ps.executeUpdate();
            
            sql = "INSERT INTO DETALLE_VENTA"
                    + "(ID_DETALLEVENTA, ID_VENTA, "
                    + "ID_PRODUCTO, PRECIO, CANTIDAD,IMPORTE) "
                    + "VALUES (SQ_DETALLE_VENTA.NEXTVAL, SQ_VENTA.CURRVAL , "
                    + "? , ?, ?, ?)";
            ps2 = cn.prepareStatement(sql);
            
            for (DetalleVenta d : t.getDetallesVenta()) {
                ps2.setInt(1, d.getIdProducto());
                ps2.setDouble(2, d.getPrecio());
                ps2.setInt(3, d.getCantidad());
                ps2.setDouble(4, d.getImporte());
                ps2.executeUpdate();
            }
            cn.commit();
       }catch(SQLException e){
           System.out.println(e.getMessage());
           cn.rollback();
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
