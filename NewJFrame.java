/*
Ahmad ALASHTAR 160501304
*/

package javaapplication2;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
    University uni = new University("TAU","Istanbul");
    String vorname;
    String nachname;
    String matrikelnummer;
    String alter;
    String fak;
    String klasse;
    String email;
    String phone;
    String address;
    String geschlecht;
    String tcnummer;
    String lva;
    int studentexists=0;
    int exists = 0;
    int studentexists2=0;
    int exists2=0;
    int dozentexists=0;
    int dozentexists2=0;
    String oldmatrikelnummer;
    String oldtcnummer;
    String oldlva;
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(994, 438));
        setSize(new java.awt.Dimension(1000, 500));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(994, 200));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "Matrikelnummer", "Alter", "Fakultaet", "Klasse", "Email", "Phone", "Address", "Geschlecht"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Discard");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Vorname");

        jLabel6.setText("Nachname");

        jLabel7.setText("Matrikelnummer");

        jLabel8.setText("Alter");

        jLabel9.setText("Fakultaet");

        jLabel10.setText("Klasse");

        jLabel11.setText("Phone");

        jLabel12.setText("Email");

        jLabel13.setText("Address");

        jLabel14.setText("Geschlecht");
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vorname", "Nachname", "TC", "Alter", "Fakultaet", "Klasse", "Email", "Phone", "Address", "Geschlecht"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Discard");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel15.setText("Vorname");

        jLabel16.setText("Nachname");

        jLabel17.setText("TC");

        jLabel18.setText("Fakultaet");

        jLabel19.setText("Alter");

        jLabel20.setText("Klasse");

        jLabel21.setText("Email");

        jLabel22.setText("Phone");

        jLabel23.setText("Address");

        jLabel24.setText("Geschlecht");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextField14))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField20)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton10)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dozent", jPanel2);

        jButton11.setText("Add");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Remove");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Search");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Update");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Discard");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LVA", jPanel3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Matrikelnummer", "LVA Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton16.setText("Anmelden");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Abmelden");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student Ab-/Anmelden", jPanel4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dozent TC", "LVA Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jButton18.setText("Anmelden");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Abmelden");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jButton18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );

        jTabbedPane1.addTab("Dozent Ab-/Anmelden", jPanel5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jButton20.setText("Zeig LVA");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField27KeyTyped(evt);
            }
        });

        jLabel1.setText("Student Matrikelnummer");

        jLabel2.setText("Dozent TC");

        jLabel3.setText("LVA Code");

        jButton21.setText("Zeig LVA");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Zeig Studenten");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel4.setText("LVA Code");

        jButton23.setText("Zeig Dozenten");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField27)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info Zeigen", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
                      
 
        if (jTable2.getSelectedRow() >=0){
 
            
            jTextField11.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0));
            jTextField12.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1));
            jTextField13.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 2));
            jTextField14.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 3));
            jTextField15.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 4));
            jTextField16.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 5));
            jTextField17.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 6));
            jTextField18.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 7));
            jTextField19.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 8));
            jTextField20.setText((String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 9));


        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        tcnummer = jTextField13.getText();
        if (Dozent.istcnummer(tcnummer)){
        
        for (int i = 0; i<jTable2.getRowCount();i++){
            if(jTable2.getModel().getValueAt(i, 2).equals(tcnummer)){
                jTable2.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
        if (exists == 1){
            JOptionPane.showMessageDialog(this, "Dozent already exists!");
        }
        if (exists == 0){
            vorname = jTextField11.getText();
            nachname = jTextField12.getText();
            alter = jTextField14.getText();
            fak = jTextField15.getText();
            klasse = jTextField16.getText();
            email = jTextField17.getText();
            phone = jTextField18.getText();
            address = jTextField19.getText();
            geschlecht = jTextField20.getText();

            
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            String[] ss = new String [10];
            ss[0]=vorname;
            ss[1]=nachname;
            ss[2]=tcnummer;
            ss[3]=alter;
            ss[4]=fak;
            ss[5]=klasse;
            ss[6]=email;
            ss[7]=phone;
            ss[8]=address;
            ss[9]=geschlecht;
            dtm.addRow(ss);
             
            exists =0;

        }
    }
        else {
             JOptionPane.showMessageDialog(this, "Mat Error");
        }
                exists = 0;
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            tcnummer = jTextField13.getText();
    if (Dozent.istcnummer(tcnummer)){

        for (int i = 0; i<jTable2.getRowCount();i++){
            if(jTable2.getModel().getValueAt(i, 2).equals(tcnummer)){
                jTable2.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
        if (exists == 0){
            JOptionPane.showMessageDialog(this, "Dozent Not Found");
        }
        exists = 0;
        
        int i = jTable2.getSelectedRow();
        if (i>=0){
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.removeRow(i);
            JOptionPane.showMessageDialog(this, "Removed successfully!");

            for (int ii = 0; ii<jTable5.getRowCount();ii++){
            if(jTable5.getModel().getValueAt(ii, 0).equals(tcnummer)){
                DefaultTableModel dttm = (DefaultTableModel) jTable5.getModel();
                 dttm.removeRow(ii);
                ii=ii-1;
            }            
        }
        }
    }
        else {
             JOptionPane.showMessageDialog(this, "TC Error");
        }
                exists = 0;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                  
        tcnummer = jTextField13.getText();
        
        for (int i = 0; i<jTable2.getRowCount();i++){
            if(jTable2.getModel().getValueAt(i, 2).equals(tcnummer)){
                jTable2.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
        if (exists == 0){
            JOptionPane.showMessageDialog(this, "Dozent Not Found");
        }
        exists = 0;
                        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                
        tcnummer = jTextField13.getText();
        if (Dozent.istcnummer(tcnummer)){
            for (int i = 0; i<jTable1.getRowCount();i++){
            if(jTable2.getModel().getValueAt(i, 2).equals(tcnummer)){
                jTable2.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
            if (jTable2.getSelectedRow()==-1 && exists==0){
                                JOptionPane.showMessageDialog(this, "Not Found");

            }
            else if (jTable2.getSelectedRow()!=-1){
            vorname = jTextField11.getText();
            nachname = jTextField12.getText();
            oldtcnummer = (String)jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 2);

            jTable2.getModel().setValueAt(jTextField11.getText(), jTable2.getSelectedRow(), 0);

            jTable2.getModel().setValueAt(jTextField12.getText(), jTable2.getSelectedRow(), 1);

            jTable2.getModel().setValueAt(jTextField13.getText(), jTable2.getSelectedRow(), 2);
            jTable2.getModel().setValueAt(jTextField14.getText(), jTable2.getSelectedRow(), 3);
            jTable2.getModel().setValueAt(jTextField15.getText(), jTable2.getSelectedRow(), 4);
            jTable2.getModel().setValueAt(jTextField16.getText(), jTable2.getSelectedRow(), 5);
            jTable2.getModel().setValueAt(jTextField17.getText(), jTable2.getSelectedRow(), 6);
            jTable2.getModel().setValueAt(jTextField18.getText(), jTable2.getSelectedRow(), 7);
            jTable2.getModel().setValueAt(jTextField19.getText(), jTable2.getSelectedRow(), 8);
            jTable2.getModel().setValueAt(jTextField20.getText(), jTable2.getSelectedRow(), 9);
            for (int ii = 0; ii<jTable5.getRowCount();ii++){
            if(jTable5.getModel().getValueAt(ii, 0).equals(oldtcnummer)){
                                jTable5.getModel().setValueAt(jTextField13.getText(),ii,0);


            }            
        }



        }
        else{
            
                
             JOptionPane.showMessageDialog(this, "Already Exists");
        }
       
    }
        else {
             JOptionPane.showMessageDialog(this, "TC Error");
        }
        exists = 0;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText(""); 
            jTextField14.setText("");
            jTextField15.setText(""); 
            jTextField16.setText("");
            jTextField17.setText(""); 
            jTextField18.setText("");
            jTextField19.setText(""); 
            jTextField20.setText("");
            tcnummer = "";
vorname="";
nachname ="";
fak ="";
phone ="";
alter ="";
address ="";
klasse ="";
geschlecht ="";
email ="";
// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        lva = jTextField22.getText();
        vorname = jTextField21.getText();

    if (LVA.islva(lva)){
        for (int i = 0; i<jTable3.getRowCount();i++){
            if(jTable3.getModel().getValueAt(i, 1).equals(lva)){
                jTable3.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
             
        }
        if (exists == 1){
            JOptionPane.showMessageDialog(this, "LVA already exists!");
        }
        else if (exists == 0){
            vorname = jTextField21.getText();
            DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
            String[] ss = new String [2];
            ss[0]=vorname;
            ss[1]=lva;
            dtm.addRow(ss);
            jTextField21.setText("");
            jTextField22.setText("");
            exists =0;

        }
    }
        else {
             JOptionPane.showMessageDialog(this, "Code Error");
        }
        exists = 0;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
                    lva = jTextField22.getText();
    if (LVA.islva(lva)){

        for (int i = 0; i<jTable3.getRowCount();i++){
            if(jTable3.getModel().getValueAt(i, 1).equals(lva)){
                jTable3.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
        if (exists == 0){
            JOptionPane.showMessageDialog(this, "LVA Not Found");
        }
        exists = 0;
        
        int i = jTable3.getSelectedRow();
        if (i>=0){
            DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
            dtm.removeRow(i);
            JOptionPane.showMessageDialog(this, "Removed successfully!");
            jTextField21.setText("");
            jTextField22.setText("");
            for (int ii = 0; ii<jTable4.getRowCount();ii++){
            if(jTable4.getModel().getValueAt(ii, 1).equals(lva)){
                DefaultTableModel dttm = (DefaultTableModel) jTable4.getModel();
                 dttm.removeRow(ii);
                ii=ii-1;
            }            
        }
            for (int iii = 0; iii<jTable5.getRowCount();iii++){
            if(jTable5.getModel().getValueAt(iii, 1).equals(lva)){
                DefaultTableModel dtttm = (DefaultTableModel) jTable5.getModel();
                 dtttm.removeRow(iii);
                  iii=iii-1;
            }            
        }
        }
    }
        else {
             JOptionPane.showMessageDialog(this, "Code Error");
        }
                exists = 0;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
                      
 
        if (jTable3.getSelectedRow() >=0){
 
            
            jTextField21.setText((String)jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0));
            jTextField22.setText((String)jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 1));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
                  
        lva = jTextField22.getText();
        
        for (int i = 0; i<jTable3.getRowCount();i++){
            if(jTable3.getModel().getValueAt(i, 1).equals(lva)){
                jTable3.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
        if (exists == 0){
            JOptionPane.showMessageDialog(this, "LVA Not Found");
        }
        exists = 0;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
                        
        lva = jTextField22.getText();
        if (LVA.islva(lva)){
            for (int i = 0; i<jTable3.getRowCount();i++){
            if(jTable3.getModel().getValueAt(i, 1).equals(lva)){
                jTable3.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
            if (exists==0 && jTable3.getSelectedRow()==-1){
                            JOptionPane.showMessageDialog(this, "Not Found");

            }
            else if (jTable3.getSelectedRow()!=-1){
            oldlva = (String)jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 1);

            vorname = jTextField21.getText();
            lva = jTextField22.getText();

            jTable3.getModel().setValueAt(jTextField21.getText(), jTable3.getSelectedRow(), 0);

            jTable3.getModel().setValueAt(jTextField22.getText(), jTable3.getSelectedRow(), 1);
            for (int ii = 0; ii<jTable5.getRowCount();ii++){
            if(jTable5.getModel().getValueAt(ii, 1).equals(oldlva)){
                                jTable5.getModel().setValueAt(jTextField22.getText(),ii,1);


            }            
        }
            for (int ii = 0; ii<jTable4.getRowCount();ii++){
            if(jTable4.getModel().getValueAt(ii, 1).equals(oldlva)){
                                jTable4.getModel().setValueAt(jTextField22.getText(),ii,1);


            }            
        }

    



        }
        else{
            
                
             JOptionPane.showMessageDialog(this, "Already Exists");
        }
       
    }
        else {
             JOptionPane.showMessageDialog(this, "LVA Error");
        }
        exists = 0;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTextField11.setText("");
            jTextField12.setText("");
            lva = "";
vorname = "";// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        matrikelnummer = jTextField23.getText();
        lva = jTextField24.getText(); 
        for (int i = 0; i<jTable1.getRowCount();i++){
            if(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer)){
                studentexists = 1;
                break;
            }
        }
        for (int i = 0; i<jTable3.getRowCount();i++){
            if(jTable3.getModel().getValueAt(i, 1).equals(lva)){
                exists = 1;
                break;
            }
        }
        if (studentexists==1 && exists==1){
            for (int i = 0; i<jTable4.getRowCount();i++){
                if(jTable4.getModel().getValueAt(i, 0).equals(matrikelnummer) && jTable4.getModel().getValueAt(i, 1).equals(lva)){
                    studentexists2 = 1;
                    exists2=1;
                    break;
                }
            }
            
        }
        else if (studentexists == 1 && exists ==0){
            JOptionPane.showMessageDialog(this, "LVA not found");
        }
        else if (studentexists == 0){
            JOptionPane.showMessageDialog(this, "Student not found");

        }
        if (!(studentexists2==1 && exists2==1)&&(exists==1&&studentexists==1)){
            DefaultTableModel dtm = (DefaultTableModel) jTable4.getModel();
            String[] ss = new String [2];
            ss[0]=matrikelnummer;
            ss[1]=lva;
            dtm.addRow(ss);
            jTextField23.setText("");
            jTextField24.setText("");
            
        }
        else if (studentexists2==1 && exists2==1){
            JOptionPane.showMessageDialog(this, "Already signed up");
        }
        
        
        
        
        
        
        
        

        
        
        
        exists = 0;
        studentexists = 0;
        exists2 = 0;
        studentexists2 = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        matrikelnummer = jTextField23.getText();
        lva = jTextField24.getText(); 
        for (int i = 0; i<jTable4.getRowCount();i++){
            if(jTable4.getModel().getValueAt(i, 0).equals(matrikelnummer) && jTable4.getModel().getValueAt(i, 1).equals(lva)){
                DefaultTableModel dtm = (DefaultTableModel) jTable4.getModel();
                 dtm.removeRow(i);
                  JOptionPane.showMessageDialog(this, "Removed successfully!");
                break;
            }            
        }

        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        
 
        if (jTable4.getSelectedRow() >=0){
 
            
            jTextField23.setText((String)jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0));
            jTextField24.setText((String)jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 1));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        tcnummer = jTextField25.getText();
        lva = jTextField26.getText(); 
        for (int i = 0; i<jTable2.getRowCount();i++){
            if(jTable2.getModel().getValueAt(i, 2).equals(tcnummer)){
                dozentexists = 1;
                break;
            }
        }
        for (int i = 0; i<jTable3.getRowCount();i++){
            if(jTable3.getModel().getValueAt(i, 1).equals(lva)){
                exists = 1;
                break;
            }
        }
        if (dozentexists==1 && exists==1){
            for (int i = 0; i<jTable5.getRowCount();i++){
                if(jTable5.getModel().getValueAt(i, 0).equals(tcnummer) && jTable5.getModel().getValueAt(i, 1).equals(lva)){
                    dozentexists2 = 1;
                    exists2=1;
                    break;
                }
            }
            
        }
        else if (dozentexists == 1 && exists ==0){
            JOptionPane.showMessageDialog(this, "LVA not found");
        }
        else if (dozentexists == 0){
            JOptionPane.showMessageDialog(this, "Dozent not found");

        }
        if (!(dozentexists2==1 && exists2==1)&&(exists==1&&dozentexists==1)){
            DefaultTableModel dtm = (DefaultTableModel) jTable5.getModel();
            String[] ss = new String [2];
            ss[0]=tcnummer;
            ss[1]=lva;
            dtm.addRow(ss);
            jTextField25.setText("");
            jTextField26.setText("");
            
        }
        else if (dozentexists2==1 && exists2==1){
            JOptionPane.showMessageDialog(this, "Already signed up");
        }
        
        
        
        
        
        
        
        

        
        
        
        exists = 0;
        dozentexists = 0;
        exists2 = 0;
        dozentexists2 = 0;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
                                                 
        tcnummer = jTextField25.getText();
        lva = jTextField26.getText(); 
        for (int i = 0; i<jTable5.getRowCount();i++){
            if(jTable5.getModel().getValueAt(i, 0).equals(tcnummer) && jTable5.getModel().getValueAt(i, 1).equals(lva)){
                DefaultTableModel dtm = (DefaultTableModel) jTable5.getModel();
                 dtm.removeRow(i);
                  JOptionPane.showMessageDialog(this, "Removed successfully!");
                break;
            }            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked

        if (jTable5.getSelectedRow() >=0){
 
            
            jTextField25.setText((String)jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 0));
            jTextField26.setText((String)jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 1));
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
                 DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
        for (int i = 0; i<jTable6.getRowCount();i++){

                 dtm.removeRow(i);
                 i=i-1;
        }
        
            matrikelnummer=jTextField27.getText();
            for (int i = 0; i<jTable4.getRowCount();i++){
                if(jTable4.getModel().getValueAt(i, 0).equals(matrikelnummer)){
                             String[] ss = new String [1];
            ss[0]=(String)jTable4.getModel().getValueAt(i, 1);
            dtm.addRow(ss);

                    
                }
            }
            
            
              

        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyTyped

    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27KeyTyped

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
        for (int i = 0; i<jTable6.getRowCount();i++){

                 dtm.removeRow(i);
                 i=i-1;
        }
        
            tcnummer=jTextField28.getText();
            for (int i = 0; i<jTable5.getRowCount();i++){
                if(jTable5.getModel().getValueAt(i, 0).equals(tcnummer)){
                             String[] ss = new String [1];
            ss[0]=(String)jTable5.getModel().getValueAt(i, 1);
            dtm.addRow(ss);

                    
                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
        for (int i = 0; i<jTable6.getRowCount();i++){

                 dtm.removeRow(i);
                 i=i-1;
        }
        
            lva=jTextField29.getText();
            for (int i = 0; i<jTable4.getRowCount();i++){
                if(jTable4.getModel().getValueAt(i, 1).equals(lva)){
                             String[] ss = new String [1];
            ss[0]=(String)jTable4.getModel().getValueAt(i, 0);
            dtm.addRow(ss);

                    
                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
        for (int i = 0; i<jTable6.getRowCount();i++){

                 dtm.removeRow(i);
                 i=i-1;
        }
        
            lva=jTextField30.getText();
            for (int i = 0; i<jTable5.getRowCount();i++){
                if(jTable5.getModel().getValueAt(i, 1).equals(lva)){
                             String[] ss = new String [1];
            ss[0]=(String)jTable5.getModel().getValueAt(i, 0);
            dtm.addRow(ss);

                    
                }
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        vorname = "";
        nachname = "";
        matrikelnummer = "";
        fak= "";
        klasse= "";
        email= "";
        phone= "";
        address= "";
        geschlecht= "";
        alter= "";

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        matrikelnummer = jTextField3.getText();
        if (Student.ismatrikelnummer(matrikelnummer)){
            for (int i = 0; i<jTable1.getRowCount();i++){
                if(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer)){
                    jTable1.setRowSelectionInterval(i, i);
                    exists = 1;
                    break;
                }
            }
            if ((jTable1.getSelectedRow()==-1)&&exists==0){
                                JOptionPane.showMessageDialog(this, "Not Found");

                
            }
            
            else if (jTable1.getSelectedRow()!=-1){
                vorname = jTextField1.getText();
                nachname = jTextField2.getText();
                oldmatrikelnummer = (String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);

                jTable1.getModel().setValueAt(jTextField1.getText(), jTable1.getSelectedRow(), 0);

                jTable1.getModel().setValueAt(jTextField2.getText(), jTable1.getSelectedRow(), 1);

                jTable1.getModel().setValueAt(jTextField3.getText(), jTable1.getSelectedRow(), 2);
                jTable1.getModel().setValueAt(jTextField4.getText(), jTable1.getSelectedRow(), 3);
                jTable1.getModel().setValueAt(jTextField5.getText(), jTable1.getSelectedRow(), 4);
                jTable1.getModel().setValueAt(jTextField6.getText(), jTable1.getSelectedRow(), 5);
                jTable1.getModel().setValueAt(jTextField7.getText(), jTable1.getSelectedRow(), 6);
                jTable1.getModel().setValueAt(jTextField8.getText(), jTable1.getSelectedRow(), 7);
                jTable1.getModel().setValueAt(jTextField9.getText(), jTable1.getSelectedRow(), 8);
                jTable1.getModel().setValueAt(jTextField10.getText(), jTable1.getSelectedRow(), 9);
                for (int ii = 0; ii<jTable4.getRowCount();ii++){
                    if(jTable4.getModel().getValueAt(ii, 0).equals(oldmatrikelnummer)){

                        jTable4.getModel().setValueAt(jTextField3.getText(),ii,0);
                    }
                }

            }
            else{

                JOptionPane.showMessageDialog(this, "Already Exists");
            }

        }
        else {
            JOptionPane.showMessageDialog(this, "Mat Error");
        }
        exists = 0;

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        matrikelnummer = jTextField3.getText();
        if (Student.ismatrikelnummer(matrikelnummer)){

            for (int i = 0; i<jTable1.getRowCount();i++){
                if(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer)){
                    System.out.println(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer));
                    jTable1.setRowSelectionInterval(i, i);
                    exists = 1;
                    break;
                }
            }
            if (exists == 0){
                JOptionPane.showMessageDialog(this, "Student Not Found");
            }
            exists = 0;

            int i = jTable1.getSelectedRow();
            if (i>=0){
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.removeRow(i);
                JOptionPane.showMessageDialog(this, "Removed successfully!");
                
                for (int ii = 0; ii<jTable4.getRowCount();ii++){
                    if(jTable4.getModel().getValueAt(ii, 0).equals(matrikelnummer)){
                        DefaultTableModel dttm = (DefaultTableModel) jTable4.getModel();
                        dttm.removeRow(ii);

                        ii=ii-1;
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Mat Error");
        }
        exists = 0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        matrikelnummer = jTextField3.getText();
        if (Student.ismatrikelnummer(matrikelnummer)){
            matrikelnummer = jTextField3.getText();

            for (int i = 0; i<jTable1.getRowCount();i++){
                if(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer)){
                    jTable1.setRowSelectionInterval(i, i);
                    exists = 1;
                    break;
                }
            }
            if (exists == 1){
                JOptionPane.showMessageDialog(this, "Student already exists!");
            }
            if (exists == 0){
                vorname = jTextField1.getText();
                nachname = jTextField2.getText();
                alter= jTextField4.getText();
                fak= jTextField5.getText();
                klasse= jTextField6.getText();
                email= jTextField7.getText();
                phone= jTextField8.getText();
               address = jTextField9.getText();
                geschlecht= jTextField10.getText();
                
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                String[] ss = new String [10];
                ss[0]=vorname;
                ss[1]=nachname;
                ss[2]=matrikelnummer;
                ss[3]=alter;
                ss[4]=fak;
                ss[5]=klasse;
                ss[6]=email;
                ss[7]=phone;
                ss[8]=address;
                ss[9]=geschlecht;
                dtm.addRow(ss);

                exists =0;

            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Mat Error");
        }
        exists = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRow() >=0){

            jTextField1.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
            jTextField2.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
            jTextField3.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
            jTextField4.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
            jTextField5.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
            jTextField6.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
            jTextField7.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
            jTextField8.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 7));
            jTextField9.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 8));
            jTextField10.setText((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 9));
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

    }//GEN-LAST:event_jTable1FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        matrikelnummer = jTextField3.getText();

        for (int i = 0; i<jTable1.getRowCount();i++){
            if(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer)){
                System.out.println(jTable1.getModel().getValueAt(i, 2).equals(matrikelnummer));
                jTable1.setRowSelectionInterval(i, i);
                exists = 1;
                break;
            }
        }
        if (exists == 0){
            JOptionPane.showMessageDialog(this, "Student Not Found");
        }
        exists = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed
        public NewJFrame() {
        initComponents();
    }
@SuppressWarnings("unchecked")  
    public static void main(String args[]) {
        NewJFrame e = new NewJFrame();
        e.setVisible(true);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
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
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
