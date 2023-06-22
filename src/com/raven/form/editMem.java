package com.raven.form;

import com.raven.main.cona;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class editMem extends javax.swing.JPanel {

    int i;

    public editMem() {
        initComponents();
        imglbl.setOpaque(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/raven/icon/delmem.png"));
        imglbl.setBounds(450, 80, 280, 410);
        imglbl.setIcon(i1);
        uadmintbl();
        uregtbl();

        tblAdmin.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblAdmin.getTableHeader().setOpaque(false);
        tblAdmin.getTableHeader().setBackground(Color.decode("#c31432"));
        tblAdmin.getTableHeader().setForeground(new Color(255, 255, 255));
//        tblAdmin.setRowHeight(30);

        tblReg.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblReg.getTableHeader().setOpaque(false);
        tblReg.getTableHeader().setBackground(Color.decode("#c31432"));
        tblReg.getTableHeader().setForeground(new Color(255, 255, 255));
//        tblReg.setRowHeight(30);

    }

    void uadmintbl() {
        try {
            cona c = new cona();
            ResultSet rs = c.s.executeQuery("select * from login");
            ResultSetMetaData stdata = rs.getMetaData();
            int q = stdata.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) tblAdmin.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("username"));
                    columnData.add(rs.getString("password"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void uregtbl() {
        try {
            cona c = new cona();
            ResultSet rs = c.s.executeQuery("select * from loginreg");
            ResultSetMetaData stdata = rs.getMetaData();
            int q = stdata.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) tblReg.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("username"));
                    columnData.add(rs.getString("password"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReg = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        imglbl = new javax.swing.JLabel();
        myButton1 = new com.raven.main.MyButton();

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Passwords"
            }
        )

        {
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        }
    );
    tblAdmin.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
    tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblAdminMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tblAdmin);

    tblReg.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Username", "Password"
        }
    )

    {
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    }
    );
    tblReg.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
    tblReg.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblRegMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(tblReg);

    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel1.setText("Admin");

    jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel2.setText("Registration");

    jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel3.setText("Username");

    jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel4.setText("Password");

    txtusername.setEditable(false);
    txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtusernameMouseClicked(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
    jLabel5.setText("Edit Member Details");

    myButton1.setText("UPDATE");
    myButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            myButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addGap(156, 156, 156))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(132, 132, 132)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(127, 127, 127))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(jLabel5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(imglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        // TODO add your handling code here:

        DefaultTableModel RecordTable = (DefaultTableModel) tblAdmin.getModel();
        int SelectedRows = tblAdmin.getSelectedRow();
        txtusername.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtpassword.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        i = 1;
    }//GEN-LAST:event_tblAdminMouseClicked

    private void tblRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) tblReg.getModel();
        int SelectedRows = tblReg.getSelectedRow();
        txtusername.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtpassword.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        i = 2;
    }//GEN-LAST:event_tblRegMouseClicked

    private void txtusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Username is UnEditable");
    }//GEN-LAST:event_txtusernameMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
                if (txtusername.getText().trim().isEmpty() || txtpassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Requirements", null,
                JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                cona c = new cona();
                String user = txtusername.getText();
                String pass = txtpassword.getText();
                if (i == 1) {
                    String query = "UPDATE `login` SET `password`='" + pass + "' WHERE `username`='" + user + "' ";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Successfully Updated");
                } else if (i == 2) {
                    String query = "UPDATE `loginreg` SET `password`='" + pass + "' WHERE `username`='" + user + "' ";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Successfully Updated");
                } else {
                    //                    JOptionPane.showMessageDialog(null, "Select Data From Table!!");
                    JOptionPane.showMessageDialog(null, "Select Data From Table!!", null,
                        JOptionPane.ERROR_MESSAGE);

                }
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    void clear() {
        txtusername.setText("");
        txtpassword.setText("");
        uadmintbl();
        uregtbl();
    }

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#2193b0"), 0, getHeight(), Color.decode("#6dd5ed"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.raven.main.MyButton myButton1;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTable tblReg;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
