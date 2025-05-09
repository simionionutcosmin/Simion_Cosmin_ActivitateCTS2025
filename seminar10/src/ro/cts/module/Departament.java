package ro.cts.module;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs {

    private List<StructuraAbs> structuri;

    public Departament(String nume, int numarAngajati) {
        super(nume, numarAngajati);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {
        structuri.add(structuraAbs);
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {

    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return structuri.get(index);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Departamentul "+ this.getNume()+" contine urmatoarele subdepartamente/sectii: ");
        structuri.forEach(StructuraAbs::afisareDescriere);

    }

    @Override
    public int calculeazaNrAngajati() {
        int count = 0;
        for( StructuraAbs structuraAbs : structuri)
        {
            count +=structuraAbs.calculeazaNrAngajati() ;
        }
        return count + this.getNumarAngajati();
    }
}
