/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package el_merendero;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author piffy
 */
public class FrameOrdine extends JFrame {
    
    String Merende[] = {"Cotoletta","Forno","Salsiccia","Hotdog"};
    JComboBox combo = new JComboBox(Merende);
    JLabel lblTitolo = new JLabel("Seleziona la merenda da ordinare");
    GridLayout GridL = new GridLayout(15,5,5,5);
    
    FrameOrdine () {
        
        super("Organizza il tuo ordine !");
        setLayout(GridL);

        add(lblTitolo);
        add(combo);
        
    }
    
  public static void main(String[] args) {
      
        FrameOrdine fr=new FrameOrdine();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(800, 600);
        fr.setVisible(true);
    } 
}
