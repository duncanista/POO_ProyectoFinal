package interfaz;

// La inicialización del mejor proyecto de su grupo, aveda, no es cierto, pero 
// esta cool :)
public class MenuPrincipal extends javax.swing.JFrame {

    // Constructor
    public MenuPrincipal() {
        initComponents();
    }

    // Código de la Interfaz gráfica
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonInventarios = new javax.swing.JButton();
        jButtonEmpleados = new javax.swing.JButton();
        jButtonResumen = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonAcercaDe = new javax.swing.JButton();
        jButtonCreditos = new javax.swing.JButton();
        jButtonAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonInventarios.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonInventarios.setText("Inventarios");
        jButtonInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventariosActionPerformed(evt);
            }
        });

        jButtonEmpleados.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonEmpleados.setText("Empleados");
        jButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadosActionPerformed(evt);
            }
        });

        jButtonResumen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonResumen.setText("Resumen");
        jButtonResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResumenActionPerformed(evt);
            }
        });

        jButtonVenta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonVenta.setText("Venta");
        jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Punto de Venta");

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonAcercaDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAcercaDe.setText("Acerca De");
        jButtonAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcercaDeActionPerformed(evt);
            }
        });

        jButtonCreditos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCreditos.setText("Créditos");
        jButtonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreditosActionPerformed(evt);
            }
        });

        jButtonAyuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAyuda.setText("Ayuda");
        jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181)
                        .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAcercaDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cierre de la aplicación
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed
    // Nos envía a la sección de ventas
    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        new Venta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVentaActionPerformed
    // Este evento al ser accionados nos manda directamente a la sección de
    // empleados
    private void jButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadosActionPerformed
        new VerEmpleados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEmpleadosActionPerformed
    // El evento nos direcciona a la sección de Inventario
    private void jButtonInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventariosActionPerformed
        new VerInventario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonInventariosActionPerformed
    // El siguiente nos muestra la información acerca del programa
    private void jButtonAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcercaDeActionPerformed
        new AcercaDe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAcercaDeActionPerformed
    // Este evento abre la ventana de Créditos, dónde podrá encontrar nuestras
    // hermosas caras
    private void jButtonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreditosActionPerformed
        new Creditos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCreditosActionPerformed
    // El evento nos da el resumen de las ventas actuales
    private void jButtonResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResumenActionPerformed
        new ResumenVentas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonResumenActionPerformed
    // El evento de Ayuda acciona una ventana que muestra información general
    // sobre el programa, y cómo usarlo.
    private void jButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAyudaActionPerformed
        new TextoAyuda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAyudaActionPerformed

    // Inicializador de la magia
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcercaDe;
    private javax.swing.JButton jButtonAyuda;
    private javax.swing.JButton jButtonCreditos;
    private javax.swing.JButton jButtonEmpleados;
    private javax.swing.JButton jButtonInventarios;
    private javax.swing.JButton jButtonResumen;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
