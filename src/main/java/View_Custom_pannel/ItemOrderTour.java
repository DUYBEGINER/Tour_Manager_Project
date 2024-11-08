/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View_Custom_pannel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Admin
 */
public class ItemOrderTour extends javax.swing.JPanel {

    /**
     * Creates new form ItemOrderTour
     */
    public ItemOrderTour() {
        initComponents();
        setOpaque(false);
        this.roundRect_Blue_Button1.setLabel("Order");
        this.roundRect_Blue_Button1.setColorHover("#ff985c");
        this.roundRect_Blue_Button1.setColorDefault("#FD7323");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundRectImage2 = new View_Custom_pannel.RoundRectImage();
        jLabel1 = new javax.swing.JLabel();
        roundRect_Blue_Button1 = new View_Custom_pannel.RoundRect_Blue_Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(49, 61, 79));
        setMinimumSize(new java.awt.Dimension(290, 420));
        setPreferredSize(new java.awt.Dimension(290, 420));

        roundRectImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRANCE.jpg"))); // NOI18N
        roundRectImage2.setOpaque(false);

        javax.swing.GroupLayout roundRectImage2Layout = new javax.swing.GroupLayout(roundRectImage2);
        roundRectImage2.setLayout(roundRectImage2Layout);
        roundRectImage2Layout.setHorizontalGroup(
            roundRectImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        roundRectImage2Layout.setVerticalGroup(
            roundRectImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Open Sans SemiCondensed ExtraBo", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name of Tour");

        roundRect_Blue_Button1.setBackground(new java.awt.Color(253, 115, 35));

        jLabel2.setFont(new java.awt.Font("Open Sans SemiCondensed ExtraBo", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 145, 255));
        jLabel2.setText("$120.000");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tym_no_select.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundRectImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(roundRect_Blue_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundRectImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundRect_Blue_Button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    int tym = 0;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if(tym == 0){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tym_select.png")));
            tym = 1;
        }else{
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tym_no_select.png")));
            tym = 0;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(this.getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintChildren(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private View_Custom_pannel.RoundRectImage roundRectImage2;
    private View_Custom_pannel.RoundRect_Blue_Button roundRect_Blue_Button1;
    // End of variables declaration//GEN-END:variables
}
