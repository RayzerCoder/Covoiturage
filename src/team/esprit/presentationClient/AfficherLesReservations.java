package team.esprit.presentationClient;

import team.esprit.dao.CovoiturageDAO;
import team.esprit.dao.NotificationDAO;
import team.esprit.dao.ReservationDAO;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Reservation;
import team.esprit.presentationAdministrateur.Authentification;

public class AfficherLesReservations extends javax.swing.JFrame {

    Covoitureur covoitureurconnecte = Authentification.covoitureurConnecte;

    public AfficherLesReservations() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt_AfficherLesReservations = new javax.swing.JTable();
        boutton_AnnulerReservation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_AfficherLesReservations.setModel(new AfficherLesResevationsTable(covoitureurconnecte));
        jScrollPane1.setViewportView(jt_AfficherLesReservations);

        boutton_AnnulerReservation.setText("Annuler Reservation");
        boutton_AnnulerReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AnnulerReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boutton_AnnulerReservation)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(boutton_AnnulerReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AnnulerReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AnnulerReservationActionPerformed
        ReservationDAO reservationDAO = new ReservationDAO();
        NotificationDAO notificationDAO = new NotificationDAO();
        int ligneSelectionne = jt_AfficherLesReservations.getSelectedRow();
        int id = (int) jt_AfficherLesReservations.getValueAt(ligneSelectionne, 0);
        
        Reservation reservation = reservationDAO.afficherReservation(id);
        Covoiturage covoiturage = reservation.getCovoiturage();        
        reservationDAO.annulerReseration(covoiturage);
        String contenu = "Bonjour, j'ai annulé ma réservation";
        notificationDAO.envoyerNotification(covoitureurconnecte, reservation.getCovoitureur() , contenu, 3);
        jt_AfficherLesReservations.setModel(new AfficherLesResevationsTable(covoitureurconnecte));
    }//GEN-LAST:event_boutton_AnnulerReservationActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherLesReservations().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AnnulerReservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_AfficherLesReservations;
    // End of variables declaration//GEN-END:variables
}
