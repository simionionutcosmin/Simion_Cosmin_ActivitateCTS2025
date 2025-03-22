package ro.cts.rezervare;

public abstract class ARezervare {

    protected String nume;
    protected int ora;
    protected int zi;
    protected int nrPersoane;

    protected ARezervare() {
        this.nume = "Client";
        this.ora = 10;
        this.zi = 1;
        this.nrPersoane = 1;
    }

    public ARezervare(String nume, int ora, int zi, int nrPersoane) {
        this.nume = nume;
        this.ora = ora;
        this.zi = zi;
        this.nrPersoane = nrPersoane;
    }

    public abstract ARezervare clone(int zi);

}
