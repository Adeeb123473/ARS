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

public class bookTic extends javax.swing.JPanel {

    int seat;
    String code, f_name, source, destination, noseat;

    public bookTic() {
        initComponents();
//           String dst=txtdst1.getEditor().getItem().toString();
//      String src= txtsrc1.getEditor().getItem().toString();
        imglbl.setOpaque(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/raven/icon/bookticket.png"));
//            JLabel image = new JLabel(i1);
        imglbl.setBounds(450, 80, 280, 410);
//            add(image);
        imglbl.setIcon(i1);

        String src = txtsrc.getText();
//        String src=combsrc.getSelectedItem();
        String dst = txtdst.getText();
        try {

            conreg c = new conreg();
//                cona c=new cona();
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
                    columnData.add(rs.getString("time_depar"));
                    columnData.add(rs.getString("date_depar"));
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtphn = new javax.swing.JTextField();
        chkmale = new javax.swing.JCheckBox();
        chkfemale = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtsrc = new javax.swing.JTextField();
        txtdst = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        imglbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        myButton1 = new com.raven.main.MyButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Book Ticket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        txtname.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Source");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Destination");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Fights Code");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("No. of Tickets");

        txtnum.setBackground(new java.awt.Color(204, 204, 204));
        txtnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Phone No");

        txtphn.setBackground(new java.awt.Color(204, 204, 204));
        txtphn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphnActionPerformed(evt);
            }
        });
        txtphn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtphnKeyTyped(evt);
            }
        });

        chkmale.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(chkmale);
        chkmale.setText("Male");

        chkfemale.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(chkfemale);
        chkfemale.setText("Female");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Source", "Destination", "Seats", "Flight Code","Time_depar","Date_depar"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        }

    );
    jTable1.setToolTipText("");
    jTable1.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Button.hoverBorderColor"));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

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

    jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jLabel9.setText("Available Flights");

    myButton1.setText("RESERVE");
    myButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            myButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(96, 96, 96)
                    .addComponent(jLabel9))
                .addGroup(layout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addComponent(jLabel1)))
            .addContainerGap(251, Short.MAX_VALUE))
        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addComponent(jLabel4)
                .addComponent(jLabel5)
                .addComponent(jLabel6)
                .addComponent(jLabel7)
                .addComponent(jLabel8))
            .addGap(73, 73, 73)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtphn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(chkmale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(chkfemale))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtcode, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsrc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
            .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(70, 70, 70))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkmale)
                                    .addComponent(chkfemale))
                                .addGap(18, 18, 18)
                                .addComponent(txtphn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4))
                .addComponent(jLabel9))
            .addGap(0, 0, 0)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    }// </editor-fold>//GEN-END:initComponents

    void clear() {
        txtname.setText("");
        txtcode.setText("");
        txtdst.setText("");
//combdst.setSelectedItem(null);
        txtphn.setText("");
        txtsrc.setText("");
//combsrc.setSelectedItem(null);
        txtnum.setText("");
        buttonGroup2.clearSelection();
        update_tbl();
    }

    void update_tbl() {
        try {
            conreg c = new conreg();
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
//                    columnData.add(rs.getString("gender"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
//        txtname.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        f_name = RecordTable.getValueAt(SelectedRows, 0).toString();
//        txtsrc.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        source = RecordTable.getValueAt(SelectedRows, 1).toString();
        txtsrc.setText(source);
//combsrc.setSelectedItem(source);
        destination = RecordTable.getValueAt(SelectedRows, 2).toString();
        txtdst.setText(destination);
//combdst.setSelectedItem(destination);
//        txtseat.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        noseat = RecordTable.getValueAt(SelectedRows, 3).toString();
        code = RecordTable.getValueAt(SelectedRows, 4).toString();
        txtcode.setText(code);
// cod=Integer.parseInt(code);
        seat = Integer.parseInt(noseat);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtdstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdstMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Select From the Available Flights Below");
    }//GEN-LAST:event_txtdstMouseClicked

    private void txtcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcodeMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Select From the Available Flights Below");
    }//GEN-LAST:event_txtcodeMouseClicked

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Select From the Available Flights Below");
    }//GEN-LAST:event_txtsrcMouseClicked

    private void txtnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumKeyTyped

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
                if (txtcode.getText().trim().isEmpty() ) {

        } else {
            String name = txtname.getText();
            String numberOfTicket = txtnum.getText();
            int nt = Integer.parseInt(numberOfTicket);
            String phone = txtphn.getText();
            String dst = txtdst.getText();
//            String dst=combdst.getEditor().getItem().toString();
            String src = txtsrc.getText();
//            String src =combsrc.getEditor().getItem().toString();
            String f = txtcode.getText();
//       String dst=txtdst1.getEditor().getItem().toString();
//      String src= txtsrc1.getEditor().getItem().toString();
//       String f=txtflight.getEditor().getItem().toString();
            String gen = "";
            if (chkmale.isSelected()) {
                gen = "male";
            } else if (chkfemale.isSelected()) {
                gen = "female";
            } else {
                JOptionPane.showMessageDialog(null, "Please Select Gender ");
            }
            try {
                int aa = seat - nt;
                if (aa < 0) {
                    JOptionPane.showMessageDialog(null, "There are " + seat + " Ticket available");
                } else {
                    String query = "INSERT INTO `passen`(`name`, `p_no`, `fl_code`, `no_ticket`, `gender`, `src`, `dst`) VALUES ('" + name + "','" + phone + "','" + f + "','" + numberOfTicket + "','" + gen + "','" + src + "','" + dst + "')";
                    conreg c = new conreg();
                    c.s.executeUpdate(query);
                    String qur = "UPDATE `flight` SET `f_name`='" + f_name + "',`src`='" + source + "',`dst`='" + destination + "',`seats`='" + aa + "' WHERE `f_code`='" + code + "'";
                    c.s.executeUpdate(qur);
                    JOptionPane.showMessageDialog(null, "Successfully Added ");
                    clear();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtphnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphnActionPerformed

    private void txtphnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphnKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtphnKeyTyped

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        GradientPaint g = new GradientPaint(0, 0, Color.decode("#005AA7"), 0, getHeight(), Color.decode("#FFFDE4"));
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#4CA1AF"), 0, getHeight(), Color.decode("#C4E0E5"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkfemale;
    private javax.swing.JCheckBox chkmale;
    private javax.swing.JLabel imglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.raven.main.MyButton myButton1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdst;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtphn;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
