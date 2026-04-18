import java.util.Arrays;
import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie types: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogies = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        Arrays.sort(bogies);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        sc.close();
    }
}