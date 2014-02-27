package team.esprit.presentationAdministrateur;

import java.util.Calendar;
import java.util.List;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import team.esprit.dao.CovoiturageDAO;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.dao.VilleDAO;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Ville;

public class AjouterCovoiturage extends javax.swing.JFrame {

    CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
    CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
    VilleDAO villeDAO = new VilleDAO();
    List<Ville> listGouvernoratsDepart;
    List<Ville> listDelegationsDepart;
    List<Ville> ListLocalitesDepart;
    List<Ville> listGouvernoratsArrivee;
    List<Ville> listDelegationsArrivee;
    List<Ville> ListLocalitesArrivee;

    public AjouterCovoiturage() {
        initComponents();
        setTitle("Ajouter un covoiturage");
        initialise();
        
        spinnerDateModel();

        remplirGouvernoratDepart();
        remplirDelegationDepart();
        remplirLocaliteDepart();

        remplirGouvernoratArrivee();
        remplirDelegationArrivee();
        remplirLocaliteArrivee();
    }
    
    public void initialise() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void spinnerDateModel() {
        SpinnerDateModel model = new SpinnerDateModel();
        model.setCalendarField(Calendar.HOUR);
        model.setCalendarField(Calendar.MINUTE);
        model.setCalendarField(Calendar.SECOND);
        sp_HeureDepart.setModel(model);
        sp_HeureDepart.setEditor(new JSpinner.DateEditor(sp_HeureDepart, "hh:mm:ss a"));
    }

    public void remplirGouvernoratDepart() {
        listGouvernoratsDepart = villeDAO.afficheVilles();
        for (Ville ville : listGouvernoratsDepart) {
            cb_GouvernoratDepart.addItem(ville.getGouvernorat());
        }
    }

    public void remplirDelegationDepart() {
        listDelegationsDepart = villeDAO.afficheDelegation(cb_GouvernoratDepart.getSelectedItem().toString());
        for (Ville ville : listDelegationsDepart) {
            cb_DelegationDepart.addItem(ville.getDelegation());
        }
    }

    public void remplirLocaliteDepart() {
        ListLocalitesDepart = villeDAO.afficheLocalite(cb_GouvernoratDepart.getSelectedItem().toString(), cb_DelegationDepart.getSelectedItem().toString());
        for (Ville ville : ListLocalitesDepart) {
            cb_LocaliteDepart.addItem(ville.getLocalite());
        }
    }

    public void remplirGouvernoratArrivee() {
        listGouvernoratsArrivee = villeDAO.afficheVilles();
        for (Ville ville : listGouvernoratsArrivee) {
            cb_GouvernoratArrivee.addItem(ville.getGouvernorat());
        }
    }

    public void remplirDelegationArrivee() {
        listDelegationsArrivee = villeDAO.afficheDelegation(cb_GouvernoratArrivee.getSelectedItem().toString());
        for (Ville ville : listDelegationsArrivee) {
            cb_DelegationArrivee.addItem(ville.getDelegation());
        }
    }

    public void remplirLocaliteArrivee() {
        ListLocalitesArrivee = villeDAO.afficheLocalite(cb_GouvernoratArrivee.getSelectedItem().toString(), cb_DelegationArrivee.getSelectedItem().toString());
        for (Ville ville : ListLocalitesArrivee) {
            cb_LocaliteArrivee.addItem(ville.getLocalite());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb_GouvernoratDepart = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cb_DelegationDepart = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cb_GouvernoratArrivee = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cb_DelegationArrivee = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tf_Conducteur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dp_Date = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sp_NombrePlaces = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        tf_Prix = new javax.swing.JTextField();
        chb_Fumeur = new javax.swing.JCheckBox();
        chb_Reserve = new javax.swing.JCheckBox();
        boutton_Ajouter = new javax.swing.JButton();
        cb_LocaliteDepart = new javax.swing.JComboBox();
        cb_LocaliteArrivee = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sp_HeureDepart = new javax.swing.JSpinner();
        boutton_Retour = new javax.swing.JButton();
        boutton_Localiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Allant de:");

        cb_GouvernoratDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_GouvernoratDepartActionPerformed(evt);
            }
        });

        jLabel2.setText("Délégation:");

        cb_DelegationDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_DelegationDepartActionPerformed(evt);
            }
        });

        jLabel3.setText("Vers: ");

        cb_GouvernoratArrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_GouvernoratArriveeActionPerformed(evt);
            }
        });

        jLabel4.setText("Délégation:");

        cb_DelegationArrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_DelegationArriveeActionPerformed(evt);
            }
        });

        jLabel5.setText("E-Mail du conducteur:");

        tf_Conducteur.setToolTipText("");

        jLabel6.setText("Le:");

        jLabel7.setText("à:");

        jLabel9.setText("Nombre de places:");

        jLabel10.setText("Prix:");

        chb_Fumeur.setText("Fumeur");

        chb_Reserve.setText("Réservé aux femmes");

        boutton_Ajouter.setText("Ajouter");
        boutton_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AjouterActionPerformed(evt);
            }
        });

        jLabel11.setText("Localite:");

        jLabel12.setText("Localite:");

        boutton_Retour.setText("Retour");
        boutton_Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RetourActionPerformed(evt);
            }
        });

        boutton_Localiser.setText("Localiser");
        boutton_Localiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_LocaliserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Conducteur, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cb_GouvernoratDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_GouvernoratArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dp_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(chb_Fumeur))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sp_NombrePlaces, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(chb_Reserve))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sp_HeureDepart)
                                            .addComponent(tf_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_DelegationArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_DelegationDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_LocaliteDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_LocaliteArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(boutton_Retour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boutton_Ajouter))
                                    .addComponent(boutton_Localiser))))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Conducteur, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cb_GouvernoratDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cb_DelegationDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_GouvernoratArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cb_DelegationArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dp_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(sp_HeureDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(sp_NombrePlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(tf_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chb_Fumeur)
                            .addComponent(chb_Reserve)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_LocaliteDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_LocaliteArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(34, 34, 34)
                        .addComponent(boutton_Localiser)
                        .addGap(18, 18, 18)
                        .addComponent(boutton_Ajouter)
                        .addGap(18, 18, 18)
                        .addComponent(boutton_Retour)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AjouterActionPerformed
        Covoiturage covoiturage = new Covoiturage();

        Covoitureur covoitureur = covoitureurDAO.afficherCovoitureurEMAIL(tf_Conducteur.getText());
        covoiturage.setCreateur(covoitureur);

        Ville villeDepart = villeDAO.afficherVille_Localite(cb_LocaliteDepart.getSelectedItem().toString());
        covoiturage.setVilleDepart(villeDepart);

        Ville villeArrivee = villeDAO.afficherVille_Localite(cb_LocaliteArrivee.getSelectedItem().toString());
        covoiturage.setVilleArrivee(villeArrivee);

        java.util.Date dateDepartUTIL = dp_Date.getDate();
        java.sql.Date dateDepartSQL = new java.sql.Date(dateDepartUTIL.getTime());
        covoiturage.setDateDepart(dateDepartSQL);

        String time1 = sp_HeureDepart.getValue().toString();
        System.out.println(time1);
        time1 = time1.substring(11, 20);
        System.out.println(time1);
        covoiturage.setHeureDepart(time1);

        covoiturage.setNombrePlaces((int) sp_NombrePlaces.getValue());
        covoiturage.setPrix((Float.parseFloat(tf_Prix.getText())));
        covoiturage.setFumeur(chb_Fumeur.isSelected());
        covoiturage.setReserveeFemmes(chb_Reserve.isSelected());

        if (covoiturageDAO.ajouterCovoiturage(covoiturage)) {
            JOptionPane.showMessageDialog(this, "Le covoiturage a été ajouté avec succés !");
        } else {
            JOptionPane.showMessageDialog(this, "Le covoiturage n'a pas été ajouté !");
        }
    }//GEN-LAST:event_boutton_AjouterActionPerformed

    private void boutton_RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RetourActionPerformed
        GestionCovoiturages gestionDesCovoiturages = new GestionCovoiturages();
        this.dispose();
        gestionDesCovoiturages.setVisible(true);
    }//GEN-LAST:event_boutton_RetourActionPerformed

    private void cb_GouvernoratDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_GouvernoratDepartActionPerformed
        cb_DelegationDepart.removeAllItems();
        cb_LocaliteDepart.removeAllItems();
        remplirDelegationDepart();
        remplirLocaliteDepart();
    }//GEN-LAST:event_cb_GouvernoratDepartActionPerformed

    private void boutton_LocaliserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_LocaliserActionPerformed
        VilleDAO villedao = new VilleDAO();
        Ville depart = new Ville();
        Ville arrivee = new Ville();

        depart.setGouvernorat((String) cb_GouvernoratDepart.getSelectedItem());
        arrivee.setGouvernorat((String) cb_GouvernoratArrivee.getSelectedItem());
        depart.setLatitude(villedao.localiserVille_nom(depart.getGouvernorat()).getLatitude());
        depart.setLongitude(villedao.localiserVille_nom(depart.getGouvernorat()).getLongitude());
        arrivee.setLatitude(villedao.localiserVille_nom(arrivee.getGouvernorat()).getLatitude());
        arrivee.setLongitude(villedao.localiserVille_nom(arrivee.getGouvernorat()).getLongitude());

        Navigateur.main(depart, arrivee); // TODO add your handling code here:
    }//GEN-LAST:event_boutton_LocaliserActionPerformed

    private void cb_DelegationDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_DelegationDepartActionPerformed
        cb_LocaliteDepart.removeAllItems();
        cb_DelegationDepart.removeAllItems();
        remplirDelegationDepart();
        remplirLocaliteDepart();
    }//GEN-LAST:event_cb_DelegationDepartActionPerformed

    private void cb_GouvernoratArriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_GouvernoratArriveeActionPerformed
        cb_DelegationArrivee.removeAllItems();
        cb_LocaliteArrivee.removeAllItems();
        remplirDelegationArrivee();
        remplirLocaliteArrivee();
    }//GEN-LAST:event_cb_GouvernoratArriveeActionPerformed

    private void cb_DelegationArriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_DelegationArriveeActionPerformed
        cb_LocaliteArrivee.removeAllItems();
        remplirDelegationArrivee();
        remplirLocaliteArrivee();
    }//GEN-LAST:event_cb_DelegationArriveeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterCovoiturage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Ajouter;
    private javax.swing.JButton boutton_Localiser;
    private javax.swing.JButton boutton_Retour;
    private javax.swing.JComboBox cb_DelegationArrivee;
    private javax.swing.JComboBox cb_DelegationDepart;
    private javax.swing.JComboBox cb_GouvernoratArrivee;
    private javax.swing.JComboBox cb_GouvernoratDepart;
    private javax.swing.JComboBox cb_LocaliteArrivee;
    private javax.swing.JComboBox cb_LocaliteDepart;
    private javax.swing.JCheckBox chb_Fumeur;
    private javax.swing.JCheckBox chb_Reserve;
    private org.jdesktop.swingx.JXDatePicker dp_Date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner sp_HeureDepart;
    private javax.swing.JSpinner sp_NombrePlaces;
    private javax.swing.JTextField tf_Conducteur;
    private javax.swing.JTextField tf_Prix;
    // End of variables declaration//GEN-END:variables
}
