public class Header extends requete {

    private String _cle, _valeur;

    public Header(String _cle, String _valeur) {
        this._cle = _cle;
        this._valeur = _valeur;
    }

    public String get_cle() {
        return this._cle;
    }

    public void set_cle(String _cle) {
        this._cle = _cle;
    }

    public String get_valeur() {
        return this._valeur;
    }

    public void set_valeur(String _valeur) {
        this._valeur = _valeur;
    }

    public void Affichable() {

    }
}
