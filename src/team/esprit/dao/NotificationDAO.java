package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import team.esprit.entities.Covoitureur;
import team.esprit.util.MyConnection;

public class NotificationDAO {

    public boolean envoyerNotification(Covoitureur covoitureur1, Covoitureur covoitureur2, String contenu, int type) {
        String requete = "INSERT INTO notifications(id_expediteur, id_destinataire, contenu, type) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = MyConnection.getInstance().prepareStatement(requete);
            preparedStatement.setInt(1, covoitureur1.getId());
            preparedStatement.setInt(2, covoitureur2.getId());
            preparedStatement.setString(3, contenu);
            preparedStatement.setInt(4, type);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
}