package interfaz;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

// Clase que nos permitirá visualizar los empleados/usuarios
public class VerEmpleados extends javax.swing.JFrame {
    // Constructor
    public VerEmpleados() {
        initComponents();
        jButtonQuitarEmpleado.setEnabled(false);
        jButtonModificarSueldo.setEnabled(false);
    
        // Modelado de la tabla
        String[] columnas = new String[]{
            "Id", "Nombre", "Puesto", "Sueldo"
        };
        // Obtención de todos los usuarios
        Users comando = new Users();
        Object[][] empleados = comando.get();
        
        // Muestreo de los usuarios en la tabla
        DefaultTableModel model = (DefaultTableModel) jTableEmpleados.getModel();
        for (int i = 0; i < empleados.length; i++) {
            model.addRow(empleados[i]);
        }
        
        jTableEmpleados.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event){
                jButtonModificarSueldo.setEnabled(true);
                jButtonQuitarEmpleado.setEnabled(true);
            }
        });

}
    // Código de la Interfaz gráfica
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jButtonNuevoEmpleado = new javax.swing.JButton();
        jButtonQuitarEmpleado = new javax.swing.JButton();
        jButtonModificarSueldo = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Empleados");

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Puesto", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);

        jButtonNuevoEmpleado.setText("Nuevo Empleado");
        jButtonNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEmpleadoActionPerformed(evt);
            }
        });

        jButtonQuitarEmpleado.setText("Quitar Empleado");
        jButtonQuitarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarEmpleadoActionPerformed(evt);
            }
        });

        jButtonModificarSueldo.setText("Modificar sueldo");
        jButtonModificarSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarSueldoActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonRefrescar.setText("Refrescar");
        jButtonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefrescarActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonQuitarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jButtonModificarSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRefrescar)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonRefrescar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuitarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Nos abre la ventana para añadir nuevo usuario
    private void jButtonNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEmpleadoActionPerformed
        new NuevoEmpleado().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNuevoEmpleadoActionPerformed
    // Al tener un usuario seleccionado, este evento nos permitirá eliminarlo
    private void jButtonQuitarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarEmpleadoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableEmpleados.getModel();
        int fila = jTableEmpleados.getSelectedRow();
        int idInt = (Integer)jTableEmpleados.getValueAt(fila, 0);
        String id = "" + idInt;
        // Creamos el objeto Users para posteriormente eliminarlo
        Users comando = new Users();
        comando.delete(id);

        // Modelación de la tabla
        model.removeRow(jTableEmpleados.getSelectedRow());
        jButtonQuitarEmpleado.setEnabled(false);
        jButtonModificarSueldo.setEnabled(false);
        // Jaja, sorry no pudimos quitar este comentario \/
        //AQUI FALTA SUBIR LA BORRADA A LA BASE DE DATOS    }//GEN-LAST:event_jButtonQuitarEmpleadoActionPerformed
    }
    // Evento que nos acciona la ventana para modificar el sueldo, envía el ID
    private void jButtonModificarSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarSueldoActionPerformed
        int fila = jTableEmpleados.getSelectedRow();
        int id = (Integer) jTableEmpleados.getValueAt(fila, 0);
        new CambiarSueldo(id).setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButtonModificarSueldoActionPerformed
    // Evento que nos regresa al menú principal al ser accionado
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed
    // Refresca la tabla, baja de nuevo la base de datos
    private void jButtonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescarActionPerformed
        this.dispose();
        new VerEmpleados().setVisible(true);
    }//GEN-LAST:event_jButtonRefrescarActionPerformed

    // Método main que inicializa el código siguiente
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
            java.util.logging.Logger.getLogger(VerEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModificarSueldo;
    private javax.swing.JButton jButtonNuevoEmpleado;
    private javax.swing.JButton jButtonQuitarEmpleado;
    private javax.swing.JButton jButtonRefrescar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    // End of variables declaration//GEN-END:variables
}
