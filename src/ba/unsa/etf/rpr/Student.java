package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student {
    private String imePrezime;
    private String brojIndeksa;
    ArrayList<Predmet>listaPredmeta = new ArrayList<>();
    public Student(String imePrezime, String brojIndeksa){
        this.imePrezime=imePrezime;
        this.brojIndeksa=brojIndeksa;
    }
    public void dodajPredmet(Predmet p){
        listaPredmeta.add(p);
    }

    public boolean krajUpisa(){
        int sumaEcts=0;
        for (Predmet predmet : listaPredmeta) {
            sumaEcts = sumaEcts + predmet.getEcts();
        }
        if(sumaEcts<30){
            System.out.println("Uneseni su predmeti koji u zbiru nemaju 30 ects bodova.");
            return false;
        }
        return true;
    }
    

}
