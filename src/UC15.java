public class TrainApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        void assignCargo(String cargo) {
            try {
                if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
                }

                this.cargo = cargo;
                System.out.println("Cargo '" + cargo + "' assigned to " + type + " bogie");

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed for " + type + " bogie");
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");

        System.out.println();

        b2.assignCargo("Petroleum");

        System.out.println();

        b2.assignCargo("Coal");

        System.out.println("\nProgram continues safely...");
    }
}