package p04_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Team team = new Team("Name");

        while (n-- > 0) {
            String[] input = reader.readLine().split(" ");

            Person person = null;

            try {
                person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            team.addPlayer(person);
        }

        System.out.println(team);
    }
}
