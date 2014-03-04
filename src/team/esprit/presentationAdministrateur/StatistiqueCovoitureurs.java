package team.esprit.presentationAdministrateur;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import team.esprit.controllers.StatCovoitureurController;

public class StatistiqueCovoitureurs extends javax.swing.JFrame {

    public File directoryCovoitureur = new File("./pictures/covoitureurs");
    public String date;

    public StatistiqueCovoitureurs() {
        initComponents();
        setTitle("Statistiques des covoitureurs");
        initialise();
    }

    public void initialise() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        directoryCovoitureur.mkdirs();
        date = new Date().toString();
        date = date.substring(4, 10);
        date = date.replaceAll("\\s+","");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_MeilleurCovoitureur = new javax.swing.JButton();
        boutton_HommeFemme = new javax.swing.JButton();
        boutton_FumeurNonFumeur = new javax.swing.JButton();
        CovoitureursActifNonActif = new javax.swing.JButton();
        boutton_CovoitureursConnectes = new javax.swing.JButton();
        boutton_CovoitureursInscrits = new javax.swing.JButton();
        boutton_CovoitureursInscritsParMois = new javax.swing.JButton();
        boutton_GenererRapport = new javax.swing.JButton();
        check_Imprimer = new javax.swing.JCheckBox();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_MeilleurCovoitureur.setText("Meilleur Covoitureur");
        boutton_MeilleurCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_MeilleurCovoitureurActionPerformed(evt);
            }
        });

        boutton_HommeFemme.setText("Homme / Femme");
        boutton_HommeFemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_HommeFemmeActionPerformed(evt);
            }
        });

        boutton_FumeurNonFumeur.setText("Fumeur / Non fumeur");
        boutton_FumeurNonFumeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_FumeurNonFumeurActionPerformed(evt);
            }
        });

        CovoitureursActifNonActif.setText("Covoitureurs Actifs / Non Actifs");
        CovoitureursActifNonActif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CovoitureursActifNonActifActionPerformed(evt);
            }
        });

        boutton_CovoitureursConnectes.setText("Covoitureurs Connéctés");
        boutton_CovoitureursConnectes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CovoitureursConnectesActionPerformed(evt);
            }
        });

        boutton_CovoitureursInscrits.setText("Covoitureurs inscrits par annes");
        boutton_CovoitureursInscrits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CovoitureursInscritsActionPerformed(evt);
            }
        });

        boutton_CovoitureursInscritsParMois.setText("Covoitureurs Inscrits par mois");
        boutton_CovoitureursInscritsParMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CovoitureursInscritsParMoisActionPerformed(evt);
            }
        });

        boutton_GenererRapport.setText("Generer Rapport");

        check_Imprimer.setText("Imprimer");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutton_CovoitureursConnectes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CovoitureursActifNonActif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_FumeurNonFumeur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_HommeFemme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_MeilleurCovoitureur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_CovoitureursInscritsParMois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_CovoitureursInscrits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(boutton_GenererRapport)
                        .addGap(50, 50, 50)
                        .addComponent(check_Imprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(boutton_Retour)
                        .addGap(59, 59, 59)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutton_MeilleurCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutton_HommeFemme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutton_FumeurNonFumeur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CovoitureursActifNonActif, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutton_CovoitureursConnectes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutton_CovoitureursInscrits, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutton_CovoitureursInscritsParMois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_GenererRapport)
                    .addComponent(check_Imprimer)
                    .addComponent(boutton_Retour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_MeilleurCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_MeilleurCovoitureurActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueMeilleurCovoitureur();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartMeilleursCovoitureurs.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Meilleurs Covoitureurs", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_boutton_MeilleurCovoitureurActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GenererStatistiques genererLesStatistiques = new GenererStatistiques();
        genererLesStatistiques.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_HommeFemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_HommeFemmeActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueHommeFemme();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartHommes_Femmes.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Hommmes / Femmes", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_boutton_HommeFemmeActionPerformed

    private void boutton_FumeurNonFumeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_FumeurNonFumeurActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueFumeur();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartFumeur_NonFumeur.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Fumeurs / Non Fumeurs", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_boutton_FumeurNonFumeurActionPerformed

    private void CovoitureursActifNonActifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CovoitureursActifNonActifActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueCovoitureursEtats();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartActifs_NonActifs.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Actif / Non Actif", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_CovoitureursActifNonActifActionPerformed

    private void boutton_CovoitureursInscritsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CovoitureursInscritsActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueCovoitureursInscritParAn();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartNombreCovoitureurInscritsParAnnee.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Inscrits par Année", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_boutton_CovoitureursInscritsActionPerformed

    private void boutton_CovoitureursInscritsParMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CovoitureursInscritsParMoisActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueCovoitureursInscritsMois();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartNombreCovoitureurParMois.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Inscrits par Mois", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_boutton_CovoitureursInscritsParMoisActionPerformed

    private void boutton_CovoitureursConnectesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CovoitureursConnectesActionPerformed
        StatCovoitureurController statistique = new StatCovoitureurController();
        JFreeChart chart = statistique.statistiqueCovoitureursConnectes();
        try {
            ChartUtilities.saveChartAsJPEG(new File(directoryCovoitureur + "\\" + date + "_chartNombreCovoitureurConnectes.jpg.jpg"), chart, 1366, 768);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        ChartFrame frame = new ChartFrame("Covoitureur Connectes", chart);
        frame.setVisible(true);
        frame.pack();
    }//GEN-LAST:event_boutton_CovoitureursConnectesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatistiqueCovoitureurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CovoitureursActifNonActif;
    private javax.swing.JButton boutton_CovoitureursConnectes;
    private javax.swing.JButton boutton_CovoitureursInscrits;
    private javax.swing.JButton boutton_CovoitureursInscritsParMois;
    private javax.swing.JButton boutton_FumeurNonFumeur;
    private javax.swing.JButton boutton_GenererRapport;
    private javax.swing.JButton boutton_HommeFemme;
    private javax.swing.JButton boutton_MeilleurCovoitureur;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JCheckBox check_Imprimer;
    // End of variables declaration//GEN-END:variables
}