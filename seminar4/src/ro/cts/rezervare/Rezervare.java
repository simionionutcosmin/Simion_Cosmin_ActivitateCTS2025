package ro.cts.rezervare;

public class Rezervare extends ARezervare{

    protected Boolean isInterior;

    public Rezervare() {
        super();
        isInterior= Boolean.TRUE;
    }

    public Rezervare(String nume, int ora, int zi, int nrPersoane, Boolean isInterior) {
        super(nume, ora, zi, nrPersoane);
        this.isInterior = isInterior;
    }

    @Override
    public ARezervare clone(int zi) {
        Rezervare r = new Rezervare();
        r.nume=this.nume;
        r.nrPersoane=this.nrPersoane;
        r.isInterior=this.isInterior;
        r.ora=this.ora;
        return r;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", interior='" + isInterior + '\'' +
                ", ora='" + ora + '\'' +
                '}';
    }
}
