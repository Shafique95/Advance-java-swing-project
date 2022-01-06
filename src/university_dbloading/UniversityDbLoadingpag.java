
package university_dbloading;

import javax.swing.ImageIcon;
import university_admin_login.AdminLoginPage;
import university_admin_login.InterfaceDesign;




public class UniversityDbLoadingpag extends javax.swing.JFrame {

    public UniversityDbLoadingpag() {
        initComponents();
        ImageIcon titleLogo = new ImageIcon(getClass().getResource("university Logo.png"));
        this.setIconImage(titleLogo.getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        loadingBar = new javax.swing.JProgressBar();
        percentageShow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backgroundImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setPreferredSize(new java.awt.Dimension(900, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingBar.setBackground(new java.awt.Color(0, 0, 51));
        loadingBar.setForeground(new java.awt.Color(255, 255, 255));
        background.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 740, 10));

        percentageShow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        percentageShow.setForeground(new java.awt.Color(255, 255, 255));
        percentageShow.setText("0.0%");
        background.add(percentageShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, -1));

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Top University Of Bangladesh");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 640, 60));

        loading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading");
        background.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundImage.setBackground(new java.awt.Color(0, 0, 0));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/i6.png"))); // NOI18N
        jPanel2.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 620, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_login2_icon/university Logo2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 178, -1));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 700, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(760, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public static void main(String args[]) {
        UniversityDbLoadingpag sp = new UniversityDbLoadingpag();
        sp.setVisible(true);
        sp.setLocationRelativeTo(new InterfaceDesign());
       
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(10);
                sp.loadingBar.setValue(i);
                sp.percentageShow.setText(Integer.toString(i) + " %");
                sp.loading.setText("Database Loading..." + -i); 
            }
        } catch (Exception e) {
        }
        sp.setVisible(false);
        new InterfaceDesign().setVisible(true);
        sp.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loading;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel percentageShow;
    // End of variables declaration//GEN-END:variables
}
