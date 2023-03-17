package tp.poo.rental;

import java.util.Objects;

public class Car extends Vehicule {

    public String model;

    public Car(String model, int year) {
        super(year);
        this.model = model;
        if (model == null) {
            throw new NullPointerException("The car model cannot be null");
        }
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return  model + " " + super.getYear();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car other = (Car) obj;
        return Objects.equals(model, other.model) && super.getYear() == other.getYear();
    }

    @Override
    public int DeadLine() {
        return 2;
    }
}
