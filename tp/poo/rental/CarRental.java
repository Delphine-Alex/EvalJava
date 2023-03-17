package tp.poo.rental;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarRental {

    public List<Vehicule> vehicules;

    public CarRental() {
        vehicules = new ArrayList<>();
    }

    public void add(Vehicule vehicule) {
        Objects.requireNonNull(vehicule, "The vehicule cannot be null");
        vehicules.add(vehicule);
    }

    public void remove(Vehicule vehicule) {
        if (!vehicules.contains(vehicule)) {
            throw new IllegalStateException("The specified vehicule is not currently rented");
        }
        vehicules.remove(vehicule);
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    @Override
    public String toString() {
        String result = "";
        for (Vehicule vehicule : vehicules) {
            result += vehicule + "\n";
        }
        return result.trim();
    }

    public List<Vehicule> toSell() {
        List<Vehicule> toSellVehicules = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();
        for (Vehicule vehicule : vehicules) {
            if (currentYear - vehicule.getYear() >= 2) {
                toSellVehicules.add(vehicule);
            }
        }
        return toSellVehicules;
    }

    /*public findACarByModel(String model){
        for (int i = 0; i < DeadLine; i++) {

        }
    }*/
}
