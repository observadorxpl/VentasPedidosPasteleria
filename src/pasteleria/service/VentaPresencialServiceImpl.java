package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.VentaPresencial;
public class VentaPresencialServiceImpl implements VentaPresencialService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    VentaPresencial vp;
    String sql;
    public VentaPresencialServiceImpl() {
    }
    @Override
    public void create(VentaPresencial t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO VENTAPRESENCIAL "
                    + "(ID_VENTAPRESENCIAL, ID_CLIENTE, ID_EMPLEADO, "
                    + "FECHA,MONTOTOTAL) "
                    + "VALUES (SQ_PRODUCTO.NEXTVAL, ?, ? , ?, SYSDATE, ?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdVentaPresencial());
            ps.setInt(2, t.getIdCliente());
            ps.setInt(3, t.getIdEmpleado());
            ps.setDouble(4, t.getMontoT());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(VentaPresencial t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE VENTAPRESENCIAL "
                    + "SET ID_VENTAPRESENCIAL = ?, ID_CLIENTE = ? ,"
                    + "ID_EMPLEADO = ?, MONTOTOTAL = ? "
                    + "WHERE ID_VENTAPRESENCIAL = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdVentaPresencial());
            ps.setInt(2, t.getIdCliente());
            ps.setInt(3, t.getIdEmpleado());
            ps.setDouble(4, t.getMontoT());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(VentaPresencial t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VentaPresencial> readAll() throws Exception {
        List<VentaPresencial> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_VENTAPRESENCIAL, ID_CLIENTE, ID_EMPLEADO,FECHA, MONTOTOTAL,"
                    + "FROM VENTAPRESENCIAL ";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                vp = new VentaPresencial(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDate(4), rs.getDouble(5));
                lista.add(vp);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }

    @Override
    public VentaPresencial findForId(int t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_VENTAPRESENCIAL, ID_CLIENTE, ID_EMPLEADO, FECHA,"
                    + "MONTOTOTAL"
                    + "FROM VENTAPRESENCIAL "
                    + "WHERE ID_VENTAPRESENCIAL = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                vp = new VentaPresencial(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDate(4), rs.getDouble(5));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return vp;
    }
    
}
