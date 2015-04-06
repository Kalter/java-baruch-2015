package day1.lab01;

public class Robot {
    @Override
    public String toString() {
        return "I am Robot";
    }

    @RunThisMethod(repeat = 10)
    public void clean() {
        System.out.println("Cleaning!");
    }
}
