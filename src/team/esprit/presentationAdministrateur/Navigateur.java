package team.esprit.presentationAdministrateur;

import chrriis.dj.nativeswing.swtimpl.*;
import chrriis.dj.nativeswing.swtimpl.components.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import team.esprit.entities.Ville;

public class Navigateur extends JFrame {

    public Navigateur(String url) {
        initComponents(url);
        setTitle("Localiser votre trajet");
    }
    
    public void initComponents(String url) {
        JPanel PanelbrowserJPanel = new JPanel();
        PanelbrowserJPanel.setLayout(new BorderLayout());
        final JWebBrowser webBrowser = new JWebBrowser();
        webBrowser.navigate(url);
        PanelbrowserJPanel.add(webBrowser);
        add(PanelbrowserJPanel);
    }

    public static void main(final Ville villeDepart, final Ville villeArrive) {
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String url = "http://maps.googleapis.com/maps/api/staticmap?"
                        + "center=center=+Sidi Bouzid,Tunisia"
                        + "&zoom=7&size=1200x1200"
                        + "&maptype=roadmap"
                        + "&markers=color:green%7Clabel:D%7C40|" + villeDepart.getLatitude() + "," + villeDepart.getLongitude()
                        + "&sensor=true"
                        + "&markers=color:red%7Clabel:A%7C40|" + villeArrive.getLatitude() + "," + villeArrive.getLongitude()
                        + "&sensor=true"
                        + "&path=color:blue|weight:5|geodesic:true|" + villeDepart.getLatitude() + "," + villeDepart.getLongitude()
                        + "|" + villeArrive.getLatitude() + "," + villeArrive.getLongitude();
                Navigateur navigateur = new Navigateur(url);
                navigateur.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                navigateur.setVisible(true);
                navigateur.setResizable(false);
                navigateur.pack();
                navigateur.setSize(700, 700);
            }
        });
    }
}