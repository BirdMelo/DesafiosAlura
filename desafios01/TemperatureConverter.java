package tasks.desafios01;

public class TemperatureConverter {

    public static void main(String[] args) {
        double celsius=21;
        double fahrenheit=(celsius*1.8)+32;
        System.out.println(String.format("Fahrenheit em double: %.2f",fahrenheit));
        int fahrenheitInt = (int) (celsius*1.8)+32;
        System.out.println(String.format("Fahrenheit em integer: %d",fahrenheitInt));
    }
}
