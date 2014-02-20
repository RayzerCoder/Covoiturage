package team.esprit.presentation;

import java.util.ArrayList;
import java.util.List;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class Pidev {

    public static void main(String[] args) {
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();

        List<Covoitureur> listedepots = new ArrayList<Covoitureur>();
        listedepots = covoitureurDAO.afficherCovoitureurs();

        for (Covoitureur covoitureur : listedepots) {
            System.out.println("**test connction JDBC ** : " + covoitureur);
        }
    }
}