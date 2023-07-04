import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split("\\s+");
        System.out.println("Number of words in the string: " + words.length);
    }
}