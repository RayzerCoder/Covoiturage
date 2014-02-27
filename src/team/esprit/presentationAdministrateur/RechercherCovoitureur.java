package team.esprit.presentationAdministrateur;

import java.util.ArrayList;
import java.util.List;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class RechercherCovoitureur extends javax.swing.JFrame {

    public RechercherCovoitureur() {
        initComponents();
        setTitle("Rechercher un Covoitureur");
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

        jLabel1 = new javax.swing.JLabel();
        boutton_ModifierUnCovoitureur = new javax.swing.JButton();
        boutton_SupprimerUnCovoitureur = new javax.swing.JButton();
        boutton_AfficherUnCovoitureur = new javax.swing.JButton();
        boutton_Retour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ListCovoitureurs = new javax.swing.JTable();
        boutton_Rechercher = new javax.swing.JButton();
        cb_Critere = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tf_Critere = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Rechercher un Covoitureur");

        boutton_ModifierUnCovoitureur.setText("Modifier un Covoitureur");
        boutton_ModifierUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ModifierUnCovoitureurActionPerformed(evt);
            }
        });

        boutton_SupprimerUnCovoitureur.setText("Supprimer un Covoitureur");
        boutton_SupprimerUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_SupprimerUnCovoitureurActionPerformed(evt);
            }
        });

        boutton_AfficherUnCovoitureur.setText("Afficher Un Covoitureur");
        boutton_AfficherUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AfficherUnCovoitureurActionPerformed(evt);
            }
        });

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        table_ListCovoitureurs.setModel(new AfficherLesCovoitureursTable());
        jScrollPane1.setViewportView(table_ListCovoitureurs);

        boutton_Rechercher.setText("Rechercher");
        boutton_Rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RechercherActionPerformed(evt);
            }
        });

        cb_Critere.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nom","Prenom","Email","Nom_utilisateur" }));

        jLabel2.setText("Critere :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boutton_SupprimerUnCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boutton_ModifierUnCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boutton_Retour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boutton_AfficherUnCovoitureur, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_Critere, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Critere, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(boutton_Rechercher)
                        .addGap(198, 198, 198))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Rechercher)
                    .addComponent(cb_Critere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Critere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_ModifierUnCovoitureur)
                    .addComponent(boutton_Retour))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_SupprimerUnCovoitureur)
                    .addComponent(boutton_AfficherUnCovoitureur))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_SupprimerUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_SupprimerUnCovoitureurActionPerformed
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        int ligneSelectionne = table_ListCovoitureurs.getSelectedRow();
        covoitureurDAO.deleteCovoitureur(ligneSelectionne + 1);
    }//GEN-LAST:event_boutton_SupprimerUnCovoitureurActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GestionCovoitureurs gestionDescovoitueurs = new GestionCovoitureurs();
        gestionDescovoitueurs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_AfficherUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AfficherUnCovoitureurActionPerformed
        int ligneSelectionne = table_ListCovoitureurs.getSelectedRow();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur;

        int id = (int) table_ListCovoitureurs.getValueAt(ligneSelectionne, 0);
        covoitureur = covoitureurDAO.afficherCovoitureur_ID(id);
        String valueAt = null;

        valueAt = "ID: " + covoitureur.getId()
                + "\nAddresse E-Mail: " + covoitureur.getEmail()
                + "\nNom d'Uuilisateur: " + covoitureur.getNomUtilisateur()
                + "\nNom: " + covoitureur.getNom()
                + "\nPrénom: " + covoitureur.getPrenom()
                + "\nSexe: " + covoitureur.getSexe()
                + "\nFumeur: " + covoitureur.isFumeur()
                + "\nDate de naissance: " + covoitureur.getDateNaissance()
                + "\nDate d'enregistrement: " + covoitureur.getDateEnregistrement()
                + "\nNote: " + covoitureur.getNote()
                + "\nEtat: " + covoitureur.getEtat()
                + "\nAvatar: " + covoitureur.getAvatar()
                + "\nSkype: " + covoitureur.getSkype()
                + "\nFacebook: " + covoitureur.getFacebook()
                + "\nDate de la derniére visite: " + covoitureur.getDateDerniereVisite()
                + "\nCle activation: " + covoitureur.getCleActivation()
                + "\nID Facebook: " + covoitureur.getIdFacebook();

        AfficherUnCovoitureur1 afficherUnCovoitureur1 = new AfficherUnCovoitureur1(valueAt);
        afficherUnCovoitureur1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_AfficherUnCovoitureurActionPerformed

    private void boutton_ModifierUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ModifierUnCovoitureurActionPerformed
        int ligneSelectionne = table_ListCovoitureurs.getSelectedRow();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur;
        int id = (int) table_ListCovoitureurs.getValueAt(ligneSelectionne, 0);
        covoitureur = covoitureurDAO.afficherCovoitureur_ID(id);

        ModifierCovoitureur modifieruncovoitureur = new ModifierCovoitureur(covoitureur);
        modifieruncovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_ModifierUnCovoitureurActionPerformed

    private void boutton_RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RechercherActionPerformed
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        listCovoitureurs = covoitureurDAO.rechercherCovoitureur(tf_Critere.getText());
        if (listCovoitureurs.size() <= 0) {

            JOptionPane.showMessageDialog(this, "element vide");
        } else {

            table_ListCovoitureurs.setModel(new RechercherCovoitureurTable(tf_Critere.getText()));
        }
    }//GEN-LAST:event_boutton_RechercherActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RechercherCovoitureur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AfficherUnCovoitureur;
    private javax.swing.JButton boutton_ModifierUnCovoitureur;
    private javax.swing.JButton boutton_Rechercher;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JButton boutton_SupprimerUnCovoitureur;
    private javax.swing.JComboBox cb_Critere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ListCovoitureurs;
    private javax.swing.JTextField tf_Critere;
    // End of variables declaration//GEN-END:variables
}