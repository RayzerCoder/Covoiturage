package team.esprit.entities;

import java.sql.Time;

public class Notification {
    
    private int _id;
    private Covoitureur _expediteur;
    private Covoitureur _destinataire;
    private Time _dateCreation; //à vérifier timestamp dans la bd.
    private String _contenu;
    private int _type;

    public void setId(int _id) {
        this._id = _id;
    }

    public void setExpediteur(Covoitureur _expediteur) {
        this._expediteur = _expediteur;
    }

    public void setDestinataire(Covoitureur _destinataire) {
        this._destinataire = _destinataire;
    }

    public void setDateCreation(Time _dateCreation) {
        this._dateCreation = _dateCreation;
    }

    public void setContenu(String _contenu) {
        this._contenu = _contenu;
    }

    public void setType(int _type) {
        this._type = _type;
    }

    public int getId() {
        return _id;
    }

    public Covoitureur getExpediteur() {
        return _expediteur;
    }

    public Covoitureur getDestinataire() {
        return _destinataire;
    }

    public Time getDateCreation() {
        return _dateCreation;
    }

    public String getContenu() {
        return _contenu;
    }

    public int getType() {
        return _type;
    }
    
}
