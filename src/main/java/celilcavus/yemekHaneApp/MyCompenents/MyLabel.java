/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celilcavus.yemekHaneApp.MyCompenents;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Celil
 */
//@JavaBean(defaultProperty defaultProperty= "UI",description = "My Label by celil cavus")
public class MyLabel extends JLabel {
    public MyLabel(){
        Font f = new Font("Tahoma", 0, 22);
        this.setFont(f);
        this.setForeground(Color.black);
        this.setBackground(Color.white);
        
    }
    
}
