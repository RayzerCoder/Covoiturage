package team.esprit.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import team.esprit.entities.Ville;
import team.esprit.util.MyConnection;

public class VilleDAO {

    public List<Ville> afficheLocalite(String gouvernorat, String delegation) {
        List<Ville> listeVille = new ArrayList<Ville>();
        String requete = "SELECT localite FROM VILLES WHERE gouvernorat = '" + gouvernorat + "' AND delegation = '" + delegation + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Ville ville = new Ville();
                ville.setLocalite(resultat.getString(1));
//                ville.setId(resultat.getInt(1));
//                ville.setCodePostal(resultat.getInt(2));
//                ville.setGouvernorat(gouvernorat);
//                ville.setDelegation(resultat.getString(4));
//                ville.setLocalite(resultat.getString(5));
//                ville.setLongitude(resultat.getInt(6));
//                ville.setLatitude(resultat.getInt(7));
                listeVille.add(ville);
            }
            return listeVille;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la Ville " + ex.getMessage());
            return null;
        }
    }

    public List<Ville> afficheDelegation(String gouvernorat) {
        List<Ville> listeVille = new ArrayList<Ville>();
        String requete = "SELECT DISTINCT delegation FROM VILLES WHERE gouvernorat = '" + gouvernorat + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Ville ville = new Ville();
                ville.setDelegation(resultat.getString(1));
                listeVille.add(ville);
            }
            return listeVille;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la Ville " + ex.getMessage());
            return null;
        }
    }

    public List<Ville> afficheVilles() {
        List<Ville> listeVille = new ArrayList<Ville>();
        String requete = "SELECT DISTINCT gouvernorat FROM villes ORDER BY gouvernorat";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Ville ville = new Ville();
                ville.setGouvernorat(resultat.getString(1));
                listeVille.add(ville);
            }
            return listeVille;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la Ville " + ex.getMessage());
            return null;
        }
    }

    public Ville afficheVille_ID(int id) {

        String requete = "SELECT * FROM VILLES WHERE ID = " + id;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Ville ville = new Ville();

            while (resultat.next()) {
                ville.setId(resultat.getInt(1));
                ville.setCodePostal(resultat.getInt(2));
                ville.setLocalite(resultat.getString(3));
                ville.setDelegation(resultat.getString(4));
                ville.setGouvernorat(resultat.getString(5));
                ville.setLatitude(resultat.getFloat(6));
                ville.setLongitude(resultat.getFloat(7));
            }
            return ville;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la Ville " + ex.getMessage());
            return null;
        }
    }

    public Ville afficherVille_Localite(String localite) {
        String requete = "SELECT * FROM VILLES WHERE localite = '" + localite + "'";

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Ville ville = new Ville();

            while (resultat.next()) {
                ville.setId(resultat.getInt(1));
                ville.setCodePostal(resultat.getInt(2));
                ville.setLocalite(resultat.getString(3));
                ville.setDelegation(resultat.getString(4));
                ville.setGouvernorat(resultat.getString(5));
                ville.setLatitude(resultat.getFloat(6));
                ville.setLongitude(resultat.getFloat(7));
            }
            return ville;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de la Ville " + ex.getMessage());
            return null;
        }
    }

    public Ville localiserVille_nom(String nom) {
        Ville ville = new Ville();
        String requete = "SELECT longitude,latitude FROM VILLES where gouvernorat='"
                + nom + "'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                ville.setLongitude(resultat.getFloat(1));
                ville.setLatitude(resultat.getFloat(2));
            }

        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des coordonées " + ex.getMessage());
        }
        return ville;
    }
}
