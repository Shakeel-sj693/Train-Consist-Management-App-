import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class SafetyCheckApp {
    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample Data
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Stream Validation
        boolean isSafe = bogies.stream().allMatch(b ->
                !(b.type.equalsIgnoreCase("Cylindrical")) ||
                        b.cargo.equalsIgnoreCase("Petroleum")
        );

        // Output
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}