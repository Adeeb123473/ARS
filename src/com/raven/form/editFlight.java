package com.raven.form;

import com.raven.main.cona;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class editFlight extends javax.swing.JPanel {

    public editFlight() {
        initComponents();
        delbtn.setOpaque(false);
        editbtn.setOpaque(false);
        imglbl.setOpaque(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/raven/icon/addf.png"));
        imglbl.setBounds(250, 80, 280, 210);
        imglbl.setIcon(i1);
        try {
            cona c = new cona();
//            ResultSet rs;
            ResultSet rs = c.s.executeQuery("select * from flight");
            ResultSetMetaData stdata = rs.getMetaData();
            int q = stdata.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("f_name"));
                    columnData.add(rs.getString("src"));
                    columnData.add(rs.getString("dst"));
                    columnData.add(rs.getString("seats"));
                    columnData.add(rs.getString("f_code"));
                    columnData.add(rs.getString("date_depar"));
                    columnData.add(rs.getString("time_depar"));

                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

//        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(Color.decode("#c31432"));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtsrc = new javax.swing.JTextField();
        txtdst = new javax.swing.JTextField();
        txtseat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        imglbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        editbtn = new com.raven.main.MyButton();
        delbtn = new com.raven.main.MyButton();

        setPreferredSize(new java.awt.Dimension(700, 414));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Source", "Destination", "Seats", "Flight Code", "Dept_Date", "Dept_Time"
            }
        )

        {
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        }
    );
    jTable1.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel1.setText("Flight Name");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel2.setText("Flight Code");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel3.setText("Source");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel4.setText("Destination");

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel5.setText("Seats Available");

    txtname.setBackground(new java.awt.Color(204, 204, 204));

    txtcode.setEditable(false);
    txtcode.setBackground(new java.awt.Color(204, 204, 204));

    txtsrc.setEditable(false);
    txtsrc.setBackground(new java.awt.Color(204, 204, 204));
    txtsrc.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtsrcMouseClicked(evt);
        }
    });

    txtdst.setEditable(false);
    txtdst.setBackground(new java.awt.Color(204, 204, 204));
    txtdst.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtdstMouseClicked(evt);
        }
    });

    txtseat.setBackground(new java.awt.Color(204, 204, 204));
    txtseat.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtseatKeyTyped(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel6.setText("Edit Flights");

    jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
    jLabel7.setText("Departure Date");

    jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
    jLabel8.setText("Departure Time");

    txtdate.setBackground(new java.awt.Color(204, 204, 204));
    txtdate.setText("YYYY/MM/DD");
    txtdate.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txtdateFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtdateFocusLost(evt);
        }
    });

    txttime.setBackground(new java.awt.Color(204, 204, 204));
    txttime.setText("HH:MM");
    txttime.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txttimeFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txttimeFocusLost(evt);
        }
    });

    editbtn.setText("EDIT");
    editbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            editbtnActionPerformed(evt);
        }
    });

    delbtn.setText("DELETE");
    delbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            delbtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtseat)
                            .addComponent(txtname)
                            .addComponent(txtcode)
                            .addComponent(txtsrc)
                            .addComponent(txtdst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addGap(25, 25, 25)
                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(104, 104, 104))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtdst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        txtname.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtsrc.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtdst.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtseat.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        txtcode.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        txttime.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        txtdate.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtseatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseatKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtseatKeyTyped

    private void txtdstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdstMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Destination Of Flight Is UnEditable");
    }//GEN-LAST:event_txtdstMouseClicked

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Source Of Flight Is UnEditable");
    }//GEN-LAST:event_txtsrcMouseClicked

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        if (txtname.getText().trim().isEmpty() || txtcode.getText().trim().isEmpty() || txtdate.getText().trim().isEmpty() || txtdst.getText().trim().isEmpty() || txtseat.getText().trim().isEmpty() || txtsrc.getText().trim().isEmpty() || txttime.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Requirements", null,
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String ansdate = txtdate.getText();
            char[] arrdate = ansdate.toCharArray();
            if (arrdate[4] == '/' && arrdate[7] == '/') {
             String time11=txttime.getText();
             char[] arrtime=time11.toCharArray();
             if(arrtime[2]==':'){
                try {
                    cona c = new cona();
                    String f_name = txtname.getText().trim();
                    String src = txtsrc.getText();
                    String dst = txtdst.getText();
                    String seat = txtseat.getText().trim();
                    String f_code = txtcode.getText().trim();
                    String date = txtdate.getText();
                    String time = txttime.getText();
                    String query = "UPDATE `flight` SET `f_name`='" + f_name + "',`src`='" + src + "',`dst`='" + dst + "',`seats`='" + seat + "', `time_depar`='" + time + "',`date_depar`='" + date + "'WHERE `f_code`='" + f_code + "'";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Successfully Updated");
//                setVisible(false);
                    remove();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                }else{
                 JOptionPane.showMessageDialog(null, "Enter Valid Time HH:MM");
             }
            }else{
                JOptionPane.showMessageDialog(null, "Enter Valid Date YYYY/MM/DD");
            }
        }

    }//GEN-LAST:event_editbtnActionPerformed

    void remove() {
        txtname.setText("");
        txtsrc.setText("");
        txtdst.setText("");
        txtseat.setText("");
        txtcode.setText("");
        txtdate.setText("YYYY/MM/DD");
        txttime.setText("HH:MM");
    }

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        // TODO add your handling code here:
        try {
            cona c = new cona();
            String query = "DELETE FROM `flight` WHERE `f_code`='" + txtcode.getText() + "'";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            remove();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delbtnActionPerformed

    private void txtdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusGained
        // TODO add your handling code here:
                if (txtdate.getText().equals("YYYY/MM/DD")) {
            txtdate.setText("");
        }
    }//GEN-LAST:event_txtdateFocusGained

    private void txtdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusLost
        // TODO add your handling code here:
                if (txtdate.getText().equals("")) {
            txtdate.setText("YYYY/MM/DD");
        }
    }//GEN-LAST:event_txtdateFocusLost

    private void txttimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimeFocusGained
        // TODO add your handling code here:
                if (txttime.getText().equals("HH:MM")) {
            txttime.setText("");
        }
    }//GEN-LAST:event_txttimeFocusGained

    private void txttimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimeFocusLost
        // TODO add your handling code here:
                if (txttime.getText().equals("")) {
            txttime.setText("HH:MM");
        }
    }//GEN-LAST:event_txttimeFocusLost

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#4CA1AF"), 0, getHeight(), Color.decode("#C4E0E5"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.main.MyButton delbtn;
    private com.raven.main.MyButton editbtn;
    private javax.swing.JLabel imglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdst;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtseat;
    private javax.swing.JTextField txtsrc;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
