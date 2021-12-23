
package alljintraframe;

import application.*;
import javax.swing.JInternalFrame;


public class AdminPanelDetails3 extends javax.swing.JInternalFrame {

    public AdminPanelDetails3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        tab1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tab2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tab3 = new javax.swing.JLabel();
        modyfyLibrary = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        displayLibrary = new javax.swing.JPanel();

        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(39, 227, 218));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        tab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/search_32px.png"))); // NOI18N
        tab1.setText("search ");
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        jPanel7.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 60));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tab2.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        tab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/change_30px.png"))); // NOI18N
        tab2.setText("Change");
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, -1));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tab3.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        tab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/moodle_50px.png"))); // NOI18N
        tab3.setText("Students");
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(tab3)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 140, 60));

        modyfyLibrary.setBackground(new java.awt.Color(39, 227, 218));
        modyfyLibrary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        modyfyLibrary.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jTextField2.setText("jTextField2");
        modyfyLibrary.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 270, -1));

        jTextField3.setText("jTextField2");
        modyfyLibrary.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 270, -1));

        jLabel2.setText("jLabel1");
        modyfyLibrary.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jTextField4.setText("jTextField2");
        modyfyLibrary.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel3.setText("jLabel1");
        modyfyLibrary.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jTextField5.setText("jTextField2");
        modyfyLibrary.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 270, -1));

        jLabel4.setText("jLabel1");
        modyfyLibrary.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jTextField6.setText("jTextField2");
        modyfyLibrary.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 270, -1));

        jLabel5.setText("jLabel1");
        modyfyLibrary.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jTextField7.setText("jTextField2");
        modyfyLibrary.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 270, -1));

        jLabel6.setText("jLabel1");
        modyfyLibrary.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jTextField8.setText("jTextField2");
        modyfyLibrary.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 270, -1));

        jLabel7.setText("jLabel1");
        modyfyLibrary.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jButton2.setText("Add");
        modyfyLibrary.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jButton3.setText("Edite");
        modyfyLibrary.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayLibrary.setPreferredSize(new java.awt.Dimension(1272, 756));
        displayLibrary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(displayLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(277, Short.MAX_VALUE)
                    .addComponent(modyfyLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(284, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(modyfyLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 1279, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
      
       
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
       displayLibrary.setVisible(false);
       modyfyLibrary.setVisible(true); 
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
      displayLibrary.setVisible(true);
       modyfyLibrary.setVisible(false);
    }//GEN-LAST:event_tab3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel displayLibrary;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel modyfyLibrary;
    private javax.swing.JLabel tab1;
    private javax.swing.JLabel tab2;
    private javax.swing.JLabel tab3;
    // End of variables declaration//GEN-END:variables
}
