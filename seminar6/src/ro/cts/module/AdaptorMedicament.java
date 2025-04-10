
package ro.cts.module;

public class AdaptorMedicament extends ro.cts.module.MedicamentFarmacie {
    private ro.cts.module.MedicamentSpital medicamentSpital;

    public AdaptorMedicament(String nume, int pret, boolean stoc, String dataExpirare) {
        super(nume, pret, stoc, dataExpirare);
    }

    public AdaptorMedicament(ro.cts.module.MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true, "12.04.2027");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
