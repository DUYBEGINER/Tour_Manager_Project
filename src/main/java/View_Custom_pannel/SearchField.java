/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View_Custom_pannel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 *
 * @author Admin
 */
public class SearchField extends JTextField{

    private final Icon iconSearch;
    private int strokeWidth = 2;
    public SearchField(){
        setOpaque(false);
        setBorder(new EmptyBorder(10,40,10,10));
        setBackground(Color.decode("#323d4e"));
        setForeground(Color.WHITE);
        iconSearch = new ImageIcon(getClass().getResource("/search.png"));
    }



    protected void paintComponent(Graphics g){
        int s = strokeWidth;
        int width = getWidth() - (2*s);
        int height = getHeight() - (2*s);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(this.getBackground());
        g2d.fillRoundRect(s, s, width, height, height, height);
        g2d.setStroke(new BasicStroke(strokeWidth));
        g2d.setColor(Color.decode("#434d5c"));
        g2d.drawRoundRect(s, s, width, height, height, height);
        super.paintComponent(g);
//
        int marginImage = 5;
        int imageSize =  height - marginImage*2;
        Image image = ((ImageIcon) iconSearch).getImage();
        g2d.drawImage(image,s+5,s+5,imageSize,imageSize,null);
        g2d.dispose();
    }
    
}
