package ba.unsa.etf.rpr;

import javax.print.event.PrintJobAttributeEvent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s=new Student("Haso Hasić", "123");
        IzborniPredmet ip=new IzborniPredmet("IM1", 5);
        ObavezniPredmet op=new ObavezniPredmet("RPR", 5);
        IzborniPredmet ip2=new IzborniPredmet("DM",10);
        ObavezniPredmet op2=new ObavezniPredmet("ASP",7);
        s.dodajPredmet(op);
        s.dodajPredmet(ip);
        s.dodajPredmet(ip2);
        s.dodajPredmet(op2);
        s.krajUpisa();

    }
}
