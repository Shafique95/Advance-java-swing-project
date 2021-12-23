
package application;

import javax.swing.JInternalFrame;


public class StudentDisplayPage extends javax.swing.JInternalFrame {

    public StudentDisplayPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        tab1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
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
        displayLibrary = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        jPanel7.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, -1));
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 140, 40));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 240, 60));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tab2.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        tab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/change_30px.png"))); // NOI18N
        tab2.setText("Modify");
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
                .addComponent(tab2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

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

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 10, 140, 60));

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

        displayLibrary.setPreferredSize(new java.awt.Dimension(1272, 756));
        displayLibrary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setPreferredSize(new java.awt.Dimension(1272, 756));
        jScrollPane2.setViewportView(jTable1);

        displayLibrary.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modyfyLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(displayLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modyfyLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 74, Short.MAX_VALUE)
                    .addComponent(displayLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
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
