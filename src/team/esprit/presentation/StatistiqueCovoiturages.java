package team.esprit.presentation;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StatistiqueCovoiturages extends javax.swing.JFrame {

    public StatistiqueCovoiturages() {
        initComponents();
        setTitle("Statistiques Covoiturages");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        boutton_CovoituragesCrees = new javax.swing.JButton();
        boutton_CovoiturageParMois = new javax.swing.JButton();
        boutton_VillesPlusVisitees = new javax.swing.JButton();
        boutton_CovoiturageParVille = new javax.swing.JButton();
        boutton_GenererRapport = new javax.swing.JButton();
        check_Imprimer = new javax.swing.JCheckBox();
        chart_Covoiturage = new javax.swing.JPanel();
        boutton_Retour = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_CovoituragesCrees.setText("Covoiturages Crées");
        boutton_CovoituragesCrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CovoituragesCreesActionPerformed(evt);
            }
        });

        boutton_CovoiturageParMois.setText("Covoiturages Crées par mois");

        boutton_VillesPlusVisitees.setText("Villes les plus visitées");

        boutton_CovoiturageParVille.setText("Covoiturage par ville");

        boutton_GenererRapport.setText("Générer Rapport");
        boutton_GenererRapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_GenererRapportActionPerformed(evt);
            }
        });

        check_Imprimer.setText("Imprimer");

        javax.swing.GroupLayout chart_CovoiturageLayout = new javax.swing.GroupLayout(chart_Covoiturage);
        chart_Covoiturage.setLayout(chart_CovoiturageLayout);
        chart_CovoiturageLayout.setHorizontalGroup(
            chart_CovoiturageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        chart_CovoiturageLayout.setVerticalGroup(
            chart_CovoiturageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(boutton_GenererRapport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(check_Imprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boutton_CovoiturageParMois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutton_CovoituragesCrees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutton_VillesPlusVisitees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutton_CovoiturageParVille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addComponent(chart_Covoiturage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutton_Retour)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutton_CovoituragesCrees)
                        .addGap(18, 18, 18)
                        .addComponent(boutton_CovoiturageParMois)
                        .addGap(18, 18, 18)
                        .addComponent(boutton_VillesPlusVisitees)
                        .addGap(18, 18, 18)
                        .addComponent(boutton_CovoiturageParVille))
                    .addComponent(chart_Covoiturage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_GenererRapport)
                    .addComponent(check_Imprimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutton_Retour)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_CovoituragesCreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CovoituragesCreesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutton_CovoituragesCreesActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GenererLesStatistiques genererLesStatistique =new GenererLesStatistiques();
        genererLesStatistique.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_GenererRapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_GenererRapportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutton_GenererRapportActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatistiqueCovoiturages().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_CovoiturageParMois;
    private javax.swing.JButton boutton_CovoiturageParVille;
    private javax.swing.JButton boutton_CovoituragesCrees;
    private javax.swing.JButton boutton_GenererRapport;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JButton boutton_VillesPlusVisitees;
    private javax.swing.JPanel chart_Covoiturage;
    private javax.swing.JCheckBox check_Imprimer;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
