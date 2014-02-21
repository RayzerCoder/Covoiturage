package team.esprit.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

public class AfficherLesCovoitureursTable extends AbstractTableModel {

    List<Covoitureur> listeCovoitureurs;
    String[] columTab = {"Identifient", "Nom", "Prenom"};

    public AfficherLesCovoitureursTable() {
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        listeCovoitureurs = covoitureurDAO.afficherCovoitureurs();
    }

    @Override
    public int getRowCount() {
        return listeCovoitureurs.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listeCovoitureurs.get(rowIndex).getId();
            case 1:
                return listeCovoitureurs.get(rowIndex).getNom();
            case 2:
                return listeCovoitureurs.get(rowIndex).getPrenom();
            case 3:
                return listeCovoitureurs.get(rowIndex).getEmail();
            case 4:
                return listeCovoitureurs.get(rowIndex).getMdp();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
}