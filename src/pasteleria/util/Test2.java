package pasteleria.util;

import pasteleria.service.ProductoServiceImpl;

public class Test2 {
    public static void main(String[] args) throws Exception {
        ProductoServiceImpl service = new ProductoServiceImpl();
        //Producto pro = new Producto(0, 1 ,"Patel clasico", 109, 129.99, 1);
        //System.out.println(service.findForId(109));
        //Producto pro = new Producto(108, 1 ,"Patel de chocolate", 109, 129.99, 1);
        //sevice.update(pro);
        System.out.println(service.readAll());
    }
}
