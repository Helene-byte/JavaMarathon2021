package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2010, "kawasaki", "red");
        System.out.println(motorbike.getModel()+"\n"+
                motorbike.getYear()+"\n"+
                motorbike.getColor());
    }

}
