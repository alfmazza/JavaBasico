public class SmartPhone extends SmartDevice {

    String storage, OS;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String storage, String OS, String brand, String model, String color) {
        super(brand, model, color);
        this.storage = storage;
        this.OS = OS;
    }

    public void printSmartPhone() {
        System.out.println("Brand: " + brand +
                          "\nModel: " + model +
                          "\nColor: " + color +
                          "\nStorage: " + storage +
                          "\nOS: " + OS);
    }

}
