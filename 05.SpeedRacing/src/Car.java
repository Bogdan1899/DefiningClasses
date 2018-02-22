
public class Car {

    private static int DEFAULT_TRAVELLED_DISTANCE = 0;

    private String model;

    private double fuelAmount;

    private double fuelCostPerKilometer;

    private int travelledDistance;

    public Car(String model, double fuelAmount, double fuelCostPerKilometer) {
        this.setModel(model);
        this.setFuelCostPerKilometer(fuelCostPerKilometer);
        this.setFuelAmount(fuelAmount);
        this.setTravelledDistance(DEFAULT_TRAVELLED_DISTANCE);
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostPerKilometer() {
        return fuelCostPerKilometer;
    }

    private void setFuelCostPerKilometer(double fuelCostPerKilometer) {
        this.fuelCostPerKilometer = fuelCostPerKilometer;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(int travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    public boolean canMove(int distance){
        return !(distance * fuelCostPerKilometer > this.fuelAmount);
    }
}
