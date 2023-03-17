package tp.poo.rental;

public abstract class Vehicule implements DeadLine{

    public int year;

    public Vehicule(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }



}
