import java.util.HashMap;
import java.util.Map;

import algorithms.ISortStrategy;

public class AlgorithmRegistry {
    private static final Map<String, ISortStrategy> algorithms = new HashMap<>();

    static {
    }

    public static ISortStrategy get(String name) {
        return algorithms.get(name);
    }

    public static void printAvailable() {
        System.out.println("Available algorithms: " + algorithms.keySet());
    }
}
