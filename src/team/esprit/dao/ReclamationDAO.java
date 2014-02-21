package team.esprit.dao;

import team.esprit.entities.Reclamation;
import team.esprit.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReclamationDAO {

    public List<Reclamation> afficherReclamations() {
        List<Reclamation> listReclamations = new ArrayList<Reclamation>();
        String requete = "SELECT * FROM RECLAMATIONS";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Reclamation reclamation = new Reclamation();
                reclamation.setId(resultat.getInt(1));
                reclamation.setNomUtilisateur(resultat.getString(2));
                reclamation.setMessage(resultat.getString(3));
                reclamation.setEmail(resultat.getString(4));
                reclamation.setTypeReclamation(resultat.getString(5));
                listReclamations.add(reclamation);
            }
            return listReclamations;
        } 
        catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des réclamations " + ex.getMessage());
            return null;
        }
    }
}