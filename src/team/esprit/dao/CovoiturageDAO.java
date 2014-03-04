package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import team.esprit.entities.Covoiturage;
import java.util.List;
import java.util.Map;
import team.esprit.entities.Covoitureur;
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
            System.out.println(ex.getMessage());
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
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public List<Covoiturage> afficherCovoituragesCovoitureurConnecte(Covoitureur covoitureurConnecte) {
        VilleDAO villeDAO = new VilleDAO();
        DetourDAO detourDAO = new DetourDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();
        List<Covoiturage> listCovoiturages = new ArrayList<Covoiturage>();
        String requete = "SELECT * FROM covoiturages WHERE id_createur = " + covoitureurConnecte.getId();
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
                covoiturage.setCreateur(covoitureurConnecte);
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
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public boolean ajouterCovoiturage(Covoiturage covoiturage) {
        String requete = "INSERT INTO covoiturages (id_ville_depart, id_ville_arrivee, id_createur, date_depart, "
                + "heure_depart, nombre_places, prix, fumeur, reservee_femmes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = MyConnection.getInstance().prepareStatement(requete);
            preparedStatement.setInt(1, covoiturage.getVilleDepart().getId());
            preparedStatement.setInt(2, covoiturage.getVilleArrivee().getId());
            preparedStatement.setInt(3, covoiturage.getCreateur().getId());
            preparedStatement.setDate(4, covoiturage.getDateDepart());
            preparedStatement.setString(5, covoiturage.getHeureDepart());
            preparedStatement.setInt(6, covoiturage.getNombrePlaces());
            preparedStatement.setFloat(7, covoiturage.getPrix());
            preparedStatement.setBoolean(8, covoiturage.isFumeur());
            preparedStatement.setBoolean(9, covoiturage.isReserveeFemmes());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public List<Covoiturage> rechercherCovoiturages(String critere) {
        VilleDAO villeDAO = new VilleDAO();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        DetourDAO detourDAO = new DetourDAO();
        ParticipantDAO participantDAO = new ParticipantDAO();
        List<Covoiturage> listCovoiturages = new ArrayList<Covoiturage>();
        String requete = "SELECT DISTINCT c.* "
                + "FROM covoiturages c, villes v "
                + "WHERE (((c.id_ville_depart = v.id) "
                + "OR (c.id_ville_arrivee = v.id)) "
                + "AND ((c.titre LIKE '%" + critere + "%') "
                + "OR (c.description LIKE '%" + critere + "%') "
                + "OR (v.code_postal LIKE '%" + critere + "%') "
                + "OR (v.gouvernorat LIKE '%" + critere + "%') "
                + "OR (v.delegation LIKE '%" + critere + "%') "
                + "OR (v.localite LIKE '%" + critere + "%')))";
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

    public boolean modifierNombrePlaces(Covoiturage covoiturage, int plusMoins) {
        String requete = "UPDATE covoiturages SET nombre_places = ? WHERE id = " + covoiturage.getId();
        try {
            PreparedStatement preparedStatement = MyConnection.getInstance().prepareStatement(requete);
            preparedStatement.setInt(1, covoiturage.getNombrePlaces() + plusMoins);
            preparedStatement.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de la mise à jour " + ex.getMessage());
            return false;
        }
    }

    public boolean supprimerCovoiturage(int id) {
        String requete = "DELETE FROM covoiturages WHERE id = " + id;
        try {
            PreparedStatement preparedStatement = MyConnection.getInstance().prepareStatement(requete);
            preparedStatement.executeUpdate();
            System.out.println("covoiturage supprimée");
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }

    public Map<Integer, Integer> afficherCovoituragesMois() {
        Map<Integer, Integer> mapCovoiturageParMois = new HashMap<Integer, Integer>();
        String requete = "SELECT COUNT( * ) AS Nombre, EXTRACT( YEAR_MONTH FROM date_creation ) AS Depart FROM Covoiturages GROUP BY EXTRACT( YEAR_MONTH FROM date_creation ) ";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                mapCovoiturageParMois.put(resultat.getInt(2), resultat.getInt(1));
            }
            return mapCovoiturageParMois;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public Map<String, Integer> afficherFrequenceVille() {
        Map<String, Integer> mapFrequenceVille = new HashMap<String, Integer>();
        String requete = "SELECT COUNT( * ) as Nombre, v.gouvernorat FROM villes v, covoiturages c WHERE v.id = c.id_ville_arrivee GROUP BY v.gouvernorat";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                mapFrequenceVille.put(resultat.getString(2), resultat.getInt(1));
            }
            return mapFrequenceVille;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public Map<Integer, Integer> afficherCovoituragesAnnee() {
        Map<Integer, Integer> mapCovoiturageParAn = new HashMap<Integer, Integer>();
        String requete = "SELECT COUNT( * ) AS Nombre, EXTRACT( YEAR FROM date_creation ) AS Depart FROM Covoiturages GROUP BY EXTRACT( YEAR FROM date_creation ) ";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                mapCovoiturageParAn.put(resultat.getInt(2), resultat.getInt(1));

            }
            return mapCovoiturageParAn;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public boolean modifierCovoiturage(Covoiturage covoiturage) {
        String requete = "UPDATE covoiturages SET id_ville_depart = ?, id_ville_arrivee = ?, date_depart = ?, heure_depart = ?, nombre_places = ?, prix = ?, fumeur = ?, reservee_femmes = ? WHERE id = " + covoiturage.getId();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, covoiturage.getVilleDepart().getId());
            ps.setInt(2, covoiturage.getVilleArrivee().getId());
            ps.setDate(3, covoiturage.getDateDepart());
            ps.setString(4, covoiturage.getHeureDepart());
            ps.setInt(5, covoiturage.getNombrePlaces());
            ps.setFloat(6, covoiturage.getPrix());
            ps.setBoolean(7, covoiturage.isFumeur());
            ps.setBoolean(8, covoiturage.isReserveeFemmes());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
        return true;
    }
}