package STCMGui;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Iterator;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tejas
 */
public class ParAlter extends javax.swing.JPanel {

    /**
     * Creates new form ParAlter
     */
    GridBagLayout layout = new GridBagLayout();
    ParAlter12345 p12345;

    public ParAlter() {
        initComponents();
        jButton2.setVisible(false);
        jTextField2.setVisible(false);
        jLabel4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Alter");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Partcipant Name");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Participant Organization");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Participant Address");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Participant Email");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Participant Mobile");

        jLabel2.setText("Delete");

        jLabel3.setText("Enter name of the Participant to Alter details");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Partcipant name");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Participant Organization");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Participant Address");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("Participant Email");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("Participant Mobile");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter the new value :");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton10)
                                .addGap(69, 69, 69)
                                .addComponent(jButton1))
                            .addComponent(jRadioButton5)))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(547, 547, 547))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String s = jTextField1.getText();
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected() || jRadioButton5.isSelected()) {
            jLabel4.setVisible(true);
            jTextField2.setVisible(true);
            jButton2.setVisible(true);
        } else if (jRadioButton6.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].pname = "";
                    }
                }
            }
            
            SwingUtilities.getWindowAncestor(this).dispose();

        } else if (jRadioButton7.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].porg = "";
                    }
                }
            }
            SwingUtilities.getWindowAncestor(this).dispose();
        } else if (jRadioButton8.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].padd = "";
                    }
                }
            }
            SwingUtilities.getWindowAncestor(this).dispose();

        } else if (jRadioButton9.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].pemail = "";
                    }
                }
            }
            SwingUtilities.getWindowAncestor(this).dispose();

        } else if (jRadioButton10.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].pmobile = "";
                    }
                }
            }
            SwingUtilities.getWindowAncestor(this).dispose();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String s = jTextField1.getText();
        if (jRadioButton1.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].pname = jTextField2.getText() ;
                    }
                }
            }

        } else if (jRadioButton2.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].porg = jTextField2.getText() ;
                    }
                }
            }

        } else if (jRadioButton3.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].padd = jTextField2.getText() ;
                    }
                }
            }

        } else if (jRadioButton4.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].pemail = jTextField2.getText() ;
                    }
                }
            }
        } else if (jRadioButton5.isSelected()) {
            Iterator it = STCMgui.a.iterator();
            while (it.hasNext()) {
                Course c1 = ((Course) it.next());
                Participant[] f = c1.par;
                for (int i = 0; i < c1.parno; i++) {

                    String namef = f[i].pname;
                    if (namef.equalsIgnoreCase(s)) {
                        f[i].pmobile = jTextField2.getText() ;
                    }
                }
            }
        }
        SwingUtilities.getWindowAncestor(this).dispose();


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
