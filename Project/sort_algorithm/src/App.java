import java.util.Arrays;
import java.util.Scanner;

import algorithms.ISortStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Input numbers (space separated): ");
            String[] parts = sc.nextLine().split(" ");
            int[] data = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            AlgorithmRegistry.printAvailable();
            System.out.print("Choose algorithm: ");
            String choice = sc.nextLine();

            ISortStrategy strategy = AlgorithmRegistry.get(choice);

            if (strategy == null) {
                System.out.println("Algorithm not found!");
                return;
            }

            int[] result = strategy.sort(data);

            System.out.println("Sorted result: " + Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
