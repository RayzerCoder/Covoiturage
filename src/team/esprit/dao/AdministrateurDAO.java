package team.esprit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import team.esprit.entities.Administrateur;
import team.esprit.util.MyConnection;

public class AdministrateurDAO {

    public Administrateur afficherInformations() {

        Administrateur administrateur = new Administrateur();
        String requete = "SELECT * FROM ADMINISTRATEURS ";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                administrateur.setId(resultat.getInt(1));
                administrateur.setEmail(resultat.getString(2));
                administrateur.setMdp(resultat.getString(3));
                administrateur.setNom(resultat.getString(4));
                administrateur.setPrenom(resultat.getString(5));
            }
            return administrateur;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement de l'Administrateur " + ex.getMessage());
            return null;
        }
    }
}
