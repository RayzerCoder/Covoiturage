package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import team.esprit.entities.StatCovoitureur;
import team.esprit.util.MyConnection;

public class StatistiqueDAO {

    public void ajouterStatistique(StatCovoitureur statistique) {

        String requete = "INSERT INTO statistiques (nom, type, chemin) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, statistique.getNom());
            ps.setString(2, statistique.getType());
            ps.setString(3, statistique.getChemin());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
}