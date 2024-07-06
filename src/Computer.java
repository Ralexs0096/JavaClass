
// access-modifier
public class Computer {

    // Properties
    double size;
    String color;
    String manufacturer;
    String brand;
    String[] accessories;
//    static int counter = 0;

    // Methods

    /**
     * Construct Method *******************************
     *
     * - the name of the method is the same as the class
     * - it Can receive some parameters
     * - it is called when the class is instantiated
     */
    public Computer(
            // parameters
            double size,
            String color,
            String manufacturer,
            String brand,
            String[] accessories
    ) {
        // values assignation
        this.size = size;
        this.color = color;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.accessories = accessories;
    }

    // this method is accessible through the object
    public void details() {
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Brand: " + this.brand);
        System.out.println("Accessories: ");
        for (String accessory: accessories) {
            System.out.println(accessory);
        }
    }

    // this method is accessible through the Class
    static void getSerialNumber() {
        System.out.println(Math.random());
    }

}
