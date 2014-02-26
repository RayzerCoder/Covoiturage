package team.esprit.presentationAdministrateur;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Accueil extends javax.swing.JFrame {

    public Accueil() {
        initComponents();
        setTitle("Accueil");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boutton_Covoitureurs = new javax.swing.JButton();
        boutton_Covoiturages = new javax.swing.JButton();
        boutton_Reclamations = new javax.swing.JButton();
        boutton_Statistiques = new javax.swing.JButton();
        boutton_Quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Administration");

        boutton_Covoitureurs.setText("Gestion des covoitureurs");
        boutton_Covoitureurs.setFocusable(false);
        boutton_Covoitureurs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boutton_Covoitureurs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boutton_Covoitureurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CovoitureursActionPerformed(evt);
            }
        });

        boutton_Covoiturages.setText("Gestion des covoiturages");
        boutton_Covoiturages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CovoituragesActionPerformed(evt);
            }
        });

        boutton_Reclamations.setText("Gestion des réclamations");
        boutton_Reclamations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ReclamationsActionPerformed(evt);
            }
        });

        boutton_Statistiques.setText("Statistiques");
        boutton_Statistiques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_StatistiquesActionPerformed(evt);
            }
        });

        boutton_Quitter.setText("Quitter");
        boutton_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_QuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutton_Covoitureurs)
                        .addGap(44, 44, 44)
                        .addComponent(boutton_Covoiturages))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutton_Reclamations)
                        .addGap(44, 44, 44)
                        .addComponent(boutton_Statistiques, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(boutton_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Covoitureurs)
                    .addComponent(boutton_Covoiturages))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Reclamations)
                    .addComponent(boutton_Statistiques))
                .addGap(37, 37, 37)
                .addComponent(boutton_Quitter)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_StatistiquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_StatistiquesActionPerformed
        new GenererStatistiques().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_StatistiquesActionPerformed

    private void boutton_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_QuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_boutton_QuitterActionPerformed

    private void boutton_ReclamationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ReclamationsActionPerformed
        new GestionReclamations().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_ReclamationsActionPerformed

    private void boutton_CovoituragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CovoituragesActionPerformed
        new GestionCovoiturages().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_CovoituragesActionPerformed

    private void boutton_CovoitureursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CovoitureursActionPerformed
        new GestionCovoitureurs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_CovoitureursActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Covoiturages;
    private javax.swing.JButton boutton_Covoitureurs;
    private javax.swing.JButton boutton_Quitter;
    private javax.swing.JButton boutton_Reclamations;
    private javax.swing.JButton boutton_Statistiques;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}