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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class viewFlights extends javax.swing.JPanel {

    public viewFlights() {
        initComponents();
    try {
            cona c=new cona();
//            ResultSet rs;
            ResultSet rs=c.s.executeQuery("select * from flight");
            ResultSetMetaData stdata=rs.getMetaData();
            int q=stdata.getColumnCount();
            DefaultTableModel  RecordTable=(DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            while(rs.next()){
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
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
        JOptionPane.showMessageDialog(null,ex);
        }
    
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(Color.decode("#c31432"));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setRowHeight(30);
    }

    
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("AVAILABLE FLIGHTS");

        jTable1.setForeground(Color.BLACK);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight Name", "Destination", "Source", "Seats", "Flight Code","Dept_Date","Dept_Time"
            }
        )

        {
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        }
    );
    jTable1.setRowHeight(30);
    jTable1.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(299, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(294, 294, 294))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
