
package university_admin_login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;

public class CreateAdmin extends javax.swing.JFrame {

    public CreateAdmin() {
        
        initComponents();
    }
 public void initComponent(){
 
 
 ImageIcon i = new ImageIcon(new ImageIcon("src/images2/i7.png").getImage().getScaledInstance(background.getWidth(),background.getHeight(),Image.SCALE_DEFAULT));
           background.setIcon(i);
 
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        userPassword = new javax.swing.JPasswordField();
        loginButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Login Page");
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 200,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        jLabel1.setText("User Password:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 200, 250, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel2.setText("Signin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        jLabel3.setText("User Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, -1));

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/sho.png"))); // NOI18N
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, 40));

        userName.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 89, 210, 40));

        userPassword.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        userPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userPassword.setEchoChar('x');
        jPanel1.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 220, 40));

        loginButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/signin.png"))); // NOI18N
        loginButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 70));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        jLabel5.setText("User Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, -1));

        userEmail.setFont(new java.awt.Font("Harrington", 1, 30)); // NOI18N
        jPanel1.add(userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 470, 330));

        jPanel2.setBackground(new java.awt.Color(0, 20, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/university Logo3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 770));

        background.setBackground(new java.awt.Color(203, 190, 153));
        background.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 290, 280));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/cap.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 530, 440));

        setSize(new java.awt.Dimension(1044, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        
        
        if (userName.getText().equals("Admin") && userPassword.getText().equals("5588")&&userEmail.getText().equals("ad@gmail.com")) {
       
            //JOptionPane.showMessageDialog(rootPane, "You Data Inserted");
            AdminLoginPage lg = new AdminLoginPage();
            lg.setVisible(true);
 
            setVisible(false);
            dispose();
                    
        }else{
            
        userName.setText("Wrong Information");
        userName.setForeground(Color.red);
        userName.setFont(new Font("Arial",Font.BOLD,20));
            
        }
       
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
  
        
    }//GEN-LAST:event_loginButtonActionPerformed

    public static void main(String args[]) {

    CreateAdmin sc =new CreateAdmin();
            sc.setVisible(true);
            ImageIcon i = new ImageIcon(new ImageIcon("src/images2/i7.png").getImage().getScaledInstance(sc.background.getWidth(), sc.background.getHeight(),Image.SCALE_DEFAULT));
            sc.background.setIcon(i);
            sc.setBounds(300,100,sc.getWidth(),sc.getHeight());
            sc.setTitle("Login");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userName;
    private javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables
}
