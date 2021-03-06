package team.esprit.entities;

public class Ville {

    private int _id;
    private int _codePostal;
    private String _gouvernorat;
    private String _delegation;
    private String _localite;
    private float _longitude;
    private float _latitude;

    public int getId() {
        return _id;
    }

    public int getCodePostal() {
        return _codePostal;
    }

    public String getGouvernorat() {
        return _gouvernorat;
    }

    public String getDelegation() {
        return _delegation;
    }

    public String getLocalite() {
        return _localite;
    }

    public float getLongitude() {
        return _longitude;
    }

    public float getLatitude() {
        return _latitude;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setCodePostal(int _codePostal) {
        this._codePostal = _codePostal;
    }

    public void setGouvernorat(String _gouvernorat) {
        this._gouvernorat = _gouvernorat;
    }

    public void setDelegation(String _delegation) {
        this._delegation = _delegation;
    }

    public void setLocalite(String _localite) {
        this._localite = _localite;
    }

    public void setLongitude(float _longitude) {
        this._longitude = _longitude;
    }

    public void setLatitude(float _latitude) {
        this._latitude = _latitude;
    }

    @Override
    public String toString() {
        return "Ville{" + "_id=" + _id + ", _codePostal=" + _codePostal + ", _gouvernorat=" + _gouvernorat + ", _delegation=" + _delegation + ", _localite=" + _localite + ", _longitude=" + _longitude + ", _latitude=" + _latitude + '}';
    }
}