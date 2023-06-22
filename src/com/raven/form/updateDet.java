package com.raven.form;

import com.raven.main.cona;
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
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateDet extends javax.swing.JPanel {
String id;
    public updateDet() {
        initComponents();
             imglbl.setOpaque(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/raven/icon/update.png"));
//            JLabel image = new JLabel(i1);
            imglbl.setBounds(450,80,280,410);
//            add(image);
imglbl.setIcon(i1);

try{

    conreg c=new conreg();
//                cona c=new cona();
//            ResultSet rs;
            ResultSet rs=c.s.executeQuery("select * from passen");
            ResultSetMetaData stdata=rs.getMetaData();
            int q=stdata.getColumnCount();
            DefaultTableModel  RecordTable=(DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            while(rs.next()){
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
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
}catch(Exception e){    JOptionPane.showMessageDialog(null,e);  }

        
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
        jLabel1.setText("UPDATE PASSENGER DETAILS");

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
    jTable1.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBorderColor"));
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

    txtname.setBackground(new java.awt.Color(204, 204, 204));

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

    txtno.setBackground(new java.awt.Color(204, 204, 204));

    txtphone.setBackground(new java.awt.Color(204, 204, 204));
    txtphone.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtphoneKeyTyped(evt);
        }
    });

    jCheckBox2.setBackground(new java.awt.Color(204, 204, 204));
    buttonGroup1.add(jCheckBox2);
    jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jCheckBox2.setText("Female");

    jCheckBox3.setBackground(new java.awt.Color(204, 204, 204));
    buttonGroup1.add(jCheckBox3);
    jCheckBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jCheckBox3.setText("Male");

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
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(39, 39, 39))
        .addComponent(jScrollPane1)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
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
                    .addGap(140, 140, 140)
                    .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(136, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(0, 0, 0)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(txtdst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
                DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
        int SelectedRows=jTable1.getSelectedRow();
        txtname.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtphone.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtcode.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtno.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
              String gen=(RecordTable.getValueAt(SelectedRows, 4).toString());
//              System.out.println(""+gen);
//              if (gen=="male"||gen=="Male")
              if(gen.equals("male") || gen.equals("Male")){
            jCheckBox3.setSelected(true);
//buttonGroup1.setSelected((ButtonModel) jCheckBox3, true);
//buttonGroup1.setSelected(ButtonModel jCheckBox1, true);
        }
//              else if (gen=="female"||gen=="Female")
              else if (gen.equals("female") || gen.equals("Female")){
            jCheckBox2.setSelected(true);
//buttonGroup1.setSelected((ButtonModel) jCheckBox2, true);
        }
        txtsrc.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        txtdst.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        id=(RecordTable.getValueAt(SelectedRows, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        // TODO add your handling code here:
                 JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtsrcMouseClicked

    private void txtdstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdstMouseClicked
        // TODO add your handling code here:
                 JOptionPane.showMessageDialog(null, "This Field is UnEditable");
    }//GEN-LAST:event_txtdstMouseClicked

    private void txtcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcodeMouseClicked
        // TODO add your handling code here:        
                 JOptionPane.showMessageDialog(null, "This Field is UnEditable \n Cancel and Book New Ticket If You Want To Change Flight");
    }//GEN-LAST:event_txtcodeMouseClicked

    private void txtphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtphoneKeyTyped

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
    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
                if (txtcode.getText().trim().isEmpty() || txtdst.getText().trim().isEmpty() || txtname.getText().trim().isEmpty() || txtno.getText().trim().isEmpty() || txtphone.getText().trim().isEmpty() || txtsrc.getText().trim().isEmpty()) {
                     JOptionPane.showMessageDialog(null,"Please Fill All Requirements",null,
                                    JOptionPane.ERROR_MESSAGE);
        }else{
            try {
            String code=txtcode.getText().trim();
            String dst=txtdst.getText().trim();
            String name=txtname.getText().trim();
            String no=txtno.getText().trim();
            String phone=txtphone.getText().trim();
            String src=txtsrc.getText().trim();
            String gen="";
            if (jCheckBox3.isSelected()) {
                gen="Male";
            }else if(jCheckBox2.isSelected()){
                gen="Female";
            }else{
                 JOptionPane.showMessageDialog(null, "Please Select a Gender");
            }
            cona c=new cona();
            String query="UPDATE `passen` SET `name`='"+name+"',`p_no`='"+phone+"',`fl_code`='"+code+"',`no_ticket`='"+no+"',`gender`='"+gen+"',`src`='"+src+"',`dst`='"+dst+"' WHERE `id`='"+id+"'";
                c.s.executeUpdate(query);
                update_tbl();
                remove();
            } catch (Exception ex) {
//                Logger.getLogger(updateDet.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    void remove(){
        txtname.setText("");
        txtcode.setText("");
        txtdst.setText("");
        txtno.setText("");
        txtphone.setText("");
        txtsrc.setText("");
        buttonGroup1.clearSelection();
    }
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
