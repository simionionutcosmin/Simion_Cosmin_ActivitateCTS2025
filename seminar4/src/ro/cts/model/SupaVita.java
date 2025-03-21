package ro.cts.model;

public class SupaVita extends Supa{

    private static int discount;

    public SupaVita(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public float calculeazaPretFinal() {
        return this.getPret() - this.getPret()*discount;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita de "+ super.getCantitate());

    }
}
