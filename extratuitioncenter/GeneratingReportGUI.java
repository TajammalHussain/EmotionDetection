/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extratuitioncenter;

import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hussain
 */
public class GeneratingReportGUI extends javax.swing.JFrame {

    DefaultTableModel mdl = new DefaultTableModel();
    Connection connct = null;
    ResultSet rslt = null;
    PreparedStatement statte = null;
    ResultSet rslttl = null;
    PreparedStatement preState = null;

    /**
     * Creates new form ReportGeneratingGui
     *
     * @throws java.sql.SQLException
     */
    public GeneratingReportGUI() throws SQLException {
        initComponents();
        //stdID.setEnabled(false);
        bookedLessonsBtn.setEnabled(false);
        lessonAMCBtn.setEnabled(false);
        oRBooks.setEnabled(false);
        printBtn.setEnabled(false);

        reportTable.setModel(mdl);

        getConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bookedLessonsBtn = new javax.swing.JButton();
        lessonAMCBtn = new javax.swing.JButton();
        oRBooks = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        printBtn = new javax.swing.JButton();
        stdID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(144, 123, 242));

        bookedLessonsBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bookedLessonsBtn.setText("Booked Lessons");
        bookedLessonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookedLessonsBtnActionPerformed(evt);
            }
        });

        lessonAMCBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lessonAMCBtn.setText("Lesson Attended/Missed/Canceled");
        lessonAMCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonAMCBtnActionPerformed(evt);
            }
        });

        oRBooks.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        oRBooks.setText("Oredered/Recommended Books");
        oRBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oRBooksActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton4.setText("<Previous Page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        reportTable.setBackground(java.awt.Color.lightGray);
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(reportTable);

        printBtn.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("ID of Student:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Choose Month:");

        monthComboBox.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Selected", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(stdID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bookedLessonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lessonAMCBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(oRBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookedLessonsBtn)
                    .addComponent(lessonAMCBtn)
                    .addComponent(oRBooks))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(printBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookedLessonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookedLessonsBtnActionPerformed
        // TODO add your handling code here:

        Object columns[] = {"LessonID", "TeacherID", "StudentID", "LessonSubject", "LessonStatus", "LessonDate", "LessonTime", "RoomNo"};
        mdl.setColumnIdentifiers(columns);
        mdl.setRowCount(0);
        String sql = "Select LessonID,TeacherID,StudentID ,LessonSubject,LessonStatus,LessonDate,LessonTime,RoomNo from LESSON where LessonStatus = 'Booked' AND StudentID='" + stdID.getText() + "'";
        try {
            statte = connct.prepareStatement(sql);
            rslt = statte.executeQuery();
            Object[] columnData = new Object[8];
            while (rslt.next()) {
                columnData[0] = rslt.getString("LessonID");
                columnData[1] = rslt.getString("TeacherID");
                columnData[2] = rslt.getString("StudentID");
                columnData[3] = rslt.getString("LessonSubject");
                columnData[4] = rslt.getString("LessonStatus");
                columnData[5] = rslt.getString("LessonDate");
                columnData[6] = rslt.getString("LessonTime");
                columnData[7] = rslt.getString("RoomNo");

                mdl.addRow(columnData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GeneratingReportGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bookedLessonsBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MainMenuTeacherGUI s = new MainMenuTeacherGUI();
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setSize(800, 600);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
        if (monthComboBox.getSelectedItem() != "Not Selected") {

            bookedLessonsBtn.setEnabled(true);
            lessonAMCBtn.setEnabled(true);
            oRBooks.setEnabled(true);
            printBtn.setEnabled(true);
        } else {

            bookedLessonsBtn.setEnabled(false);
            lessonAMCBtn.setEnabled(false);
            oRBooks.setEnabled(false);
            printBtn.setEnabled(false);

        }
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("The Student has Booked the Lesson:'" + stdID.getText() + "'");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            reportTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }

    }//GEN-LAST:event_printBtnActionPerformed

    private void lessonAMCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonAMCBtnActionPerformed
        // TODO add your handling code here:
        Object columns[] = {"LessonID", "TeacherID", "StudentID", "Subject", "LessonDate", "LessonTime", "AttendanceStatus"};
        mdl.setColumnIdentifiers(columns);
        mdl.setRowCount(0);

        String sql1 = "Select LessonID,TeacherID,StudentID ,Subject,LessonDate,LessonTime,AttendanceStatus from LESSONPROGRESS where ( AttendanceStatus = 'Canceled' OR AttendanceStatus = 'Missed' OR AttendanceStatus = 'Attended') AND StudentID='" + stdID.getText() + "'";
        try {
            statte = connct.prepareStatement(sql1);
            rslt = statte.executeQuery();
            Object[] columnData = new Object[7];
            while (rslt.next()) {
                columnData[0] = rslt.getString("LessonID");
                columnData[1] = rslt.getString("TeacherID");
                columnData[2] = rslt.getString("StudentID");
                columnData[3] = rslt.getString("Subject");
                columnData[4] = rslt.getString("LessonDate");
                columnData[5] = rslt.getString("LessonTime");
                columnData[6] = rslt.getString("AttendanceStatus");

                mdl.addRow(columnData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GeneratingReportGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lessonAMCBtnActionPerformed

    private void oRBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oRBooksActionPerformed
        // TODO add your handling code here:
        Object columns[] = {"StudentID", "StudentName", "Address", "OrderedBook", "RecommendedBook"};
        mdl.setColumnIdentifiers(columns);
        mdl.setRowCount(0);

        String sql1 = "Select Student.StudentID,Student.StudentName,Student.Address ,Student.OrderedBook, Book.BookName as RecommendedBook \n"
                + "FROM BOOK\n"
                + "\n"
                + "INNER JOIN Student ON BOOK.StudentID=Student.StudentID WHERE Student.StudentID='"+stdID.getText()+"'";
         try {
            statte = connct.prepareStatement(sql1);
            rslt = statte.executeQuery();
            Object[] columnData = new Object[5];
            while (rslt.next()) {
                columnData[0] = rslt.getString("StudentID");
                columnData[1] = rslt.getString("StudentName");
                columnData[2] = rslt.getString("Address");
                columnData[3] = rslt.getString("OrderedBook");
                columnData[4] = rslt.getString("RecommendedBook");

                mdl.addRow(columnData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GeneratingReportGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_oRBooksActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneratingReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratingReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratingReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratingReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GeneratingReportGUI().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(GeneratingReportGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void getConnect() throws SQLException {
        String url = "jdbc:sqlite:extraTuitionCentre";

        connct = DriverManager.getConnection(url);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookedLessonsBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lessonAMCBtn;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JButton oRBooks;
    private javax.swing.JButton printBtn;
    private javax.swing.JTable reportTable;
    private javax.swing.JTextField stdID;
    // End of variables declaration//GEN-END:variables
}
