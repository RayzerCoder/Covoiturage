package team.esprit.entities;

public class Covoitureur {

    private int _id;
    private String _nom;
    private String _prenom;
    private String _login;
    private String _mdp;

    public void setId(int _id) {
        this._id = _id;
    }

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public void setPrenom(String _prenom) {
        this._prenom = _prenom;
    }

    public void setLogin(String _login) {
        this._login = _login;
    }

    public void setMdp(String _mdp) {
        this._mdp = _mdp;
    }

    public int getId() {
        return _id;
    }

    public String getNom() {
        return _nom;
    }

    public String getPrenom() {
        return _prenom;
    }

    public String getLogin() {
        return _login;
    }

    public String getMdp() {
        return _mdp;
    }

    @Override
    public String toString() {
        return " " + this._id + " " + this._nom + " " + this._prenom;
    }
}