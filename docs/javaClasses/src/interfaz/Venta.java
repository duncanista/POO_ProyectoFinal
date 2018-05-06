package interfaz;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

// Clase Venta, que es la ventana donde se mostrarán y podrán hacer ventas
public class Venta extends javax.swing.JFrame {
    // Constructor mágico
    public Venta() {
        initComponents();
        double total = 0;
        
        jButtonBorrar.setEnabled(false);
        jButtonAgregar.setEnabled(false);
        jButtonPagar.setEnabled(false);
    
        // Modelo de la tabla
        String[] columnas = new String[]{
            "Id", "Nombre", "Categoria", "Cantidad", "Precio"
        };
        // Obtención de los datos de productos
        Products comando = new Products();
        Object[][] productos = comando.get();
        
        // Creación de la tabla con los datos ya reunidos
        DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();
        for (int i = 0; i < productos.length; i++) {
            model.addRow(productos[i]);
        }
        // Método, que al ser seleccionado, y dada la cantidad, nos ayuda a vender
        jTableProductos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event){
                jButtonAgregar.setEnabled(true);
            }
        });
    }

    // Código de la Interfaz gráfica
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProductos = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jLabelVenta = new javax.swing.JLabel();
        jButtonPagar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonCambio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelProductos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelProductos.setText("Productos:");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jLabelVenta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelVenta.setText("Venta:");

        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableVentas);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Categoria", "Inventario", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableProductos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total:   $");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTotal.setText("0.00");

        jLabel3.setText("Cantidad:");

        jButtonCambio.setText("Calcular cambio");
        jButtonCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelProductos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabelVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRegresar)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jButtonCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelTotal)
                                .addGap(224, 224, 224))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCantidad))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelProductos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelVenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonRegresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAgregar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelTotal))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCambio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBorrar)))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Evento, que previamente necesita haber seleccionado un producto, que al ser
    // clicado, nos enviará los productos a vender, que después al pagar, les
    // restará la cantidad, y los subira a la base de datos
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        int fila = jTableProductos.getSelectedRow();
        try{
            jButtonBorrar.setEnabled(true);
            jButtonPagar.setEnabled(true);
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
            int disponible = (Integer) jTableProductos.getValueAt(fila,3);
            // Verificador de errores
            if (cantidad <= 0){
                throw new NumberFormatException();
            }
            if (cantidad > disponible){
                throw new IllegalArgumentException();
            }
            // Este bloque nos ayuda a enviar a la tabla derecha los datos de los
            // productos a comprar
            int nuevoInventario = disponible - cantidad;
            jTableProductos.setValueAt(nuevoInventario, fila, 3);
            Object[] producto = {jTableProductos.getValueAt(fila, 0), jTableProductos.getValueAt(fila, 1), cantidad, jTableProductos.getValueAt(fila, 4)            
            };
            DefaultTableModel model = (DefaultTableModel) jTableVentas.getModel();
            model.addRow(producto);
            
            // Setter del precio total previo
            double precio = (double) jTableProductos.getValueAt(fila, 4);
            double total = Double.parseDouble(jLabelTotal.getText());
            total += precio * cantidad;
            jLabelTotal.setText("" + total);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Revisa que haya un entero en positivo en cantidad.");            
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "No tienes suficiente inventario.");
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed
    // Evento que al ser accionado nos regresa al menú principal
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed
    // Método que al ser accionado nos acciona el pagar
    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        // Obtención de la fecha, de la forma más baja posible
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        
        String fecha = day + "/" + month + "/" + year;
        
        // Modelación de la tabla
        DefaultTableModel dtm = (DefaultTableModel)jTableProductos.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] nuevosProductos = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++){
        for (int j = 0; j < nCol ; j++){
            nuevosProductos[i][j] = dtm.getValueAt(i,j);
        }
    }
        // Declaramos objetos para después accionar sus métodos
        Sales comando2 = new Sales();
        Products comando = new Products();
        double total = Double.parseDouble(jLabelTotal.getText());
        for (Object[] producto: nuevosProductos){
            int id = (Integer) producto[0];
            int cantidad = (Integer) producto[3];
            // Por cada objeto, editamos la cantidad nueva
            comando.update(id, cantidad);
        }
        // Añadimos a la base de datos la venta total
        comando2.insert(fecha, total);
        

        JOptionPane.showMessageDialog(null, "¡El pago ha sido realizado con éxito!");

        
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonPagarActionPerformed
    // Evento que borra la venta
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        this.dispose();
        new Venta().setVisible(true);
    }//GEN-LAST:event_jButtonBorrarActionPerformed
    // Elemento que acciona el poder calcular el cambio
    private void jButtonCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambioActionPerformed
        double total = Double.parseDouble(jLabelTotal.getText());
        new CalcularCambio(total).setVisible(true);
    }//GEN-LAST:event_jButtonCambioActionPerformed

    // Código que se corre al accionar la ventana
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCambio;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVenta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables
}
