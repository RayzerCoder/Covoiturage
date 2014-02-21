package team.esprit.presentation;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import team.esprit.dao.CovoiturageDAO;
import team.esprit.entities.Covoiturage;

public class AfficherLesCovoituragesTable extends AbstractTableModel {
    
    List<Covoiturage> listCovoitureurs;
    //Dans le columnTab[] saisie les colonnes li 7ajtek bihom
    String columnTab[] = {"", "", "", ""};

    public AfficherLesCovoituragesTable() {
        CovoiturageDAO covoiturageDAO = new CovoiturageDAO();
        listCovoitureurs = covoiturageDAO.afficherCovoiturages();
    }
    
    @Override
    public int getRowCount() {
        return listCovoitureurs.size();
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
        //A modifier selon les champs des covoiturages ta3mel case kima fel les exemples lo5rin
        return null;
    }
}
