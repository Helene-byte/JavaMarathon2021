package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setModel("audi");
        car.setYear(2015);

        Motorbike motorbike= new Motorbike("kawasaki","blue",2018);

        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2020));
    }
}
