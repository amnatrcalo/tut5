package ba.unsa.etf.rpr;

public abstract class Predmet {
    protected String imePredmeta;
    protected int ects;
    Predmet(String ime, int ects){
        this.imePredmeta=ime;
        this.ects=ects;
    }

    public abstract int getEcts();

    public abstract String getImePredmeta();

    public abstract void setEcts(int ects);

    public abstract void setImePredmeta(String imePredmeta);

    public abstract void dodajStudenta(Student s);

    public abstract int dajBrojStudenata();
}
