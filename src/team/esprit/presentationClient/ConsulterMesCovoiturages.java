package team.esprit.presentationClient;

import java.util.List;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import team.esprit.dao.CovoiturageDAO;
import team.esprit.dao.DetourDAO;
import team.esprit.dao.ParticipantDAO;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Ville;
import team.esprit.presentationAdministrateur.Authentification;

public class ConsulterMesCovoiturages extends javax.swing.JFrame {
    
    Covoitureur covoitureurConnecte = Authentification.covoitureurConnecte;

    public ConsulterMesCovoiturages() {
        this.dispose();
        initialise();
    }
    
    public ConsulterMesCovoiturages(Covoitureur covoitureur) {
        initComponents();
        this.setTitle("Consulter mes covoiturages");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Covoiturages = new javax.swing.JTable();
        boutton_Supprimer = new javax.swing.JButton();
        boutton_Modifier = new javax.swing.JButton();
        boutton_Details = new javax.swing.JButton();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_Covoiturages.setModel(new ConsulterMesCovoituragesTable(covoitureurConnecte));
        jScrollPane1.setViewportView(ta_Covoiturages);

        boutton_Supprimer.setText("Supprimer");
        boutton_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_SupprimerActionPerformed(evt);
            }
        });

        boutton_Modifier.setText("Modifier");

        boutton_Details.setText("Plus de détails");
        boutton_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_DetailsActionPerformed(evt);
            }
        });

        boutton_Retour.setText("Retour");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutton_Supprimer)
                        .addGap(50, 50, 50)
                        .addComponent(boutton_Modifier)
                        .addGap(54, 54, 54)
                        .addComponent(boutton_Details)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutton_Retour)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Supprimer)
                    .addComponent(boutton_Modifier)
                    .addComponent(boutton_Details)
                    .addComponent(boutton_Retour))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_DetailsActionPerformed
        int ligneSelectionne = ta_Covoiturages.getSelectedRow();
        int id = (int) ta_Covoiturages.getValueAt(ligneSelectionne, 0);
                
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();
        DetourDAO detourDAO = new DetourDAO();
        
        Covoiturage covoiturage = covoiturageDAO.afficherCovoiturage_ID(id);
        
        String informations = null;

        String p = "";
        List<Covoitureur> listCovoitureurs = participantDAO.afficherParticipants(covoiturage);
        for (Covoitureur participant : listCovoitureurs) {
            p = p + participant.getNomUtilisateur() + ", ";
        }

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

        informations = "ID:  " + covoiturage.getId()
                + "\nTitre: " + covoiturage.getTitre()
                + "\nDescription: " + covoiturage.getDescription()
                + "\nVille de départ: " + covoiturage.getVilleDepart().getGouvernorat() + ", " + covoiturage.getVilleDepart().getDelegation() + ", " + covoiturage.getVilleDepart().getLocalite()
                + "\nVille d'arrivée: " + covoiturage.getVilleArrivee().getGouvernorat() + ", " + covoiturage.getVilleArrivee().getDelegation() + ", " + covoiturage.getVilleArrivee().getLocalite()
                + "\nDate de départ: " + covoiturage.getDateDepart()
                + "\nHeure de départ: " + covoiturage.getHeureDepart()
                + "\nNombre de places disponibles: " + covoiturage.getNombrePlaces()
                + "\nFumeur: " + f
                + "\nRéservé aux femmes: " + r
                + "\nVilles de détours: " + d
                + "\nLes participants: " + p;
        
        ConsulterCovoiturage consulterCovoiturage = new ConsulterCovoiturage(covoiturage, informations);
        this.dispose();
        consulterCovoiturage.setVisible(true);
    }//GEN-LAST:event_boutton_DetailsActionPerformed

    private void boutton_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_SupprimerActionPerformed
        int ligneSelectionne = ta_Covoiturages.getSelectedRow();
        int id = (int) ta_Covoiturages.getValueAt(ligneSelectionne, 0);
        
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        int choix = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce covoiturage ?", null, 1, QUESTION_MESSAGE);
        if (choix == 0) {
            if (covoiturageDAO.supprimerCovoiturage(id))
                JOptionPane.showMessageDialog(this, "Le covoiturage a été supprimé avec succés.");
            else JOptionPane.showMessageDialog(this, "Le covoiturage n'a pas été supprimé.");
        }
    }//GEN-LAST:event_boutton_SupprimerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterMesCovoiturages().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Details;
    private javax.swing.JButton boutton_Modifier;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JButton boutton_Supprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ta_Covoiturages;
    // End of variables declaration//GEN-END:variables
}