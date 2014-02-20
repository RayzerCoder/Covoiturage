package team.esprit.presentation;

import team.esprit.dao.ReclamationDAO;
import team.esprit.entities.Reclamation;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ReclamationTable extends AbstractTableModel {

    List<Reclamation> listReclamations;
    String columnTab[] = {"De la part de", "Réclamation"};
    //String columnTab[] = {"id", "date_envoi", "titre", "type", "message", "id_expediteur"};

    public ReclamationTable() {
        ReclamationDAO reclamationDAO = new ReclamationDAO();
        listReclamations = reclamationDAO.AfficherReclamations();
    }

    @Override
    public int getRowCount() {
        return listReclamations.size();
    }

    @Override
    public int getColumnCount() {
        return columnTab.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnTab[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listReclamations.get(rowIndex).getEmail();
            case 1:
                return listReclamations.get(rowIndex).getMessage();
            default:
                return null;
        }
    }
}