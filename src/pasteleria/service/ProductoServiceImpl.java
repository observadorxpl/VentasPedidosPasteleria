package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.Producto;

public class ProductoServiceImpl implements ProductoService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Producto pro;
    String sql;

    public ProductoServiceImpl() {
    }
    
    
    @Override
    public void create(Producto t) throws Exception {
       try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO PRODUCTO "
                    + "(ID_PRODUCTO, ID_LINEA, DESCRIPCION, "
                    + "PRECIO_COMPRA,PRECIO_VENTA, STOCK) "
                    + "VALUES (SQ_PRODUCTO.NEXTVAL, ?, ? , ?, ?, ?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdLinea());
            ps.setString(2, t.getDescripcion());
            ps.setDouble(3, t.getPrecioCompra());
            ps.setDouble(4, t.getPrecioVenta());
            ps.setInt(5, t.getStock());
            ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }finally{
           cn.close();
       }
    }

    @Override
    public void update(Producto t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE PRODUCTO "
                    + "SET ID_LINEA = ?, DESCRIPCION = ? ,"
                    + "PRECIO_COMPRA = ?, PRECIO_VENTA = ?, STOCK = ? "
                    + "WHERE ID_PRODUCTO = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdLinea());
            ps.setString(2, t.getDescripcion());
            ps.setDouble(3, t.getPrecioCompra());
            ps.setDouble(4, t.getPrecioVenta());
            ps.setInt(5, t.getStock());
            ps.setInt(6, t.getIdProducto());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(Producto t) throws Exception {
        //Eliminacion logica, en construccion UPDATE SET ESTADO = 0
    }

    @Override
    public List<Producto> readAll() throws Exception {
        List<Producto> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_PRODUCTO, ID_LINEA, DESCRIPCION, PRECIO_COMPRA,"
                    + "PRECIO_VENTA, STOCK "
                    + "FROM PRODUCTO ";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pro = new Producto(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getDouble(4), rs.getDouble(5), rs.getInt(6));
                lista.add(pro);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }
    

    @Override
    public Producto findForId(int t) throws Exception {
         try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_PRODUCTO, ID_LINEA, DESCRIPCION, PRECIO_COMPRA,"
                    + "PRECIO_VENTA, STOCK "
                    + "FROM PRODUCTO "
                    + "WHERE ID_PRODUCTO = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                pro = new Producto(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getDouble(4), rs.getDouble(5), rs.getInt(6));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return pro;
    }

    @Override
    public Producto findForName(String nombre) throws Exception {
        pro = null;
        try {
            cn = AccesoDB.getConnection();
             sql = "SELECT ID_PRODUCTO, ID_LINEA, DESCRIPCION, PRECIO_COMPRA,"
                    + "PRECIO_VENTA, STOCK "
                    + "FROM PRODUCTO "
                    + "WHERE DESCRIPCION = ?";
            ps=cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            pro=null;
            if (rs.next()) {                
                pro=new Producto(rs.getInt(1), rs.getInt(2), rs.getString(3),
                                 rs.getDouble(4), rs.getDouble(5), rs.getInt(6));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            cn.close();
        }
        return pro;
    }
}
