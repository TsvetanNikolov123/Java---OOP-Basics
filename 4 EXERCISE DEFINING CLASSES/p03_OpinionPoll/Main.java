package p03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Person> people = new HashSet<>();

        int numberOfInputLines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfInputLines; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            people.add(person);
        }

        people.stream()
                .filter(p -> p.getAge() > 30)
                .sorted((person, person1)-> person.getName().compareTo(person1.getName()))
                .forEach(person -> System.out.printf("%s - %d%n", person.getName(),person.getAge()));
    }
}
