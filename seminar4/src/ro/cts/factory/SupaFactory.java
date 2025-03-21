package ro.cts.factory;

import ro.cts.model.Supa;
import ro.cts.model.SupaCiuperci;
import ro.cts.model.SupaLegume;
import ro.cts.model.SupaVita;

public class SupaFactory {
    private int cantitate;
    private float pret;

    public SupaFactory(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Supa getSupa(TipSupa tipSupa, Boolean hasArdei, Boolean hasSmantana){
        switch (tipSupa) {
            case CIUPERCI ->
            {
                return new SupaCiuperci(cantitate, pret, hasArdei, hasSmantana );
            }
            case LEGUME ->
            {
                return new SupaLegume(cantitate, pret, hasArdei, hasSmantana);
            }
            case VITA ->
            {
                return new SupaVita(cantitate, pret, hasArdei,hasSmantana);
            }
            default -> {
                return null;
            }
        }
    }




}
