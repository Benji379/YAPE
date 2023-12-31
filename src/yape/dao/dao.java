package yape.dao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Benji
 */
public class dao {

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 46;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void cambiarColorSeparador(JSeparator separador, String codigoColor) {
        try {
            Color color = Color.decode(codigoColor);
            separador.setForeground(color);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
