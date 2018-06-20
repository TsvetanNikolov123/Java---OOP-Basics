package p05_01_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();
        while (!"END".equals(command)) {
            try {
                if (command.startsWith("Dough")) {
                    String[] doughArgs = command.split("\\s+");
                    String flourType = doughArgs[1];
                    String bakingTechnique = doughArgs[2];
                    double weight = Double.parseDouble(doughArgs[3]);

                    Dough dough = new Dough(flourType, bakingTechnique, weight);
                    System.out.printf("%.2f%n", dough.getCalories());
                } else if (command.startsWith("Topping")) {
                    String[] toppingArgs = command.split("\\s+");
                    String type = toppingArgs[1];
                    double weight = Double.parseDouble(toppingArgs[2]);

                    Topping topping = new Topping(type, weight);
                    System.out.printf("%.2f%n", topping.getCalories());
                } else if (command.startsWith("Pizza")) {
                    String[] pizzaArgs = command.split("\\s+");
                    String name = pizzaArgs[1];
                    int numberOfToppings = Integer.parseInt(pizzaArgs[2]);

                    Pizza pizza = new Pizza(name, numberOfToppings);

                    String[] doughArgs = reader.readLine().split("\\s+");
                    String flourType = doughArgs[1];
                    String bakingTechnique = doughArgs[2];
                    double doughWeight = Double.parseDouble(doughArgs[3]);

                    Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
                    pizza.setDough(dough);

                    for (int i = 0; i < numberOfToppings; i++) {
                        String[] toppingArgs = reader.readLine().split("\\s+");
                        String type = toppingArgs[1];
                        double toppingWeight = Double.parseDouble(toppingArgs[2]);

                        Topping topping = new Topping(type, toppingWeight);

                        pizza.addTopping(topping);
                    }

                    System.out.println(pizza);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }

            command = reader.readLine();
        }
    }
}
