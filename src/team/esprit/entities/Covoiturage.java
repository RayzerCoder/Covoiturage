package team.esprit.entities;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class Covoiturage {

    private int _id;
    private String _titre;
    private String _description;
    private Ville _villeDepart;
    private Ville _villeArrivee;
    private Covoitureur _createur;
    private Date _dateCreation; //Current_TimeStamp
    private Date _dateMiseAJour;
    private Date _dateDepart;
    private Date _dateArrivee;
    private int _nombrePlaces;
    private boolean _fumeur;
    private boolean _reserveFemmes;
    private Map<Covoiturage, List<Ville>> _detours;
    private Map<Covoiturage, List<Covoitureur>> _participants;

    public boolean isFumeur() {
        return _fumeur;
    }

    public boolean isReserveFemmes() {
        return _reserveFemmes;
    }

    public void setFumeur(boolean _fumeur) {
        this._fumeur = _fumeur;
    }

    public void setReserveFemmes(boolean _reserveFemmes) {
        this._reserveFemmes = _reserveFemmes;
    }
    
    public void setId(int _id) {
        this._id = _id;
    }

    public void setTitre(String _titre) {
        this._titre = _titre;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public void setVilleDepart(Ville _villeDepart) {
        this._villeDepart = _villeDepart;
    }

    public void setVilleArrivee(Ville _villeArrivee) {
        this._villeArrivee = _villeArrivee;
    }

    public void setCreateur(Covoitureur _createur) {
        this._createur = _createur;
    }

    public void setDateCreation(Date _dateCreation) {
        this._dateCreation = _dateCreation;
    }

    public void setDateMiseAJour(Date _dateMiseAJour) {
        this._dateMiseAJour = _dateMiseAJour;
    }

    public void setDateDepart(Date _dateDepart) {
        this._dateDepart = _dateDepart;
    }

    public void setDateArrivee(Date _dateArrivee) {
        this._dateArrivee = _dateArrivee;
    }

    public void setNombrePlaces(int _nombrePlaces) {
        this._nombrePlaces = _nombrePlaces;
    }

    public int getId() {
        return _id;
    }

    public String getTitre() {
        return _titre;
    }

    public String getDescription() {
        return _description;
    }

    public Ville getVilleDepart() {
        return _villeDepart;
    }

    public Ville getVilleArrivee() {
        return _villeArrivee;
    }

    public Covoitureur getCreateur() {
        return _createur;
    }

    public Date getDateCreation() {
        return _dateCreation;
    }

    public Date getDateMiseAJour() {
        return _dateMiseAJour;
    }

    public Date getDateDepart() {
        return _dateDepart;
    }

    public Date getDateArrivee() {
        return _dateArrivee;
    }

    public int getNombrePlaces() {
        return _nombrePlaces;
    }
}