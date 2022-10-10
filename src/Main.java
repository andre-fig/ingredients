
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your order:");
        String order = scanner.nextLine();
        scanner.close();
        
        Order smoothieOrder = new Order(order);
        Smoothie smoothie = smoothieOrder.getSmoothie();

        String output = smoothie.ingredients.stream()
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println("Your order ingredients are:");

        System.out.println(output);

    }
}

