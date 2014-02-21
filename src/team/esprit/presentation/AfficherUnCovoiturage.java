package team.esprit.presentation;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class AfficherUnCovoiturage extends javax.swing.JFrame {

    public AfficherUnCovoiturage() {
        initComponents();
        setTitle("Afficher un covoiturage");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Afficher = new javax.swing.JTextArea();
        boutton_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_Afficher.setEditable(false);
        ta_Afficher.setColumns(20);
        ta_Afficher.setRows(5);
        jScrollPane1.setViewportView(ta_Afficher);

        boutton_Cancel.setText("Retour");
        boutton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(boutton_Cancel)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutton_Cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_CancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_boutton_CancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherUnCovoiturage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_Cancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_Afficher;
    // End of variables declaration//GEN-END:variables
}