package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import team.esprit.entities.Covoitureur;
import team.esprit.util.MyConnection;

//modifier covoitureur
//supprimer covoitureur
//pourquoi recherche selon l'id ?
//autres recherche ..
public class CovoitureurDAO {

    private Covoitureur _covoitureur;

    public Covoitureur afficherCovoitureur_ID(int id) {

        _covoitureur = new Covoitureur();
        String requete = "select * from covoitureurs where id=" + id;
        
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                _covoitureur.setId(resultat.getInt(3));
                _covoitureur.setNom(resultat.getString(2));
                _covoitureur.setPrenom(resultat.getString(11));
            }
            return _covoitureur;
        } 
        catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }

    public List<Covoitureur> afficherCovoitureurs() {
        List<Covoitureur> listeCovoitureurs = new ArrayList<Covoitureur>();
        String requete = "select * from covoitureurs";
        
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Covoitureur c = new Covoitureur();
                c.setId(resultat.getInt(1));
                c.setNom(resultat.getString(4));
                c.setPrenom(resultat.getString(5));
                listeCovoitureurs.add(c);
            }
            return listeCovoitureurs;
        } 
        catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }

    public void ajouterCovoitureur(Covoitureur c) {

        String requete = "insert into covoitureurs (mdp,email) values (?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getMdp());
            ps.setString(2, c.getLogin());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
}
