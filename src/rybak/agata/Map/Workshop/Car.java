package rybak.agata.Map.Workshop;

/**
 * Created by asus on 2017-06-02.
 */
public class Car {
    private String brand;
    private double capacity;
    private double mileage;
    private double price;
    private boolean isFixed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public Car(){

    }

    public Car(String brand, double capacity, double mileage, double price, boolean isFixed) {
        setBrand(brand);
        setCapacity(capacity);
        setMileage(mileage);
        setPrice(price);
        setFixed(isFixed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", mileage=" + mileage +
                ", price=" + price +
                ", isFixed=" + isFixed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (Double.compare(car.capacity, capacity) != 0) return false;
        if (Double.compare(car.mileage, mileage) != 0) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (isFixed != car.isFixed) return false;
        return brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand.hashCode();
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mileage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isFixed ? 1 : 0);
        return result;
    }
}
