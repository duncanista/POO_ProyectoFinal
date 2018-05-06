package interfaz;

import javax.swing.JOptionPane;

// Clase que modifica el sueldo de un empleado determinado
public class CambiarSueldo extends javax.swing.JFrame {
    public int id;
    // Constructor necesario, pero no se utiliza, se menciona por Default en
    // alguna tabla
    public CambiarSueldo() {
        initComponents();
    }
    // Constructor, al obtener el ID
    public CambiarSueldo(int id){
        this.id = id;
        initComponents();
    }
    
    // Método que le ingresa el nuevo sueldo al empleado, utiliza las complejas
    // clases para subirlo al servidor
    private void setSueldo(int id, double sueldo) {
        Users comando = new Users();
        comando.update(id, sueldo);
    }

    // Código de interfaz
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelSueldo = new javax.swing.JLabel();
        jTextFieldSueldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelSueldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSueldo.setText("Nuevo sueldo: $");

        jTextFieldSueldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSueldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSueldo)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSueldo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Evento, que al ser accionado, toma el sueldo nuevo a modificar, y activa
    // el método previamente mostrado
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        try{
            double sueldo = Double.parseDouble(jTextFieldSueldo.getText());
            if (sueldo <= 0){
                throw new NumberFormatException();
            }
            setSueldo(id, sueldo);

            new VerEmpleados().setVisible(true);
            this.dispose();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Tiene que ser un número mayor a 0.");
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    // Evento que al ser clicado nos regresa a la ventana anterior.
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        new VerEmpleados().setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSueldoActionPerformed

    // Código que se activa al entrar a la ventana
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
            java.util.logging.Logger.getLogger(CambiarSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarSueldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JTextField jTextFieldSueldo;
    // End of variables declaration//GEN-END:variables


}
