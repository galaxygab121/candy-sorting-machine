import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This program simulates a Halloween candy sorting machine. It categorizes candy
 * by type and counts them.
 */
public class CandySorter {
    public static void main(String[] args) {
        // Create a list of candies
        List<String> candies = List.of("Skittles", "Gummy Bears", "Smarties", "Hershey Chocolate", "Skittles", "Smarties", "Smarties");

        // Create a map to store the count of each candy type
        Map<String, Integer> candyCount = new HashMap<>();

        // Iterate through the list of candies and categorize/count them
        for (String candy : candies) {
            // Check if the candy type is already in the map; if not, initialize the count to 0
            int count = candyCount.getOrDefault(candy, 0);

            // Update the count by incrementing it by 1
            candyCount.put(candy, count + 1);
        }

        // Display the results
        System.out.println("Candy Sorting Machine Results:");
        for (Map.Entry<String, Integer> entry : candyCount.entrySet()) {
            String candyType = entry.getKey();
            int count = entry.getValue();
            System.out.println(candyType + ": " + count);
        }
    }
}
