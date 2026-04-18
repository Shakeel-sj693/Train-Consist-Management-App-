import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile Patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validation
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}