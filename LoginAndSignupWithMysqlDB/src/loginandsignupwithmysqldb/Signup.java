
package loginandsignupwithmysqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;


public class Signup extends javax.swing.JFrame {

        public Signup() {
                setTitle("SignUp Form");
                initComponents();
        }

        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                nameField = new javax.swing.JTextField();
                loginbtn = new javax.swing.JButton();
                signupbtn = new javax.swing.JButton();
                addressField = new javax.swing.JTextField();
                mobileNumberField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                signupPasswordField = new javax.swing.JPasswordField();
                jLabel5 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("SIGNUP");

                nameField.setBackground(new java.awt.Color(255, 255, 255));
                nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                nameField.setForeground(new java.awt.Color(0, 0, 0));
                nameField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameFieldActionPerformed(evt);
                        }
                });

                loginbtn.setBackground(new java.awt.Color(0, 102, 204));
                loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                loginbtn.setForeground(new java.awt.Color(0, 0, 0));
                loginbtn.setText("Login");
                loginbtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                loginbtnActionPerformed(evt);
                        }
                });

                signupbtn.setBackground(new java.awt.Color(51, 204, 0));
                signupbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                signupbtn.setForeground(new java.awt.Color(0, 0, 0));
                signupbtn.setText("Signup");
                signupbtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                signupbtnActionPerformed(evt);
                        }
                });

                addressField.setBackground(new java.awt.Color(255, 255, 255));
                addressField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                addressField.setForeground(new java.awt.Color(0, 0, 0));
                addressField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addressFieldActionPerformed(evt);
                        }
                });

                mobileNumberField.setBackground(new java.awt.Color(255, 255, 255));
                mobileNumberField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                mobileNumberField.setForeground(new java.awt.Color(0, 0, 0));
                mobileNumberField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mobileNumberFieldActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                jLabel2.setText("Name");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                jLabel3.setText("Address");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(0, 0, 0));
                jLabel4.setText("Mobile Number");

                signupPasswordField.setBackground(new java.awt.Color(255, 255, 255));
                signupPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                signupPasswordField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                signupPasswordFieldActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 0, 0));
                jLabel5.setText("Password");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(152, 152, 152)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(mobileNumberField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(signupPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                                                        .addComponent(jLabel3)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(251, 251, 251)
                                                                .addComponent(jLabel1))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(271, 271, 271)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9))
                                                        .addComponent(signupbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(154, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mobileNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signupPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(75, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_nameFieldActionPerformed

        private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
        }//GEN-LAST:event_loginbtnActionPerformed
        private String generateRandomID() {

//Generate random char and num combination id random
//    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//    StringBuilder idBuilder = new StringBuilder();
//    Random random = new Random();
//    for (int i = 0; i < 4; i++) {
//        int index = random.nextInt(characters.length());
//        idBuilder.append(characters.charAt(index));
//    }
//    return idBuilder.toString();


//Generate 4 numbers id random
    StringBuilder idBuilder = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < 4; i++) {
        int digit = random.nextInt(10); // Generates a random digit from 0 to 9
        idBuilder.append(digit);
    }
    return idBuilder.toString();

}

        private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
    
          String username = nameField.getText();
          String address = addressField.getText();
          String mobileNumber = mobileNumberField.getText();
          String password = new String(signupPasswordField.getPassword());

    // Generate a random 4-digit alphanumeric ID
    String id = generateRandomID();

    // JDBC connection parameters
    String url = "jdbc:mysql://localhost:3306/loginandsignupdb";
    String user = "root";
    String passwordDB = "mysqlauzor404?";

    try (Connection connection = DriverManager.getConnection(url, user, passwordDB)) {
        String query = "INSERT INTO signups (id, username, address, mobilenumber, password) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, mobileNumber);
            preparedStatement.setString(5, password);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Signup successful!");
                // You can add code here to show a success message or redirect to a new screen
            } else {
                System.out.println("Signup failed. No rows affected.");
                // You can add code here to show an error message
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error connecting to the database: " + ex.getMessage());
        // You can add code here to show an error message
    }

       

        }//GEN-LAST:event_signupbtnActionPerformed

        private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_addressFieldActionPerformed

        private void mobileNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_mobileNumberFieldActionPerformed

        private void signupPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupPasswordFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_signupPasswordFieldActionPerformed

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
                        java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Signup().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField addressField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton loginbtn;
        private javax.swing.JTextField mobileNumberField;
        private javax.swing.JTextField nameField;
        private javax.swing.JPasswordField signupPasswordField;
        private javax.swing.JButton signupbtn;
        // End of variables declaration//GEN-END:variables
}
