package yape.from;

import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
import yape.dao.FechaHora;

/**
 *
 * @author Benji
 */
public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/yape/img/icono.png")));
        txtFecha.setText(RellenarDatos.fecha);
        char n1 = String.valueOf(RellenarDatos.celular).charAt(String.valueOf(RellenarDatos.celular).length() - 3);
        char n2 = String.valueOf(RellenarDatos.celular).charAt(String.valueOf(RellenarDatos.celular).length() - 2);
        char n3 = String.valueOf(RellenarDatos.celular).charAt(String.valueOf(RellenarDatos.celular).length() - 1);
        txtCelular.setText("*** *** " + n1 + n2 + n3);
        txtDestino.setText("" + RellenarDatos.destino);
        txtMonto.setText("" + RellenarDatos.monto);
        txtNombre.setText("<html><div style='text-align: center;'>" + RellenarDatos.nombre);
        Random random = new Random();
        int randomNumber = random.nextInt(100000000); // Genera un número aleatorio entre 0 y 99999999
        String codigoOperacion = String.format("%08d", randomNumber);
        txtNOperacion.setText(codigoOperacion);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jlbMoneda = new javax.swing.JLabel();
        txtMonto = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jlbOperacion = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JLabel();
        separador3 = new javax.swing.JLabel();
        separador4 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnCompartir = new javax.swing.JButton();
        jlbDiseño = new javax.swing.JLabel();
        txtNOperacion = new javax.swing.JLabel();
        txtDestino = new javax.swing.JLabel();
        txtCelular = new javax.swing.JLabel();
        jlbCelular1 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        fondoPanel = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yape");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.setBackground(new java.awt.Color(255, 0, 0));
        Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/serpentina.png"))); // NOI18N
        Pantalla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 240));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Yapeo");
        Pantalla.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Compartir");
        Pantalla.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 80, 30));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        Pantalla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jlbTitulo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(119, 38, 138));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("¡Yapeaste!");
        Pantalla.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 50));

        jlbMoneda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbMoneda.setForeground(new java.awt.Color(180, 177, 195));
        jlbMoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMoneda.setText("S/");
        Pantalla.add(jlbMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 40, 40));

        txtMonto.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(119, 38, 138));
        txtMonto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMonto.setText("0.00");
        Pantalla.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, 40));

        txtFecha.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(209, 210, 212));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("00 mes. 0000 - 88:88 pm");
        Pantalla.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 220, -1));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(17, 25, 39));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("name ape1 ape2");
        txtNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Pantalla.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 220, 50));

        jlbOperacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlbOperacion.setForeground(new java.awt.Color(209, 210, 212));
        jlbOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbOperacion.setText("N° de operacion:");
        Pantalla.add(jlbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 80, 20));

        separador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/separador.png"))); // NOI18N
        Pantalla.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 200, 20));

        separador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/separador.png"))); // NOI18N
        Pantalla.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 200, 20));

        separador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/separador.png"))); // NOI18N
        Pantalla.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 200, 10));

        separador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/separador.png"))); // NOI18N
        Pantalla.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 200, 10));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/btnEnviar.png"))); // NOI18N
        btnEnviar.setBorder(null);
        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        Pantalla.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 40, 40));

        btnCompartir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/btnCompartir.png"))); // NOI18N
        btnCompartir.setBorder(null);
        btnCompartir.setBorderPainted(false);
        btnCompartir.setContentAreaFilled(false);
        btnCompartir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompartirActionPerformed(evt);
            }
        });
        Pantalla.add(btnCompartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 40, 40));

        jlbDiseño.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlbDiseño.setForeground(new java.awt.Color(209, 210, 212));
        jlbDiseño.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbDiseño.setText("Destino:");
        Pantalla.add(jlbDiseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 80, 30));

        txtNOperacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNOperacion.setForeground(new java.awt.Color(17, 25, 39));
        txtNOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNOperacion.setText("11111111");
        Pantalla.add(txtNOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 80, 30));

        txtDestino.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(17, 25, 39));
        txtDestino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDestino.setText("Yape");
        Pantalla.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 80, 30));

        txtCelular.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(17, 25, 39));
        txtCelular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCelular.setText("*** *** 111");
        Pantalla.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 80, 30));

        jlbCelular1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlbCelular1.setForeground(new java.awt.Color(209, 210, 212));
        jlbCelular1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCelular1.setText("N° de celular:");
        Pantalla.add(jlbCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 80, 30));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/LOGO.png"))); // NOI18N
        Pantalla.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, 70));

        fondoPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/PANEL.png"))); // NOI18N
        Pantalla.add(fondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 240, 390));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/FONDO.png"))); // NOI18N
        Pantalla.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 600));

        getContentPane().add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        RellenarDatos abrir = new RellenarDatos();
        abrir.setVisible(true);
        hide();
    }//GEN-LAST:event_btnEnviarActionPerformed
    
    private void btnCompartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompartirActionPerformed
        yape.dao.PrintYape.capturePanel(Pantalla);
    }//GEN-LAST:event_btnCompartirActionPerformed
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pantalla;
    private javax.swing.JButton btnCompartir;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoPanel;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlbCelular1;
    private javax.swing.JLabel jlbDiseño;
    private javax.swing.JLabel jlbMoneda;
    private javax.swing.JLabel jlbOperacion;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    public static javax.swing.JLabel txtCelular;
    public static javax.swing.JLabel txtDestino;
    public static javax.swing.JLabel txtFecha;
    public static javax.swing.JLabel txtMonto;
    public static javax.swing.JLabel txtNOperacion;
    public static javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
