import java.util.HashMap;
import java.util.Map;

import algorithms.BubbleSort;
import algorithms.ISortStrategy;
import algorithms.QuickSort;

public class AlgorithmRegistry {
    private static final Map<String, ISortStrategy> algorithms = new HashMap<>();

    static {
        algorithms.put("Quick", new QuickSort());
        algorithms.put("Bubble", new BubbleSort());
    }

    public static ISortStrategy get(String name) {
        return algorithms.get(name);
    }

    public static void printAvailable() {
        System.out.println("Available algorithms: " + algorithms.keySet());
    }
}
