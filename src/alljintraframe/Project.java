package alljintraframe;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Project extends javax.swing.JFrame implements ActionListener {

    private ImageIcon icon, btni; // extra add
    private JLabel cardLabel;
    private JPanel panel;
    private Container c;
    private CardLayout card;
    private JButton previousButton, nextButton; // end extra add

    public Project() {
        initComponents();
        initComponent();
        showImage();
    }

    public void showImage() {
        String[] imageName = {"1.jpg", "15.jpg", "5.jpg",};
        for (String n : imageName) {
            icon = new ImageIcon("src/universitybg/" + n); //make icon
            cardLabel = new JLabel(icon);// set icon to label
            panel.add(cardLabel);// set label to panel
            // Resize Image 
            Image img1 = icon.getImage();// get image by this method
            Image newImage = img1.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_DEFAULT);
            // after resize image again make it icon
            icon = new ImageIcon(newImage);
        }
    }

    public void initComponent() {

        ImageIcon universityIcon = new ImageIcon(getClass().getResource("idblogo.png"));// this is to get icon
        this.setIconImage(universityIcon.getImage());// To set Image Icon
        this.setTitle("University Management System");
        this.setFont(new Font("sans-serif", Font.BOLD, 50));
        this.setBounds(250, 50, 1400, 1020);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // extra add 
        c = this.getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        card = new CardLayout();
        panel = new JPanel(card);
        panel.setBounds(0, 0, 1920, 1000);
        c.add(panel);

        previousButton = new JButton();
        previousButton.setBounds(10, 400, 150, 40);
        c.add(previousButton);
        /*createEmptyBorder(int top, int left, int bottom, int right)
         Creates an empty border that takes up space but which does no drawing, specifying the width of the top, left, bottom, and right sides.*/
        nextButton = new JButton("Background");
        nextButton.setBounds(1230, 5, 150, 50);
        nextButton.setFont(new Font("sans-serif", Font.BOLD, 16));
        // nextButton.setContentAreaFilled(true);
        nextButton.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        int m = nextButton.getWidth(); // this is the width of btn
        int n = nextButton.getHeight(); // this is the height of btn
        btni = new ImageIcon(new ImageIcon("src/universitybg/3.png").getImage().getScaledInstance(m, n, Image.SCALE_DEFAULT));
        nextButton.setIcon(btni);

        c.add(nextButton);
        previousButton.addActionListener(this);
        nextButton.addActionListener(this);

    }
// Code for action Listener

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == previousButton) {
            card.previous(panel);
        }
        if (ae.getSource() == nextButton) {
            card.next(panel);
        }

        String msg = ae.getActionCommand();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));

        jMenu1.setBorder(null);
        jMenu1.setText("Faculty");
        jMenu1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem1.setText("Add Faculty");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem2.setText("Add Department");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem3.setText("See Details ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem4.setText("Delete & Update ");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setBorder(null);
        jMenu3.setText("Department");
        jMenu3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_student_male_32.png"))); // NOI18N
        jMenuItem5.setText("Add Subject");
        jMenu3.add(jMenuItem5);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem17.setText("Assign Subject to Student");
        jMenu3.add(jMenuItem17);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem6.setText("Assign Subject to Faculty");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem7.setText("See Details ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem8.setText("Delete & Update ");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(null);
        jMenu4.setText("Details");
        jMenu4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem9.setText("Add Faculty");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem10.setText("Add Member");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem11.setText("See Details ");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem12.setText("Delete & Update ");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(null);
        jMenu5.setText("Attendance");
        jMenu5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem13.setText("Add Faculty");
        jMenu5.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem14.setText("Add Member");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem15.setText("See Details ");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem16.setText("Delete & Update ");
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu2.setBorder(null);
        jMenu2.setText("Attendance Detail");
        jMenu2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem18.setText("Add Faculty");
        jMenu2.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem19.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem19.setText("Add Member");
        jMenu2.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem20.setText("See Details ");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem21.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem21.setText("Delete & Update ");
        jMenu2.add(jMenuItem21);

        jMenuBar1.add(jMenu2);

        jMenu6.setBorder(null);
        jMenu6.setText("Examination");
        jMenu6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem22.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_student_male_32.png"))); // NOI18N
        jMenuItem22.setText("Add Department");
        jMenu6.add(jMenuItem22);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem23.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem23.setText("Assign Subject to Faculty");
        jMenu6.add(jMenuItem23);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem24.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem24.setText("Assign Subject to Student");
        jMenu6.add(jMenuItem24);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem25.setText("See Details ");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem25);

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem26.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem26.setText("Delete & Update ");
        jMenu6.add(jMenuItem26);

        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(null);
        jMenu7.setText("Update Details");
        jMenu7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem27.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem27.setText("Add Faculty");
        jMenu7.add(jMenuItem27);

        jMenuItem28.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem28.setText("Add Member");
        jMenu7.add(jMenuItem28);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem29.setText("See Details ");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem29);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem30.setText("Delete & Update ");
        jMenu7.add(jMenuItem30);

        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(null);
        jMenu8.setText("Fee Details");
        jMenu8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem31.setText("Add Faculty");
        jMenu8.add(jMenuItem31);

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem32.setText("Add Member");
        jMenu8.add(jMenuItem32);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem33.setText("See Details ");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem34.setText("Delete & Update ");
        jMenu8.add(jMenuItem34);

        jMenuBar1.add(jMenu8);

        jMenu10.setBorder(null);
        jMenu10.setText("Utility");
        jMenu10.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem40.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem40.setText("Add Faculty");
        jMenu10.add(jMenuItem40);

        jMenuItem41.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem41.setText("Add Member");
        jMenu10.add(jMenuItem41);

        jMenuItem42.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem42.setText("See Details ");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem42);

        jMenuItem43.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem43.setText("Delete & Update ");
        jMenu10.add(jMenuItem43);

        jMenuBar1.add(jMenu10);

        jMenu11.setBorder(null);
        jMenu11.setText("About");
        jMenu11.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem44.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_university_32.png"))); // NOI18N
        jMenuItem44.setText("Add Faculty");
        jMenu11.add(jMenuItem44);

        jMenuItem45.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem45.setText("Add Member");
        jMenu11.add(jMenuItem45);

        jMenuItem46.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem46.setText("See Details ");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem46);

        jMenuItem47.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem47.setText("Delete & Update ");
        jMenu11.add(jMenuItem47);

        jMenuBar1.add(jMenu11);

        jMenu9.setBorder(null);
        jMenu9.setText("Exit");
        jMenu9.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem35.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_student_male_32.png"))); // NOI18N
        jMenuItem35.setText("Add Department");
        jMenu9.add(jMenuItem35);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem36.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem36.setText("Assign Subject to Faculty");
        jMenu9.add(jMenuItem36);

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem37.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_add_user_group_man_woman_32.png"))); // NOI18N
        jMenuItem37.setText("Assign Subject to Student");
        jMenu9.add(jMenuItem37);

        jMenuItem38.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem38.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_moleskine_32.png"))); // NOI18N
        jMenuItem38.setText("See Details ");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem38);

        jMenuItem39.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem39.setFont(new java.awt.Font("Microsoft Himalaya", 1, 25)); // NOI18N
        jMenuItem39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_hand_icon/icons8_delete_database_32.png"))); // NOI18N
        jMenuItem39.setText("Delete & Update ");
        jMenu9.add(jMenuItem39);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    public static void main(String args[]) {
        new Project().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
