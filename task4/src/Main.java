import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(20000, 2015, 150),
                new Car(15000, 2020, 120),
                new Car(15000, 2020, 150),
                new Car(25000, 2010, 100)
        };

        Arrays.sort(cars);
        System.out.println("Відсортовані автомобілі (за нашими умовами)");
        for(Car car: cars){
            System.out.println("Ціна " + car.getPrice() + "  Рік: " + car.getYear() + "  К-сть к.с.: " + car.getHorsePower());
        }
    }
}


class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public int getYear() { return year; }
    public int getHorsePower() { return horsePower; }

    public void setPrice(int price) { this.price = price; }
    public void setYear(int year) { this.year = year; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object obj){
        Car otherCar = (Car) obj;

        int priceDiff = otherCar.price - this.price;
        if (priceDiff != 0) {
            return priceDiff;
        }

        int yearDiff = this.year - otherCar.year;
        if (yearDiff != 0) {
            return yearDiff;
        }
        return this.horsePower - otherCar.horsePower;
    }

}