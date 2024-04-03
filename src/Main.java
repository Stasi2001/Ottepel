import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextInt();
        }

        int longestThaw = 0;
        int currentThaw = 0;

        for (int temp = temperatures) {
            if (temp > 0) {
                currentThaw++;
            } else {
                longestThaw = Math.max(longestThaw, currentThaw);
                currentThaw = 0;
            }
        }

        longestThaw = Math.max(longestThaw, currentThaw);

        System.out.println(longestThaw);
    }
}