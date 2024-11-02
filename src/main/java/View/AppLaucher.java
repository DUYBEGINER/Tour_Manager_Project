package View;

import javax.swing.*;

public class AppLaucher {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                try {
//                    // Thiết lập Look and Feel là Nimbus
//                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                new LOGIN_UI().setVisible(true);
            }
        });
    }
}
