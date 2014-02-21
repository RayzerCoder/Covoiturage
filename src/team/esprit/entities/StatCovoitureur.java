package team.esprit.entities;

import java.util.Collections;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import team.esprit.dao.CovoitureurDAO;

public class StatCovoitureur extends Statistique {
    
    public JFreeChart statistiqueCovoitureursActifNonActif() {
        List<Covoitureur> listActif;
        List<Covoitureur> listNonActif;
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        listActif = covoitureurDAO.afficherCovoitureurActif(true);
        listNonActif = covoitureurDAO.afficherCovoitureurActif(false);
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Actif", listActif.size() + 1);
        pieDataset.setValue("Non Actif", listNonActif.size() + 1);
        JFreeChart chart = ChartFactory.createPieChart("Actif / Non Actif", pieDataset, true, true, false);
        return chart;
    }

    public JFreeChart statistiqueHommeFemme() {
        List<Covoitureur> listFemme;
        List<Covoitureur> ListHomme;
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        listFemme = covoitureurDAO.afficherCovoitureurSexe('F');
        ListHomme = covoitureurDAO.afficherCovoitureurSexe('H');
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Femme", listFemme.size() + 1);
        pieDataset.setValue("Homme", ListHomme.size() + 1);
        JFreeChart chart = ChartFactory.createPieChart("Homme / Femme", pieDataset, true, true, false);
        return chart;
    }

    public JFreeChart statistiqueFumeur() {
        List<Covoitureur> listFumeur;
        List<Covoitureur> listNonFumeur;
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        listFumeur = covoitureurDAO.afficherCovoitureurFumeur(true);
        listNonFumeur = covoitureurDAO.afficherCovoitureurFumeur(false);
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Fumeur", listFumeur.size() + 1);
        pieDataset.setValue("Non Fumeur", listNonFumeur.size() + 1);
        JFreeChart chart = ChartFactory.createPieChart("Fumeur / Non Fumeur", pieDataset, true, true, false);
        return chart;
    }

    public JFreeChart statistiqueMeilleurCovoitureur() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        List<Covoitureur> listCovoitureurs = covoitureurDAO.afficherCovoitureurs();
        Collections.sort(listCovoitureurs, new Covoitureur());
        List<Covoitureur> resultatCovoitureurs = null;
        resultatCovoitureurs = listCovoitureurs.subList(0, 10);
        for (Covoitureur covoitureur : resultatCovoitureurs) {
            System.out.println(covoitureur);
        }
        for (Covoitureur covoitureur : resultatCovoitureurs) {
            dataset.setValue(covoitureur.getNote(), "Note", covoitureur.getNom());
        }
        JFreeChart chart = ChartFactory.createBarChart("Meilleurs Covoitureur", "Nom", "Note", dataset, PlotOrientation.VERTICAL, true, true, false);
        return chart;
    }
}