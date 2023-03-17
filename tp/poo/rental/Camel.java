package tp.poo.rental;

public class Camel extends Vehicule {


    public Camel(int year) {
        super(year);
    }

    @Override
    public String toString() {
        return "camel" + " " + getYear();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Camel camel = (Camel) obj;
        return super.getYear() == camel.getYear();
    }

    @Override
    public int DeadLine() {
        return 5;
    }
}
