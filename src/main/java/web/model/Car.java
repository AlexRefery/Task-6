package web.model;

public class Car {
    private String model;
    private String type;
    private String color;

    public Car(String model, String type, String color) {
        this.model = model;
        this.type = type;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car model = " + model + ", type = " + type + ", color = " + color;
    }
}
