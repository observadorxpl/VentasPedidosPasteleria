package pasteleria.view;

import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pasteleria.controller.ClienteController;
import pasteleria.controller.ProductoController;
import pasteleria.controller.VentaController;
import pasteleria.model.Cliente;
import pasteleria.model.DVentaPresencial;
import pasteleria.model.DetalleVenta;
import pasteleria.model.Producto;/*
import uni.controller.ClienteController;
import uni.controller.EmpleadoController;

import uni.controller.VentaController;
import uni.entity.Cliente;
import uni.entity.Detalle;
import uni.entity.Empleado;

import uni.entity.Venta;
import uni.util.Session;
 */
import pasteleria.model.Venta;

public class VentasPresencialView extends javax.swing.JInternalFrame {

    public VentasPresencialView() {
        initComponents();
        try {
            cargaListas();
            nuevaVenta();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbocliente = new javax.swing.JComboBox();
        cbotipodoc = new javax.swing.JComboBox();
        txtnrodoc = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtnro = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboproducto = new javax.swing.JComboBox();
        txtcodigo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtmonto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdetalle = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtigv = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btnagregardetalle = new javax.swing.JButton();
        btnquitardetalle = new javax.swing.JButton();
        btnregistraventa = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setTitle("R E G I S T R A R   V E N T A S");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Cliente");

        jLabel2.setText("Tipo Doc.");

        jLabel3.setText("Nro. Doc");

        jLabel4.setText("Empleado");

        txtnrodoc.setEditable(false);
        txtnrodoc.setText("01-0001");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));

        txtnro.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtnro, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblfecha.setText("dd/mm/yyyy");

        jLabel13.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbocliente, 0, 202, Short.MAX_VALUE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnrodoc)
                    .addComponent(cbotipodoc, 0, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(cbocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(txtnrodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfecha)
                            .addComponent(jLabel13)))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de producto"));

        jLabel5.setText("Producto");

        jLabel6.setText("Precio");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Codigo");

        jLabel9.setText("Monto");

        cboproducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboproductoItemStateChanged(evt);
            }
        });

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(153, 153, 153));

        txtprecio.setEditable(false);
        txtprecio.setBackground(new java.awt.Color(153, 153, 153));
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantidadKeyReleased(evt);
            }
        });

        txtmonto.setEditable(false);
        txtmonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Detalle"));

        tbdetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre de Producto", "Precio", "Cantidad", "Importe"
            }
        ));
        jScrollPane1.setViewportView(tbdetalle);
        if (tbdetalle.getColumnModel().getColumnCount() > 0) {
            tbdetalle.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbdetalle.getColumnModel().getColumn(1).setPreferredWidth(180);
            tbdetalle.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbdetalle.getColumnModel().getColumn(3).setPreferredWidth(40);
            tbdetalle.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setText("SubTotal");

        jLabel11.setText("Igv");

        jLabel12.setText("Total");

        txtsubtotal.setEditable(false);
        txtsubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtigv.setEditable(false);
        txtigv.setBackground(new java.awt.Color(153, 153, 153));
        txtigv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txttotal.setEditable(false);
        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnagregardetalle.setText("Agregar Detalle");
        btnagregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregardetalleActionPerformed(evt);
            }
        });

        btnquitardetalle.setText("Quitar Detalle");
        btnquitardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitardetalleActionPerformed(evt);
            }
        });

        btnregistraventa.setText("Registrar Venta");
        btnregistraventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraventaActionPerformed(evt);
            }
        });

        btnimprimir.setText("Imprimir");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        jButton5.setText("Cerrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(2, 2, 2)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnagregardetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnquitardetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnregistraventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnagregardetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnquitardetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnregistraventa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnimprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // cerrar
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cboproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboproductoItemStateChanged
        try {
            mostrarProducto();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_cboproductoItemStateChanged

    private void txtcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyReleased
        try {
            calcularMonto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtcantidadKeyReleased

    private void btnagregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregardetalleActionPerformed
        try {
            agregarDetalle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnagregardetalleActionPerformed

    private void btnquitardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitardetalleActionPerformed
        try {
            quitarDetalle();
        } catch (Exception e) {
            TotalVenta();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnquitardetalleActionPerformed

    private void btnregistraventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraventaActionPerformed
        try {
            grabarVenta();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnregistraventaActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        PrincipalView principalView = new PrincipalView();
        System.out.println("mostrar");
        principalView.mostrarBoleta();
    }//GEN-LAST:event_btnimprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregardetalle;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnquitardetalle;
    private javax.swing.JButton btnregistraventa;
    private javax.swing.JComboBox cbocliente;
    private javax.swing.JComboBox cboproducto;
    private javax.swing.JComboBox cbotipodoc;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTable tbdetalle;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtnro;
    private javax.swing.JTextField txtnrodoc;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    //instanciar objetos
    ClienteController ocli = new ClienteController();
//  EmpleadoController oemp = new EmpleadoController();
    ProductoController opro = new ProductoController();

    List<DetalleVenta> lista = new ArrayList<>();

    int stk;
//    Empleado emp = null;

    private void cargaListas() throws Exception {
        //llenar combo de cliente
        cboproducto.removeAllItems();
        cbocliente.removeAllItems();
        for (Cliente c : ocli.ClienteListar()) {
            cbocliente.addItem(c);
        }
        //llenar combo de producto
        cboproducto.removeAllItems();
        for (Producto p : opro.ProductoListar()) {
            cboproducto.addItem(p);
        }
        //nombre de empleado
//  emp = (Empleado) Session.get("usuario");
//  txtEmpleado.setText(emp.getNombre() + " " + emp.getApellidos());
        txtEmpleado.setText("Luis Davolio");
        cbotipodoc.removeAllItems();
        cbotipodoc.addItem("Factura");
        cbotipodoc.addItem("Boleta");
        cbotipodoc.addItem("Guia");
    }

    private void nuevaVenta() {
        txtcantidad.setSelectionStart(0);
        txtcantidad.grabFocus();
        Date hoy = new Date();
        SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yyyy");
        lblfecha.setText(mascara.format(hoy));
        txtsubtotal.setText("");
        txtigv.setText("");
        txttotal.setText("");
        lista.clear();
        DefaultTableModel model = (DefaultTableModel) tbdetalle.getModel();
        model.setRowCount(0);
        txtnro.setText("");
        cbocliente.setSelectedIndex(-1);
        //cboproducto.setSelectedIndex(-1);
    }

    Producto p = null;

    private void mostrarProducto() throws Exception {
        if (cboproducto.getSelectedIndex() != -1) {
            p = (Producto) cboproducto.getSelectedItem();
            //p = opro.ProductoBuscarxId(p.getIdProducto());
            //String nom = cboproducto.getSelectedItem().toString().trim();
            //p = opro.ProductoBuscarxId(nom);
            stk = p.getStock();
            txtcodigo.setText(String.valueOf(p.getIdProducto()));
            txtprecio.setText(String.valueOf(p.getPrecioVenta()));
            txtcantidad.setText("1");
            txtcantidad.setSelectionStart(0);
            txtcantidad.grabFocus();
            calcularMonto();
        }
    }

    private void calcularMonto() {
        if (!"".equals(txtcantidad.getText())) {
            if (Integer.parseInt(txtcantidad.getText().trim()) > 0) {
                int cant = Integer.parseInt(txtcantidad.getText());
                System.out.println(cant);
                //if(cant < 1){cant = 1;}
                if (cant < stk) {
                    double pre = Double.parseDouble(txtprecio.getText());
                    double monto = pre * cant;
                    txtmonto.setText(monto + "");
                } else {
                    JOptionPane.showMessageDialog(this, "Solo quedan:" + stk + " unidades en stock");
                    txtcantidad.setText(stk - 1 + "");
                    calcularMonto();
                    txtcantidad.setSelectionStart(0);
                    txtcantidad.grabFocus();
                }
            } else {
                txtcantidad.setText("1");
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
                txtcantidad.setSelectionStart(0);
                txtcantidad.grabFocus();
                calcularMonto();
            }
        } else {
            System.out.println("lg");
            txtcantidad.setText("1");
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
            txtcantidad.setSelectionStart(0);
            txtcantidad.grabFocus();

        }
    }

    DetalleVenta det = null;

    private void agregarDetalle() {
        det = new DetalleVenta();
        //asignar valores al cojeto det
        det.setIdProducto(Integer.parseInt(txtcodigo.getText()));
        det.setNombreProducto(cboproducto.getSelectedItem().toString().trim());
        det.setPrecio(Double.parseDouble(txtprecio.getText()));
        det.setCantidad(Integer.parseInt(txtcantidad.getText()));
        det.setImporte(Double.parseDouble(txtmonto.getText()));
        System.out.println("log");
        adicionarDetalle(det);
        listarDetalle(lista);
        TotalVenta();
        NuevoDetalle();
    }

    private void adicionarDetalle(DetalleVenta det) {
        boolean val = false;
        for (DetalleVenta d : lista) {
            if (det.getIdProducto() == d.getIdProducto()) {
                d.setCantidad(d.getCantidad() + det.getCantidad());
                d.setImporte(d.getPrecio() * d.getCantidad());
                System.out.println("true");
                val = true;
            }
        }
        if (val == false) {
            lista.add(det);
            System.out.println(lista.toString());
        }

    }

    private void listarDetalle(List<DetalleVenta> lista) {
        DefaultTableModel model = (DefaultTableModel) tbdetalle.getModel();
        model.setRowCount(0);
        for (DetalleVenta d : lista) {
            Object[] rowdata = {d.getIdProducto(),
                d.getNombreProducto(),
                d.getPrecio(),
                d.getCantidad(),
                d.getImporte()};
            model.addRow(rowdata);
        }
        tbdetalle.setRowSelectionInterval(0, 0);
    }

    private void TotalVenta() {
        DecimalFormat df = new DecimalFormat("#.000");
        double subtot = 0;
        double igv = 0;
        double tot = 0;

        for (DetalleVenta d : lista) {
            subtot += d.getImporte();
        }
        if (cbotipodoc.getSelectedIndex() == 0) {
            System.out.println(subtot);
            igv = (subtot * 0.18);
            igv = Math.round(igv * Math.pow(10, 2)) / Math.pow(10, 2);
            tot = subtot + igv;
        } else {
            tot = subtot;
        }
        txtsubtotal.setText(subtot + "");
        txtigv.setText(igv + "");
        txttotal.setText(tot + "");
    }

    private void NuevoDetalle() {
        txtmonto.setText("");
        txtprecio.setText("");
        txtcantidad.setText("");
        txtcodigo.setText("");
        cboproducto.setSelectedIndex(-1);
        cboproducto.requestFocus();
    }

    private void quitarDetalle() {
        // eliminar fila de la tabla     
        int fila = tbdetalle.getSelectedRow();
        if (fila > -1) {
            lista.remove(fila);//elimina file de la coleccion
            listarDetalle(lista);
            TotalVenta();
        } else {
            JOptionPane.showMessageDialog(this, "Detalle no tiene item");
        }
    }

    VentaController oVenta = null;
    Venta ve = null;

    private void grabarVenta() {
        try {
            // instanciando objetos
            oVenta = new VentaController();
            ve = new Venta();
            //asignar valores al objeto ve
            ve.setIdCliente(ocli.ClienteBuscar(cbocliente.getSelectedItem().toString().trim()).getIdCliente());
            ve.setIdEmpleado(1);
            //ve.setTipoV(cbotipodoc.getSelectedItem().toString());
            //ve.setNrodoc(txtnrodoc.getText());
            ve.setTipoV("P");
            ve.setMontT(Double.parseDouble(txttotal.getText()));
            ve.setDetallesVenta(lista);
            //graba venta
            oVenta.VentaPresencialProcesar(ve, 1);
            int idfact = ve.getIdVenta();
            txtnro.setText("000" + String.valueOf(idfact) + "");
            JOptionPane.showMessageDialog(this, "Venta registrada con exito \n Gracias por su compra");
//   imprimir();
            nuevaVenta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

//    private void imprimir() {
//        Connection cn;
//        try {
//            cn = AccesoDB.getConnection();
//            String ruta = System.getProperty("user.dir") + "/src/uni/sistemas/reportes/facturaventa.jasper";
//            Map parametro = new HashMap();
//            parametro.put("NFACT", Integer.parseInt(txtnro.getText()));
//            JasperPrint print = JasperFillManager.fillReport(ruta, parametro, cn);
//            JasperViewer view = new JasperViewer(print, false);
//            view.setTitle("VENTAS");
//            view.setExtendedState(Frame.MAXIMIZED_BOTH);
//            view.setVisible(true);
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "No se pudo", "ERROR", JOptionPane.ERROR_MESSAGE);
//        }
//    }
}
