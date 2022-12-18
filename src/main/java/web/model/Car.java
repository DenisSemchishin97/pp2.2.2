package web.model;

public class Car {
    private String model;
    private int series;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int seriees) {
        this.series = seriees;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

}