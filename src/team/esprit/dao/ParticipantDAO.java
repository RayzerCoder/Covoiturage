package team.esprit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.util.MyConnection;

public class ParticipantDAO {

    public List<Covoitureur> afficherParticipants(Covoiturage covoiturage) {

        List<Covoitureur> listParticipants = new ArrayList<Covoitureur>();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        String requete = "SELECT id_participant FROM participants WHERE participants.id_covoiturage = " + covoiturage.getId();
        
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoitureur covoitureur;
                covoitureur = covoitureurDAO.afficherCovoitureur_ID(resultat.getInt(1));
                listParticipants.add(covoitureur);
            }
            return listParticipants;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            return null;
        }
    }
}