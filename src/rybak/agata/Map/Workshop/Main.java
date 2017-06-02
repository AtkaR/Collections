package rybak.agata.Map.Workshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Opel", 1.8, 2763, 1346237, false));
        cars.add(new Car("Peugeot", 1.4, 2763, 137, false));
        cars.add(new Car("Fiat", 1.3, 233, 1346237, false));
        cars.add(new Car("Fiat", 2, 213, 12237, false));
        cars.add(new Car("Peugeot", 1.8, 6763, 237, false));
        cars.add(new Car("Honda", 12.3, 234, 1007, false));
        cars.add(new Car("Ferrari", 1.1, 25, 1000, false));
        cars.add(new Car("Opel", 2.8, 2763, 10000000, false));

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("Andrzej", "Noga", 40, 0));
        mechanics.add(new Mechanic("Janusz", "Biznesu", 46, 0));

        Workshop w = new Workshop(mechanics, cars);
        w.show();
        w.fix();

        for(Car c : cars)
        {
            System.out.println(c);
        }

        System.out.println("============================");

        for(Mechanic m : mechanics)
        {
            System.out.println(m);
        }
    }
}
