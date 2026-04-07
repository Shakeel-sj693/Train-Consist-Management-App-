import java.util.HashSet;
import java.util.Set;

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG104");
        bogieIds.add("BG102");

        System.out.println("Bogie IDs entered into the system:");
        System.out.println(bogieIds);

        System.out.println("Total unique bogie IDs: " + bogieIds.size());
    }
}