package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class IzborniPredmet extends Predmet {
    private ArrayList<Student>listaUpisanihNaIzborni;
    IzborniPredmet(String ime, int ects) {
        super(ime, ects);
        listaUpisanihNaIzborni=null;
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
        listaUpisanihNaIzborni.add(s);
    }
    @Override
    public int dajBrojStudenata(){
        return listaUpisanihNaIzborni.size();
    }



}
