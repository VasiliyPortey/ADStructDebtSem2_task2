import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String wordsString = sc.nextLine();
        Set<String> wordsSet = new HashSet<>(Arrays.asList(wordsString.split(" ")));
        System.out.println("Вот какие там есть слова: " + wordsSet.toString());
    }
}