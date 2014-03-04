package team.esprit.presentationAdministrateur;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class ModifierCovoitureur extends javax.swing.JFrame {

    private static final String _regexNom = "^([a-zA-Z'àâéèêôùûçÀÂÉÈÔÙÛÇ\\s-]{1,30})$";
    private static final String _regexAdressEmail = "^[^\\W][a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*\\@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*\\.[a-zA-Z]{2,4}$";
    private static final String _regexMdp = "^\\S*(?=\\S{8,})(?=\\S*[a-z])(?=\\S*[A-Z])(?=\\S*[\\d])\\S*$";
    Covoitureur covoitureur;

    public ModifierCovoitureur() {
        this.dispose();
        initialise();
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

        if (covoitureur.getEtat() == 0) {
            cb_Etat.setSelectedIndex(0);
        } else if (covoitureur.getEtat() == 1) {
            cb_Etat.setSelectedIndex(1);
        } else if (covoitureur.getEtat() == 2) {
            cb_Etat.setSelectedIndex(2);
        }

        tf_Avatar.setText(covoitureur.getAvatar());
        tf_Facebook.setText(covoitureur.getFacebook());
        tf_Skype.setText(covoitureur.getSkype());
        tf_NomUtilisateur.setText(covoitureur.getNomUtilisateur());

        dp_Date.setDate(covoitureur.getDateNaissance());
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
    }

    public String MD5Crypt(char[] textField) {
        String mdp = "";
        MessageDigest messageDigest;
        byte[] digest;
        BigInteger bigInt;
        String hashText;

        try {
            for (int i = 0; i < textField.length; i++) {
                mdp = mdp + textField[i];
            }
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(mdp.getBytes());
            digest = messageDigest.digest();
            bigInt = new BigInteger(1, digest);
            hashText = bigInt.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
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
        boutton_Retour = new javax.swing.JButton();
        boutton_Modifer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dp_Date = new org.jdesktop.swingx.JXDatePicker();
        cb_Etat = new javax.swing.JComboBox();
        tf_Mdp = new javax.swing.JPasswordField();

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

        buttonGroup1.add(rb_Homme);
        rb_Homme.setText("Homme");

        buttonGroup1.add(rb_Femme);
        rb_Femme.setText("Femme");

        buttonGroup2.add(rb_Oui);
        rb_Oui.setText("Oui");

        buttonGroup2.add(rb_Non);
        rb_Non.setText("Non");

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        boutton_Modifer.setText("Modifier");
        boutton_Modifer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ModiferActionPerformed(evt);
            }
        });

        jLabel8.setText("Etat:");

        cb_Etat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2" }));

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
                            .addComponent(tf_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(cb_Etat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Mdp)))
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_Homme)
                            .addComponent(rb_Femme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_Non)
                                .addGap(230, 230, 230))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12))
                                        .addGap(57, 57, 57))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dp_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Skype, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_Oui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutton_Modifer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boutton_Retour)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_Mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_NomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tf_Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_Skype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dp_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cb_Etat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_Femme)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_Homme))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(boutton_Retour)
                                                .addComponent(boutton_Modifer))
                                            .addComponent(rb_Oui))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_Non)))))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_ModiferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ModiferActionPerformed
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        if (tf_Email.getText().matches(_regexAdressEmail) == false) {
            JOptionPane.showMessageDialog(this, "Adresse E-Mail invalide !", null, 2);
        } else {
            if (tf_Mdp.getText().matches(_regexMdp) == false) {
                JOptionPane.showMessageDialog(this, "Le mot de passe doit contenir 8 caractéres dont au "
                        + "moin une lettre miniscule, une lettre majuscule ets un chifre !", null, 2);
            } else {
                if (tf_Nom.getText().matches(_regexNom) == false) {
                    JOptionPane.showMessageDialog(this, "Nom invalide !", null, 2);
                } else {
                    if (tf_Prenom.getText().matches(_regexNom) == false) {
                        JOptionPane.showMessageDialog(this, "Prenom invalide !", null, 2);
                    } else {
                        if (dp_Date.getDate() == null) {
                            JOptionPane.showMessageDialog(this, "Saisissez votre date de naissance !", null, 2);
                        } else {
                            if (tf_Avatar.getText().matches(_regexNom) == false) {
                                JOptionPane.showMessageDialog(this, "Lien vers la photo de profil invalide !", null, 2);
                            } else {
                                if (tf_Skype.getText().matches(_regexNom) == false) {
                                    JOptionPane.showMessageDialog(this, "Nom d'utilisateur Skype !", null, 2);
                                } else {
                                    if (tf_Facebook.getText().matches(_regexNom) == false) {
                                        JOptionPane.showMessageDialog(this, "Lien vers le profil Facebook invalide !", null, 2);
                                    } else {
                                        covoitureur.setEmail(tf_Email.getText());

                                        char[] motPass = tf_Mdp.getPassword();
                                        String MD5Pass = MD5Crypt(motPass);
                                        covoitureur.setMdp(MD5Pass);

                                        covoitureur.setNomUtilisateur(tf_NomUtilisateur.getText());
                                        covoitureur.setNom(tf_Nom.getText());
                                        covoitureur.setPrenom(tf_Prenom.getText());

                                        covoitureur.setEtat(Integer.parseInt(cb_Etat.getSelectedItem().toString()));

                                        if (rb_Homme.isSelected()) {
                                            covoitureur.setSexe('H');
                                        } else {
                                            covoitureur.setSexe('F');
                                        }
                                        covoitureur.setAvatar(tf_Avatar.getText());
                                        covoitureur.setSkype(tf_Skype.getText());
                                        covoitureur.setFacebook(tf_Facebook.getText());

                                        java.util.Date dateNaissanceUTIL = dp_Date.getDate();
                                        java.sql.Date dateNaissanceSQL = new java.sql.Date(dateNaissanceUTIL.getTime());
                                        covoitureur.setDateNaissance(dateNaissanceSQL);

                                        if (rb_Oui.isSelected()) {
                                            covoitureur.setFumeur(true);
                                        } else {
                                            covoitureur.setFumeur(false);
                                        }
                                        if (covoitureurDAO.modifierCovoitureur(covoitureur)) {
                                            JOptionPane.showMessageDialog(this, "Modification effectué avec succés.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_boutton_ModiferActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        RechercherCovoitureur rechercheruncovoitureur = new RechercherCovoitureur();
        rechercheruncovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

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
    private javax.swing.JButton boutton_Retour;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cb_Etat;
    private org.jdesktop.swingx.JXDatePicker dp_Date;
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
    private javax.swing.JRadioButton rb_Femme;
    private javax.swing.JRadioButton rb_Homme;
    private javax.swing.JRadioButton rb_Non;
    private javax.swing.JRadioButton rb_Oui;
    private javax.swing.JTextField tf_Avatar;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_Facebook;
    private javax.swing.JPasswordField tf_Mdp;
    private javax.swing.JTextField tf_Nom;
    private javax.swing.JTextField tf_NomUtilisateur;
    private javax.swing.JTextField tf_Prenom;
    private javax.swing.JTextField tf_Skype;
    // End of variables declaration//GEN-END:variables
}