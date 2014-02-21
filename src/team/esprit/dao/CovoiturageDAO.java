package team.esprit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import team.esprit.entities.Covoiturage;
import java.util.List;
import team.esprit.util.MyConnection;

public class CovoiturageDAO {

    public List<Covoiturage> afficherCovoiturages() {

        VilleDAO villeDAO = new VilleDAO();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        List<Covoiturage> listCovoiturages = new ArrayList<Covoiturage>();
        String requete = "SELECT * FROM COVOITURAGES";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoiturage covoiturage = new Covoiturage();
                covoiturage.setId(resultat.getInt(1));
                covoiturage.setTitre(resultat.getString(2));
                covoiturage.setDescription(resultat.getString(3));
                covoiturage.setVilleDepart(villeDAO.afficheVille_ID(resultat.getInt(4)));
                covoiturage.setVilleArrivee(villeDAO.afficheVille_ID(resultat.getInt(5)));
                covoiturage.setCreateur(covoitureurDAO.afficherCovoitureur_ID(resultat.getInt(6)));
                covoiturage.setDateCreation(resultat.getDate(7));
                covoiturage.setDateMiseAJour(resultat.getDate(8));
                covoiturage.setDateDepart(resultat.getDate(9));
                covoiturage.setDateArrivee(resultat.getDate(10));
                covoiturage.setNombrePlaces(resultat.getInt(11));
                covoiturage.setFumeur(resultat.getBoolean(12));
                covoiturage.setReserveFemmes(resultat.getBoolean(13));
                listCovoiturages.add(covoiturage);
            }
            return listCovoiturages;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des covoiturages " + ex.getMessage());
            return null;
        }
    }
}