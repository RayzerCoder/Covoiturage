package team.esprit.presentationClient;

import java.util.List;
import javax.mail.Message;
import javax.swing.table.AbstractTableModel;
import team.esprit.dao.CovoiturageDAO;
import team.esprit.dao.MessageDAO;
import team.esprit.entities.Covoiturage;
import team.esprit.entities.Covoitureur;
import team.esprit.presentationAdministrateur.Authentification;

public class ConsulterMesMessageTable extends AbstractTableModel {
    
    Covoitureur covoitureurConnecte = Authentification.covoitureurConnecte;
 
    String[] columTab = {"ID", "nom expéditeur", "object", "contenu","date_envoi"};
    private final List<team.esprit.entities.Message> listMessageses;

    public ConsulterMesMessageTable() {
       
        MessageDAO messageDAO = new MessageDAO();
        
        listMessageses = messageDAO.afficherMessage();
    }

    @Override
    public int getRowCount() {
        return listMessageses.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listMessageses.get(rowIndex).getId();
            case 1:
                return listMessageses.get(rowIndex).getExpediteur().getNom();
            case 2:
                return listMessageses.get(rowIndex).getObjet();
            case 3:
                return listMessageses.get(rowIndex).getContenu();
            case 4:
                return listMessageses.get(rowIndex).getDateEnvoie();
            default:
                return null;
        }
    }

   
}