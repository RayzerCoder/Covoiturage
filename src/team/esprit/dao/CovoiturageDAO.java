package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import team.esprit.entities.Covoiturage;
import java.util.List;
import team.esprit.util.MyConnection;

public class CovoiturageDAO {

    public Covoiturage afficherCovoiturage_ID(int id) {
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        VilleDAO villeDAO = new VilleDAO();
        DetourDAO detourDAO = new DetourDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();
        String requete = "SELECT * FROM covoiturages WHERE id = " + id;
        Covoiturage covoiturage = new Covoiturage();

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                covoiturage.setId(resultat.getInt(1));
                covoiturage.setTitre(resultat.getString(2));
                covoiturage.setDescription(resultat.getString(3));
                covoiturage.setVilleDepart(villeDAO.afficheVille_ID(resultat.getInt(4)));
                covoiturage.setVilleArrivee(villeDAO.afficheVille_ID(resultat.getInt(5)));
                covoiturage.setCreateur(covoitureurDAO.afficherCovoitureur_ID(resultat.getInt(6)));
                covoiturage.setDateCreation(resultat.getDate(7));
                covoiturage.setDateMiseAJour(resultat.getDate(8));
                covoiturage.setDateDepart(resultat.getDate(9));
                covoiturage.setHeureDepart(resultat.getString(10));
                covoiturage.setNombrePlaces(resultat.getInt(11));
                covoiturage.setPrix(resultat.getFloat(12));
                covoiturage.setFumeur(resultat.getBoolean(13));
                covoiturage.setReserveeFemmes(resultat.getBoolean(14));
                covoiturage.setDetours(detourDAO.afficherDetours(covoiturage));
                covoiturage.setParticipants(participantDAO.afficherParticipants(covoiturage));
            }
            return covoiturage;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoiturage " + ex.getMessage());
            return null;
        }
    }

    public List<Covoiturage> afficherCovoiturages() {

        VilleDAO villeDAO = new VilleDAO();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        DetourDAO detourDAO = new DetourDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();

        List<Covoiturage> listCovoiturages = new ArrayList<Covoiturage>();
        String requete = "SELECT * FROM covoiturages";

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
                covoiturage.setHeureDepart(resultat.getString(10));
                covoiturage.setNombrePlaces(resultat.getInt(11));
                covoiturage.setPrix(resultat.getFloat(12));
                covoiturage.setFumeur(resultat.getBoolean(13));
                covoiturage.setReserveeFemmes(resultat.getBoolean(14));
                covoiturage.setDetours(detourDAO.afficherDetours(covoiturage));
                covoiturage.setParticipants(participantDAO.afficherParticipants(covoiturage));
                listCovoiturages.add(covoiturage);
            }
            return listCovoiturages;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des covoiturages " + ex.getMessage());
            return null;
        }
    }

    public boolean ajouterCovoiturage(Covoiturage covoiturage) {

        String requete = "INSERT INTO covoiturages (id_ville_depart, id_ville_arrivee, id_createur, date_depart, heure_depart, nombre_places, prix, fumeur, reservee_femmes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, covoiturage.getVilleDepart().getId());
            ps.setInt(2, covoiturage.getVilleArrivee().getId());
            ps.setInt(3, covoiturage.getCreateur().getId());
            ps.setDate(4, covoiturage.getDateDepart());
            ps.setString(5, covoiturage.getHeureDepart());
            ps.setInt(6, covoiturage.getNombrePlaces());
            ps.setFloat(7, covoiturage.getPrix());
            ps.setBoolean(8, covoiturage.isFumeur());
            ps.setBoolean(9, covoiturage.isReserveeFemmes());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès.");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'ajout du covoiturage " + ex.getMessage());
            return false;
        }
    }
}