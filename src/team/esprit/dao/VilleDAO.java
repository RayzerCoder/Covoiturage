package team.esprit.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import team.esprit.entities.Ville;
import team.esprit.util.MyConnection;

public class VilleDAO {

    public Ville afficheVille_ID(int id) {
        Ville ville = new Ville();
        String requete = "SELECT * FROM VILLES WHERE ID = " + id;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                ville.setId(resultat.getInt(1));
                ville.setLatitude(resultat.getFloat(2));
                ville.setLongitude(resultat.getFloat(3));
                ville.setNom(resultat.getString(4));
                ville.setGouvernorat(resultat.getString(5));
                ville.setCodePostal(resultat.getInt(6));
            }
            return ville;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la Ville " + ex.getMessage());
            return null;
        }
    }
}
