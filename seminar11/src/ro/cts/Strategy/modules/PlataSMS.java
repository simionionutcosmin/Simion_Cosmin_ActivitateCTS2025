package ro.cts.Strategy.modules;

public class PlataSMS implements IMetodaPlata{

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Plata prin SMS validata!");
    }
}
