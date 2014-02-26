package team.esprit.presentationAdministrateur;

import team.esprit.dao.ReclamationDAO;
import team.esprit.entities.Reclamation;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class GestionReclamationsTable extends AbstractTableModel {

    List<Reclamation> listReclamations;
    String columnTab[] = {"De la part de", "Type de réclamation", "Message"};

    public GestionReclamationsTable() {
        ReclamationDAO reclamationDAO = new ReclamationDAO();
        listReclamations = reclamationDAO.afficherReclamations();
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
                return listReclamations.get(rowIndex).getType();
            case 2:
                return listReclamations.get(rowIndex).getMessage();
            default:
                return null;
        }
    }
}