package tp.poo.rental;

public class Main {

    public static void main(String[] args){

        CarRental rental = new CarRental();
        rental.add(new Car("Renauld Arkana", 2023));
        rental.add(new Car("test de", 2022));
        rental.add(new Car("Porsche 911", 2019));
        rental.add(new Car("Ford Mustang", 2014));
        rental.add(new Car("DeLorian", 1975));
        rental.add(new Camel(2010));
        rental.add(new Camel(2020));

        System.out.println(rental.getVehicules());

        rental.remove(new Car("DeLorian", 1975));
        System.out.println(rental.getVehicules());

        System.out.println(rental);

        System.out.println(rental.toSell());


    }
}
