package p01_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static final String DRIVE_COMMAND = "Drive";
    private static final String REFUEL_COMMAND = "Refuel";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");

        String carType = carTokens[0];
        String truckType = truckTokens[0];

        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carFuelConsumptionPerKilometer = Double.parseDouble(carTokens[2]);
        Vehicle car = new Car(carFuelQuantity, carFuelConsumptionPerKilometer);

        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckFuelConsumptionPerKilometer = Double.parseDouble(truckTokens[2]);
        Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumptionPerKilometer);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put(carType, car);
        vehicles.put(truckType, truck);

        int countOfCommands = Integer.parseInt(reader.readLine());

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        while (countOfCommands-- > 0) {
            String[] commandTokens = reader.readLine().split("\\s+");

            String command = commandTokens[0];
            String vehicleType = commandTokens[1];
            double parameter = Double.parseDouble(commandTokens[2]);

            switch (command) {
                case DRIVE_COMMAND:
                    boolean isTraveled = vehicles.get(vehicleType).drive(parameter);

                    if (isTraveled) {
                        System.out.println(String.format("%s travelled %s km",
                                vehicleType,
                                decimalFormat.format(parameter)));
                    } else {
                        System.out.println(String.format("%s needs refueling",
                                vehicleType));
                    }
                    break;
                case REFUEL_COMMAND:
                    vehicles.get(vehicleType).refuel(parameter);
                    break;
            }
        }

        vehicles.values().forEach(System.out::println);
    }
}
