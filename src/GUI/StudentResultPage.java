/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author dewashish painkra
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String rollNo)
    {
        initComponents();
        jTextField1.setText((rollNo));
        jTextField1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jTextField1.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jTextField2.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, 30));

        jTextField3.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 110, 30));

        jTextField4.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 110, 30));

        jTextField5.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 110, 30));

        jTextField6.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 110, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Subjects");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Total Marks");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Passing Marks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Mark Obtained");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Physics");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Maths");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Chemistry");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Electrical");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Biology");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jTextField7.setBackground(new java.awt.Color(153, 255, 255));
        jTextField7.setText("100");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 422, 100, 30));

        jTextField8.setBackground(new java.awt.Color(153, 255, 255));
        jTextField8.setText("100");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 262, 100, 30));

        jTextField9.setBackground(new java.awt.Color(153, 255, 255));
        jTextField9.setText("100");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 302, 100, 30));

        jTextField10.setBackground(new java.awt.Color(153, 255, 255));
        jTextField10.setText("100");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 342, 100, 30));

        jTextField11.setBackground(new java.awt.Color(153, 255, 255));
        jTextField11.setText("100");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 382, 100, 30));

        jTextField12.setBackground(new java.awt.Color(153, 255, 255));
        jTextField12.setText("33");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 422, 100, 30));

        jTextField13.setBackground(new java.awt.Color(153, 255, 255));
        jTextField13.setText("33");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 262, 100, 30));

        jTextField14.setBackground(new java.awt.Color(153, 255, 255));
        jTextField14.setText("33");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 302, 100, 30));

        jTextField15.setBackground(new java.awt.Color(153, 255, 255));
        jTextField15.setText("33");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 100, 30));

        jTextField16.setBackground(new java.awt.Color(153, 255, 255));
        jTextField16.setText("33");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 382, 100, 30));

        jTextField17.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 262, 100, 30));

        jTextField18.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 302, 100, 30));

        jTextField19.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 342, 100, 30));

        jTextField20.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 382, 100, 30));

        jTextField21.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 422, 100, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Total Marks");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        jTextField22.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 120, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Result");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jTextField23.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 100, 30));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons_ResultManagement/icons8-logout-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        jLabel18.setBackground(new java.awt.Color(153, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons_ResultManagement/schoolPic2.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:.
        String rollNo=jTextField1.getText();
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student join result where student.rollno='"+rollNo+"' and result.rollno='"+rollNo+"'");
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null,"Entered Roll no doesn't exist");
            }
            else
            {
                jTextField2.setText(rs.getString(1));   // name
                jTextField2.setEditable(false);
                jTextField3.setText(rs.getString(3));    // gender
                jTextField3.setEditable(false);
                jTextField4.setText(rs.getString(5));  //  course
                jTextField4.setEditable(false);
                jTextField5.setText(rs.getString(4));    //fathername
                jTextField5.setEditable(false);
                jTextField6.setText(rs.getString(6));   //branch
                jTextField6.setEditable(false);
                
                jTextField17.setText(rs.getString(8));   // physics
                jTextField17.setEditable(false);
                jTextField18.setText(rs.getString(9));   // maths
                jTextField18.setEditable(false);
                jTextField19.setText(rs.getString(10));  // chemistry
                jTextField19.setEditable(false);
                jTextField20.setText(rs.getString(11));  // electrical 
                jTextField20.setEditable(false);
                jTextField21.setText(rs.getString(12));    // biology
                jTextField21.setEditable(false);
                
                jTextField22.setText(rs.getString(13));    // total
                jTextField22.setEditable(false);
                
                // 7 to 16
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
                jTextField10.setEditable(false);
                jTextField11.setEditable(false);
                jTextField12.setEditable(false);
                jTextField13.setEditable(false);
                jTextField14.setEditable(false);
                jTextField15.setEditable(false);
                jTextField16.setEditable(false);
                
                
                
                int physicsMarks=Integer.parseInt(rs.getString(8));
                int mathsMarks=Integer.parseInt(rs.getString(9));
                int chemMarks=Integer.parseInt(rs.getString(10));
                int elecMarks=Integer.parseInt(rs.getString(11));
                int bioMarks=Integer.parseInt(rs.getString(12));
                
                // for result 
                if(physicsMarks>=33 && mathsMarks>=33 && chemMarks>=33 && elecMarks>=33 && bioMarks>=33 )
                {
                    jTextField23.setText("PASS");
                }
                else
                {
                    jTextField23.setText("FAIL");
                }
                jTextField23.setEditable(false);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int response=JOptionPane.showConfirmDialog(null,"you want to exit","submit",JOptionPane.YES_NO_OPTION);
        if(response==0)
        {
            setVisible(false);
            Student frame=new Student();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}