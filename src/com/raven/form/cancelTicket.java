package com.raven.form;

import com.raven.main.conreg;
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

public class cancelTicket extends javax.swing.JPanel {

    int id, numberOfTickets;
    String code;

    public cancelTicket() {
        initComponents();
        imglbl.setOpaque(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/raven/icon/update.png"));
//            JLabel image = new JLabel(i1);
        imglbl.setBounds(450, 80, 280, 410);
//            add(image);
        imglbl.setIcon(i1);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        try {

            conreg c = new conreg();
//                cona c=new cona();
//            ResultSet rs;
            ResultSet rs = c.s.executeQuery("select * from passen");
            ResultSetMetaData stdata = rs.getMetaData();
            int q = stdata.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("p_no"));
                    columnData.add(rs.getString("fl_code"));
                    columnData.add(rs.getString("no_ticket"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("src"));
                    columnData.add(rs.getString("dst"));
                    columnData.add(rs.getString("id"));
//                    columnData.add(rs.getString("time_depar"));
//                    columnData.add(rs.getString("date_depar"));
                    
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(Color.decode("#c31432"));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtsrc = new javax.swing.JTextField();
        txtdst = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        imglbl = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        myButton1 = new com.raven.main.MyButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CANCEL PASSENGER ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Phone_No" ,"Flight_Code", "No_Of_Tickets", "Gender","Src","Dst","id"
            }
        )

        {
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        }
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel2.setText("Name");

    jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel3.setText("Source");

    jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel4.setText("Destination");

    jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel5.setText("Flight_code");

    jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
    jLabel6.setText("No_of_Tickets");

    jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel7.setText("Phone_No");

    txtname.setEditable(false);
    txtname.setBackground(new java.awt.Color(204, 204, 204));
    txtname.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtnameMouseClicked(evt);
        }
    });

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

    txtcode.setEditable(false);
    txtcode.setBackground(new java.awt.Color(204, 204, 204));
    txtcode.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtcodeMouseClicked(evt);
        }
    });

    txtno.setEditable(false);
    txtno.setBackground(new java.awt.Color(204, 204, 204));
    txtno.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtnoMouseClicked(evt);
        }
    });
    txtno.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtnoKeyTyped(evt);
        }
    });

    txtphone.setEditable(false);
    txtphone.setBackground(new java.awt.Color(204, 204, 204));
    txtphone.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtphoneMouseClicked(evt);
        }
    });

    jCheckBox2.setBackground(new java.awt.Color(204, 204, 204));
    buttonGroup1.add(jCheckBox2);
    jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jCheckBox2.setText("Female");
    jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jCheckBox2MouseClicked(evt);
        }
    });

    jCheckBox3.setBackground(new java.awt.Color(204, 204, 204));
    buttonGroup1.add(jCheckBox3);
    jCheckBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jCheckBox3.setText("Male");
    jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jCheckBox3MouseClicked(evt);
        }
    });

    myButton1.setText("DELETE");
    myButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            myButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(20, 20, 20)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtname)
                        .addComponent(txtcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtdst, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtsrc, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jCheckBox3)
                            .addGap(3, 3, 3)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(72, 72, 72))
        .addGroup(layout.createSequentialGroup()
            .addGap(91, 91, 91)
            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
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
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox3)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        txtname.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtphone.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtcode.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        code = txtcode.getText();
        txtno.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        numberOfTickets = Integer.parseInt(txtno.getText());
        String gen = (RecordTable.getValueAt(SelectedRows, 4).toString());
        id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 7).toString());

        if (gen.equals("male") || gen.equals("Male")) {
            jCheckBox3.setSelected(true);
        } else if (gen.equals("female") || gen.equals("Female")) {
            jCheckBox2.setSelected(true);
        }
        txtsrc.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        txtdst.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnoKeyTyped

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        

        try {
            String value = "";
            conreg c = new conreg();
            String query1 = "DELETE FROM `passen` WHERE `id`='" + id + "'";
            c.s.executeUpdate(query1);
            String query2 = "SELECT `seats` FROM `flight` WHERE `f_code`='" + code + "'";
            ResultSet rs = c.s.executeQuery(query2);
            while (rs.next()) {
                value = rs.getString(1);
            }

            int val = Integer.parseInt(value);
            int res = val + numberOfTickets;
            rs.close();
            String[] fl = new String[7];
            int i = 0;
            String query3 = "SELECT * FROM `flight` WHERE `f_code`='" + code + "'";
            ResultSet rs1 = c.s.executeQuery(query3);
            while (rs1.next()) {
                fl[0] = rs1.getString("f_name");
                fl[1] = (rs1.getString("src"));
                fl[2] = (rs1.getString("dst"));
                fl[3] = (rs1.getString("seats"));
            }
            String query4 = "UPDATE `flight` SET `f_name`='" + fl[0] + "',`src`='" + fl[1] + "',`dst`='" + fl[2] + "',`seats`='" + res + "' WHERE `f_code`='" + code + "'";
            c.s.executeUpdate(query4);
            JOptionPane.showMessageDialog(null, "Succefully Cancelled Tickets");
            clear();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtnameMouseClicked

    private void txtdstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdstMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtdstMouseClicked

    private void txtcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcodeMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtcodeMouseClicked

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtsrcMouseClicked

    private void txtnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnoMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtnoMouseClicked

    private void txtphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtphoneMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtphoneMouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_jCheckBox2MouseClicked

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        GradientPaint g = new GradientPaint(0, 0, Color.decode("#005AA7"), 0, getHeight(), Color.decode("#FFFDE4"));
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#36D1DC"), 0, getHeight(), Color.decode("#5B86E5"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    void clear() {
        update_tbl();
        txtcode.setText("");
        txtdst.setText("");
        txtname.setText("");
        txtphone.setText("");
        txtname.setText("");
        txtsrc.setText("");
        txtno.setText("");
        buttonGroup1.clearSelection();
    }

    void update_tbl() {
        try {
            conreg c = new conreg();
            ResultSet rs = c.s.executeQuery("select * from passen");
            ResultSetMetaData stdata = rs.getMetaData();
            int q = stdata.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("p_no"));
                    columnData.add(rs.getString("fl_code"));
                    columnData.add(rs.getString("no_ticket"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("src"));
                    columnData.add(rs.getString("dst"));
                    columnData.add(rs.getString("id"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imglbl;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.raven.main.MyButton myButton1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdst;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
