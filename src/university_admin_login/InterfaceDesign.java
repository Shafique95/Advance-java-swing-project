package university_admin_login;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class InterfaceDesign extends javax.swing.JFrame {

    public InterfaceDesign() {
        initComponents();
        //initComponent();
    }

//    public void initComponent(){
//    
//    ImageIcon  universityIcon = new ImageIcon(getClass().getResource("university Logo.png"));// this is to get icon
//            this.setIconImage(universityIcon.getImage());// To set Image Icon
//   
//               setLocationRelativeTo(null);
//    }
//    
    
    
    
    
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        SubHeading = new javax.swing.JLabel();
        CreateAccountBtn = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JPanel();
        Logout = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        LoginPaneBtn = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        ForgotPassBtn = new javax.swing.JPanel();
        ForgotPassword = new javax.swing.JButton();
        DisplayPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Manage System");
        setUndecorated(true);

        BasePanel.setBackground(new java.awt.Color(255, 255, 255));
        BasePanel.setPreferredSize(new java.awt.Dimension(1008, 277));

        SideBar.setBackground(new java.awt.Color(8, 2, 24));
        SideBar.setForeground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/university Logo2.png"))); // NOI18N
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LogoMouseReleased(evt);
            }
        });

        Heading.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("L U University");

        SubHeading.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        SubHeading.setForeground(new java.awt.Color(255, 255, 255));
        SubHeading.setText("Top University in Bangladesh");

        CreateAccountBtn.setBackground(new java.awt.Color(8, 2, 24));
        CreateAccountBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn.setBackground(new java.awt.Color(24, 14, 25));
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/button (1).png"))); // NOI18N
        btn.setBorder(null);
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMouseExited(evt);
            }
        });
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateAccountBtnLayout = new javax.swing.GroupLayout(CreateAccountBtn);
        CreateAccountBtn.setLayout(CreateAccountBtnLayout);
        CreateAccountBtnLayout.setHorizontalGroup(
            CreateAccountBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        CreateAccountBtnLayout.setVerticalGroup(
            CreateAccountBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn)
                .addContainerGap())
        );

        LogoutBtn.setBackground(new java.awt.Color(8, 2, 24));
        LogoutBtn.setToolTipText("If you click Interface will logout");
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Logout.setBackground(new java.awt.Color(24, 14, 25));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/exit button.png"))); // NOI18N
        Logout.setBorder(null);
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogoutBtnLayout = new javax.swing.GroupLayout(LogoutBtn);
        LogoutBtn.setLayout(LogoutBtnLayout);
        LogoutBtnLayout.setHorizontalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogoutBtnLayout.setVerticalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        btnAbout.setBackground(new java.awt.Color(24, 14, 25));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/btnAbout.png"))); // NOI18N
        btnAbout.setBorder(null);
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAboutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAboutMousePressed(evt);
            }
        });
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        LoginPaneBtn.setBackground(new java.awt.Color(8, 2, 24));
        LoginPaneBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginPaneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginPaneBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginPaneBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginPaneBtnMouseExited(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(24, 14, 25));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/login4.png"))); // NOI18N
        loginBtn.setBorder(null);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPaneBtnLayout = new javax.swing.GroupLayout(LoginPaneBtn);
        LoginPaneBtn.setLayout(LoginPaneBtnLayout);
        LoginPaneBtnLayout.setHorizontalGroup(
            LoginPaneBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPaneBtnLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        LoginPaneBtnLayout.setVerticalGroup(
            LoginPaneBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ForgotPassBtn.setBackground(new java.awt.Color(8, 2, 24));
        ForgotPassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ForgotPassword.setBackground(new java.awt.Color(24, 14, 25));
        ForgotPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/ForgotButton.png"))); // NOI18N
        ForgotPassword.setBorder(null);
        ForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ForgotPassBtnLayout = new javax.swing.GroupLayout(ForgotPassBtn);
        ForgotPassBtn.setLayout(ForgotPassBtnLayout);
        ForgotPassBtnLayout.setHorizontalGroup(
            ForgotPassBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPassBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ForgotPassBtnLayout.setVerticalGroup(
            ForgotPassBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPassBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ForgotPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logo)
                            .addComponent(Heading)
                            .addComponent(SubHeading)
                            .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginPaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ForgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addGap(2, 2, 2)
                .addComponent(Heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubHeading)
                .addGap(18, 18, 18)
                .addComponent(CreateAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(LoginPaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ForgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DisplayPanel.setBackground(new java.awt.Color(39, 227, 218));
        DisplayPanel.setPreferredSize(new java.awt.Dimension(751, 768));

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addComponent(DisplayPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1006, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseEntered
        JPanel btn = CreateAccountBtn;
        isEnter(btn);
    }//GEN-LAST:event_btnMouseEntered

    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked

       RegistrationDashboard rgd = new RegistrationDashboard();
        DisplayPanel.add(rgd);
        rgd.show();
//       
//        //setVisible(false);
//        //dispose();
    }//GEN-LAST:event_btnMouseClicked

    private void btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseExited
        JPanel btn = CreateAccountBtn;
        isExit(btn);
    }//GEN-LAST:event_btnMouseExited

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed

        System.exit(0);
    }//GEN-LAST:event_LogoutActionPerformed

    private void ForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseEntered
       JPanel btn = ForgotPassBtn;
        isEnter(btn);
    }//GEN-LAST:event_ForgotPasswordMouseEntered

    private void ForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseClicked
        
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
        setVisible(false);
         dispose();
    }//GEN-LAST:event_ForgotPasswordMouseClicked

    private void ForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseExited
        JPanel btn = ForgotPassBtn;
        isExit(btn);
    }//GEN-LAST:event_ForgotPasswordMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
       JPanel btn = LogoutBtn;
        isEnter(btn);
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        System.exit(0);
    }//GEN-LAST:event_LogoutMousePressed

    private void LogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseEntered
       JPanel btn = SideBar;
        isExit(btn);
        
    }//GEN-LAST:event_LogoMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        JPanel btn = LogoutBtn;
        isExit(btn);
    }//GEN-LAST:event_LogoutMouseExited

    private void LogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMousePressed
       this.Logo.setBounds(0,0,Logo.getWidth(),Logo.getHeight());
    }//GEN-LAST:event_LogoMousePressed

    private void LogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseReleased
       this.Logo.setBounds(20,20,Logo.getWidth(),Logo.getHeight());
    }//GEN-LAST:event_LogoMouseReleased

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutMouseClicked

    private void btnAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseEntered
       //this.btnAbout.setBounds(50,650,100,100);
    }//GEN-LAST:event_btnAboutMouseEntered

    private void btnAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseExited
      //this.setBounds(50,600,150,150);
    }//GEN-LAST:event_btnAboutMouseExited

    private void btnAboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutMousePressed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
       
//       AboutUs about = new AboutUs();
//       about.setVisible(true);
       
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
       
     
    }//GEN-LAST:event_btnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
     
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
         new AdminLoginPage().setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void LoginPaneBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPaneBtnMouseEntered
      JPanel btn = LoginPaneBtn;
        isEnter(btn);
    }//GEN-LAST:event_LoginPaneBtnMouseEntered

    private void LoginPaneBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPaneBtnMouseExited
        JPanel btn = LoginPaneBtn;
        isExit(btn);
    }//GEN-LAST:event_LoginPaneBtnMouseExited

    private void LoginPaneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPaneBtnMouseClicked
        new AdminLoginPage().setVisible(true);
    }//GEN-LAST:event_LoginPaneBtnMouseClicked
    void isEnter(JPanel btn) {

        btn.setBackground(new Color(39, 39, 39));
    }

    void isExit(JPanel btn) {
        btn.setBackground(new Color(1, 3, 2));

    }

    
    
    public static void main(String args[]) {
            InterfaceDesign id = new InterfaceDesign();
            id.setVisible( true);
            
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanel;
    private javax.swing.JPanel CreateAccountBtn;
    private javax.swing.JDesktopPane DisplayPanel;
    private javax.swing.JPanel ForgotPassBtn;
    private javax.swing.JButton ForgotPassword;
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel LoginPaneBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel LogoutBtn;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel SubHeading;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
