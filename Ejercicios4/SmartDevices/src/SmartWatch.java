public class SmartWatch extends SmartDevice{
    String weight, displayRes;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String weight, String displayRes, String brand, String model, String color) {
        super(brand, model, color);
        this.weight = weight;
        this.displayRes = displayRes;
    }

    public void printSmartWatch() {
        System.out.println("Brand: " + brand +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nWeight: " + weight +
                "\nDisplay size: " + displayRes);
    }
}
