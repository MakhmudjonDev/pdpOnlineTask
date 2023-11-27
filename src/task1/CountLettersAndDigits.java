
package task1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CountLettersAndDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matnni kiriting: ");
        String text = scanner.nextLine();

        int letterCount = countLetters(text);
        int digitCount = countDigits(text);

        System.out.println("Matnda " + letterCount + " ta harf va " + digitCount + " ta raqam bor.");
    }

    private static int countLetters(String text) {
        // Harflarni izlash uchun regex
        String regex = "[a-zA-Z]";

        // Pattern va Matcher yaratish
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        // Har bir match topish
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    private static int countDigits(String text) {
        // Raqamni izlash uchun regex
        String regex = "\\d";

        // Pattern va Matcher yaratish
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        // Har bir match topish
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}

