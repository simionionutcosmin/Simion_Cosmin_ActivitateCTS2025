package ro.cts.module;

public abstract class StructuraAbs {
    private String nume;
    private int numarAngajati;

    public StructuraAbs() {
    }

    public StructuraAbs(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numeAngajati) {
        this.numarAngajati = numeAngajati;
    }

    public abstract void adaugaNod(StructuraAbs structuraAbs);

    public abstract void stergeNod(StructuraAbs structuraAbs);

    public abstract StructuraAbs getNodCopil(int index);

    public abstract void afisareDescriere();

    public abstract int calculeazaNrAngajati();

}