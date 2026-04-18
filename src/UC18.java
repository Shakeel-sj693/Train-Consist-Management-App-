import java.util.Scanner;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (bogieIds[i].equals(key)) {
                found = true;
                break;
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie ID FOUND");
        } else {
            System.out.println("Bogie ID NOT FOUND");
        }

        sc.close();
    }
}