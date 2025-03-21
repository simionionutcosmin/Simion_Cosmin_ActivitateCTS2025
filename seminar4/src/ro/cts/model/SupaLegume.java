package ro.cts.model;

public class SupaLegume extends Supa{

    private static int discount;

    public SupaLegume(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere(){
        System.out.println("Supa de legume de "+ super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return this.getPret() - this.getPret()*discount;
    }
}
