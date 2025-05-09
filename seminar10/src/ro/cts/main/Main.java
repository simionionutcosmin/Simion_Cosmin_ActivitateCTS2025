package ro.cts.main;

import ro.cts.module.Departament;
import ro.cts.module.Sectie;
import ro.cts.module.StructuraAbs;

public class Main {
    public static void main(String[] args) {

        StructuraAbs d1 = new Departament("despartament1", 4);
        StructuraAbs d2 = new Departament("departament2", 3);

        StructuraAbs sectie1 = new Sectie("sectie 1", 4);
        StructuraAbs sectie2 = new Sectie("sectie 2", 6);
        StructuraAbs sectie3 = new Sectie("sectie 3", 3);

        d1.calculeazaNrAngajati();
        d1.adaugaNod(d2);
        d1.adaugaNod(sectie1);
        d2.adaugaNod(sectie2);
        d2.adaugaNod(sectie3);

        System.out.println(d1.calculeazaNrAngajati());
        d1.afisareDescriere();


    }
}

