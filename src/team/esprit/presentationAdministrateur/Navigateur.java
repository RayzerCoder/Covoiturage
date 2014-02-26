/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team.esprit.presentationAdministrateur;

import chrriis.dj.nativeswing.swtimpl.*;
import chrriis.dj.nativeswing.swtimpl.components.*;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import team.esprit.entities.Ville;

/**
 *
 * @author Hhussein
 */
public class Navigateur extends JFrame {

    public Navigateur(String url) {
        JPanel PanelbrowserJPanel = new JPanel();
        PanelbrowserJPanel.setLayout(new BorderLayout());
        final JWebBrowser navigateur = new JWebBrowser();
        navigateur.navigate(url);
        PanelbrowserJPanel.add(navigateur);
        add(PanelbrowserJPanel);
    }

    public static void main(final Ville depart, final Ville arrivee) {
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String link;
                link = "http://maps.googleapis.com/maps/api/staticmap?"
                        + "center=center=+Sidi Bouzid,Tunisia"
                        + "&zoom=7&size=1200x1200"
                        + "&maptype=roadmap"
                        //  + "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794" 
                        + "&markers=color:green%7Clabel:D%7C40|" + depart.getLatitude() + "," + depart.getLongitude()
                        + "&sensor=true"
                        + "&markers=color:red%7Clabel:A%7C40|" + arrivee.getLatitude() + "," + arrivee.getLongitude()
                        + "&sensor=true"
                        + "&path=color:blue|weight:5|geodesic:true|" + depart.getLatitude() + "," + depart.getLongitude()
                        + "|" + arrivee.getLatitude() + "," + arrivee.getLongitude();


                Navigateur nav = new Navigateur(link);
                nav.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                nav.setVisible(true);
                nav.setSize(700, 700);
            }
        });

    }
}
