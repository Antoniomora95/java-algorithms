import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventOfCode1 {

    private static List<Integer> insertSort (List<Integer> input) {
        for(int i = 1; i < input.size(); i++) {
            int key = input.get(i);
            int j = i - 1;

            while(j >= 0 && input.get(j) > key) {
                input.set(j + 1,  input.get(j));
                j = j - 1;
            }
            input.set(j + 1, key);
        }
        return input;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Paste, click enter, ctrl + D");
        // Read all input lines into a StringBuilder
        StringBuilder inputBuilder = new StringBuilder();
        // Reading until (Ctrl+D or Ctrl+Z)
        while (scanner.hasNextLine()) {
            inputBuilder.append(scanner.nextLine()).append("\n");
        }

        String input = inputBuilder.toString();
        String[] lines = input.split("\n");

        List<Integer> leftList = new ArrayList<Integer>(lines.length);
        List<Integer> rightList = new ArrayList<Integer>(lines.length);

        for (String line : lines) {
            // Trim whitespace and split by space
            String[] parts = line.trim().split("\\s+");

            if (parts.length == 2) {
                leftList.add(Integer.parseInt(parts[0]));
                rightList.add(Integer.parseInt(parts[1]));
            }
        }

        List<Integer> sortedLeft = insertSort(leftList);
        List<Integer> sortedRight = insertSort(rightList);

        int distance = 0;

        for(int i = 0; i < leftList.size(); i++) {
            distance += Math.abs(sortedRight.get(i) - sortedLeft.get(i));
        }

        System.out.println(distance);

        scanner.close();
    }
}
