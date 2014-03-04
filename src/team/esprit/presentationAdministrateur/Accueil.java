package team.esprit.presentationAdministrateur;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Accueil extends javax.swing.JFrame {

    public Accueil() {
        initComponents();
        setTitle("Accueil");
        initialise();
    }

    public void initialise() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_Covoitureurs = new javax.swing.JButton();
        boutton_Covoiturages = new javax.swing.JButton();
        boutton_Reclamations = new javax.swing.JButton();
        boutton_Statistiques = new javax.swing.JButton();
        boutton_Quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boutton_Covoitureurs)
                        .addGap(44, 44, 44)
                        .addComponent(boutton_Covoiturages))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(boutton_Reclamations)
                        .addGap(44, 44, 44)
                        .addComponent(boutton_Statistiques, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(boutton_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutton_Covoitureurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_Covoiturages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Reclamations, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_Statistiques, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boutton_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    // End of variables declaration//GEN-END:variables
}