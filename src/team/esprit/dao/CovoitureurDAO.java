package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import team.esprit.entities.Covoitureur;
import team.esprit.util.MyConnection;

public class CovoitureurDAO {

    public Covoitureur afficherCovoitureur_ID(int id) {

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM COVOITUREURS WHERE ID = " + id;

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
            }
            return covoitureur;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement du Covoitureur " + ex.getMessage());
            return null;
        }
    }

    public boolean afficherCovoitureur_EMAIL(String email) throws SQLException{

        Covoitureur covoitureur = new Covoitureur();
        String requete = "SELECT * FROM COVOITUREURS WHERE EMAIL = '" + email + "'";

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

    public List<Covoitureur> afficherCovoitureurs() {
        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "SELECT * FROM COVOITUREURS";

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
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des Covoitureurs " + ex.getMessage());
            return null;
        }
    }

    public void ajouterCovoitureur(Covoitureur covoitureur) throws SQLException {

        String requete = "INSERT INTO covoitureurs (email, mdp) VALUES (?, ?)";
//        Date d = new Date();
//        String dateString = d.getDay() + " " + d.getMonth() + " " + d.getYear();
//        Date date = null;
//        try {
//            date = new SimpleDateFormat("DD/MM/YYYY").parse(dateString);
//        } catch (ParseException ex) {
//            Logger.getLogger(CovoitureurDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        if (afficherCovoitureur_EMAIL(covoitureur.getEmail()) == false) {
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, covoitureur.getEmail());
                ps.setString(2, covoitureur.getMdp());
                //ps.setDate(3, (java.sql.Date) date);
                ps.executeUpdate();
                System.out.println("Ajout effectuée avec succès.");
            } catch (SQLException ex) {
                System.out.println("Erreur lors de l'ajout du Covoitureur " + ex.getMessage());
            }
        }
        else System.out.println("L'email existe déjà !");
    }
    
     public List<Covoitureur> afficherCovoitureurSexe(char sexe) {


        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "select * from covoitureurs where sexe='" + sexe + "'";

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
                listCovoitureurs.add(covoitureur);
            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> afficherCovoitureurActif(boolean b) {


        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "SELECT * FROM COVOITUREURS WHERE ETAT = " + b;

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
                listCovoitureurs.add(covoitureur);

            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> afficherCovoitureurFumeur(boolean b) {


        List<Covoitureur> listCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "select * from covoitureurs where fumeur=" + b;

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
                listCovoitureurs.add(covoitureur);

            }
            return listCovoitureurs;
        } catch (SQLException ex) {
            System.out.println("erreur  " + ex.getMessage());
            return null;
        }
    }
}