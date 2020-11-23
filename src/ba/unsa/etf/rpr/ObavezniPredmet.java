package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class ObavezniPredmet extends Predmet {
    private ArrayList<Student> listaUpisanihNaObavezni;
    ObavezniPredmet(String ime, int ects) {
        super(ime, ects);
        listaUpisanihNaObavezni=null;
    }

    @Override
    public int getEcts() {
        return ects;
    }

    @Override
    public String getImePredmeta() {
        return imePredmeta;
    }

    @Override
    public void setEcts(int ects) {
        this.ects=ects;
    }

    @Override
    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta=imePredmeta;
    }

    @Override
    public void dodajStudenta(Student s){
        listaUpisanihNaObavezni.add(s);
    }
    @Override
    public int dajBrojStudenata(){
        return listaUpisanihNaObavezni.size();
    }



}
