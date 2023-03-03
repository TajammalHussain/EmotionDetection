/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extratuitioncenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Hussain
 */

public class ExtraTuitionCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        connect();
        
        LogInGUI dd=new LogInGUI();
        dd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dd.setSize(800, 600);
        dd.setLocationRelativeTo(null);
        dd.setVisible(true);

        
    }
    
}
