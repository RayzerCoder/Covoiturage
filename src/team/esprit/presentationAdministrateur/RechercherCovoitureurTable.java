/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team.esprit.presentationAdministrateur;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;

/**
 *
 * @author Hhussein
 */
public class RechercherCovoitureurTable extends AbstractTableModel{

    String ch ; 
    List<Covoitureur> listeCovoitureurs;
   // Covoitureur covoitureur = new Covoitureur();
    String[] columTab = {"Identifient", "Nom", "Prenom" , "Email"};

    public RechercherCovoitureurTable(String ch) {
        this.ch=ch ;
        CovoitureurDAO covoitureurDAO = new CovoitureurDAO();
        listeCovoitureurs = covoitureurDAO.rechercherCovoitureur(ch);
       
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
            case 3 :
                return listeCovoitureurs.get(rowIndex).getEmail();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columTab[column];
    }
    
}
