package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.DVentaPresencial;
public class DVentaPresencialServiceImpl implements DVentaPresencialService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    DVentaPresencial dvp;
    String sql;
    public DVentaPresencialServiceImpl() {
    }

    @Override
    public void create(DVentaPresencial t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO DVENTAPRESENCIAL "
                    + "(ID_DVENTAPRESENCIAL, ID_VENTAPRESENCIAL, ID_PRODUCTO, "
                    + "PRECIO,CANTIDAD, IMPORTE) "
                    + "VALUES (SQ_PRODUCTO.NEXTVAL, ?, ? , ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdVentPres());
            ps.setInt(2, t.getIdProducto());
            ps.setDouble(3, t.getPrecio());
            ps.setInt(4, t.getCantidad());
            ps.setDouble(5, t.getImporte());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(DVentaPresencial t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE DVENTAPRESENCIAL "
                    + "SET ID_VENTAPRESENCIAL = ?, ID_PRODUCTO = ? ,"
                    + "PRECIO = ?, CANTIDAD = ?, IMPORTE = ? "
                    + "WHERE ID_DVENTAPRESENCIAL = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdVentPres());
            ps.setInt(2, t.getIdProducto());
            ps.setDouble(3, t.getPrecio());
            ps.setInt(4, t.getCantidad());
            ps.setDouble(5, t.getImporte());
            ps.setInt(6, t.getIdDVentPres());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(DVentaPresencial t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DVentaPresencial> readAll() throws Exception {
        List<DVentaPresencial> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_DVENTAPRESENCIAL, ID_VENTAPRESENCIAL, ID_PRODUCTO, PRECIO,"
                    + "CANTIDAD, IMPORTE "
                    + "FROM DVENTAPRESENCIAL ";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                dvp = new DVentaPresencial(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDouble(4), rs.getInt(5), rs.getDouble(6));
                lista.add(dvp);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }

    @Override
    public DVentaPresencial findForId(int t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_DVENTAPRESENCIAL, ID_VENTAPRESENCIAL, ID_PRODUCTO, PRECIO,"
                    + "CANTIDAD, IMPORTE "
                    + "FROM DVENTAPRESENCIAL "
                    + "WHERE ID_DVENTAPRESENCIAL = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                dvp = new DVentaPresencial(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getDouble(4), rs.getInt(5), rs.getDouble(6));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return dvp;
    }
    
}
