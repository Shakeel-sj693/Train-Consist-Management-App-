//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.stream.Collectors;


abstract class Bogie {
    String type;

    Bogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}


class Sleeper extends Bogie {
    int seatCapacity;
    Sleeper(int seatCapacity) { super("Sleeper"); this.seatCapacity = seatCapacity; }
}
class ACChair extends Bogie {
    int seatCapacity;
    ACChair(int seatCapacity) { super("AC Chair"); this.seatCapacity = seatCapacity; }
}
class FirstClass extends Bogie {
    int seatCapacity;
    FirstClass(int seatCapacity) { super("First Class"); this.seatCapacity = seatCapacity; }
}


class RectangularGoods extends Bogie {
    String cargoType;
    RectangularGoods(String cargoType) { super("Rectangular Goods"); this.cargoType = cargoType; }
}
class CylindricalGoods extends Bogie {
    String cargoType;
    CylindricalGoods(String cargoType) { super("Cylindrical Goods"); this.cargoType = cargoType; }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Sleeper(72),
                new Sleeper(80),
                new ACChair(60),
                new FirstClass(40),
                new RectangularGoods("Coal"),
                new CylindricalGoods("Oil"),
                new RectangularGoods("Grain")
        );

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> System.out.println("   " + b));
        });
    }
}
