package ro.cts.Observer.main;

import ro.cts.Observer.modules.Autobuz;
import ro.cts.Observer.modules.Calator;
import ro.cts.Observer.modules.MijlocTransport;
import ro.cts.Observer.modules.Observer;

public class Main {

    public static void main(String[] args) {
        Observer calator1 = new Calator("calator1");
        Observer calator2 = new Calator("calator2");
        Observer calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(101);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseul();
    }
}
