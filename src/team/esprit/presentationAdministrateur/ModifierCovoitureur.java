package team.esprit.presentationAdministrateur;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class ModifierCovoitureur extends javax.swing.JFrame {

    Covoitureur covoitureur;

    public ModifierCovoitureur() {
        this.dispose();
    }

    public ModifierCovoitureur(Covoitureur covoitureur) {
        initComponents();
        setTitle("Modifier un Covoitureur");
        initialise();
        this.covoitureur = covoitureur;
        initialiserComposants();
    }
    
    public void initialise() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void initialiserComposants() {
        tf_Nom.setText(covoitureur.getNom());
        tf_Prenom.setText(covoitureur.getPrenom());
        tf_Email.setText(covoitureur.getEmail());
        tf_Etat.setText("" + covoitureur.getEtat());
        tf_Avatar.setText(covoitureur.getAvatar());
        tf_Facebook.setText(covoitureur.getFacebook());
        tf_Skype.setText(covoitureur.getSkype());
        tf_NomUtilisateur.setText(covoitureur.getNomUtilisateur());
        tf_Mdp.setText(covoitureur.getMdp());
        jX_date.setDate(covoitureur.getDateNaissance());
        if (covoitureur.isFumeur() == true) {
            rb_Oui.setSelected(true);
        } else {
            rb_Non.setSelected(true);
        }
        if (covoitureur.getSexe() == 'H') {
            rb_Homme.setSelected(true);
        } else {
            rb_Femme.setSelected(true);
        }
        jX_date.setDate(covoitureur.getDateNaissance());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        tf_Mdp = new javax.swing.JTextField();
        tf_NomUtilisateur = new javax.swing.JTextField();
        tf_Nom = new javax.swing.JTextField();
        tf_Avatar = new javax.swing.JTextField();
        tf_Prenom = new javax.swing.JTextField();
        rb_Homme = new javax.swing.JRadioButton();
        rb_Femme = new javax.swing.JRadioButton();
        rb_Oui = new javax.swing.JRadioButton();
        rb_Non = new javax.swing.JRadioButton();
        tf_Facebook = new javax.swing.JTextField();
        tf_Skype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        boutton_Modifer = new javax.swing.JButton();
        tf_Etat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jX_date = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Adresse E-Mail:");

        jLabel3.setText("Mot de passe:");

        jLabel4.setText("Nom Utlisateur:");

        jLabel5.setText("Nom:");

        jLabel6.setText("Prenom:");

        jLabel7.setText("Sexe:");

        jLabel9.setText("Skype :");

        jLabel10.setText("Facebook :");

        jLabel12.setText("Avatar :");

        jLabel13.setText("Fumeur :");

        jLabel14.setText("Date de naissance:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Modifier Un Covoitureur :");

        tf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EmailActionPerformed(evt);
            }
        });

        tf_Avatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AvatarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_Homme);
        rb_Homme.setText("Homme");

        buttonGroup1.add(rb_Femme);
        rb_Femme.setText("Femme");

        buttonGroup2.add(rb_Oui);
        rb_Oui.setText("Oui");

        buttonGroup2.add(rb_Non);
        rb_Non.setText("Non");

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boutton_Modifer.setText("Modifier");
        boutton_Modifer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ModiferActionPerformed(evt);
            }
        });

        tf_Etat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EtatActionPerformed(evt);
            }
        });

        jLabel8.setText("Etat:");

        jX_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jX_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Nom)
                            .addComponent(tf_Prenom)
                            .addComponent(tf_NomUtilisateur)
                            .addComponent(tf_Mdp)
                            .addComponent(tf_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(tf_Etat)))
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_Homme)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_Femme)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_Non)
                            .addComponent(rb_Oui))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boutton_Modifer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_Avatar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(tf_Skype, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_Facebook, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jX_date, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(tf_Skype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_NomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jX_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(boutton_Modifer)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Etat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_Femme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_Homme))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_Oui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_Non)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_ModiferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ModiferActionPerformed
        covoitureur.setEmail(tf_Email.getText());
        covoitureur.setMdp(tf_Mdp.getText());
        covoitureur.setNomUtilisateur(tf_NomUtilisateur.getText());
        covoitureur.setNom(tf_Nom.getText());
        covoitureur.setPrenom(tf_Prenom.getText());
        covoitureur.setEtat(Integer.parseInt(tf_Etat.getText()));
        if (rb_Homme.isSelected())  {
            covoitureur.setSexe('H');
        }
        else{
            covoitureur.setSexe('F');
        }
        covoitureur.setAvatar(tf_Avatar.getText());
        covoitureur.setSkype(tf_Skype.getText());
        covoitureur.setFacebook(tf_Facebook.getText());
        java.util.Date dateNaissanceUTIL = jX_date.getDate();
        java.sql.Date dateNaissanceSQL = new java.sql.Date(dateNaissanceUTIL.getTime());
        covoitureur.setDateNaissance(dateNaissanceSQL);
        
        if ( rb_Oui.isSelected()){
            covoitureur.setFumeur(true);
        }
        else {
            covoitureur.setFumeur(false);
        }
        
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        covoitureurDAO.modifierCovoitureur(covoitureur);
    }//GEN-LAST:event_boutton_ModiferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RechercherCovoitureur rechercheruncovoitureur = new RechercherCovoitureur();
        rechercheruncovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailActionPerformed

    private void tf_AvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AvatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_AvatarActionPerformed

    private void tf_EtatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EtatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EtatActionPerformed

    private void jX_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jX_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jX_dateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifierCovoitureur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierCovoitureur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierCovoitureur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierCovoitureur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierCovoitureur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Modifer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jX_date;
    private javax.swing.JRadioButton rb_Femme;
    private javax.swing.JRadioButton rb_Homme;
    private javax.swing.JRadioButton rb_Non;
    private javax.swing.JRadioButton rb_Oui;
    private javax.swing.JTextField tf_Avatar;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Etat;
    private javax.swing.JTextField tf_Facebook;
    private javax.swing.JTextField tf_Mdp;
    private javax.swing.JTextField tf_Nom;
    private javax.swing.JTextField tf_NomUtilisateur;
    private javax.swing.JTextField tf_Prenom;
    private javax.swing.JTextField tf_Skype;
    // End of variables declaration//GEN-END:variables
}