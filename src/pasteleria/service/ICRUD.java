package pasteleria.service;
// Esta clase sirve para generalizar el CRUD, T significa la clase o objeto
// que debe pasarse como parametro.
import java.util.List;
public interface ICRUD<T> {
    void create(T t) throws Exception;
    void update(T t) throws Exception;
    void delete(T t) throws Exception;
    List<T> readAll() throws Exception;
    T findForId(int t) throws Exception;
}
