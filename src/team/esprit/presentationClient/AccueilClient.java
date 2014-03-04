package team.esprit.presentationClient;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
import team.esprit.util.MyConnection;

public class AccueilClient extends javax.swing.JFrame {

    Covoitureur covoitureurConnecte = Authentification.covoitureurConnecte;
    Covoiturage covoiturage;

    
    public AccueilClient() {
        this.dispose();
        initialise();
    }
    
    public AccueilClient(Covoitureur covoitureurConnecte) {
        initComponents();
        this.setTitle("TEST");
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

        boutton_Modifier = new javax.swing.JButton();
        boutton_Retour = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_PrenomNom = new javax.swing.JLabel();
        label_Photo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Afficher = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_Resevations = new javax.swing.JList();
        rb_Confirmer = new javax.swing.JRadioButton();
        rb_Annuler = new javax.swing.JRadioButton();
        boutton_Valider = new javax.swing.JButton();
        button_Consulter = new javax.swing.JButton();
        boutton_Modifier1 = new javax.swing.JButton();
        boutton_Retour1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        boutton_Modifier.setText("Modifier");

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_PrenomNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_PrenomNom.setText("Votre Prénom & Nom");

        label_Photo.setText("Votre photo de profil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_PrenomNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(label_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_PrenomNom)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        ta_Afficher.setEditable(false);
        ta_Afficher.setColumns(20);
        ta_Afficher.setRows(5);
        jScrollPane1.setViewportView(ta_Afficher);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Demandes de réservations :");

        list_Resevations.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_Resevations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_ResevationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_Resevations);

        rb_Confirmer.setText("Confirmer");

        rb_Annuler.setText("Annuler");

        boutton_Valider.setText("Valider / Annuler réservation");
        boutton_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ValiderActionPerformed(evt);
            }
        });

        button_Consulter.setText("Consulter Profil");

        boutton_Modifier1.setText("Modifier");

        boutton_Retour1.setText("Retour");
        boutton_Retour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_Retour1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(boutton_Retour1)
                        .addGap(85, 85, 85)
                        .addComponent(boutton_Modifier1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(rb_Confirmer)
                            .addGap(64, 64, 64)
                            .addComponent(rb_Annuler))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(button_Consulter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boutton_Valider))
                            .addGap(20, 20, 20))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_Confirmer)
                            .addComponent(rb_Annuler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boutton_Valider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Consulter))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boutton_Modifier1)
                            .addComponent(boutton_Retour1))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modifier mon profil", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab8", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab9", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        ConsulterMesCovoiturages consulterMesCovoiturages = new ConsulterMesCovoiturages(covoitureurConnecte);
        this.dispose();
        consulterMesCovoiturages.setVisible(true);
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_Retour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_Retour1ActionPerformed
        ConsulterMesCovoiturages consulterMesCovoiturages = new ConsulterMesCovoiturages(covoitureurConnecte);
        this.dispose();
        consulterMesCovoiturages.setVisible(true);
    }//GEN-LAST:event_boutton_Retour1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //pour afficher la photo
        String requete = "select avatar from covoitureurs where id=?";
        try {
            byte[] Imagebytes;
            Image image;
            java.sql.PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, covoitureurConnecte.getId());

            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Imagebytes = resultat.getBytes(1); //lézem el avatar de type BLOP
                image = getToolkit().createImage(Imagebytes);
                Image img = image.getScaledInstance(label_Photo.getWidth(), label_Photo.getHeight(), image.SCALE_FAST);
                ImageIcon icon = new ImageIcon(img);
                label_Photo.setIcon(icon);
            }

            //actualiser tout un frame
            //this.dispose() new.setvisible

            //actualiser un jtable ta3melha invalidate() validate() repaint()

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("Erreur Image " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccueilClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Modifier;
    private javax.swing.JButton boutton_Modifier1;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JButton boutton_Retour1;
    private javax.swing.JButton boutton_Valider;
    private javax.swing.JButton button_Consulter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_Photo;
    private javax.swing.JLabel label_PrenomNom;
    private javax.swing.JList list_Resevations;
    private javax.swing.JRadioButton rb_Annuler;
    private javax.swing.JRadioButton rb_Confirmer;
    private javax.swing.JTextArea ta_Afficher;
    // End of variables declaration//GEN-END:variables
}
