import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestReader {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        System.out.println("\n");
        System.out.printf("the input is %s", input);
        reader.close();;
    }
}
