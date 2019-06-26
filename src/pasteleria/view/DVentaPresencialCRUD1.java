package pasteleria.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pasteleria.controller.DVentaPresencialController;
import pasteleria.model.DVentaPresencial;


public class DVentaPresencialCRUD1 extends javax.swing.JInternalFrame {

    public DVentaPresencialCRUD1() {
        initComponents();
        try {
            txtIdDVentaPresencial.setEditable(false);
            listarDVentaPresencial();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdProducto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtIdDVentaPresencial = new javax.swing.JTextField();
        txtIDProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDVentasPresencial = new javax.swing.JTable();
        txtIdVentaPresencial = new javax.swing.JTextField();
        lblIdLinea = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setTitle("MANTENIMIENTO DE DVNETASPRESENCIAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto"));

        lblIdProducto.setText("ID");

        lblDescripcion.setText("ID Producto");

        lblPrecioCompra.setText("Precio");

        lblPrecioVenta.setText("Cantidad");

        lblStock.setText("Importe");

        tblDVentasPresencial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "COD. VEN.PRE", "ID PRODUCTO", "PRECIO", "CANTIDAD", "IMPORTE"
            }
        ));
        tblDVentasPresencial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDVentasPresencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDVentasPresencialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDVentasPresencial);

        lblIdLinea.setText("ID VentaPresencial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdProducto)
                    .addComponent(lblDescripcion)
                    .addComponent(lblPrecioCompra)
                    .addComponent(lblPrecioVenta)
                    .addComponent(lblStock)
                    .addComponent(lblIdLinea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdVentaPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIdDVentaPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProducto)
                    .addComponent(txtIdDVentaPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdVentaPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdLinea))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioCompra)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioVenta)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrar)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
 }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        procesar(1);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        procesar(2);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        procesar(3);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        consultar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblDVentasPresencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDVentasPresencialMouseClicked
        try {
            editar(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }       
    }//GEN-LAST:event_tblDVentasPresencialMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIdLinea;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tblDVentasPresencial;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtIdDVentaPresencial;
    private javax.swing.JTextField txtIdVentaPresencial;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    //crear objeto de la clase ProductoController
    DVentaPresencialController obj = new DVentaPresencialController();
    DVentaPresencial dvp;

    private void listarDVentaPresencial() {
        try {
            //variable de tipo tabla
            DefaultTableModel tabla = (DefaultTableModel) tblDVentasPresencial.getModel();
            tabla.setRowCount(0);
            for (DVentaPresencial x : obj.DVentaPresencialListar()) {
                Object[] fila = { x.getIdDVentPres(), x.getIdVentPres(), x.getIdProducto(), 
                    x.getPrecio(), x.getCantidad(), x.getImporte() };
                tabla.addRow(fila);
            }
        } catch (Exception e) {
        }
    }
    
    private void procesar(int op) {
        dvp = leerDatos();
        try {
            String msg = obj.DVentaPresencialProcesar(dvp, op);
            JOptionPane.showMessageDialog(null, msg);
            listarDVentaPresencial();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void consultar() {
        try {
            dvp = obj.DVentaPresencialBuscar(Integer.parseInt(txtIdDVentaPresencial.getText()));
            if (dvp != null) {
                txtIdDVentaPresencial.setText(String.valueOf(dvp.getIdDVentPres()));
                txtIdVentaPresencial.setText(String.valueOf(dvp.getIdVentPres()));
                txtIDProducto.setText(String.valueOf(dvp.getIdProducto()));
                txtPrecio.setText(String.valueOf(dvp.getPrecio()));
                txtCantidad.setText(String.valueOf(dvp.getCantidad()));
                txtImporte.setText(String.valueOf(dvp.getImporte()));
            } else {
                JOptionPane.showMessageDialog(null, "Detalle de Venta no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private DVentaPresencial leerDatos() {
        //crear objeto pro
        dvp = new DVentaPresencial();
        //asignar valores al objeto pro
        dvp.setIdDVentPres(Integer.parseInt(txtIdDVentaPresencial.getText()));
        dvp.setIdVentPres(Integer.parseInt(txtIdVentaPresencial.getText()));
        dvp.setIdProducto(Integer.parseInt(txtIDProducto.getText()));
        dvp.setPrecio(Double.parseDouble(txtPrecio.getText()));
        dvp.setCantidad(Integer.parseInt(txtCantidad.getText()));
        dvp.setImporte(Double.parseDouble(txtImporte.getText()));
        return dvp;
    }

    private void editar() throws Exception {
        int f = tblDVentasPresencial.getSelectedRow();
        Object cod = tblDVentasPresencial.getValueAt(f, 0);
        dvp = obj.DVentaPresencialBuscar((int) cod);
        if (dvp != null) {
            txtIdDVentaPresencial.setText(String.valueOf(dvp.getIdDVentPres()));
            txtIdVentaPresencial.setText(String.valueOf(dvp.getIdVentPres()));
            txtIDProducto.setText(String.valueOf(dvp.getIdProducto()));
            txtPrecio.setText(String.valueOf(dvp.getPrecio()));
            txtCantidad.setText(String.valueOf(dvp.getCantidad()));
            txtImporte.setText(String.valueOf(dvp.getImporte()));
        } else {
            JOptionPane.showMessageDialog(null, "Detalle de venta no existe");
        }
    }

}
