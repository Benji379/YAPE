package yape.from;

import java.awt.Toolkit;
import java.util.Random;
import yape.dao.dao;
import javax.swing.SwingUtilities;

/**
 *
 * @author Benji
 */
public class Captura extends javax.swing.JFrame {

    public Captura() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/yape/img/icono.png")));
        txtFecha.setText(RellenarDatos.fecha);
        char n1 = String.valueOf(RellenarDatos.celular).charAt(String.valueOf(RellenarDatos.celular).length() - 3);
        char n2 = String.valueOf(RellenarDatos.celular).charAt(String.valueOf(RellenarDatos.celular).length() - 2);
        char n3 = String.valueOf(RellenarDatos.celular).charAt(String.valueOf(RellenarDatos.celular).length() - 1);
        txtCelular.setText("*** *** " + n1 + n2 + n3);
        txtDestino.setText("" + RellenarDatos.destino);
        txtMonto.setText("" + RellenarDatos.mont);
        txtNombre.setText("<html><div style='text-align: center; display: table-cell; vertical-align: middle;'>" + RellenarDatos.nombre);
        Random random = new Random();
        int randomNumber = random.nextInt(100000000); // Genera un número aleatorio entre 0 y 99999999
        String codigoOperacion = String.format("%08d", randomNumber);
        txtNOperacion.setText(codigoOperacion);
        SwingUtilities.invokeLater(() -> {
            dao.cambiarColorSeparador(jSeparator1, "#1111111");
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JLabel();
        jlbSerpentina = new javax.swing.JLabel();
        jlbNuevoYapeo = new javax.swing.JLabel();
        jlbCompartir = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jlbMoneda = new javax.swing.JLabel();
        txtMonto = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jlbOperacion = new javax.swing.JLabel();
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

        jSeparator1.setForeground(new java.awt.Color(240, 236, 236));
        Pantalla.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 180, 10));

        jSeparator2.setForeground(new java.awt.Color(240, 236, 236));
        Pantalla.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(240, 236, 236));
        Pantalla.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(240, 236, 236));
        Pantalla.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 180, 10));

        btnSalir.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        Pantalla.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jlbSerpentina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSerpentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/serpentina.png"))); // NOI18N
        Pantalla.add(jlbSerpentina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 330, 190));

        jlbNuevoYapeo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlbNuevoYapeo.setForeground(new java.awt.Color(255, 255, 255));
        jlbNuevoYapeo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNuevoYapeo.setText("Nuevo Yapeo");
        Pantalla.add(jlbNuevoYapeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 80, 30));

        jlbCompartir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlbCompartir.setForeground(new java.awt.Color(255, 255, 255));
        jlbCompartir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCompartir.setText("Compartir");
        Pantalla.add(jlbCompartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 80, 30));

        jlbTitulo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(119, 38, 138));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("¡Yapeaste!");
        Pantalla.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, 50));

        jlbMoneda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbMoneda.setForeground(new java.awt.Color(180, 177, 195));
        jlbMoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMoneda.setText("S/");
        Pantalla.add(jlbMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 40, 40));

        txtMonto.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(119, 38, 138));
        txtMonto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMonto.setText("0.00");
        Pantalla.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 160, 40));

        txtFecha.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(83, 87, 94));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("00 mes. 0000 - 88:88 pm");
        Pantalla.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 220, 20));

        txtNombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(39, 48, 64));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("name ape1 ape2");
        txtNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Pantalla.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 180, 40));

        jlbOperacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlbOperacion.setForeground(new java.awt.Color(156, 156, 157));
        jlbOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbOperacion.setText("N° de operacion:");
        Pantalla.add(jlbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 425, 80, 20));

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
        Pantalla.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 40, 40));

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
        Pantalla.add(btnCompartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 40, 40));

        jlbDiseño.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlbDiseño.setForeground(new java.awt.Color(156, 156, 157));
        jlbDiseño.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbDiseño.setText("Destino:");
        Pantalla.add(jlbDiseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 80, 30));

        txtNOperacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNOperacion.setForeground(new java.awt.Color(17, 25, 39));
        txtNOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNOperacion.setText("11111111");
        Pantalla.add(txtNOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 80, 30));

        txtDestino.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(17, 25, 39));
        txtDestino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDestino.setText("Yape");
        Pantalla.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 80, 30));

        txtCelular.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(17, 25, 39));
        txtCelular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCelular.setText("*** *** 111");
        Pantalla.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 80, 30));

        jlbCelular1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlbCelular1.setForeground(new java.awt.Color(156, 156, 157));
        jlbCelular1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCelular1.setText("N° de celular:");
        Pantalla.add(jlbCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 80, 30));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/LOGO.png"))); // NOI18N
        Pantalla.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, 70));

        fondoPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/PANEL.png"))); // NOI18N
        Pantalla.add(fondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 390));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yape/img/FONDO.png"))); // NOI18N
        Pantalla.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        getContentPane().add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

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

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked
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
            java.util.logging.Logger.getLogger(Captura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Captura().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pantalla;
    private javax.swing.JButton btnCompartir;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoPanel;
    private javax.swing.JLabel icono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlbCelular1;
    private javax.swing.JLabel jlbCompartir;
    private javax.swing.JLabel jlbDiseño;
    private javax.swing.JLabel jlbMoneda;
    private javax.swing.JLabel jlbNuevoYapeo;
    private javax.swing.JLabel jlbOperacion;
    private javax.swing.JLabel jlbSerpentina;
    private javax.swing.JLabel jlbTitulo;
    public static javax.swing.JLabel txtCelular;
    public static javax.swing.JLabel txtDestino;
    public static javax.swing.JLabel txtFecha;
    public static javax.swing.JLabel txtMonto;
    public static javax.swing.JLabel txtNOperacion;
    public static javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
