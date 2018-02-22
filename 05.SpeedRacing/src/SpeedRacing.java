import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SpeedRacing {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int numberOfCars = Integer.parseInt(bfr.readLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] inputArgs = bfr.readLine().split(" ");
            Car car = new Car(inputArgs[0], Double.parseDouble(inputArgs[1]), Double.parseDouble(inputArgs[2]));
            cars.add(car);
        }

        String[] command = bfr.readLine().split(" ");

        while (!command[0].equals("End")){
            String model = command[1];
            int kilometers = Integer.parseInt(command[2]);

            for (Car car : cars) {
                if (car.getModel().equals(model)){
                    if (car.canMove(kilometers)){
                        car.setTravelledDistance(car.getTravelledDistance() + kilometers);
                        car.setFuelAmount(car.getFuelAmount() - car.getFuelCostPerKilometer() * kilometers);
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }

            command = bfr.readLine().split(" ");
        }

        for (Car car : cars) {
            System.out.printf("%s %.2f %d\n", car.getModel(), car.getFuelAmount(), car.getTravelledDistance());
        }
    }
}
