package p10_MooD3;

import p10_MooD3.impl.Archangel;
import p10_MooD3.impl.Demon;
import p10_MooD3.impl.GameObject;

import java.util.Scanner;

public class Main {

    private static final String TOKEN_SEPARATOR = " \\| ";
    private static final int NAME_INDEX = 0;
    private static final int CHARACTER_TYPE = 1;
    private static final int SPECIAL_POINTS_INDEX = 2;
    private static final int LEVEL_INDEX = 3;
    private static final String CHARACTER_TYPE_DEMON = "Demon";
    private static final String CHARACTER_TYPE_ARCHANGEL = "Archangel";


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] inputArgs = scan.nextLine().trim().split(TOKEN_SEPARATOR);
        String name = inputArgs[NAME_INDEX];
        String characterType = inputArgs[CHARACTER_TYPE];
        Double specialPoints = Double.parseDouble(inputArgs[SPECIAL_POINTS_INDEX]);
        int level = Integer.parseInt(inputArgs[LEVEL_INDEX]);

        if (CHARACTER_TYPE_DEMON.equals(characterType)) {

            GameObject newDemon = new Demon(name, specialPoints, level);

            StringBuilder sb = new StringBuilder();
            sb
                    .append("\"")
                    .append(newDemon.getName())
                    .append("\" | \"")
                    .append(newDemon.generateHashPassword())
                    .append("\" -> ")
                    .append(characterType);

            System.out.println(sb.toString());
            System.out.println(specialPoints * level);

        } else if (CHARACTER_TYPE_ARCHANGEL.equals(characterType)) {

            GameObject newArchangel = new Archangel(name, specialPoints, level);

            StringBuilder sb = new StringBuilder();
            sb
                    .append("\"")
                    .append(newArchangel.getName())
                    .append("\" | \"")
                    .append(newArchangel.generateHashPassword())
                    .append("\" -> ")
                    .append(characterType);

            System.out.println(sb);
            System.out.println( Integer.parseInt(inputArgs[2]) * level);
        }
    }
}