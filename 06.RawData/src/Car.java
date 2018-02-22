
public class Car {

    private static final int NUMBER_OF_TIRES = 4;

    private String model;

    private Engine engine;

    private Cargo cargo;

    private Tire[] tires;

    public Car(String model, Engine engine, Cargo cargo) {
        this.setModel(model);
        this.setCargo(cargo);
        this.setEngine(engine);
        this.setTires(new Tire[NUMBER_OF_TIRES]);
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    private void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    private void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tire[] getTires() {
        return tires;
    }

    private void setTires(Tire[] tires) {
        this.tires = tires;
    }
}
