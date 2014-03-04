package team.esprit.presentationClient;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import team.esprit.dao.MessageDAO;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Message;
import team.esprit.presentationAdministrateur.Authentification;

public class ConsulterMesMessage extends javax.swing.JFrame {

    Covoitureur covoitureurConnecte = Authentification.covoitureurConnecte;
    public String destinataire;

    public ConsulterMesMessage() {
        initialise();
        this.dispose();
    }

    public ConsulterMesMessage(Covoitureur covoitureur) {
        initComponents();
        setTitle("Mes Messages");
        covoitureurConnecte = covoitureur;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_AfficherMesMessage = new javax.swing.JTable();
        Btn_RepondreMessage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Btn_AfficherMessage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table_AfficherMesMessage.setModel(new ConsulterMesMessageTable());
        jScrollPane1.setViewportView(Table_AfficherMesMessage);

        Btn_RepondreMessage.setText("Repondre");
        Btn_RepondreMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RepondreMessageActionPerformed(evt);
            }
        });

        jButton1.setText("Retour");

        Btn_AfficherMessage.setText("Afficher message");
        Btn_AfficherMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AfficherMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Btn_RepondreMessage)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_AfficherMessage)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_RepondreMessage)
                    .addComponent(jButton1)
                    .addComponent(Btn_AfficherMessage))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AfficherMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AfficherMessageActionPerformed
        int ligneSelectionne = Table_AfficherMesMessage.getSelectedRow();
        int id = (int) Table_AfficherMesMessage.getValueAt(ligneSelectionne, 0);
        MessageDAO messageDAO = new MessageDAO();
        Message message = messageDAO.afficherUnMessage(id);
        String mailTo = message.getExpediteur().getEmail();
        String valueAt = null;
        valueAt = "ID:  " + message.getId()
                + "\nNom Expediteur: " + message.getExpediteur().getNom()
                + "\nObjet: " + message.getObjet()
                + "\nContenu: " + message.getContenu()
                + "\ndate d'envoie" + message.getDateEnvoie();
        AfficherUnMessage afficherUnMessage = new AfficherUnMessage(valueAt, mailTo);
        afficherUnMessage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_AfficherMessageActionPerformed

    private void Btn_RepondreMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RepondreMessageActionPerformed
        int ligneSelectionne = Table_AfficherMesMessage.getSelectedRow();
        int id = (int) Table_AfficherMesMessage.getValueAt(ligneSelectionne, 0);
        MessageDAO messageDAO = new MessageDAO();
        Message message = messageDAO.afficherUnMessage(id);
        String mailTo = message.getExpediteur().getEmail();
        RepondreMessage repondreMessage = new RepondreMessage(mailTo);
        this.dispose();
        repondreMessage.setVisible(true);
    }//GEN-LAST:event_Btn_RepondreMessageActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterMesMessage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AfficherMessage;
    private javax.swing.JButton Btn_RepondreMessage;
    private javax.swing.JTable Table_AfficherMesMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}