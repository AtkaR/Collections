package rybak.agata.Map.Workshop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by asus on 2017-06-02.
 */
public class Workshop {
    private Map<Mechanic, List<Car>> workshop;

    public Workshop() {
        // TODO Auto-generated constructor stub
    }

    public Workshop(List<Mechanic> mechanics, List<Car> cars) {
        workshop = new HashMap<>();

        for (Mechanic m : mechanics)
        {
            workshop.put(m, new ArrayList<>());
        }


        int idx = 0;
        for (Car c : cars)
        {
            workshop.get(mechanics.get(idx)).add(c);
            idx++;
            if (idx >= mechanics.size())
            {
                idx = 0;
            }
        }
    }

    public void show()
    {
        for (Entry<Mechanic, List<Car>> e : workshop.entrySet())
        {
            System.out.println(e.getKey());
            for (Car car : e.getValue())
            {
                System.out.println(car);
            }
        }
    }

    public void fix()
    {
        for(Entry<Mechanic, List<Car>> e : workshop.entrySet())
        {
            for(Car c : e.getValue())
            {
                if (c.getMileage() >= 1000)
                {
                    e.getKey().setSaldo(e.getKey().getSaldo() + Mechanic.PRICE_FOR_REPAIR);
                    c.setFixed(true);
                }
            }
        }
    }

}
