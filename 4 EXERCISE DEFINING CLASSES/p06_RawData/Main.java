package p06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] carData = reader.readLine().split("\\s+");

            // Инициализираме "car" за да свикниме за във бъдеще
            // като правиме проверки и ако имаме обект със стойности от тип "null"
            // да го пропускаме

            Car car = null;

            String model = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];

            Cargo cargo = new Cargo(cargoType, cargoWeight);

            List<Tire> tires = new ArrayList<>();


            for (int i = 5; i < carData.length - 1; i += 2) {
                double pressure = Double.parseDouble(carData[i]);
                int age = Integer.parseInt(carData[i + 1]);

                Tire tire = new Tire(age, pressure);
                tires.add(tire);
            }

            car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String command = reader.readLine();
        switch (command) {
            case "fragile":
                cars.stream()
                        .filter(car -> car.getTires().stream()
                                .filter(tire -> tire.getPressure() < 1)
                                .collect(Collectors.toList()).size() > 0)
                        .filter(car -> car.getCargo().getType().equals("fragile"))
                        .forEach(System.out::println);

                break;
            case "flamable":
                cars.stream()
                        .filter(car -> "flamable".equals(car.getCargo().getType()))
                        .filter(car -> car.getEngine().getPower() > 250)
                        .forEach(System.out::println);
                break;
        }
    }
}
