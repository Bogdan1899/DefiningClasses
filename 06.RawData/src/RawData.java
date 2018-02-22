import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class RawData {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int numberOfCars = Integer.parseInt(bfr.readLine());

        LinkedList<Car> cars = new LinkedList<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] inputArgs = bfr.readLine().split(" ");
            Engine engine = new Engine(Integer.parseInt(inputArgs[1]), Integer.parseInt(inputArgs[2]));
            Cargo cargo = new Cargo(Integer.parseInt(inputArgs[3]), inputArgs[4]);
            Car car = new Car(inputArgs[0], engine, cargo);
            int index = 0;

            for (int j = 5; j < inputArgs.length - 1; j+=2) {
                Tire tire = new Tire(Double.parseDouble(inputArgs[j]), Integer.parseInt(inputArgs[j + 1]));
                car.getTires()[index++] = tire;
            }

            cars.add(car);
        }

        String command = bfr.readLine();

        if (command.equals("fragile")){
            for (Car car : cars) {
                if (car.getCargo().getType().equals(command)){
                    for (Tire tire : car.getTires()) {
                        if (tire.getPressure() < 1){
                            System.out.println(car.getModel());
                            break;
                        }
                    }
                }
            }
        } else {
            for (Car car : cars) {
                if (car.getCargo().getType().equals(command)
                        && car.getEngine().getPower() > 250){
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
