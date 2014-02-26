package team.esprit.entities;

import java.sql.Date;

public class Evaluation {

    private int _id;
    private String _message; //un petit message avec l'évaluation
    private int _note;
    private Covoiturage _covoiturage; //id_covoiturage
    private Covoitureur _evaluateur; //id_evaluateur
    private Date _dateEvaluation; //dans la bd DateTime donc à vérifier. je propose String (on récupére le Time et on le convertit avec substring etc..)

    public void setId(int _id) {
        this._id = _id;
    }

    public void setMessage(String _message) {
        this._message = _message;
    }

    public void setNote(int _note) {
        this._note = _note;
    }

    public void setCovoiturage(Covoiturage _covoiturage) {
        this._covoiturage = _covoiturage;
    }

    public void setEvaluateur(Covoitureur _evaluateur) {
        this._evaluateur = _evaluateur;
    }

    public void setDateEvaluation(Date _dateEvaluation) {
        this._dateEvaluation = _dateEvaluation;
    }

    public int getId() {
        return _id;
    }

    public String getMessage() {
        return _message;
    }

    public int getNote() {
        return _note;
    }

    public Covoiturage getCovoiturage() {
        return _covoiturage;
    }

    public Covoitureur getEvaluateur() {
        return _evaluateur;
    }

    public Date getDateEvaluation() {
        return _dateEvaluation;
    }
}