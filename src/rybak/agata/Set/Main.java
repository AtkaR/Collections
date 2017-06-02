package rybak.agata.Set;

import java.util.*;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {

        Set<Doctor> setDoctor = new HashSet<Doctor>();
            setDoctor.add(new Doctor("L1", "N1", "GP", 4500));
            setDoctor.add(new Doctor("L5", "N6", "GP", 4500));
            setDoctor.add(new Doctor("L2", "N2", "GP", 4500));
            setDoctor.add(new Doctor("L1", "N1", "GP", 4500));

            setDoctor.forEach(l -> {System.out.println(l);});

        Set<Doctor> tsetLekarz = new TreeSet<Doctor>((l1, l2)->(l1.getName().compareTo(l2.getName())));
            tsetLekarz.add(new Doctor("L1", "N1", "GP", 4500));
            tsetLekarz.add(new Doctor("L5", "N6", "GP", 4500));
            tsetLekarz.add(new Doctor("L2", "N2", "GP", 4500));
            tsetLekarz.add(new Doctor("L1", "N1", "GP", 4500));

            System.out.println("--------------------------");
            setDoctor.forEach(l -> {System.out.println(l);});
            tsetLekarz.forEach(l -> {System.out.println(l);});

        List<Doctor> l = new ArrayList<Doctor>(Arrays.asList(new Doctor[]{
                new Doctor("L1", "N1", "GP", 4500),
                new Doctor("L1", "N1", "GP", 4500),
                new Doctor("L2", "N1", "GP", 4500),
                new Doctor("L1", "N1", "GP", 4500),
                new Doctor("L1", "N1", "GP", 4500),
                new Doctor("L1", "N1", "GP", 4500),
                new Doctor("L1", "N1", "GP", 4500),
                new Doctor("L3", "N1", "GP", 4500),
                new Doctor("L3", "N1", "GP", 4500),
                new Doctor("L1", "N1", "GP", 4500)
        }));

        Set<Doctor> lekarzeSet = new HashSet<Doctor>(l);
            System.out.println("+++++++++++++++++++++");
            lekarzeSet.forEach(o -> {System.out.println(o);});

    }

}
