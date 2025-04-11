
package ro.cts.main;

import ro.cts.module.AdaptorMedicament;
import ro.cts.module.MedicamentSpital;
import ro.cts.module.MedicamentFarmacie;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Medi", 50, true, "17.05.2028");
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Medi2", 45);
        AdaptorMedicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        vindeMedicamente(adaptorMedicament);
    }
}
