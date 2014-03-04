package team.esprit.presentationClient;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import team.esprit.dao.CovoiturageDAO;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.dao.NotificationDAO;
import team.esprit.dao.ParticipantDAO;
import team.esprit.dao.ReservationDAO;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.presentationAdministrateur.Authentification;

public class ConsulterCovoiturage extends javax.swing.JFrame {

    Covoitureur covoitureurConnecte = Authentification.covoitureurConnecte;
    Covoiturage covoiturage;

    public ConsulterCovoiturage() {
        this.dispose();
        initialise();
    }

    public ConsulterCovoiturage(Covoiturage covoiturage, String informations) {
        initComponents();
        this.setTitle("Consulter un de mes covoiturages");
        initialise();
        ta_Afficher.setText(informations);
        this.covoiturage = covoiturage;
        remplirListeReservations();
    }

    public void remplirListeReservations() {
        ReservationDAO reservationDAO = new ReservationDAO();
        DefaultListModel model = new DefaultListModel();
        //Une liste contenant les covoitureurs qui ont envoyé une demande de réservation dans ce covoiturage
        List<Covoitureur> listCovoitureurs = reservationDAO.afficherCovoitureurs(covoiturage);
        for (Covoitureur covoitureur : listCovoitureurs) {
            model.addElement(covoitureur.getNomUtilisateur());
        }
        list_Resevations.setModel(model);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Afficher = new javax.swing.JTextArea();
        boutton_Retour = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_Resevations = new javax.swing.JList();
        rb_Confirmer = new javax.swing.JRadioButton();
        rb_Annuler = new javax.swing.JRadioButton();
        boutton_Modifier = new javax.swing.JButton();
        boutton_Valider = new javax.swing.JButton();
        button_Consulter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_Afficher.setEditable(false);
        ta_Afficher.setColumns(20);
        ta_Afficher.setRows(5);
        jScrollPane1.setViewportView(ta_Afficher);

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        list_Resevations.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_Resevations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_ResevationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_Resevations);

        buttonGroup1.add(rb_Confirmer);
        rb_Confirmer.setText("Confirmer");

        buttonGroup1.add(rb_Annuler);
        rb_Annuler.setText("Annuler");

        boutton_Modifier.setText("Modifier");

        boutton_Valider.setText("Valider / Annuler réservation");
        boutton_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ValiderActionPerformed(evt);
            }
        });

        button_Consulter.setText("Consulter Profil");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Demandes de réservations :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(boutton_Retour)
                        .addGap(85, 85, 85)
                        .addComponent(boutton_Modifier)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(rb_Confirmer)
                                .addGap(64, 64, 64)
                                .addComponent(rb_Annuler))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_Consulter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boutton_Valider))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boutton_Modifier)
                            .addComponent(boutton_Retour)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_Confirmer)
                            .addComponent(rb_Annuler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boutton_Valider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Consulter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        ConsulterMesCovoiturages consulterMesCovoiturages = new ConsulterMesCovoiturages(covoitureurConnecte);
        this.dispose();
        consulterMesCovoiturages.setVisible(true);
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ValiderActionPerformed
        ReservationDAO reservationDAO = new ReservationDAO();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        NotificationDAO notificationDAO = new NotificationDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();

        Covoitureur covoitureurSelectionne = covoitureurDAO.afficherCovoitureur_NomUtilisateur(list_Resevations.getSelectedValue().toString());
        int plusMoins, type;
        boolean etat;

        if (rb_Confirmer.isSelected()) {
            plusMoins = -1;
            etat = true;
            int choix = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment accepter cette demande de réservation ?", null, 1, QUESTION_MESSAGE);
            if (choix == 0) {
                String contenu = "Vous etes accepté dans le covoiturage qui part de "
                + covoiturage.getVilleDepart().getLocalite() + " "
                + covoiturage.getVilleDepart().getDelegation() + " "
                + covoiturage.getVilleDepart().getGouvernorat() + "vers "
                + covoiturage.getVilleArrivee().getLocalite() + " "
                + covoiturage.getVilleArrivee().getDelegation() + " "
                + covoiturage.getVilleArrivee().getGouvernorat()
                + " à " + covoiturage.getHeureDepart();
                type = 1; //Type de notification : Réservation confirmé

                if ((reservationDAO.modifierEtat(covoitureurSelectionne, covoiturage, etat))
                    && (covoiturageDAO.modifierNombrePlaces(covoiturage, plusMoins))
                    && (notificationDAO.envoyerNotification(covoitureurConnecte, covoitureurSelectionne, contenu, type))
                    && (participantDAO.ajouterParticipant(covoitureurSelectionne, covoiturage))) {
                    JOptionPane.showMessageDialog(this, "Votre confimation a été effectué.");
                }
            }
        } else if (rb_Annuler.isSelected()) {
            try {
                boolean etatReservation = reservationDAO.afficherEtat(covoitureurSelectionne, covoiturage);
                if (etatReservation) {
                    plusMoins = 1;
                    etat = false;
                    int choix = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment annuler cette demande de réservation ?", null, 1, QUESTION_MESSAGE);
                    if (choix == 0) {
                        String contenu = "Vous etes pas accepté dans le covoiturage qui part de "
                        + covoiturage.getVilleDepart().getLocalite() + " "
                        + covoiturage.getVilleDepart().getDelegation() + " "
                        + covoiturage.getVilleDepart().getGouvernorat() + "vers "
                        + covoiturage.getVilleArrivee().getLocalite() + " "
                        + covoiturage.getVilleArrivee().getDelegation() + " "
                        + covoiturage.getVilleArrivee().getGouvernorat()
                        + " à " + covoiturage.getHeureDepart();
                        type = 0; //Réservation annulé
                        if ((reservationDAO.modifierEtat(covoitureurSelectionne, covoiturage, etat))
                            && (covoiturageDAO.modifierNombrePlaces(covoiturage, plusMoins))
                            && (notificationDAO.envoyerNotification(covoitureurConnecte, covoitureurSelectionne, contenu, type))
                            && (participantDAO.supprimerParticipant(covoitureurSelectionne, covoiturage))) {
                            JOptionPane.showMessageDialog(this, "Votre annulation a été effectué.");
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConsulterCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_boutton_ValiderActionPerformed

    private void list_ResevationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_ResevationsMouseClicked
        ReservationDAO reservationDAO = new ReservationDAO();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureurSelectionne = covoitureurDAO.afficherCovoitureur_NomUtilisateur(list_Resevations.getSelectedValue().toString());
        try {
            boolean etatReservation = reservationDAO.afficherEtat(covoitureurSelectionne, covoiturage);
            if (etatReservation) {
                rb_Confirmer.setVisible(false);
            } else {
                rb_Annuler.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsulterCovoiturage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_list_ResevationsMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterCovoiturage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Modifier;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JButton boutton_Valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_Consulter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList list_Resevations;
    private javax.swing.JRadioButton rb_Annuler;
    private javax.swing.JRadioButton rb_Confirmer;
    private javax.swing.JTextArea ta_Afficher;
    // End of variables declaration//GEN-END:variables
}