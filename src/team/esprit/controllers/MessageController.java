/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team.esprit.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import team.esprit.dao.CovoitureurDAO;
import team.esprit.entities.Covoitureur;
import team.esprit.entities.Message;
import team.esprit.util.MyConnection;

/**
 *
 * @author admin
 */
public class MessageController {
    
    
    public boolean repondreMessage(String destinataire,String msg){
    
     String requete = "INSERT INTO messages (id_expediteur,id_destinataire,object,contenu) VALUES (?, ?, ?, ?)";
     Message message= new Message();
         
       try {
 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            Covoitureur covoitureur = new Covoitureur();
            CovoitureurDAO covoitureurDAO= new CovoitureurDAO();
            
           covoitureur= covoitureurDAO.afficherCovoitureurEMAIL(msg);
           ps.setInt(1,3);
            ps.setInt(2, covoitureur.getId());
            ps.setString(3,"cc");
            ps.setString(4, msg);
            
       
       
        } catch (SQLException ex) {
            System.out.println("Erreur lors du l'envoie de message " + ex.getMessage());
           return false;
        }
        return true;
    
    
    
    
    }
    
}
