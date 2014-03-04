package team.esprit.presentationAdministrateur;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class AfficherLesCovoitureurs extends javax.swing.JFrame {

    public AfficherLesCovoitureurs() {
        initComponents();
        setTitle("Afficher les Covoitureurs");
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

        boutton_AfficherUnCovoitureur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ListCovoitureurs = new javax.swing.JTable();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_AfficherUnCovoitureur.setText("Plus de détails");
        boutton_AfficherUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AfficherUnCovoitureurActionPerformed(evt);
            }
        });

        table_ListCovoitureurs.setModel(new team.esprit.presentationAdministrateur.AfficherLesCovoitureursTable());
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(boutton_AfficherUnCovoitureur)
                .addGap(112, 112, 112)
                .addComponent(boutton_Retour)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_AfficherUnCovoitureur)
                    .addComponent(boutton_Retour))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AfficherUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AfficherUnCovoitureurActionPerformed
        int ligneSelectionne = table_ListCovoitureurs.getSelectedRow();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur;
        int id = (int) table_ListCovoitureurs.getValueAt(ligneSelectionne, 0);
        covoitureur = covoitureurDAO.afficherCovoitureur_ID(id);
        String informations = null;
        informations = "ID:  " + covoitureur.getId()
                + "\n\nAddresse E-Mail: " + covoitureur.getEmail()
                + "\n\nNom d'utilisateur: " + covoitureur.getNomUtilisateur()
                + "\n\nNom: " + covoitureur.getNom()
                + "\n\nPrénom: " + covoitureur.getPrenom()
                + "\n\nSexe: " + covoitureur.getSexe()
                + "\n\nFumeur: " + covoitureur.isFumeur()
                + "\n\nDate de naissance: " + covoitureur.getDateNaissance()
                + "\n\nDate d'enregistrement: " + covoitureur.getDateEnregistrement()
                + "\n\nNote: " + covoitureur.getNote()
                + "\n\nEtat: " + covoitureur.getEtat()
                + "\n\nAvatar: " + covoitureur.getAvatar()
                + "\n\nSkype: " + covoitureur.getSkype()
                + "\n\nFacebook: " + covoitureur.getFacebook()
                + "\n\nDate de derniére visite: " + covoitureur.getDateDerniereVisite()
                + "\n\nCle d'activation: " + covoitureur.getCleActivation()
                + "\n\nID Facebook: " + covoitureur.getIdFacebook();
        AfficherUnCovoitureur afficherUnCovoitureur = new AfficherUnCovoitureur(informations);
        afficherUnCovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_AfficherUnCovoitureurActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GestionCovoitureurs gestionDeCovoitureur = new GestionCovoitureurs();
        gestionDeCovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherLesCovoitureurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AfficherUnCovoitureur;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ListCovoitureurs;
    // End of variables declaration//GEN-END:variables
}