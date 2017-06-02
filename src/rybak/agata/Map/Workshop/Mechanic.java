package rybak.agata.Map.Workshop;

/**
 * Created by asus on 2017-06-02.
 */
public class Mechanic {
    public static final double PRICE_FOR_REPAIR = 10;
    private String name;
    private String surname;
    private int age;
    private double saldo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Mechanic(){

    }

    public Mechanic(String name, String surname, int age, double saldo) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setSaldo(saldo);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;

        Mechanic mechanic = (Mechanic) o;

        if (age != mechanic.age) return false;
        if (Double.compare(mechanic.saldo, saldo) != 0) return false;
        if (!name.equals(mechanic.name)) return false;
        return surname.equals(mechanic.surname);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(saldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
