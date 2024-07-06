public class Main {
    public static void main(String[] args) {
        String[] accesoriesHpPavilion = {"charger", "hub"};

        Computer hpPavilion = new Computer(
                14,
                "grey",
                "Helmet Pattcard",
                "HP",
                accesoriesHpPavilion
        );

        // object - all methods/properties but not the static ones
        hpPavilion.details();

        // class - you have access to the Static methods/properties
        Computer.getSerialNumber();
    }
}