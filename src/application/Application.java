
package application;

import alljintraframe.IntraLink1;
import alljintraframe.AdminPanelDetails;
import alljintraframe.AdminPanelDetails2;
import alljintraframe.AdminPanelDetails3;
import alljintraframe.IntraLink3;
import alljintraframe.IntraLink4;
import alljintraframe.IntraLink5;
import alljintraframe.IntraLink6;
import alljintraframe.IntraLink7;
import alljintraframe.LibraryManagement2;
import alljintraframe.IntraLink9;
import alljintraframe.LibraryManagement;
import alljintraframe.Project;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class Application extends javax.swing.JFrame {
                Timer timer;
    public Application() {
        initComponents();
        initComponent();
    }
  public void initComponent(){
  

        ActionListener   ac = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new  Date();
                DateFormat timeFormate = new SimpleDateFormat("hh:mm:ss");
                String time = timeFormate.format(date);
                timeButton.setText(time);
                Date date2 = new  Date();
                DateFormat timeFormate2 = new SimpleDateFormat("dd/MM/yy");
                String time2 = timeFormate2.format(date2);
                dateButton.setText(time2);
               
            }
        };
        timer = new Timer(1000,ac);
        timer.setInitialDelay(0);
        timer.start();
  
  
  
  
  }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        buttonMinMaxClose = new javax.swing.JPanel();
        buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        buttonMin = new javax.swing.JPanel();
        min = new javax.swing.JLabel();
        buttonmax = new javax.swing.JPanel();
        max = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        homeButton = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        adminButton = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        facultyButton = new javax.swing.JPanel();
        facultyLabel = new javax.swing.JLabel();
        depButton = new javax.swing.JPanel();
        DepLabel = new javax.swing.JLabel();
        academicButton = new javax.swing.JPanel();
        academicLabel = new javax.swing.JLabel();
        teacehrButton = new javax.swing.JPanel();
        teacherLabel = new javax.swing.JLabel();
        studentButton = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        accountButton = new javax.swing.JPanel();
        accountlabel = new javax.swing.JLabel();
        libraryButton = new javax.swing.JPanel();
        libraryLabel = new javax.swing.JLabel();
        supportHelpButton = new javax.swing.JPanel();
        sphLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        TotalOverview = new javax.swing.JPanel();
        displayPane = new javax.swing.JDesktopPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        timeButton = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateButton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logoTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(242, 242, 245));
        header.setPreferredSize(new java.awt.Dimension(1055, 70));

        buttonMinMaxClose.setLayout(new java.awt.BorderLayout());

        buttonclose.setBackground(new java.awt.Color(242, 242, 245));
        buttonclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttoncloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttoncloseMouseExited(evt);
            }
        });

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/close32.png"))); // NOI18N
        close.setToolTipText("<html>Close</html>");
        close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttoncloseLayout = new javax.swing.GroupLayout(buttonclose);
        buttonclose.setLayout(buttoncloseLayout);
        buttoncloseLayout.setHorizontalGroup(
            buttoncloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttoncloseLayout.createSequentialGroup()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        buttoncloseLayout.setVerticalGroup(
            buttoncloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        buttonMinMaxClose.add(buttonclose, java.awt.BorderLayout.LINE_END);

        buttonMin.setBackground(new java.awt.Color(242, 242, 245));

        min.setBackground(new java.awt.Color(255, 102, 255));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/min2.png"))); // NOI18N
        min.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonMinLayout = new javax.swing.GroupLayout(buttonMin);
        buttonMin.setLayout(buttonMinLayout);
        buttonMinLayout.setHorizontalGroup(
            buttonMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonMinLayout.createSequentialGroup()
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        buttonMinLayout.setVerticalGroup(
            buttonMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        buttonMinMaxClose.add(buttonMin, java.awt.BorderLayout.LINE_START);

        buttonmax.setBackground(new java.awt.Color(242, 242, 245));

        max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/max.png"))); // NOI18N
        max.setToolTipText("");
        max.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonmaxLayout = new javax.swing.GroupLayout(buttonmax);
        buttonmax.setLayout(buttonmaxLayout);
        buttonmaxLayout.setHorizontalGroup(
            buttonmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonmaxLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(max)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonmaxLayout.setVerticalGroup(
            buttonmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(max, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        buttonMinMaxClose.add(buttonmax, java.awt.BorderLayout.CENTER);

        menuBar.setAlignmentX(1.0F);
        menuBar.setAlignmentY(1.0F);
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0);
        flowLayout1.setAlignOnBaseline(true);
        menuBar.setLayout(flowLayout1);

        homeButton.setLayout(new java.awt.BorderLayout());

        home.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/home.png"))); // NOI18N
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        homeButton.add(home, java.awt.BorderLayout.CENTER);

        menuBar.add(homeButton);

        adminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminButtonMouseExited(evt);
            }
        });
        adminButton.setLayout(new java.awt.BorderLayout());

        adminLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        adminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/businessman_32px.png"))); // NOI18N
        adminLabel.setText("Admin");
        adminLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        adminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminLabelMouseExited(evt);
            }
        });
        adminButton.add(adminLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(adminButton);

        facultyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facultyButton.setLayout(new java.awt.BorderLayout());

        facultyLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        facultyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facultyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/lecture_32px.png"))); // NOI18N
        facultyLabel.setText("Faculty");
        facultyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        facultyLabel.setVerifyInputWhenFocusTarget(false);
        facultyLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        facultyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facultyLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facultyLabelMouseExited(evt);
            }
        });
        facultyButton.add(facultyLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(facultyButton);

        depButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depButton.setLayout(new java.awt.BorderLayout());

        DepLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        DepLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/department_32px.png"))); // NOI18N
        DepLabel.setText("Department");
        DepLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DepLabel.setVerifyInputWhenFocusTarget(false);
        DepLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DepLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DepLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DepLabelMouseExited(evt);
            }
        });
        depButton.add(DepLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(depButton);

        academicButton.setLayout(new java.awt.BorderLayout());

        academicLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        academicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        academicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/flying_mortarboard_32px.png"))); // NOI18N
        academicLabel.setText("Academic Programm");
        academicLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        academicLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        academicLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        academicLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                academicLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                academicLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                academicLabelMouseExited(evt);
            }
        });
        academicButton.add(academicLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(academicButton);

        teacehrButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacehrButton.setLayout(new java.awt.BorderLayout());

        teacherLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        teacherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/teacher_32px.png"))); // NOI18N
        teacherLabel.setText("Teachers");
        teacherLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        teacherLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        teacherLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherLabelMouseExited(evt);
            }
        });
        teacehrButton.add(teacherLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(teacehrButton);

        studentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentButton.setLayout(new java.awt.BorderLayout());

        studentLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        studentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/student_registration_32px.png"))); // NOI18N
        studentLabel.setText("Students");
        studentLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        studentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentLabelMouseExited(evt);
            }
        });
        studentButton.add(studentLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(studentButton);

        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountButton.setLayout(new java.awt.BorderLayout());

        accountlabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        accountlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/account_32px.png"))); // NOI18N
        accountlabel.setText("Account");
        accountlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accountlabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        accountlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountlabelMouseExited(evt);
            }
        });
        accountButton.add(accountlabel, java.awt.BorderLayout.CENTER);

        menuBar.add(accountButton);

        libraryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        libraryButton.setLayout(new java.awt.BorderLayout());

        libraryLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        libraryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/book_shelf_32px.png"))); // NOI18N
        libraryLabel.setText("Library");
        libraryLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        libraryLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        libraryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libraryLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                libraryLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                libraryLabelMouseExited(evt);
            }
        });
        libraryButton.add(libraryLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(libraryButton);

        supportHelpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supportHelpButton.setLayout(new java.awt.BorderLayout());

        sphLabel.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        sphLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sphLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/help_32px.png"))); // NOI18N
        sphLabel.setText("Support & Help");
        sphLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sphLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sphLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sphLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sphLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sphLabelMouseExited(evt);
            }
        });
        supportHelpButton.add(sphLabel, java.awt.BorderLayout.CENTER);

        menuBar.add(supportHelpButton);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255)));
        searchPanel.setLayout(new java.awt.BorderLayout());

        searchTextField.setBackground(new java.awt.Color(193, 249, 240));
        searchTextField.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        searchTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchPanel.add(searchTextField, java.awt.BorderLayout.CENTER);

        searchIcon.setBackground(new java.awt.Color(193, 249, 240));
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/search_32px.png"))); // NOI18N
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchIconMouseExited(evt);
            }
        });
        searchPanel.add(searchIcon, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(buttonMinMaxClose, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                        .addComponent(buttonMinMaxClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(menuBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header, java.awt.BorderLayout.PAGE_START);

        TotalOverview.setBackground(new java.awt.Color(39, 227, 218));
        TotalOverview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayPane.setBackground(new java.awt.Color(39, 227, 218));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel9.setPreferredSize(new java.awt.Dimension(340, 200));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(193, 249, 240));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeButton.setBackground(new java.awt.Color(0, 0, 0));
        timeButton.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        timeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        timeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(timeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Admin");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 50));

        dateButton.setBackground(new java.awt.Color(0, 0, 0));
        dateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(dateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 156, 27));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/administrator_male_125px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 130));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/sun_behind_small_cloud_48px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 60, 60));

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 200));

        jPanel24.setBackground(new java.awt.Color(204, 204, 255));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(193, 249, 240));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/google_classroom_80px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(47, 47, 47))
        );

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 200));

        jPanel26.setBackground(new java.awt.Color(193, 249, 240));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Total Student");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel24.setText("Add student");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel24.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 190, 200));

        jPanel21.setBackground(new java.awt.Color(204, 204, 255));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel21.setPreferredSize(new java.awt.Dimension(340, 200));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(193, 249, 240));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/user_groups_86px.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 200));

        jPanel23.setBackground(new java.awt.Color(193, 249, 240));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Total Feculty");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setText("add Feculty");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 190, 200));

        jPanel18.setBackground(new java.awt.Color(204, 204, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel18.setMinimumSize(new java.awt.Dimension(340, 200));
        jPanel18.setPreferredSize(new java.awt.Dimension(320, 200));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(193, 249, 240));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/teaching_86px.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 200));

        jPanel20.setBackground(new java.awt.Color(193, 249, 240));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Total Subject");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setText("add Subject");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 170, 200));

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(193, 249, 240));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/teacher_86px2.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 200));

        jPanel17.setBackground(new java.awt.Color(193, 249, 240));

        jLabel15.setText("Add Teacher");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total Teacher");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 170, 200));

        jPanel33.setBackground(new java.awt.Color(204, 204, 255));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(193, 249, 240));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_icons/department_86px.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(20, 20, 20))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel33.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 200));

        jPanel35.setBackground(new java.awt.Color(193, 249, 240));

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Total Departments");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel33.setText("add Clock");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel33.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 190, 200));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/Square150x150Logo.scale-200.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoMousePressed(evt);
            }
        });

        logoTitle.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        logoTitle.setText("University Management System");
        logoTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        logoTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoTitleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoTitleMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout displayPaneLayout = new javax.swing.GroupLayout(displayPane);
        displayPane.setLayout(displayPaneLayout);
        displayPaneLayout.setHorizontalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPaneLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(displayPaneLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayPaneLayout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPaneLayout.createSequentialGroup()
                        .addComponent(logoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(418, 418, 418))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPaneLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPaneLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497))))
        );
        displayPaneLayout.setVerticalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(logoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        displayPane.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(jPanel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(jPanel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(jPanel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(jPanel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(jPanel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(logoTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayPane.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TotalOverview.add(displayPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 830));

        jPanel1.add(TotalOverview, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1279, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    
    
    
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        
        JPanel closebtn2 =  buttonclose;
        isExit(closebtn2);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
       if(this.getExtendedState()!= Application.MAXIMIZED_BOTH){
          this.setExtendedState(Application.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Application.NORMAL);
        }
        
    }//GEN-LAST:event_maxMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        new Application().setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_minMouseClicked

    private void academicLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicLabelMouseClicked
        IntraLink1 intra = new IntraLink1();
        displayPane.add(intra);
        intra.show();
        
    }//GEN-LAST:event_academicLabelMouseClicked

    private void adminLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseClicked
       AdminPanelDetails3 intra2 = new AdminPanelDetails3();
        displayPane.add(intra2);
        intra2.show();
    }//GEN-LAST:event_adminLabelMouseClicked

    private void facultyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyLabelMouseClicked
       IntraLink3 intra3 = new IntraLink3();
        displayPane.add(intra3);
        intra3.show();
    }//GEN-LAST:event_facultyLabelMouseClicked

    private void DepLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepLabelMouseClicked
        IntraLink4 intra4 = new IntraLink4();
        displayPane.add(intra4);
        intra4.show();
    }//GEN-LAST:event_DepLabelMouseClicked

    private void teacherLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLabelMouseClicked
        IntraLink5 intra5 = new IntraLink5();
        displayPane.add(intra5);
        intra5.show();
    }//GEN-LAST:event_teacherLabelMouseClicked

    private void studentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLabelMouseClicked
      StudentDisplayPage str = new StudentDisplayPage();
        displayPane.add(str);
        str.show();
    }//GEN-LAST:event_studentLabelMouseClicked

    private void accountlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountlabelMouseClicked
       IntraLink7 intra7 = new IntraLink7();
        displayPane.add(intra7);
        intra7.show();
    }//GEN-LAST:event_accountlabelMouseClicked

    private void libraryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryLabelMouseClicked
        LibraryManagement intra8 = new LibraryManagement();
        displayPane.add(intra8);
        intra8.show();
    }//GEN-LAST:event_libraryLabelMouseClicked

    private void sphLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sphLabelMouseClicked
         IntraLink9 intra9 = new IntraLink9();
        displayPane.add(intra9);
        intra9.show();
    }//GEN-LAST:event_sphLabelMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Application ap = new Application();
        ap.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void buttoncloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncloseMouseExited
     
    }//GEN-LAST:event_buttoncloseMouseExited

    private void buttoncloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncloseMouseEntered
       
    }//GEN-LAST:event_buttoncloseMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        JPanel closebtn =  buttonclose;
        isEnter(closebtn);
    }//GEN-LAST:event_closeMouseExited

    private void maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseEntered
        JPanel maxbtn2 = buttonmax;
        isExit(maxbtn2);
    }//GEN-LAST:event_maxMouseEntered

    private void maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseExited
       
        JPanel maxbtn = buttonmax;
        isEnter(maxbtn);
    }//GEN-LAST:event_maxMouseExited

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        JPanel minBtn = buttonMin;
        isExit(minBtn);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
         JPanel minBtn2 = buttonMin;
        isEnter(minBtn2);
    }//GEN-LAST:event_minMouseExited

    private void searchIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseEntered
          JPanel searchBtn = searchPanel;
        isExit(searchBtn);
    }//GEN-LAST:event_searchIconMouseEntered

    private void searchIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseExited
        JPanel searchBtn2 = searchPanel;
        isEnter(searchBtn2);
    }//GEN-LAST:event_searchIconMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        JPanel homBtn = homeButton;
        isEnter2(homBtn);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
         JPanel homBtn2 = homeButton;
        isExit2(homBtn2);
    }//GEN-LAST:event_homeMouseExited

    private void adminButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseEntered
     
    }//GEN-LAST:event_adminButtonMouseEntered

    private void adminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseExited
     
    }//GEN-LAST:event_adminButtonMouseExited

    private void adminLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseEntered
         JPanel adminBtn = adminButton;
        isEnter2(adminBtn);
    }//GEN-LAST:event_adminLabelMouseEntered

    private void adminLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseExited
         JPanel adminBtn1 = adminButton;
        isExit2(adminBtn1);
    }//GEN-LAST:event_adminLabelMouseExited

    private void facultyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyLabelMouseEntered
        JPanel Btn1 = facultyButton;
        isEnter2(Btn1);
    }//GEN-LAST:event_facultyLabelMouseEntered

    private void facultyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyLabelMouseExited
        JPanel Btn2 = facultyButton;
        isExit2(Btn2);
    }//GEN-LAST:event_facultyLabelMouseExited

    private void DepLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepLabelMouseEntered
        JPanel Btn3 = depButton;
        isEnter2(Btn3);
    }//GEN-LAST:event_DepLabelMouseEntered

    private void DepLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepLabelMouseExited
        JPanel Btn4 = depButton;
        isExit2(Btn4);
    }//GEN-LAST:event_DepLabelMouseExited

    private void academicLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicLabelMouseEntered
        JPanel Btn5 = academicButton;
        isEnter2(Btn5);
    }//GEN-LAST:event_academicLabelMouseEntered

    private void academicLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicLabelMouseExited
         JPanel Btn6 = academicButton;
        isExit2(Btn6);
    }//GEN-LAST:event_academicLabelMouseExited

    private void teacherLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLabelMouseEntered
        JPanel Btn7 = teacehrButton;
        isEnter2(Btn7);
    }//GEN-LAST:event_teacherLabelMouseEntered

    private void teacherLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLabelMouseExited
        JPanel Btn8 = teacehrButton;
        isExit2(Btn8);
    }//GEN-LAST:event_teacherLabelMouseExited

    private void studentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLabelMouseEntered
       JPanel Btn9 = studentButton;
        isEnter2(Btn9);
    }//GEN-LAST:event_studentLabelMouseEntered

    private void studentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLabelMouseExited
         JPanel Btn10 = studentButton;
        isExit2(Btn10);
    }//GEN-LAST:event_studentLabelMouseExited

    private void accountlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountlabelMouseEntered
       JPanel Btn11 = accountButton;
        isEnter2(Btn11);
    }//GEN-LAST:event_accountlabelMouseEntered

    private void accountlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountlabelMouseExited
         JPanel Btn12 = accountButton;
        isExit2(Btn12);
    }//GEN-LAST:event_accountlabelMouseExited

    private void libraryLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryLabelMouseEntered
       JPanel Btn13 = libraryButton;
        isEnter2(Btn13);
    }//GEN-LAST:event_libraryLabelMouseEntered

    private void libraryLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryLabelMouseExited
      JPanel Btn14 = libraryButton;
        isExit2(Btn14);
    }//GEN-LAST:event_libraryLabelMouseExited

    private void sphLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sphLabelMouseEntered
       JPanel Btn15 = supportHelpButton;
        isEnter2(Btn15);
    }//GEN-LAST:event_sphLabelMouseEntered

    private void sphLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sphLabelMouseExited
       JPanel Btn16 = supportHelpButton;
        isExit2(Btn16);
    }//GEN-LAST:event_sphLabelMouseExited

    private void logoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMousePressed
       // this.logo.setSize(logo.getWidth()-10,logo.getHeight()-10);
    }//GEN-LAST:event_logoMousePressed

    private void logoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseEntered
        this.logo.setSize(logo.getWidth()-2,logo.getHeight()-2);
    }//GEN-LAST:event_logoMouseEntered

    private void logoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseExited
         this.logo.setSize(logo.getWidth(),logo.getHeight());
    }//GEN-LAST:event_logoMouseExited

    private void logoTitleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoTitleMouseEntered
       this.logoTitle.setSize(logoTitle.getWidth()-2,logoTitle.getHeight()-2);
    }//GEN-LAST:event_logoTitleMouseEntered

    private void logoTitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoTitleMouseExited
         this.logoTitle.setSize(logoTitle.getWidth(),logoTitle.getHeight());
    }//GEN-LAST:event_logoTitleMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }
    // For Changing Color
    void isEnterLabel( JLabel btn){
     btn.setBackground(new Color(39, 227, 218));
    }
    
    void isEnter(JPanel btn) {

        btn.setBackground(new Color(240, 240, 240));
    }

    void isExit(JPanel btn) {
        btn.setBackground(new Color(39, 227, 218));

    }
    void isEnter2(JPanel btn) {

        btn.setBackground(new Color(66, 148, 146));
    }

    void isExit2(JPanel btn) {
        btn.setBackground(new Color(240, 240, 240));

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepLabel;
    private javax.swing.JPanel TotalOverview;
    private javax.swing.JPanel academicButton;
    private javax.swing.JLabel academicLabel;
    private javax.swing.JPanel accountButton;
    private javax.swing.JLabel accountlabel;
    private javax.swing.JPanel adminButton;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JPanel buttonMin;
    private javax.swing.JPanel buttonMinMaxClose;
    private javax.swing.JPanel buttonclose;
    private javax.swing.JPanel buttonmax;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dateButton;
    private javax.swing.JPanel depButton;
    private javax.swing.JDesktopPane displayPane;
    private javax.swing.JPanel facultyButton;
    private javax.swing.JLabel facultyLabel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel home;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel libraryButton;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoTitle;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel min;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel sphLabel;
    private javax.swing.JPanel studentButton;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JPanel supportHelpButton;
    private javax.swing.JPanel teacehrButton;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JLabel timeButton;
    // End of variables declaration//GEN-END:variables
}
