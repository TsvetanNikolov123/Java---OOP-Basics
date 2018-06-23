package p03_02_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] studentTokens = reader.readLine().split("\\s+");
        String[] workersTokens = reader.readLine().split("\\s+");

        try {
            Human student = new Student(studentTokens[0], studentTokens[1], studentTokens[2]);
            Human worker = new Worker(workersTokens[0], workersTokens[1], Double.parseDouble(workersTokens[2]),
                    Double.parseDouble(workersTokens[3]));

            System.out.println(student);
            System.out.println(worker);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
