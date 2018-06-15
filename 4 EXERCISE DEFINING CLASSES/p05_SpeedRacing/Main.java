package p05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Car> cars = new LinkedHashMap<>();
        int countOfCars = Integer.parseInt(reader.readLine());

        while (countOfCars-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");


            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double costPerKilometer = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuel, costPerKilometer);

            cars.putIfAbsent(tokens[0], car);
        }

        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }

            String[] driveTokens = line.split("\\s+");

            try {
                String carModel = driveTokens[1];
                int kilometers = Integer.parseInt(driveTokens[2]);
                cars.get(carModel).drive(kilometers);

            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
            }

        }

        cars.values().forEach(System.out::println);
    }
}
