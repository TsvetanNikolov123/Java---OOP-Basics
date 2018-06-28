package p05_01_BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<IdentableId> citizens = new ArrayList<>();

        while (true) {
            String[] currentArgs = scanner.nextLine().split("\\s+");

            if ("End".equals(currentArgs[0])) {
                break;
            } else if (currentArgs.length == 2) {
                IdentableId robot = new Robot(currentArgs[0], currentArgs[1]);
                citizens.add(robot);
            } else if (currentArgs.length == 3) {
                IdentableId citizen = new Citizen(currentArgs[0], currentArgs[1], currentArgs[2]);
                citizens.add(citizen);
            }
        }

        String lastDigitOfId = scanner.nextLine();

        for (IdentableId citizen : citizens) {

            if (citizen.getId().endsWith(lastDigitOfId)) {
                System.out.println(citizen.getId());
            }
        }
    }
}

