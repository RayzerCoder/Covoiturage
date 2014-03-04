package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import team.esprit.entities.Message;
import team.esprit.entities.Covoitureur;
import team.esprit.presentationAdministrateur.Authentification;
import team.esprit.util.MyConnection;

public class MessageDAO {

    Covoitureur covoitureurConnecte = Authentification.covoitureurConnecte;

    public boolean envoyerMessage(Covoitureur c, Message message) {
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        try {
            if (covoitureurDAO.afficherCovoitureur_EMAIL(c.getEmail())) {
                covoitureurConnecte = covoitureurDAO.afficherCovoitureurEMAIL(c.getEmail());
            } else {
                covoitureurConnecte.setEmail(c.getEmail());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReclamationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String requete = "INSERT INTO messages (id_expediteur, id_destinataire, object, contenu) Values (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = MyConnection.getInstance().prepareStatement(requete);
            preparedStatement.setInt(1, message.getExpediteur().getId());
            preparedStatement.setInt(2, message.getDestinataire().getId());


            preparedStatement.setString(3, "coucou");


            preparedStatement.setString(4, message.getContenu());
            preparedStatement.executeUpdate();
            System.out.println("envoie effectuée avec succès.");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'ajout de la message " + ex.getMessage());
            return false;
        }
    }

    public List<Message> afficherMessage() {

        List<Message> listMessages = new ArrayList<Message>();
        String requete = "SELECT m.id,m.id_expediteur,c.nom_utilisateur,m.object,m.contenu,m.date_envoi FROM messages m inner join covoitureurs c on m.id_expediteur=c.id where m.id_destinataire=" + covoitureurConnecte.getId();

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Message message = new Message();
                covoitureurConnecte.setNom(resultat.getString(3));
                covoitureurConnecte.setId(resultat.getInt(2));
                message.setId(resultat.getInt(1));
                message.setExpediteur(covoitureurConnecte);
                message.setObjet(resultat.getString(4));
                message.setContenu(resultat.getString(5));
                message.setDateEnvoie(resultat.getTime(6));
                listMessages.add(message);
            }
            return listMessages;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des Messages " + ex.getMessage());
            return null;
        }
    }

    public Message afficherUnMessage(int id) {
        String requete = "SELECT m.id,m.id_expediteur,c.nom_utilisateur,m.object,m.contenu,m.date_envoi FROM messages m inner join covoitureurs c on m.id_expediteur=c.id where m.id=" + id;
        Message message = new Message();
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                covoitureurConnecte.setNom(resultat.getString(3));
                covoitureurConnecte.setId(resultat.getInt(2));
                message.setId(resultat.getInt(1));
                message.setExpediteur(covoitureurConnecte);
                message.setObjet(resultat.getString(4));
                message.setContenu(resultat.getString(5));
                message.setDateEnvoie(resultat.getTime(6));
            }
            return message;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement de Messages " + ex.getMessage());
            return null;
        }
    }
}