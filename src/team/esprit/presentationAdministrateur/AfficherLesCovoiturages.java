package team.esprit.presentationAdministrateur;

import java.util.List;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import team.esprit.dao.CovoiturageDAO;
import team.esprit.dao.DetourDAO;
import team.esprit.dao.ParticipantDAO;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Ville;

public class AfficherLesCovoiturages extends javax.swing.JFrame {

    public AfficherLesCovoiturages() {
        initComponents();
        setTitle("Afficher les covoiturages");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Covoiturages = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        boutton_AfficherCovoiturage = new javax.swing.JButton();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_Covoiturages.setModel(new AfficherLesCovoituragesTable());
        jScrollPane1.setViewportView(table_Covoiturages);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Afficher les covoiturages");

        boutton_AfficherCovoiturage.setText("Afficher detail");
        boutton_AfficherCovoiturage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AfficherCovoiturageActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(boutton_AfficherCovoiturage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutton_Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_AfficherCovoiturage)
                    .addComponent(boutton_Retour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AfficherCovoiturageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AfficherCovoiturageActionPerformed
        AfficherUnCovoiturage affichercovoiturage = new AfficherUnCovoiturage();
        affichercovoiturage.setVisible(true);

        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();
        DetourDAO detourDAO = new DetourDAO();

        int ligneSelectionne = table_Covoiturages.getSelectedRow();
        int idCovoiturage = (int) table_Covoiturages.getValueAt(ligneSelectionne, 0);

        String nom_utilisateur = table_Covoiturages.getValueAt(ligneSelectionne, 1).toString();

        Covoiturage covoiturage = covoiturageDAO.afficherCovoiturage_ID(idCovoiturage);

        String valueAt = null;

        String p = "";
        List<Covoitureur> listCovoitureurs = participantDAO.afficherParticipants(covoiturage);
        for (Covoitureur covoitureur : listCovoitureurs) {
            p = p + covoitureur.getNomUtilisateur() + ", ";
        }
        
//        String p = "";
//        List<Covoitureur> listParticipants = participantDAO.afficherParticipants(covoiturage);
//        for (Covoitureur participant : listParticipants) {
//            p = p + participant.getNomUtilisateur() + ", ";
//        }

        String d = "";
        List<Ville> listDetours = detourDAO.afficherDetours(covoiturage);
        for (Ville ville : listDetours) {
            d = d + ville.getGouvernorat() + ", " + ville.getDelegation() + ", " + ville.getLocalite() + ". ";
        }

        boolean reserve = covoiturage.isReserveeFemmes();
        String r;
        if (reserve) {
            r = "Oui";
        } else {
            r = "Non";
        }

        boolean fumeur = covoiturage.isFumeur();
        String f;
        if (fumeur) {
            f = "Oui";
        } else {
            f = "Non";
        }

        valueAt = "ID:  " + covoiturage.getId()
                + "\nTitre: " + covoiturage.getTitre()
                + "\nDescription: " + covoiturage.getDescription()
                + "\nVille de départ: " + covoiturage.getVilleDepart().getGouvernorat() + ", " + covoiturage.getVilleDepart().getDelegation() + ", " + covoiturage.getVilleDepart().getLocalite()
                + "\nVille d'arrivée: " + covoiturage.getVilleArrivee().getGouvernorat() + ", " + covoiturage.getVilleArrivee().getDelegation() + ", " + covoiturage.getVilleArrivee().getLocalite()
                + "\nCréateur: " + nom_utilisateur
                + "\nDate de départ: " + covoiturage.getDateDepart()
                + "\nHeure de départ: " + covoiturage.getHeureDepart()
                + "\nNombre de places disponibles: " + covoiturage.getNombrePlaces()
                + "\nFumeur: " + f
                + "\nRéservé aux femmes: " + r
                + "\nVilles de détours: " + d
                + "\nLes participants: " + p;

        AfficherUnCovoiturage afficherUnCovoiturage = new AfficherUnCovoiturage(valueAt);
        afficherUnCovoiturage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_AfficherCovoiturageActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherLesCovoiturages().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AfficherCovoiturage;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Covoiturages;
    // End of variables declaration//GEN-END:variables
}