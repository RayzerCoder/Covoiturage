package team.esprit.presentationAdministrateur;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GestionCovoitureurs extends javax.swing.JFrame {

    public GestionCovoitureurs() {
        setTitle("Gestion des Covoitureurs");
        initComponents();
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

        boutton_AjouterCovoitureur = new javax.swing.JButton();
        boutton_AfficherLesCovoitureurs = new javax.swing.JButton();
        boutton_RechercheUnCovoitureur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_AjouterCovoitureur.setText("Ajouter un covoitureur");
        boutton_AjouterCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AjouterCovoitureurActionPerformed(evt);
            }
        });

        boutton_AfficherLesCovoitureurs.setText("Afficher les covoitureurs");
        boutton_AfficherLesCovoitureurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AfficherLesCovoitureursActionPerformed(evt);
            }
        });

        boutton_RechercheUnCovoitureur.setText("Recherche Un Covoitureur");
        boutton_RechercheUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RechercheUnCovoitureurActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestion des Covoitureurs");

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
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boutton_RechercheUnCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_AfficherLesCovoitureurs, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_AjouterCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutton_Retour)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(boutton_AjouterCovoitureur)
                .addGap(32, 32, 32)
                .addComponent(boutton_AfficherLesCovoitureurs)
                .addGap(34, 34, 34)
                .addComponent(boutton_RechercheUnCovoitureur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(boutton_Retour)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AjouterCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AjouterCovoitureurActionPerformed
        AjouterCovoitureur ajouterUnCovoitureur = new AjouterCovoitureur();
        ajouterUnCovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_AjouterCovoitureurActionPerformed

    private void boutton_AfficherLesCovoitureursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AfficherLesCovoitureursActionPerformed
        AfficherLesCovoitureurs afficherLesCovoitureurs = new AfficherLesCovoitureurs();
        afficherLesCovoitureurs.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_boutton_AfficherLesCovoitureursActionPerformed

    private void boutton_RechercheUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RechercheUnCovoitureurActionPerformed
        RechercherCovoitureur rechercherUnCovoitureur = new RechercherCovoitureur();
        rechercherUnCovoitureur.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_boutton_RechercheUnCovoitureurActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        Accueil accueil = new Accueil();
        this.dispose();
        accueil.setVisible(true);
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCovoitureurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AfficherLesCovoitureurs;
    private javax.swing.JButton boutton_AjouterCovoitureur;
    private javax.swing.JButton boutton_RechercheUnCovoitureur;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}