package com.raven.form;

import com.raven.main.cona;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class addFlight extends javax.swing.JPanel {
//String s=dateField.getText();
    public addFlight() {
        initComponents();
        imglbl.setOpaque(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/raven/icon/addf.png"));
        imglbl.setBounds(450, 80, 280, 410);
        imglbl.setIcon(i1);
    }

    public void remove() {
        txtname.setText("");
        txtcode.setText("");
        txtdes.setSelectedItem(null);
        txtsrc.setSelectedItem(null);
        txtnum.setText("");
        dateField.setText("YYYY/MM/DD");
        txttime.setText("HH:MM");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        imglbl = new javax.swing.JLabel();
        txtsrc = new javax.swing.JComboBox<>();
        txtdes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        myButton3 = new com.raven.main.MyButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ADD FLIGHT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("FLIGHT  CODE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NO OF SEATS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("FLIGHT NAME");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("SOURCE ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("DESTINATION");

        txtcode.setBackground(new java.awt.Color(204, 204, 204));
        txtcode.setActionCommand("<Not Set>");

        txtname.setBackground(new java.awt.Color(204, 204, 204));

        txtnum.setBackground(new java.awt.Color(204, 204, 204));
        txtnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumKeyTyped(evt);
            }
        });

        txtsrc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "Philippines", "Malaysia", "Singapore", "Thailand", "Indonesia" }));
        txtsrc.setSelectedItem(null);

        txtdes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "Philippines", "Malaysia", "Singapore", "Thailand", "Indonesia" }));
        txtdes.setSelectedItem(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Departure Date");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Departure Time");

        dateField.setBackground(new java.awt.Color(204, 204, 204));
        dateField.setText("YYYY/MM/DD");
        dateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFieldFocusLost(evt);
            }
        });
        dateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateFieldKeyTyped(evt);
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
        txttime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttimeKeyTyped(evt);
            }
        });

        myButton3.setText("SAVE");
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(txtnum)
                            .addComponent(txtsrc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateField)
                            .addComponent(txttime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumKeyTyped

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
       try{
        if (txtcode.getText().trim().isEmpty() || dateField.getText().trim().isEmpty() || txtname.getText().trim().isEmpty() || txtnum.getText().trim().isEmpty() || txttime.getText().trim().isEmpty() || txtdes.getSelectedItem() == null || txtsrc.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please Fill All Requirements", null,
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String answer = dateField.getText();
            char[] valid = answer.toCharArray();

            String timeans = txttime.getText();
            char[] tim = timeans.toCharArray();

            if (valid[4] == '/' && valid[7] == '/') {
                if (tim[2] == ':') {
                    String f_name = txtname.getText().trim();
                    String f_code = txtcode.getText().trim();
                    String src = txtsrc.getEditor().getItem().toString();
                    String dst = txtdes.getEditor().getItem().toString();
                    String date = dateField.getText().trim();
                    String time = txttime.getText().trim();
                    int num = Integer.parseInt(txtnum.getText().trim());

                    try {
                        cona c = new cona();
                        String str = "INSERT INTO `flight`(`f_name`, `src`, `dst`, `seats`, `f_code`, `time_depar`, `date_depar`) VALUES ('" + f_name + "','" + src + "','" + dst + "','" + num + "','" + f_code + "','" + time + "','" + date + "')";
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null, "Flight Added");
                        remove();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Hour in HH:SS Format");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Valid date in YYYY/MM/DD Format");
            }
        }
       }catch(Exception e ){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_myButton3ActionPerformed

    private void dateFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SLASH))) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid");
            evt.consume();
        }
    }//GEN-LAST:event_dateFieldKeyTyped

    private void dateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFieldFocusGained
        // TODO add your handling code here:
        if (dateField.getText().equals("YYYY/MM/DD")) {
            dateField.setText("");
        }
    }//GEN-LAST:event_dateFieldFocusGained

    private void dateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFieldFocusLost
        // TODO add your handling code here:
        if (dateField.getText().equals("")) {
            dateField.setText("YYYY/MM/DD");
        }
    }//GEN-LAST:event_dateFieldFocusLost

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

    private void txttimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE) || (c == ':'))) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid");
            evt.consume();
        }
    }//GEN-LAST:event_txttimeKeyTyped

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#4CA1AF"), 0, getHeight(), Color.decode("#C4E0E5"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
        txtsrc.setBackground(Color.gray);
        txtdes.setBackground(Color.gray);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel imglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.raven.main.MyButton myButton3;
    private javax.swing.JTextField txtcode;
    private javax.swing.JComboBox<String> txtdes;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnum;
    private javax.swing.JComboBox<String> txtsrc;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
