package pasteleria.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pasteleria.database.AccesoDB;
import pasteleria.model.Linea;

public class LineaServiceImpl implements LineaService{
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Linea oLinea;
    String sql;

    public LineaServiceImpl() {
    }
    
    
    @Override
    public void create(Linea t) throws Exception {
       try {
            cn = AccesoDB.getConnection();
            sql = "INSERT INTO LINEA (ID_LINEA, DESCRIPCION) VALUES (SQ_LINEA.NEXTVAL, ? )";
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
    public void update(Linea t) throws Exception {
        try{
        cn = AccesoDB.getConnection();
            sql =   "UPDATE LINEA "
                    + "SET DESCRIPCION = ? "
                    + "WHERE ID_LINEA = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getDescripcion());
            ps.setInt(2, t.getIdLinea());
            ps.executeUpdate();
       }catch(SQLException e){
            System.out.println(e.getMessage());
       }finally{
            cn.close();
       }
    }

    @Override
    public void delete(Linea t) throws Exception {
        //Eliminacion logica, en construccion UPDATE SET ESTADO = 0
    }

    @Override
    public List<Linea> readAll() throws Exception {
        List<Linea> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_LINEA, DESCRIPCION FROM LINEA";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                oLinea = new Linea(rs.getInt(1), rs.getString(2));
                lista.add(oLinea);
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
        return lista;
    }
    

    @Override
    public Linea findForId(int t) throws Exception {
         try {
            cn = AccesoDB.getConnection();
            sql = "SELECT ID_LINEA, DESCRIPCION FROM LINEA WHERE ID_LINEA = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            if(rs.next()){
                oLinea = new Linea(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        } finally {
            cn.close();
        }
         return oLinea;
    }

    @Override
    public Linea findForName(String nombre) throws Exception {
        oLinea = null;
        try {
            cn = AccesoDB.getConnection();
             sql = "SELECT ID_LINEA, DESCRIPCION FROM LINEA WHERE DESCRIPCION = ?";
            ps=cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs=ps.executeQuery();
            oLinea=null;
            if (rs.next()) {                
                oLinea = new Linea(rs.getInt(1), rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            cn.close();
        }
        return oLinea;
    }
}
