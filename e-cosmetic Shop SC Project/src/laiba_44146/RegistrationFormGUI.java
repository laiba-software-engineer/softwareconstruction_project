package laiba_44146;

import laiba_44146.RegistrationForm;
import laiba_44146.RegistrationFormFile;
import laiba_44146.RegistrationFormFileImpl;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


	public class RegistrationFormGUI extends javax.swing.JFrame {

	    public RegistrationFormGUI() {
	        initComponents();
	        ImageIcon img = new ImageIcon("src/media/images(15).jpg");
	       this.setIconImage(img.getImage());
	    }
	    public void setData(){
	    	RegistrationForm sfb = new RegistrationForm();
	    	RegistrationFormFile sfd = new RegistrationFormFileImpl();
	        String username = txtCustomerUsername.getText();
	        String address = txtAddress.getText();
	        String password = txtSetPassword.getText();
	        String gender = cbGender.getSelectedItem().toString();
	        String contactNo = txtPhoneNo.getText();
	        sfb.setUsername(username);
	        sfb.setAddress(address);
	        sfb.setPassword(password);
	        sfb.setGender(gender);
	        sfb.setPhoneNo(contactNo);
	        sfd.newUserDetails(sfb);
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        lblCustomerUsername = new javax.swing.JLabel();
	        txtCustomerUsername = new javax.swing.JTextField();
	        jLabel9 = new javax.swing.JLabel();
	        txtAddress = new javax.swing.JTextField();
	        jLabel10 = new javax.swing.JLabel();
	        txtSetPassword = new javax.swing.JTextField();
	        jLabel12 = new javax.swing.JLabel();
	        cbGender = new javax.swing.JComboBox<>();
	        jLabel13 = new javax.swing.JLabel();
	        txtPhoneNo = new javax.swing.JTextField();
	        btnRegister = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        lblBgImg = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Sign Up");
	        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

	        lblCustomerUsername.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblCustomerUsername.setForeground(new java.awt.Color(255, 255, 255));
	        lblCustomerUsername.setText("userName:");
	        getContentPane().add(lblCustomerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, 30));

	        txtCustomerUsername.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtCustomerUsernameActionPerformed(evt);
	            }
	        });
	        getContentPane().add(txtCustomerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 160, -1));

	        jLabel9.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel9.setText("Address:");
	        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 30));
	        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 160, -1));

	        jLabel10.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel10.setText("Prefered password:");
	        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, 30));
	        getContentPane().add(txtSetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 160, -1));

	        jLabel12.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel12.setText("Gender:");
	        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

	        cbGender.setBackground(new java.awt.Color(211, 27, 27,80));
	        cbGender.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
	        cbGender.setForeground(new java.awt.Color(255, 255, 255));
	        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
	        cbGender.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                cbGenderActionPerformed(evt);
	            }
	        });
	        getContentPane().add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

	        jLabel13.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel13.setText("phone no.:");
	        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 100, 30));
	        getContentPane().add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, -1));

	        btnRegister.setBackground(new java.awt.Color(197, 14, 14));
	        btnRegister.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
	        btnRegister.setText("Submit");
	        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                btnRegisterMouseClicked(evt);
	            }
	        });
	        btnRegister.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnRegisterActionPerformed(evt);
	            }
	        });
	        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

	        jPanel1.setBackground(new java.awt.Color(0, 0, 0,90));

	        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel1.setText("SIGN UP FORM");
	        jPanel1.add(jLabel1);

	        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 530, 480));

	        lblBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images(15).jpg"))); // NOI18N
	        getContentPane().add(lblBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 610));

	        setSize(new java.awt.Dimension(1086, 650));
	        setLocationRelativeTo(null);
	    }// </editor-fold>//GEN-END:initComponents

	    private void txtCustomerUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerUsernameActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_txtCustomerUsernameActionPerformed

	    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_cbGenderActionPerformed

	    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
	        // TODO add your handling code here:
	        if(!"".equals(txtCustomerUsername.getText()) && !"".equals(txtAddress.getText()) && !"".equals(txtPhoneNo.getText()) && !"".equals(txtSetPassword.getText()) ){
	            setData();
	            JOptionPane.showMessageDialog(this, "Request Submitted Successfully.... \r\nYour account will be registered soon.");
	            System.exit(1);
	        }
	        else{
	            JOptionPane.showMessageDialog(this, "Please Fill all fields.");
	        }
	        
	        //If the user selects Yes then the Window closes.
	        
	        
	    }//GEN-LAST:event_btnRegisterMouseClicked

	    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
	        // TODO add your handling code here:

	    }//GEN-LAST:event_btnRegisterActionPerformed

	    
	    public static void main(String args[]) {
	      
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(RegistrationFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(RegistrationFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(RegistrationFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(RegistrationFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new RegistrationFormGUI().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton btnRegister;
	    private javax.swing.JComboBox<String> cbGender;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel13;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JLabel lblBgImg;
	    private javax.swing.JLabel lblCustomerUsername;
	    private javax.swing.JTextField txtAddress;
	    private javax.swing.JTextField txtCustomerUsername;
	    private javax.swing.JTextField txtPhoneNo;
	    private javax.swing.JTextField txtSetPassword;
	    // End of variables declaration//GEN-END:variables
}
