package team.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Reservation;
import team.esprit.util.MyConnection;

public class ReservationDAO {
    
    public Reservation afficherReservation(int id) {
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        Reservation reservation = new Reservation();
        String requete = "SELECT * FROM reservations where id = " + id;
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                reservation.setId(resultat.getInt(1));
                reservation.setCovoitureur(covoitureurDAO.afficherCovoitureur_ID(resultat.getInt(2)));
                reservation.setCovoiturage(covoiturageDAO.afficherCovoiturage_ID(resultat.getInt(3)));
                reservation.setDateReservation(resultat.getDate(4));
            }
            return reservation;
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean afficherEtat(Covoitureur covoitureur, Covoiturage covoiturage) throws SQLException {
        String requete = "SELECT etat FROM reservations WHERE id_covoiturage = "
                + covoiturage.getId() + " AND id_covoitureur = " + covoitureur.getId();
        boolean etat = false;
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                etat = resultat.getBoolean(1);
            }
            return etat;
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new SQLException(ex);
        }
    }

    public List<Covoitureur> afficherCovoitureurs(Covoiturage covoiturage) {
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        List<Covoitureur> listReservateurs = new ArrayList<Covoitureur>();
        String requete = "SELECT id_covoitureur FROM reservations WHERE id_covoiturage = " + covoiturage.getId();
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Covoitureur covoitureur = covoitureurDAO.afficherCovoitureur_ID(resultat.getInt(1));
                listReservateurs.add(covoitureur);
            }
            return listReservateurs;
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

//    public List<Covoitureur> afficherCovoitureursConfirmes(Covoiturage covoiturage) {
//        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
//        List<Covoitureur> listReservateurs = new ArrayList<Covoitureur>();
//        String requete = "SELECT id_covoitureur FROM reservations WHERE id_covoiturage = " 
//                + covoiturage.getId() + " AND etat = 1";
//        try {
//            Statement statement = MyConnection.getInstance().createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//            while (resultat.next()) {
//                Covoitureur covoitureur = covoitureurDAO.afficherCovoitureur_ID(resultat.getInt(1));
//                listReservateurs.add(covoitureur);
//            }
//            return listReservateurs;
//        } catch (SQLException ex) {
//            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
    public boolean annulerReseration(Covoiturage covoiturage) {
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        String requete = "DELETE FROM reservations WHERE id_covoiturage = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, covoiturage.getId());
            ps.executeUpdate();
            covoiturageDAO.modifierNombrePlaces(covoiturage, 1);
            System.out.println("Reservation supprimée");
        } catch (SQLException ex) {

            System.out.println("erreur lors de la suppression de Reservation  " + ex.getMessage());
        }
        return true;
    }

    public List<Reservation> afficherReservationsCovoitureur(Covoitureur covoitureur) {
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        List<Reservation> listReservations = new ArrayList<Reservation>();
        String requete = "SELECT * FROM reservations r, covoiturages c WHERE id_covoitureur = " + covoitureur.getId()
                + " AND c.id = r.id";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Reservation reservation = new Reservation();
                reservation.setId(resultat.getInt(1));
                reservation.setCovoitureur(covoitureur);
                reservation.setCovoiturage(covoiturageDAO.afficherCovoiturage_ID(resultat.getInt(3)));
                reservation.setDateReservation(resultat.getDate(4));
                listReservations.add(reservation);
            }
            return listReservations;
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean modifierEtat(Covoitureur covoitureur, Covoiturage covoiturage, boolean etat) {
        String requete = "UPDATE reservations SET etat = ? WHERE id_covoitureur = " + covoitureur.getId()
                + " AND id_covoiturage = " + covoiturage.getId();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setBoolean(1, etat);
            ps.executeUpdate();
            System.out.println("l'état est: " + etat);
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
            return false;
        }
    }
}