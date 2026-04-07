import java.util.ArrayList;

public class UseCase2AddPassengerBogies {

    public static void main(String[] args) {

        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("Adding passenger bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nCurrent Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        System.out.println("\nTrain Consist after removal:");
        System.out.println(passengerBogies);

        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}