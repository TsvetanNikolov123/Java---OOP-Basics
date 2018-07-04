package its_in_the_blood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HealthManager healthManager = new HealthManager();

        while (true) {
            String inputLine = reader.readLine();

            if ("BEER IS COMING".equals(inputLine)) {
                break;
            }

            String[] tokens = inputLine.split("\\s+");
            String command = tokens[0];
            String organism = tokens[1];
            String clusterId = "";
            int rows = 0;
            int cols = 0;

            String result = "";
            switch (command) {
                case "createOrganism":
                    System.out.println(healthManager.createOrganism(organism));
                    break;

                case "addCluster":
                    clusterId = tokens[2];
                    rows = Integer.parseInt(tokens[3]);
                    cols = Integer.parseInt(tokens[4]);

                    String addClusterResult = healthManager.addCluster(organism, clusterId, rows, cols);

                    if (!addClusterResult.equals("")) {
                        System.out.println(addClusterResult);
                    }
                    break;

                case "addCell":
                    clusterId = tokens[2];
                    String cellType = tokens[3];
                    String cellId = tokens[4];
                    int health = Integer.parseInt(tokens[5]);
                    int row = Integer.parseInt(tokens[6]);
                    int col = Integer.parseInt(tokens[7]);
                    int additionalProperty = Integer.parseInt(tokens[8]);

                    result = healthManager.addCell(organism, clusterId, cellType, cellId, health, row, col, additionalProperty);

                    if (!result.equals("")) {
                        System.out.println(result);
                    }
                    break;

                case "activateCluster":
                    result = healthManager.activateCluster(organism);

                    if (!result.equals("")) {
                        System.out.println(result);
                    }
                    break;

                case "checkCondition":
                    try {
                        if (!healthManager.checkCondition(organism).equals("")) {
                            System.out.printf("%s", healthManager.checkCondition(organism));
                        }
                    } catch (Exception e) {

                    }
                    break;
            }
        }
    }
}
