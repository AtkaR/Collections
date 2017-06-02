package rybak.agata.Set;

/**
 * Created by asus on 2017-06-02.
 */
public class Doctor {
    private String name;
    private String surname;
    private String specjalization;
    private double salary;

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

    public String getSpecjalization() {
        return specjalization;
    }

    public void setSpecjalization(String specjalization) {
        this.specjalization = specjalization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Doctor(){

    }

    public Doctor(String name, String surname, String specjalization, double salary) {
        setName(name);
        setSurname(surname);
        setSpecjalization(specjalization);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specjalization='" + specjalization + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;

        Doctor doctor = (Doctor) o;

        if (Double.compare(doctor.salary, salary) != 0) return false;
        if (!name.equals(doctor.name)) return false;
        if (!surname.equals(doctor.surname)) return false;
        return specjalization.equals(doctor.specjalization);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + specjalization.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
