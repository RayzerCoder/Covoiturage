package team.esprit.presentation;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class AjouterUnCovoiturage extends javax.swing.JFrame {

    public AjouterUnCovoiturage() {
        initComponents();
        setTitle("Ajouter un covoiturage");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_VilleDeDepart = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        combo_VilleDArriver = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tf_DateDeDepart = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_HeureDeDepart = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spinner_NombreDePlace = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        tf_Prix = new javax.swing.JTextField();
        check_fumeur = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        boutton_AjouterCovoiturage = new javax.swing.JButton();
        boutton_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ajouter un covoiturage");

        jLabel2.setText("de");

        combo_VilleDeDepart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Villle de depart" }));

        jLabel3.setText("à");

        combo_VilleDArriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Villle d'arriver" }));

        jLabel4.setText("Date");

        tf_DateDeDepart.setText("date de depart");

        jLabel5.setText("à");

        tf_HeureDeDepart.setText("heure de depart");

        jLabel6.setText("nombre de place");

        jLabel7.setText("Prix");

        tf_Prix.setText("$");

        check_fumeur.setText("accepte les fumeurs");

        jCheckBox1.setText("réserver aux femmes");

        boutton_AjouterCovoiturage.setText("Ajouter");

        boutton_cancel.setText("Retour");
        boutton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_VilleDArriver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_VilleDeDepart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_DateDeDepart)
                    .addComponent(tf_HeureDeDepart)
                    .addComponent(tf_Prix)
                    .addComponent(spinner_NombreDePlace))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boutton_AjouterCovoiturage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boutton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(check_fumeur))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox1)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_VilleDeDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_VilleDArriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_DateDeDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_HeureDeDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spinner_NombreDePlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(check_fumeur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutton_cancel)
                    .addComponent(boutton_AjouterCovoiturage))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_boutton_cancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterUnCovoiturage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AjouterCovoiturage;
    private javax.swing.JButton boutton_cancel;
    private javax.swing.JCheckBox check_fumeur;
    private javax.swing.JComboBox combo_VilleDArriver;
    private javax.swing.JComboBox combo_VilleDeDepart;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner spinner_NombreDePlace;
    private javax.swing.JTextField tf_DateDeDepart;
    private javax.swing.JTextField tf_HeureDeDepart;
    private javax.swing.JTextField tf_Prix;
    // End of variables declaration//GEN-END:variables
}