package team.esprit.presentationAdministrateur;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import team.esprit.controllers.MailController;
import team.esprit.controllers.RandomString;
import team.esprit.dao.AdministrateurDAO;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Administrateur;
import team.esprit.entities.Covoitureur;
import team.esprit.presentationClient.AccueilClient;
import team.esprit.presentationClient.AfficherLesReservations;
import team.esprit.presentationClient.ConsulterMesMessage;
import team.esprit.presentationClient.CreerUnCovoiturage;
import team.esprit.presentationClient.ValiderInscription;
import team.esprit.presentationClient.EnvoyerReclamation;
import team.esprit.presentationClient.Inscription;

public class Authentification extends javax.swing.JFrame {

    private static final String _regexAdressEmail = "^[^\\W][a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*\\@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*\\.[a-zA-Z]{2,4}$";
    private static final String _regexMdp = "^\\S*(?=\\S{8,})(?=\\S*[a-z])(?=\\S*[A-Z])(?=\\S*[\\d])\\S*$";
    public static Covoitureur covoitureurConnecte;

    public Authentification() {
        initComponents();
        setTitle("Authentification");
        initialise();
    }

    public void initialise() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String creerNouveauMotPasse() {
        RandomString randomString = new RandomString(8);
        String motPass = randomString.nextString();
        StringBuilder newMotPass = new StringBuilder(motPass);
        newMotPass.setCharAt(0, '0');
        newMotPass.setCharAt(3, 'x');
        newMotPass.setCharAt(7, 'X');
        return newMotPass.toString();
    }

    public String MD5Crypt(char[] textField) {
        String mdp = "";
        try {
            for (int i = 0; i < textField.length; i++) {
                mdp = mdp + textField[i];
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(mdp.getBytes());
            byte[] digest = messageDigest.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String hashText = bigInt.toString(16);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        boutton_Authentifier = new javax.swing.JButton();
        tf_Pass = new javax.swing.JPasswordField();
        boutton_Reinitialiser = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        boutton_LoginFacebook = new javax.swing.JButton();
        boutton_Inscription = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adresse E-Mail:");

        jLabel2.setText("Mot de passe:");

        boutton_Authentifier.setText("M'authentifier");
        boutton_Authentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AuthentifierActionPerformed(evt);
            }
        });

        boutton_Reinitialiser.setText("Réinitialiser mon mot de passe");
        boutton_Reinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_ReinitialiserActionPerformed(evt);
            }
        });

        boutton_LoginFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team/esprit/presentationAdministrateur/facebook.jpg"))); // NOI18N

        boutton_Inscription.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boutton_Inscription.setText("Je m'inscris !");
        boutton_Inscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_InscriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutton_Authentifier)
                .addGap(18, 18, 18)
                .addComponent(boutton_Reinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(boutton_LoginFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutton_Inscription)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Authentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_Reinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boutton_LoginFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_Inscription, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AuthentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AuthentifierActionPerformed
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        AdministrateurDAO administrateurDAO = new AdministrateurDAO();
        covoitureurConnecte = covoitureurDAO.afficherCovoitureurEMAIL(tf_Email.getText());
        Administrateur administrateur = administrateurDAO.afficherInformations();
        if (tf_Email.getText().matches(_regexAdressEmail) == false) {
            JOptionPane.showMessageDialog(this, "Adresse E-Mail invalide !", null, 2);
        } else {
            if (tf_Pass.getText().matches(_regexMdp) == false) {
                JOptionPane.showMessageDialog(this, "Le mot de passe doit contenir 8 caractéres dont au "
                        + "moin une lettre miniscule, une lettre majuscule ets un chifre !", null, 2);
            } else {
                if (tf_Email.getText().equals(administrateur.getEmail()) && (((MD5Crypt(tf_Pass.getPassword()).equals(administrateur.getMdp()))))) {
                    JOptionPane.showMessageDialog(this, "Bienvenue Administrateur :)");
                    this.dispose();
                    Accueil accueil = new Accueil();
                    accueil.setVisible(true);
                } else if ((tf_Email.getText().equals(covoitureurConnecte.getEmail())) && ((MD5Crypt(tf_Pass.getPassword()).equals(covoitureurConnecte.getMdp())))) {
                    if (covoitureurConnecte.getEtat() == 1) {
                        if (covoitureurConnecte.getSexe() == 'X') {
                            int choix = JOptionPane.showConfirmDialog(this, "Bonjour " + covoitureurConnecte.getEmail() + ", "
                                    + "veuillez valider votre inscription afin "
                                    + "de pouvoir accéder à notre application. Merci", null, 2, 3);
                            if (choix == 0) {
                                ValiderInscription validerInscription =
                                        new ValiderInscription(covoitureurConnecte);
                                validerInscription.setVisible(true);
                            }
                        } else if (covoitureurConnecte.getSexe() == 'F') {
                            int choix = JOptionPane.showConfirmDialog(this, "Bonjour Madame, "
                                    + "veuillez valider votre inscription afin"
                                    + " de pouvoir accéder à notre application. Merci", null, 2, 3);
                            if (choix == 0) {
                                ValiderInscription validerInscription = new ValiderInscription(covoitureurConnecte);
                                validerInscription.setVisible(true);
                            }
                        } else if (covoitureurConnecte.getSexe() == 'H') {
                            int choix = JOptionPane.showConfirmDialog(this, "Bonjour Monsieur, "
                                    + "veuillez valider votre inscription afin"
                                    + " de pouvoir accéder à notre application. Merci", null, 2, 3);
                            if (choix == 0) {
                                ValiderInscription validerInscription =
                                        new ValiderInscription(covoitureurConnecte);
                                this.dispose();
                                validerInscription.setVisible(true);
                            }
                        }
                    } else if (covoitureurConnecte.getEtat() == 0) {
                        if (covoitureurConnecte.getSexe() == 'X') {
                            int choix = JOptionPane.showConfirmDialog(this, "Désolé " + covoitureurConnecte.getEmail()
                                    + ", vous etes bloquée par l'Administrateur. "
                                    + "Vous pouvez lui envoyer une réclamation.", null, 2, 3);
                            if (choix == 0) {
                                EnvoyerReclamation envoyerReclamation =
                                        new EnvoyerReclamation(covoitureurConnecte.getEmail());
                                this.dispose();
                                envoyerReclamation.setVisible(true);
                            }
                        } else if (covoitureurConnecte.getSexe() == 'F') {
                            int choix = JOptionPane.showConfirmDialog(this, "Désolé Madame "
                                    + covoitureurConnecte.getPrenom()
                                    + " " + covoitureurConnecte.getNom() + ", vous etes bloquée par l'Administrateur. "
                                    + "Vous pouvez lui envoyer une réclamation.", null, 2, 3);
                            if (choix == 0) {
                                EnvoyerReclamation envoyerReclamation = new EnvoyerReclamation(covoitureurConnecte.getEmail());
                                this.dispose();
                                envoyerReclamation.setVisible(true);
                            }
                        } else if (covoitureurConnecte.getSexe() == 'H') {
                            int choix = JOptionPane.showConfirmDialog(this, "Désolé Monsieur "
                                    + covoitureurConnecte.getPrenom()
                                    + " " + covoitureurConnecte.getNom() + ", vous etes bloquée par l'Administrateur. "
                                    + "Vous pouvez lui envoyer une réclamation.", "Bloqué", 2, 3);
                            if (choix == 0) {
                                EnvoyerReclamation envoyerReclamation = new EnvoyerReclamation(covoitureurConnecte.getEmail());
                                this.dispose();
                                envoyerReclamation.setVisible(true);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Bienvenue " + covoitureurConnecte.getPrenom()
                                + " " + covoitureurConnecte.getNom() + " :)");
                        this.dispose();
                        AccueilClient accueilClient = new AccueilClient(covoitureurConnecte);
                        ConsulterMesMessage consulterMesMessages = new ConsulterMesMessage(covoitureurConnecte);
                        CreerUnCovoiturage creerUnCovoiturage = new CreerUnCovoiturage(covoitureurConnecte);
                        AfficherLesReservations afficherLesReservations = new AfficherLesReservations();
                        afficherLesReservations.setVisible(true);
                        //creerUnCovoiturage.setVisible(true);
                        //consulterMesMessages.setVisible(true);
                        //accueilClient.setVisible(true);
                    }
                    if ((covoitureurConnecte.getSexe() == 'X')
                            || (covoitureurConnecte.getNom() == null)
                            || (covoitureurConnecte.getPrenom() == null)) {
                        JOptionPane.showMessageDialog(this, "Veuillez mettre à jour votre profil. Vérifier votre sexe, votre nom et votre prénom.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Combinaison Email - Mot de passe invalide ! Veuillez vérifier vos coordonnées !", null, 2);
                }
            }
        }
    }//GEN-LAST:event_boutton_AuthentifierActionPerformed
    private void boutton_ReinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ReinitialiserActionPerformed
        MailController mailController = new MailController();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        AdministrateurDAO administrateurDAO = new AdministrateurDAO();
        Administrateur administrateur = administrateurDAO.afficherInformations();
        covoitureurConnecte = covoitureurDAO.afficherCovoitureurEMAIL(tf_Email.getText());
        if (tf_Email.getText().matches(_regexAdressEmail) == false) {
            JOptionPane.showMessageDialog(this, "Adresse E-Mail invalide !", null, 2);
        } else {
            int choix = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment changer votre mot de passe ?", null, 2);
            if (choix == 0) {
                String motPasse = creerNouveauMotPasse();
                String destinataire = tf_Email.getText();
                String msg = "Votre nouveau mot de passe est:\n\n" + motPasse;
                char[] password = motPasse.toCharArray();
                String MD5Pass = MD5Crypt(password);
                System.out.println(motPasse);
                System.out.println(MD5Pass);
                if (tf_Email.getText().equals(administrateur.getEmail())) {
                    if (mailController.envoyerEmailReinitialisationMotPasse(destinataire, msg)
                            && administrateurDAO.modifierMotPasse(administrateur, MD5Pass)) {
                        JOptionPane.showMessageDialog(this, "Votre mot de passe a été réinitialisé.");
                    }
                } else if (tf_Email.getText().equals(covoitureurConnecte.getEmail())) {
                    if (mailController.envoyerEmailReinitialisationMotPasse(destinataire, msg)
                            && covoitureurDAO.modifierMotPasse(covoitureurConnecte, MD5Pass)) {
                        JOptionPane.showMessageDialog(this, "Votre mot de passe n' pas a été réinitialisé.", null, 2);
                    }
                }
            }
        }
    }//GEN-LAST:event_boutton_ReinitialiserActionPerformed

    private void boutton_InscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_InscriptionActionPerformed
        Inscription inscription = new Inscription();
        this.dispose();
        inscription.setVisible(true);
    }//GEN-LAST:event_boutton_InscriptionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Authentifier;
    private javax.swing.JButton boutton_Inscription;
    private javax.swing.JButton boutton_LoginFacebook;
    private javax.swing.JButton boutton_Reinitialiser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JPasswordField tf_Pass;
    // End of variables declaration//GEN-END:variables
}