/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View_Custom_pannel;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Round_Rect_Button_Logo extends javax.swing.JPanel {

    /**
     * Creates new form Round_Rect_Button_Logo
     */
    public Round_Rect_Button_Logo() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(204, 61));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 20);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order.png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(32, 32));
        add(Logo);

        Label.setFont(new java.awt.Font("Open Sans SemiBold", 1, 18)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Label.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(Label);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        this.setBackground(Color.decode(Color_hover));
        repaint();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(Color.decode(Color_default));
        repaint();
    }//GEN-LAST:event_formMouseExited

     private String Color_default = "#1F41BB";
    private String Color_hover = "#0456ce";
    
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(this.getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintChildren(grphcs);
    }

    public JLabel getjLabel1() {
        return Label;
    }

    public void setLogo(ImageIcon logo) {
        Logo.setIcon(logo);
    }

    public void setColorDefault(String color1) {
        Color_default = color1;
    }

    public void setColorHover(String color1) {
        Color_hover = color1;
    }
    public void setLabel(String label) {
        this.Label.setText(label);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Logo;
    // End of variables declaration//GEN-END:variables
}
