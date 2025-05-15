package ro.cts.Chain.main;

import ro.cts.Chain.modules.*;

public class Main {
    public static void main(String[] args) {
        AInfoTransport troleibuz = new InfoTroleibuz();
        AInfoTransport autobuz = new InfoAutobuz();
        AInfoTransport tramvai = new InfoTramvai();
        AInfoTransport metrou = new InfoMetrou();

        troleibuz.setNext(autobuz);
        troleibuz.setNext(tramvai);
        troleibuz.setNext(metrou);

        troleibuz.recomandaTransport(2);
        troleibuz.recomandaTransport(12);
        troleibuz.recomandaTransport(7);
        troleibuz.recomandaTransport(4);

    }
}
