package ro.cts.main;

import ro.cts.module.Departament;
import ro.cts.module.Sectie;
import ro.cts.module.StructuraAbs;

public class Main {
    public static void main(String[] args){
        StructuraAbs d1= new Departament("departament 1", 2);
        StructuraAbs d2 = new Departament("departament 2", 6);

        StructuraAbs s1=new Sectie("Sectie 1", 1);
        StructuraAbs s2=new Sectie("Sectie 2", 5);
        StructuraAbs s3=new Sectie("Sectie 3", 8);

        d1.adaugaNod(d2);


        d2.adaugaNod(s1);
        d2.adaugaNod(s2);
        d2.adaugaNod(s3);

        System.out.println(d1.calculeazaNrAngajati());
        System.out.println(d2.calculeazaNrAngajati());
        d1.afisareDescriere();


    }
}

