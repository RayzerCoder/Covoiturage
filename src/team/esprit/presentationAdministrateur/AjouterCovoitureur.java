package team.esprit.presentationAdministrateur;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class AjouterCovoitureur extends javax.swing.JFrame {

    public AjouterCovoitureur() {
        initComponents();
        setTitle("Ajouter un Covoitureur");
        initialise();
    }
    
    public void initialise() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_Ajouter = new javax.swing.JButton();
        boutton_Retour = new javax.swing.JButton();
        label_Login = new javax.swing.JLabel();
        tf_Login = new javax.swing.JTextField();
        label_Login1 = new javax.swing.JLabel();
        tf_MotDePasse = new javax.swing.JPasswordField();

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

        label_Login1.setText("Mot de passe :");

        tf_MotDePasse.setText("jPassword");
        tf_MotDePasse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_MotDePasseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_MotDePasse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutton_Ajouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutton_Retour))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Login)
                    .addComponent(tf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Login1)
                    .addComponent(tf_MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Ajouter)
                    .addComponent(boutton_Retour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GestionCovoitureurs gestionCovoitueur = new GestionCovoitureurs();
        gestionCovoitueur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void boutton_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AjouterActionPerformed
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur = new Covoitureur();
        covoitureur.setEmail(tf_Login.getText());
        covoitureur.setMdp(tf_MotDePasse.getText());

        if ((covoitureur.getEmail() != null) && (covoitureur.getMdp() != null)) {
            try {
                covoitureurDAO.ajouterCovoitureur(covoitureur);
                JOptionPane.showMessageDialog(this, "Ajout effectué avec succés ");
            } catch (Exception e) {
            }
        } else if (covoitureur.getEmail() == null) {
            JOptionPane.showMessageDialog(this, "Vérifier le format de l'adresse e-mail");
        } else if (covoitureur.getMdp() == null) {
            JOptionPane.showMessageDialog(this, "Vérifier la format du Mot de passe");//  : length 8 , containing at least one lowercase letter ,at least one uppercase letter and at least one number
        }
    }//GEN-LAST:event_boutton_AjouterActionPerformed

    private void tf_MotDePasseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_MotDePasseMouseClicked
        tf_MotDePasse.setText("");
    }//GEN-LAST:event_tf_MotDePasseMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterCovoitureur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Ajouter;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JLabel label_Login;
    private javax.swing.JLabel label_Login1;
    private javax.swing.JTextField tf_Login;
    private javax.swing.JPasswordField tf_MotDePasse;
    // End of variables declaration//GEN-END:variables
}