package web.model;

public class Car {

    private String color;

    private String engine;

    private int series;

    public Car(String color, String engine, int series) {
        this.color = color;
        this.engine = engine;
        this.series = series;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
