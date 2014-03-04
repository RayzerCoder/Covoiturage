package team.esprit.presentationClient;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.dao.MessageDAO;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Message;

public class RepondreMessage extends javax.swing.JFrame {

    public RepondreMessage() {
        this.dispose();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public RepondreMessage(String ch) {
        initComponents();
        setTitle("Répondre à un message");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ta_Message.setLineWrap(true);
        ta_Message.setWrapStyleWord(true);
        tf_Email.setText(ch);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_Annuler = new javax.swing.JButton();
        boutton_Envoyer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Message = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_Annuler.setText("Annuler");
        boutton_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AnnulerActionPerformed(evt);
            }
        });

        boutton_Envoyer.setText("Envoyer");
        boutton_Envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_EnvoyerActionPerformed(evt);
            }
        });

        ta_Message.setColumns(20);
        ta_Message.setRows(5);
        jScrollPane1.setViewportView(ta_Message);

        jLabel1.setText("To : ");

        tf_Email.setToolTipText("");
        tf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(boutton_Envoyer)
                .addGap(54, 54, 54)
                .addComponent(boutton_Annuler)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutton_Envoyer)
                    .addComponent(boutton_Annuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AnnulerActionPerformed
        ConsulterMesMessage consulterMesMessages = new ConsulterMesMessage();
        consulterMesMessages.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_boutton_AnnulerActionPerformed

    private void boutton_EnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_EnvoyerActionPerformed
        String destinataire = tf_Email.getText();
        Covoitureur covoitureur = new Covoitureur();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        covoitureur = covoitureurDAO.afficherCovoitureurEMAIL(destinataire);
        MessageDAO messageDAO = new MessageDAO();
        Message message = new Message();
        Covoitureur cov = new Covoitureur();
        cov = covoitureurDAO.afficherCovoitureur_ID(1);
        String msg = ta_Message.getText();
        message.setContenu(msg);
        message.setExpediteur(cov);
        message.setDestinataire(covoitureur);
        if (messageDAO.envoyerMessage(covoitureur, message) == true) {
            JOptionPane.showMessageDialog(this, "Votre message a été transmis vers l'adresse: " + destinataire);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Votre message n'a pas été transmis vers l'adresse: " + destinataire);
        }
    }//GEN-LAST:event_boutton_EnvoyerActionPerformed

    private void tf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RepondreMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepondreMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepondreMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepondreMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepondreMessage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Annuler;
    private javax.swing.JButton boutton_Envoyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_Message;
    private javax.swing.JTextField tf_Email;
    // End of variables declaration//GEN-END:variables
}
