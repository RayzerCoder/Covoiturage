package team.esprit.dao;

import java.sql.PreparedStatement;
import team.esprit.entities.Reclamation;
import team.esprit.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import team.esprit.entities.Covoitureur;

public class ReclamationDAO {

    public boolean ajouterReclamation(Covoitureur c, Reclamation reclamation) {
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Covoitureur covoitureur = new Covoitureur();
        
        try {
            if (covoitureurDAO.afficherCovoitureur_EMAIL(c.getEmail())) {
                covoitureur = covoitureurDAO.afficherCovoitureurEMAIL(c.getEmail());
            }
            else
            {
                covoitureur.setEmail(c.getEmail());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReclamationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        String requete = "INSERT INTO reclamations (nom_utilisateur, message, email, type) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = MyConnection.getInstance().prepareStatement(requete);
            if (covoitureur.getEmail().equals(reclamation.getEmail())) {
                preparedStatement.setString(1, covoitureur.getNomUtilisateur());
            } else {
                preparedStatement.setString(1, null);
            }
            preparedStatement.setString(2, reclamation.getMessage());
            preparedStatement.setString(3, reclamation.getEmail());
            preparedStatement.setString(4, reclamation.getType());
            preparedStatement.executeUpdate();
            System.out.println("Ajout effectuée avec succès.");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'ajout de la Reclamation " + ex.getMessage());
            return false;
        }
    }

    public List<Reclamation> afficherReclamations() {
        List<Reclamation> listReclamations = new ArrayList<Reclamation>();
        String requete = "SELECT email, type, message FROM reclamations";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Reclamation reclamation = new Reclamation();
                reclamation.setEmail(resultat.getString(1));
                reclamation.setType(resultat.getString(2));
                reclamation.setMessage(resultat.getString(3));
                listReclamations.add(reclamation);
            }
            return listReclamations;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des Réclamations " + ex.getMessage());
            return null;
        }
    }
}