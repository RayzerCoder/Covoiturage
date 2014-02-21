package team.esprit.presentation;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GestionDesReclamations extends javax.swing.JFrame {

    public GestionDesReclamations() {
        initComponents();
        this.setTitle("Gestion des réclamations");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ta_Reclamation.setLineWrap(true);
        ta_Reclamation.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        boutton_Lire = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_Reclamation = new javax.swing.JTextArea();
        boutton_Repondre = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Reclamation = new javax.swing.JTable();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_Lire.setText("Lire");
        boutton_Lire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_LireActionPerformed(evt);
            }
        });

        ta_Reclamation.setColumns(20);
        ta_Reclamation.setRows(5);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ta_Reclamation, org.jdesktop.beansbinding.ELProperty.create("${editable==false}"), ta_Reclamation, org.jdesktop.beansbinding.BeanProperty.create("editable"), "");
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(ta_Reclamation);

        boutton_Repondre.setText("Répondre");
        boutton_Repondre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RepondreActionPerformed(evt);
            }
        });

        table_Reclamation.setModel(new GestionDesReclamationsTable());
        jScrollPane3.setViewportView(table_Reclamation);

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutton_Lire)
                    .addComponent(boutton_Retour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boutton_Repondre)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(boutton_Lire)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boutton_Repondre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boutton_Retour)
                                .addGap(5, 5, 5))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_LireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_LireActionPerformed
        int x = table_Reclamation.getSelectedRow();
        ta_Reclamation.setText(table_Reclamation.getValueAt(x, 1).toString());
    }//GEN-LAST:event_boutton_LireActionPerformed

    private void boutton_RepondreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RepondreActionPerformed
        RepondreUneReclamation repondreReclamation = new RepondreUneReclamation();
        int x = table_Reclamation.getSelectedRow();
        int y = table_Reclamation.getSelectedColumn();
        repondreReclamation.set_tf_Nom(table_Reclamation.getValueAt(x, 0).toString());
        this.dispose();
        repondreReclamation.setVisible(true);
    }//GEN-LAST:event_boutton_RepondreActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        Accueil accueil = new Accueil();
        this.dispose();
        accueil.setVisible(true);
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionDesReclamations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDesReclamations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDesReclamations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDesReclamations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesReclamations().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Lire;
    private javax.swing.JButton boutton_Repondre;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea ta_Reclamation;
    private javax.swing.JTable table_Reclamation;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}