/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extratuitioncenter;

import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hussain
 */
public class RecordOfStudentGUI extends javax.swing.JFrame {

    DefaultTableModel mdl = new DefaultTableModel();
    Connection connctn = null;
    ResultSet rslt = null;
    PreparedStatement preState = null;
    public static String LogInValue="";

    /**
     * Creates new form RecordOfStudentGUI
     * @throws java.sql.SQLException
     * formal integration of data took place( not necessary)
     */
    public RecordOfStudentGUI() throws SQLException {
        initComponents();
        Object columns[] = {"StudentID", "StudentName", "Gender", "DateOfBirth", "Address", "EmergencyContactNo", "OrderedBook"};
        mdl.setColumnIdentifiers(columns);
        studentRecordTable.setModel(mdl);
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentRecordTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(144, 123, 242));

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        backBtn.setText("<Previous Page");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        studentRecordTable.setBackground(java.awt.Color.lightGray);
        studentRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(studentRecordTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        MainMenuStudentGUI ss= new MainMenuStudentGUI();
         ss.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ss.setSize(800, 600);
                ss.setLocationRelativeTo(null);
                ss.setVisible(true);
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new RecordOfStudentGUI().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(RecordOfStudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    public void setLogInValue(String newValue)
    {
       LogInValue=newValue;
    }
    

    private void loadData() throws SQLException {
        //String url = "jdbc:sqlite:G:\\Softwares\\SQL lite\\sqlitestudio-3.1.0\\SQLiteStudio\\extraTuitionCentre";
        // create a connctn to the database
       
       String url = "jdbc:sqlite:extraTuitionCentre";
        connctn = DriverManager.getConnection(url);

        
        
        String sql = "Select StudentID,StudentName, Gender, DateOfBirth, Address, EmergencyContactNo, OrderedBook from STUDENT where StudentID='" + LogInValue + "'";
        try {
            preState = connctn.prepareStatement(sql);
            rslt = preState.executeQuery();
            Object[] columnData = new Object[7];
            while (rslt.next()) {
                columnData[0] = rslt.getString("StudentID");
                columnData[1] = rslt.getString("StudentName");
                columnData[2] = rslt.getString("Gender");
                columnData[3] = rslt.getString("DateOfBirth");
                columnData[4] = rslt.getString("Address");
                columnData[5] = rslt.getString("EmergencyContactNo");
                columnData[6] = rslt.getString("OrderedBook");
                
                mdl.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentRecordTable;
    // End of variables declaration//GEN-END:variables
}
