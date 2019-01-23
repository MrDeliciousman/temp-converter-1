import java.util.*;

public class TempConverter {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat;
        
        do {
            double fahrenheit;
            double celsius;
            
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(celsius);
            System.out.println("Continue?");
            repeat = input.nextBoolean();
        } while (repeat);
    }
}
