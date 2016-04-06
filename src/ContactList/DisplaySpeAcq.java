/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

/**
 *
 * @author tejas
 */
public class DisplaySpeAcq extends javax.swing.JPanel {

    /**
     * Creates new form DisplaySpeAcq
     */
    public DisplaySpeAcq() {
        initComponents();
        jTextArea1.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Type of Acquaintance to Display :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Relative", "Personal Friend", "Professional Friend", "Casual Friend" }));

        jLabel2.setText("List of :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)))
                        .addGap(0, 319, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x = jComboBox1.getSelectedIndex();
        StringBuffer s = new StringBuffer();
        if (x == 0) {
            if (CL_Gui.ar.size() != 0) {
                int i = 1;
                s.append("\nRELATIVES:");
                for (Relative a : CL_Gui.ar) {
                    s.append("\nRelative " + i + ":");
                    s.append("\n" + a);
                    i++;
                }
            }
            jTextArea1.setText(s.toString());
        } else if (x == 1) {
            if (CL_Gui.apef.size() != 0) {
                int i = 1;
                s.append("\n\nPERSONAL FRIENDS:");
                for (PerFriend a : CL_Gui.apef) {
                    s.append("\nPersonal Friend " + i + ":");
                    s.append("\n" + a);
                    i++;
                }

            }
            jTextArea1.setText(s.toString());
        } else if (x == 2) {
            if (CL_Gui.aprf.size() != 0) {
                int i = 1;
                s.append("\n\nPROFESSIONAL FRIENDS:");
                for (ProFriend a : CL_Gui.aprf) {
                    s.append("\nProfessional Friend " + i + ":");
                    s.append("\n" + a);
                    i++;
                }

            }
            jTextArea1.setText(s.toString());
        } else if (x == 3) {
            if (CL_Gui.acf.size() != 0) {
                int i = 1;
                s.append("\n\nCASUAL FRIENDS:");
                for (CasFriend a : CL_Gui.acf) {
                    s.append("\nCasual Friend " + i + ":");
                    s.append("\n" + a);
                    i++;
                }

            }
            jTextArea1.setText(s.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
