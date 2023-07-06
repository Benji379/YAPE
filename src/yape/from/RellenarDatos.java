package yape.from;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import yape.dao.FechaHora;
import yape.dao.dao;

/**
 *
 * @author Benji
 */
public class RellenarDatos extends javax.swing.JFrame {

    public static String nombre;
    public static double monto;
    public static int celular;
    public static String destino;
    public static String fecha;

    public RellenarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/yape/img/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rellenar");
        setBackground(new java.awt.Color(204, 51, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtCelular.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, -1));

        txtMonto.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, -1));

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Celular");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres y Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtDestino.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yape", "Plim" }));
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        btnProcesar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

        if (!txtCelular.getText().equals("") && !txtMonto.getText().equals("") && !txtNombre.getText().equals("")) {
            if (txtCelular.getText().length() == 9 && Double.parseDouble(txtMonto.getText()) <= 500) {
                try {
                    nombre = txtNombre.getText();
                    monto = Double.parseDouble(txtMonto.getText());
                    destino = (String) txtDestino.getSelectedItem();
                    celular = Integer.parseInt(txtCelular.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Monto inválido", "Error", JOptionPane.ERROR);
                }
                String dia, mes, año, hora;
                año = String.valueOf(FechaHora.getAño());
                dia = String.valueOf(FechaHora.getDia());
                hora = FechaHora.getHora();
                mes = FechaHora.getDiaSemana();
                fecha = dia + " " + mes + ". " + año + " - " + hora;
                principal abrir = new principal();
                abrir.setVisible(true);
                this.hide();
            } else {
                if (txtCelular.getText().length() != 9) {
                    JOptionPane.showMessageDialog(null, "Complete la cantidad de digitos", "Error", JOptionPane.ERROR_MESSAGE);
                }

                if (Double.parseDouble(txtMonto.getText()) > 500) {
                    JOptionPane.showMessageDialog(null, "Monto Mayor a 500", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        dao.limitacionNumeros(txtMonto, evt, 6);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        dao.limitacionNumeros(txtCelular, evt, 9);
    }//GEN-LAST:event_txtCelularKeyTyped

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RellenarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RellenarDatos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JComboBox<String> txtDestino;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
