package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import team.esprit.entities.Covoitureur;
import team.esprit.util.MyConnection;

public class CovoitureurDAO {

    public Covoitureur afficherCovoitureur_ID(int id) {

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM covoitureurs WHERE id = " + id;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
            }
            return covoitureur;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            return null;
        }
    }

    public boolean afficherCovoitureur_EMAIL(String email) throws SQLException {

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM covoitureurs WHERE email = '" + email + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
            }
            if (covoitureur.getId() != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            throw new SQLException(ex);
        }
    }

    public Covoitureur afficherCovoitureurEMAIL(String email) {

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM covoitureurs WHERE email = '" + email + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
            }
            return covoitureur;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> afficherCovoitureurs() {
        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "SELECT * FROM covoitureurs";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoitureur covoitureur = new Covoitureur();
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des Covoitureurs " + ex.getMessage());
            return null;
        }
    }

    public void ajouterCovoitureur(Covoitureur covoitureur) {

        String requete = "INSERT INTO covoitureurs (email, mdp) VALUES (?, ?)";

        try {
            if (afficherCovoitureur_EMAIL(covoitureur.getEmail()) == false) {
                try {
                    PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                    ps.setString(1, covoitureur.getEmail());
                    ps.setString(2, covoitureur.getMdp());
                    ps.executeUpdate();
                    System.out.println("Ajout effectuée avec succès.");
                } catch (SQLException ex) {
                    System.out.println("Erreur lors de l'ajout du Covoitureur " + ex.getMessage());
                }
            } else {
                System.out.println("L'email existe déjà !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CovoitureurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Covoitureur> afficherCovoitureurSexe(char sexe) {

        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "SELECT * FROM covoitureurs WHERE sexe = '" + sexe + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoitureur covoitureur = new Covoitureur();
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> afficherCovoitureurEtat(int etat) {

        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "SELECT * FROM covoitureurs WHERE etat = " + etat;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoitureur covoitureur = new Covoitureur();
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> afficherCovoitureurFumeur(boolean fumeur) {

        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "SELECT * FROM covoitureurs WHERE fumeur = " + fumeur;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoitureur covoitureur = new Covoitureur();
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            return null;
        }
    }

    public boolean authentifierCovoitureur(String email, String mdp) throws SQLException {

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM covoitureurs WHERE email = '" + email + "' AND mdp = '" + mdp + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
            }
            if (covoitureur.getId() != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            throw new SQLException(ex);
        }

    }

    public boolean authentifierCovoitureurFacebook(String id_facebook) throws SQLException {
        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM covoitureurs WHERE id_facebook = '" + id_facebook + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
            }
            if (covoitureur.getId() != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            throw new SQLException(ex);
        }
    }

    public boolean afficherCovoitureur_IDFACEBOOK(String id_facebook) throws SQLException {

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM covoitureurs WHERE id_facebook = '" + id_facebook + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
            }
            if (covoitureur.getId() != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            throw new SQLException(ex);
        }
    }

    public void ajouterCovoitureurFacebook(Covoitureur covoitureur) throws SQLException {
        String requete = "INSERT INTO covoitureurs (id_facebook, email, mdp) VALUES (?, ?, ?)";
        if (afficherCovoitureur_IDFACEBOOK(covoitureur.getIdFacebook()) == false) {
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, covoitureur.getIdFacebook());
                ps.setString(2, covoitureur.getEmail());
                ps.setString(3, covoitureur.getMdp());

                ps.executeUpdate();
                System.out.println("Ajout effectuée avec succès.");
            } catch (SQLException ex) {
                System.out.println("Erreur lors de l'ajout du Covoitureur " + ex.getMessage());
            }
        } else {
            System.out.println("L'email existe déjà !");
        }
    }

    public Map<Integer, Integer> afficherCovoitureurParMois() {
        Map<Integer, Integer> mapCovoitureurParMois = new HashMap<Integer, Integer>();
        String requete = "SELECT COUNT( * ) , EXTRACT( YEAR_MONTH  FROM date_enregistrement ) AS enregistrer FROM covoitureurs GROUP BY EXTRACT( YEAR_MONTH  FROM date_enregistrement )";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                mapCovoitureurParMois.put(resultat.getInt(2), resultat.getInt(1));
            }
            return mapCovoitureurParMois;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public Map<Integer, Integer> afficherCovoitureurParAn() {


        Map<Integer, Integer> mapCovoitureurParAn = new HashMap<Integer, Integer>();
        String requete = "SELECT COUNT( * ) , EXTRACT( YEAR FROM date_enregistrement ) AS enregistrer FROM Covoitureurs GROUP BY EXTRACT( YEAR FROM date_enregistrement )";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                mapCovoitureurParAn.put(resultat.getInt(2), resultat.getInt(1));

            }
            return mapCovoitureurParAn;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> rechercherCovoitureur(String critere) {

        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();

        String requete = "SELECT * FROM covoitureurs WHERE nom LIKE '%" + critere + "%' or prenom LIKE '%" + critere + "%' or email LIKE '%" + critere + "%' or nom_utilisateur LIKE '%" + critere + "%'";
        try {

            Statement ps = MyConnection.getInstance().createStatement();
            ResultSet resultat = ps.executeQuery(requete);

            while (resultat.next()) {
                Covoitureur covoitureur = new Covoitureur();
                covoitureur.setId(resultat.getInt(1));
                covoitureur.setEmail(resultat.getString(2));
                covoitureur.setMdp(resultat.getString(3));
                covoitureur.setNomUtilisateur(resultat.getString(4));
                covoitureur.setNom(resultat.getString(5));
                covoitureur.setPrenom(resultat.getString(6));
                covoitureur.setSexe(resultat.getString(7).charAt(0));
                covoitureur.setFumeur(resultat.getBoolean(8));
                covoitureur.setDateNaissance(resultat.getDate(9));
                covoitureur.setDateEnregistrement(resultat.getDate(10));
                covoitureur.setNote(resultat.getInt(11));
                covoitureur.setEtat(resultat.getInt(12));
                covoitureur.setAvatar(resultat.getString(13));
                covoitureur.setSkype(resultat.getString(14));
                covoitureur.setFacebook(resultat.getString(15));
                covoitureur.setDateDerniereVisite(resultat.getDate(16));
                covoitureur.setCleActivation(resultat.getString(17));
                covoitureur.setIdFacebook(resultat.getString(18));
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    }

    public void deleteCovoitureur(int id) {
        String requete = "delete from covoitureurs whee id = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("covoitureur supprimée");
        } catch (SQLException ex) {

            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public boolean modifierCovoitureur(Covoitureur covoitureur) {
        String requete = "UPDATE covoitureurs SET email = ?, mdp = ?, nom_utilisateur = ? , nom = ? ,prenom = ?, sexe = ?, fumeur = ?, etat = ?, avatar = ?, skype = ? WHERE id = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, covoitureur.getEmail());
            ps.setString(2, covoitureur.getMdp());
            ps.setString(3, covoitureur.getNomUtilisateur());
            ps.setString(4, covoitureur.getNom());
            ps.setString(5, covoitureur.getPrenom());
            ps.setString(6, "" + covoitureur.getSexe());
            ps.setBoolean(7, covoitureur.isFumeur());
            ps.setInt(8, covoitureur.getEtat());
            ps.setString(9, covoitureur.getAvatar());
            ps.setString(10, covoitureur.getSkype());
            ps.setInt(11, covoitureur.getId());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
        return true;
    }
}