
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}

public class Main {
    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
