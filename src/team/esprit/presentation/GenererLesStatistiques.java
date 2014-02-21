package team.esprit.presentation;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GenererLesStatistiques extends javax.swing.JFrame {

    public GenererLesStatistiques() {
        initComponents();
        setTitle("Générer Statistiques");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_StatistiqueCovoitureur = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        boutton_StatistiqueCovoiturage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boutton_Retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_StatistiqueCovoitureur.setText("Statistique Covoitureurs");
        boutton_StatistiqueCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_StatistiqueCovoitureurActionPerformed(evt);
            }
        });

        jButton2.setText("Statistique Covoitureur");

        boutton_StatistiqueCovoiturage.setText("Statistique Covoiturages");
        boutton_StatistiqueCovoiturage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_StatistiqueCovoiturageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Statistiques");

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
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutton_StatistiqueCovoiturage, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(boutton_StatistiqueCovoitureur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutton_Retour)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(134, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(123, 123, 123)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(boutton_StatistiqueCovoitureur)
                .addGap(39, 39, 39)
                .addComponent(boutton_StatistiqueCovoiturage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(boutton_Retour)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(176, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_StatistiqueCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_StatistiqueCovoitureurActionPerformed
        StatistiqueCovoitureurs statistiqueCovoitureurs = new StatistiqueCovoitureurs();
        statistiqueCovoitureurs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_StatistiqueCovoitureurActionPerformed

    private void boutton_StatistiqueCovoiturageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_StatistiqueCovoiturageActionPerformed
        StatistiqueCovoiturages statistiqueCovoiturage = new StatistiqueCovoiturages();
        statistiqueCovoiturage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_StatistiqueCovoiturageActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        new Accueil().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenererLesStatistiques().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JButton boutton_StatistiqueCovoiturage;
    private javax.swing.JButton boutton_StatistiqueCovoitureur;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}