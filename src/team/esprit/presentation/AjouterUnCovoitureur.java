package team.esprit.presentation;

import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class AjouterUnCovoitureur extends javax.swing.JFrame {

    public AjouterUnCovoitureur() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_Ajouter = new javax.swing.JButton();
        boutton_Retour = new javax.swing.JButton();
        label_Login = new javax.swing.JLabel();
        tf_Login = new javax.swing.JTextField();
        label_Login1 = new javax.swing.JLabel();
        tf_MotDePasse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_Ajouter.setText("Ajouter");
        boutton_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AjouterActionPerformed(evt);
            }
        });

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        label_Login.setText("Login :");

        tf_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_LoginActionPerformed(evt);
            }
        });

        label_Login1.setText("Mot de passe :");

        tf_MotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_MotDePasseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ajouter un Covoitureur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boutton_Ajouter))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(label_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Login))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(label_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_MotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(boutton_Retour)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Login)
                    .addComponent(tf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Login1)
                    .addComponent(tf_MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Ajouter)
                    .addComponent(boutton_Retour))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_LoginActionPerformed

    private void tf_MotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_MotDePasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_MotDePasseActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GestionDesCovoitureurs gestionDeCovoitueur = new GestionDesCovoitureurs();
        gestionDeCovoitueur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AjouterActionPerformed
        // TODO add your handling code here:
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur = new Covoitureur();
        covoitureur.setLogin(tf_Login.getText());
        covoitureur.setMdp(tf_MotDePasse.getText());
        System.out.println("test aff 2 " + covoitureur.getMdp() + covoitureur.getLogin() + tf_MotDePasse.getText());
        covoitureurDAO.ajouterCovoitureur(covoitureur);


    }//GEN-LAST:event_boutton_AjouterActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterUnCovoitureur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Ajouter;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_Login;
    private javax.swing.JLabel label_Login1;
    private javax.swing.JTextField tf_Login;
    private javax.swing.JTextField tf_MotDePasse;
    // End of variables declaration//GEN-END:variables
}