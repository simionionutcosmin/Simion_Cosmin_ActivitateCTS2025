package ro.cts.model;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private Boolean hasArdei;
    private Boolean hasSmantana;

    public Supa(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.hasArdei = hasArdei;
        this.hasSmantana = hasSmantana;
    }

    public float getPretPer100g(){
        return (this.pret/this.cantitate)*100;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public abstract float calculeazaPretFinal();

    public abstract void afiseazaDescriere();

}
