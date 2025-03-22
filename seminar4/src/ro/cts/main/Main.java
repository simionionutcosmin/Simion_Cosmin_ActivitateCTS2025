package ro.cts.main;

import ro.cts.factory.SupaFactory;
import ro.cts.factory.TipSupa;
import ro.cts.model.Supa;
import ro.cts.rezervare.Rezervare;

public class Main {
    public static void main(String[] args) {

        SupaFactory sf = new SupaFactory(250, 25.5f);

        Supa supaLegume = sf.getSupa(TipSupa.LEGUME, Boolean.TRUE, Boolean.TRUE);
        Supa supaVita = sf.getSupa(TipSupa.VITA, Boolean.TRUE, Boolean.TRUE);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();

        Rezervare rezervare=new Rezervare("John",5, 2,3,Boolean.TRUE);
        System.out.println(rezervare.toString());

    }
}