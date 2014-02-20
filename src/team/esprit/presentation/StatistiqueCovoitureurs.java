package team.esprit.presentation;

public class StatistiqueCovoitureurs extends javax.swing.JFrame {

    public StatistiqueCovoitureurs() {
        initComponents();
        setTitle("Statistiques des Covoitureurs");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_MeilleurCovoitureur = new javax.swing.JButton();
        boutton_HommeFemme = new javax.swing.JButton();
        boutton_FumeurNonFumeur = new javax.swing.JButton();
        boutton_NombreCovoitureur = new javax.swing.JButton();
        boutton_CovoitureursConnectes = new javax.swing.JButton();
        boutton_CovoitureursInscrits = new javax.swing.JButton();
        boutton_CovoitureursInscritsParMois = new javax.swing.JButton();
        boutton_GenererRapport = new javax.swing.JButton();
        check_Imprimer = new javax.swing.JCheckBox();
        chart_Covoitureur = new javax.swing.JPanel();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_MeilleurCovoitureur.setText("Meilleur Covoitureur");
        boutton_MeilleurCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_MeilleurCovoitureurActionPerformed(evt);
            }
        });

        boutton_HommeFemme.setText("Homme / Femme");

        boutton_FumeurNonFumeur.setText("Fumeur / Non fumeur");

        boutton_NombreCovoitureur.setText("Nombre Covoitureurs");

        boutton_CovoitureursConnectes.setText("Covoitureurs Connéctés");

        boutton_CovoitureursInscrits.setText("Covoitureurs Inscrits");

        boutton_CovoitureursInscritsParMois.setText("Covoitureurs Inscrit par mois");

        boutton_GenererRapport.setText("Generer Rapport");

        check_Imprimer.setText("Imprimer");

        javax.swing.GroupLayout chart_CovoitureurLayout = new javax.swing.GroupLayout(chart_Covoitureur);
        chart_Covoitureur.setLayout(chart_CovoitureurLayout);
        chart_CovoitureurLayout.setHorizontalGroup(
            chart_CovoitureurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        chart_CovoitureurLayout.setVerticalGroup(
            chart_CovoitureurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(boutton_GenererRapport, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(check_Imprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutton_CovoitureursInscritsParMois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_CovoitureursInscrits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_CovoitureursConnectes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_NombreCovoitureur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_FumeurNonFumeur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_HommeFemme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutton_MeilleurCovoitureur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chart_Covoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutton_Retour)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutton_MeilleurCovoitureur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutton_HommeFemme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutton_FumeurNonFumeur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutton_NombreCovoitureur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutton_CovoitureursConnectes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutton_CovoitureursInscrits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutton_CovoitureursInscritsParMois))
                    .addComponent(chart_Covoitureur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_GenererRapport)
                    .addComponent(check_Imprimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutton_Retour))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_MeilleurCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_MeilleurCovoitureurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutton_MeilleurCovoitureurActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GenererLesStatistiques genererLesStatistiques = new GenererLesStatistiques();
        genererLesStatistiques.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatistiqueCovoitureurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_CovoitureursConnectes;
    private javax.swing.JButton boutton_CovoitureursInscrits;
    private javax.swing.JButton boutton_CovoitureursInscritsParMois;
    private javax.swing.JButton boutton_FumeurNonFumeur;
    private javax.swing.JButton boutton_GenererRapport;
    private javax.swing.JButton boutton_HommeFemme;
    private javax.swing.JButton boutton_MeilleurCovoitureur;
    private javax.swing.JButton boutton_NombreCovoitureur;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JPanel chart_Covoitureur;
    private javax.swing.JCheckBox check_Imprimer;
    // End of variables declaration//GEN-END:variables
}