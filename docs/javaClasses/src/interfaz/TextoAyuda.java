package interfaz;

// Esta clase sólo muestra el código de ayuda
public class TextoAyuda extends javax.swing.JFrame {
    // Constructor
    public TextoAyuda() {
        initComponents();
    }
    // Código de Intefaz de Gráfica
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ayuda");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("**Si no se tiene una buena conexión, es posible que la aplicación se atore.\n\nAl cargar la aplicación, se abre el menú principal.\nA continuación, se muestra una breve explicación de las 4 secciones:\n\nVenta:\nDentro de venta, hay 2 tablas. La de la izquiera son los productos disponibles.\nSe seleccionan esos productos, se escribe una cantidad, y se presiona \"Agregar\".\nEsto agrega productos a la derecha, la cual es la tabla de lo que se va a vender.\nAl oprimir borrar, se vacía la segunda tabla y se reinicia la pantalla.\nAl oprimir pagar, se guarda la venta y se abre la ventana de cambio.\nLa pantalla de cambio es opcional y se usa para calcular el cambio que se le da al comprador. \n\nInventarios: \nEn inventarios, hay una tabla con todos los productos que existen.\nAquí, se pueden agregar nuevos productos, borrar productos y agregar inventario.\nPara agregar un producto, se llenan todos los datos que se piden.\nPara eliminar, se selecciona el producto y se oprime el botón de eliminar.\nPara agregar inventario, se selecciona el producto y se oprime el botón de agregar.\n*Ya que la base de datos puede tardar en actualizarse, hay un botón de refrescar.\n\nEmpleados:\nEn empleados, hay una tabla con todos los que tienen acceso al sistema.\nAquí, se puede meter nueva gente, quitarla o cambiar los sueldos.\nPara un nuevo empleado, se escribe toda su información y se guarda.\nPara borrar, se selecciona el empleado y se oprime borrar..\nPara cambiar su sueldo, se selecciona el empleado y se oprime el botón.\n*Ya que la base de datos puede tardar en actualizarse, hay un botón de refrescar.\n\nResumen:\nEn la pantalla de resumen, hay una tabla con todas las ventas.\nSe seleccionan las ventas que el usuario quiera para encontrar el total de ingresos.");
        jScrollPane1.setViewportView(jTextArea1);

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                        .addComponent(botonRegresar)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Regresa al menú principal
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    // Inicializa la ventana al entrar
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
            java.util.logging.Logger.getLogger(TextoAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextoAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextoAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextoAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextoAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
