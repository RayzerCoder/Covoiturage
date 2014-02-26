
package team.esprit.controlllers;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Month;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.ui.RectangleInsets;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class StatCovoitureurController {
    public JFreeChart statistiqueCovoitureursActifNonActif() {
        List<Covoitureur> listBloque;
        List<Covoitureur> listAttente;
        List<Covoitureur> listActif;
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        listBloque = covoitureurDAO.afficherCovoitureurEtat(0);
        listActif = covoitureurDAO.afficherCovoitureurEtat(1);
        listAttente = covoitureurDAO.afficherCovoitureurEtat(2);
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Bloqué", listActif.size() + 1);
        pieDataset.setValue("Actif", listActif.size() + 1);
        pieDataset.setValue("En Attente", listActif.size() + 1);
        JFreeChart chart = ChartFactory.createPieChart("Actif / Non Actif", pieDataset, true, true, false);
        return chart;
    }

    public JFreeChart statistiqueCovoitureursInscritParMois() {
        Map<Integer, Integer> mapCovoitureurParMois = new HashMap<Integer, Integer>();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        mapCovoitureurParMois = covoitureurDAO.afficherCovoitureurParMois();

        TimeSeries series = new TimeSeries("Inscrits par Mois", Month.class);
        for (Map.Entry<Integer, Integer> entry : mapCovoitureurParMois.entrySet()) {
            Integer nbreCovoitureur = entry.getValue();
            Integer anneeMois = entry.getKey();
            String annee = anneeMois.toString().substring(0, 4);
            String mois = anneeMois.toString().substring(4);
            //System.out.println(anneeMois);
            System.out.println(annee);
            System.out.println(mois);
            series.add(new Month(Integer.parseInt(mois), Integer.parseInt(annee)), nbreCovoitureur);

        }
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createTimeSeriesChart("Nombre Inscrits par Mois", " Mois ", "Nombre Inscrits", dataset, true, true, true);
        return chart;
    }

    public JFreeChart statistiqueCovoitureursConnectes() {
        TimeSeries time = new TimeSeries("time", Second.class);
        time.setMaximumItemAge(2000);
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(time);
        DateAxis domain = new DateAxis("Time");
        NumberAxis range = new NumberAxis("connéctés");
        domain.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        range.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        domain.setLabelFont(new Font("SansSerif", Font.PLAIN, 14));
        range.setLabelFont(new Font("SansSerif", Font.PLAIN, 14));
        XYItemRenderer renderer = new XYLineAndShapeRenderer(true, false);
        renderer.setSeriesPaint(0, Color.red);
        renderer.setSeriesPaint(1, Color.green);
        renderer.setStroke(new BasicStroke(3f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL));
        XYPlot plot = new XYPlot(dataset, domain, range, renderer);
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        domain.setAutoRange(true);
        domain.setLowerMargin(0.0);
        domain.setUpperMargin(0.0);
        domain.setTickLabelsVisible(true);
        range.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        
        JFreeChart chart = new JFreeChart("Covoitureurs connéctés en temps réel",
                new Font("SansSerif", Font.BOLD, 24), plot, true);
        chart.setBackgroundPaint(Color.white);
        
        return chart;

    }//A completer

    public JFreeChart statistiqueCovoitureursInscritParAn() {
        Map<Integer, Integer> mapCovoitureurParAn = new HashMap<Integer, Integer>();
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        mapCovoitureurParAn = covoitureurDAO.afficherCovoitureurParAn();

        TimeSeries series = new TimeSeries("Inscrits par Ans", Year.class);
        for (Map.Entry<Integer, Integer> entry : mapCovoitureurParAn.entrySet()) {
            Integer nbreCovoitureur = entry.getValue();
            Integer anneeAnregistrement = entry.getKey();
            series.add(new Year(anneeAnregistrement), nbreCovoitureur);

        }
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(series);
        dataset.setDomainIsPointsInTime(true);
        JFreeChart chart = ChartFactory.createTimeSeriesChart("Nombre Inscrits par an", " Année ", "Nombre Inscrits", dataset, true, true, true);
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
