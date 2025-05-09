package ro.cts.module;

public class Sectie extends  StructuraAbs{

    public Sectie() {
    }

    public Sectie(String nume, int numarAngajati) {
        super(nume, numarAngajati);
    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {
        System.out.println("Nu se poate");
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {
        System.out.println("Nu se poate");
    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return this;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Sectia "+ this.getNume());
    }

    @Override
    public int calculeazaNrAngajati() {
        return this.getNumarAngajati();
    }
}
