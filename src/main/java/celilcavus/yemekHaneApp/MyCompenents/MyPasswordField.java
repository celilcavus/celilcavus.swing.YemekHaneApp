/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celilcavus.yemekHaneApp.MyCompenents;

import celilcavus.yemekHaneApp.MyCompenents.GUISettings.FontSettings;
import javax.swing.JPasswordField;

/**
 *
 * @author Celil
 */
public class MyPasswordField extends JPasswordField{
    public MyPasswordField()
    {
        this.setFont(new FontSettings().GetFont());
        this.setText(" ");
    }
}
