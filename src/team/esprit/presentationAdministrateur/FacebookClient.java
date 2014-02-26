package team.esprit.presentation;


import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FacebookClient extends JFrame {

    JButton login;
    JButton getPermissionsForApp;
    JButton retrieveUser;
    JButton getAccessToken;

    public FacebookClient() {

        login = new JButton("Login");
        getPermissionsForApp = new JButton("get permissions for app");
        retrieveUser = new JButton("retrieve user information");
        getAccessToken = new JButton("get access_token");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        panel.add(login);
        panel.add(getPermissionsForApp);
        panel.add(retrieveUser);
        panel.add(getAccessToken);

        add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(100, 125);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    public void setLoginListener(ActionListener l) {
        login.addActionListener(l);
    }

    public void setgetPermissionsForAppListener(ActionListener l) {
        getPermissionsForApp.addActionListener(l);
    }

    public void setretrieveUserListener(ActionListener l) {
        retrieveUser.addActionListener(l);
    }

    public void setgetAccessTokenListener(ActionListener l) {
        getAccessToken.addActionListener(l);
    }

}
