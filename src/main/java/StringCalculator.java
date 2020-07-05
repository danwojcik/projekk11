import java.util.Scanner;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String[] numbersTable = numbers.split(",");
        int result = 0;
        for (String s : numbersTable) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}
