package team.esprit.presentation;

import team.esprit.entities.Reclamation;

public class RepondreReclamation extends javax.swing.JFrame {

    public void set_tf_Nom(String ch) {
        tf_Nom.setText(ch);
    }

    public RepondreReclamation() {
        initComponents();
        setTitle("Répondre à une réclamation");
        this.setResizable(false);
        ta_Message.setLineWrap(true);
        ta_Message.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Message = new javax.swing.JTextArea();
        boutton_Envoyer = new javax.swing.JButton();
        tf_Nom = new javax.swing.JTextField();
        boutton_Annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("To : ");

        ta_Message.setColumns(20);
        ta_Message.setRows(5);
        jScrollPane1.setViewportView(ta_Message);

        boutton_Envoyer.setText("Envoyer");
        boutton_Envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_EnvoyerActionPerformed(evt);
            }
        });

        tf_Nom.setToolTipText("");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tf_Nom, org.jdesktop.beansbinding.ELProperty.create("${editable==false}"), tf_Nom, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        tf_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomActionPerformed(evt);
            }
        });

        boutton_Annuler.setText("Annuler");
        boutton_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(boutton_Envoyer)
                .addGap(54, 54, 54)
                .addComponent(boutton_Annuler)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Envoyer)
                    .addComponent(boutton_Annuler))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomActionPerformed

    private void boutton_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AnnulerActionPerformed
        GestionDesReclamations gestionDesReclamations = new GestionDesReclamations();
        gestionDesReclamations.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_boutton_AnnulerActionPerformed

    private void boutton_EnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_EnvoyerActionPerformed
        String destinataire = tf_Nom.getText();
        String msg = ta_Message.getText();
        Reclamation reclamation = new Reclamation();
        reclamation.repondreReclamation(destinataire, msg);
    }//GEN-LAST:event_boutton_EnvoyerActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RepondreReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepondreReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepondreReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepondreReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepondreReclamation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Annuler;
    private javax.swing.JButton boutton_Envoyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_Message;
    private javax.swing.JTextField tf_Nom;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}