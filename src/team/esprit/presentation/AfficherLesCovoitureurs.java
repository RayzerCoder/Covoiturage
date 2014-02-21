package team.esprit.presentation;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class AfficherLesCovoitureurs extends javax.swing.JFrame {

    public AfficherLesCovoitureurs() {
        initComponents();
        setTitle("Afficher les Covoitureurs");
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
        boutton_AfficherUnCovoitureur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ListCovoitureurs = new javax.swing.JTable();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Afficher les Covoitureurs");

        boutton_AfficherUnCovoitureur.setText("Plus de détails");
        boutton_AfficherUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AfficherUnCovoitureurActionPerformed(evt);
            }
        });

        table_ListCovoitureurs.setModel(new team.esprit.presentation.AfficherLesCovoitureursTable());
        jScrollPane1.setViewportView(table_ListCovoitureurs);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(boutton_AfficherUnCovoitureur)
                        .addGap(169, 169, 169)
                        .addComponent(boutton_Retour)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_AfficherUnCovoitureur)
                    .addComponent(boutton_Retour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AfficherUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AfficherUnCovoitureurActionPerformed

        int ligneSelectionne = table_ListCovoitureurs.getSelectedRow();

        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur;

        int id = (int) table_ListCovoitureurs.getValueAt(ligneSelectionne, 0);
        covoitureur = covoitureurDAO.afficherCovoitureur_ID(id);
        String valueAt = null;

        valueAt = "ID:  " + covoitureur.getId()
                + "\nNom: " + covoitureur.getNom()
                + "\nPrénom: " + covoitureur.getPrenom()
                + "\nAddresse E-Mail: " + covoitureur.getEmail()
                + "\nMot de Passe: " + covoitureur.getMdp();

        AfficherUnCovoitureur afficherUnCovoitureur = new AfficherUnCovoitureur(valueAt);
        afficherUnCovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_AfficherUnCovoitureurActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GestionDesCovoitureurs gestionDeCovoitureur = new GestionDesCovoitureurs();
        gestionDeCovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AfficherLesCovoitureurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherLesCovoitureurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherLesCovoitureurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherLesCovoitureurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherLesCovoitureurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AfficherUnCovoitureur;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ListCovoitureurs;
    // End of variables declaration//GEN-END:variables
}