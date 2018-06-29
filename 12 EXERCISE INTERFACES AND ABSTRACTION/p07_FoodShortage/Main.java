package p07_FoodShortage;

import p07_FoodShortage.constants.Constants;
import p07_FoodShortage.contracts.Buyer;
import p07_FoodShortage.impl.Citizen;
import p07_FoodShortage.impl.Rebel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final int NAME_INDEX = 0;
    private static final int AGE_INDEX = 1;
    private static final int GROUP_INDEX = 2;
    private static final int ID_INDEX = 2;
    private static final int BIRTHDAY_INDEX = 3;
    private static final int TOKENS_COUNT_REBEL = 3;
    private static final int TOKENS_COUNT_CITIZEN = 4;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Buyer> buyers = readBuyer(reader);

        long totalFoodPurchased = getTotalFoodPurchased(reader, buyers);

        System.out.println(totalFoodPurchased);
    }

    private static long getTotalFoodPurchased(BufferedReader reader, Map<String, Buyer> buyers) throws IOException {
        long totalFoodPurchased = 0L;

        while (true){
            String name = reader.readLine().trim();

            if (Constants.TERMINATE_STRING.equals(name)){
                break;
            }

            Buyer buyer = buyers.get(name);

            if (buyer != null){
                totalFoodPurchased += buyer.buyFood();
            }
        }

        return totalFoodPurchased;
    }

    private static Map<String, Buyer> readBuyer(BufferedReader reader) throws IOException {
        Map<String, Buyer> buyers = new HashMap<>();

        int buyersCount = Integer.parseInt(reader.readLine());

        while (buyersCount-- > 0){
            String[] tokens = reader.readLine().split(Constants.TOKENS_SEPARATOR);

            String name = tokens[NAME_INDEX];
            int age = Integer.parseInt(tokens[AGE_INDEX]);

            switch (tokens.length){
                case TOKENS_COUNT_REBEL:
                    String group = tokens[GROUP_INDEX];
                    buyers.putIfAbsent(name, new Rebel(name, age, group));
                    break;
                case TOKENS_COUNT_CITIZEN:
                    String id = tokens[ID_INDEX];
                    String birthday = tokens[BIRTHDAY_INDEX];
                    buyers.putIfAbsent(name, new Citizen(id, name, age, birthday));
                    break;
            }
        }

        return buyers;
    }
}
