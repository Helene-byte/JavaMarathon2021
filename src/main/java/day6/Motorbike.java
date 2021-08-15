package day6;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Motorbike( String model, String color, int year) {
        this.year = year;
        this.model = model;
        this.color = color;
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear-year);
    }
}
