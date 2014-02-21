package team.esprit.entities;

public class Ville {
    
    private int _id;
    private float _latitude;
    private float _longitude;
    private String _nom;
    private String _gouvernorat;
    private int _codePostal;

    public void setId(int _id) {
        this._id = _id;
    }

    public void setLatitude(float _latitude) {
        this._latitude = _latitude;
    }

    public void setLongitude(float _longitude) {
        this._longitude = _longitude;
    }

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public void setGouvernorat(String _gouvernorat) {
        this._gouvernorat = _gouvernorat;
    }

    public void setCodePostal(int _codePostal) {
        this._codePostal = _codePostal;
    }

    public int getId() {
        return _id;
    }

    public float getLatitude() {
        return _latitude;
    }

    public float getLongitude() {
        return _longitude;
    }

    public String getNom() {
        return _nom;
    }

    public String getGouvernorat() {
        return _gouvernorat;
    }

    public int getCodePostal() {
        return _codePostal;
    }
    
}
