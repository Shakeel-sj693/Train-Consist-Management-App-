import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();

        int[] capacity = new int[n];

        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacity[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (capacity[j] > capacity[j + 1]) {
                    // Swap
                    int temp = capacity[j];
                    capacity[j] = capacity[j + 1];
                    capacity[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Capacities:");
        for (int i = 0; i < n; i++) {
            System.out.print(capacity[i] + " ");
        }

        sc.close();
    }
}