package p03_CarShopExtended;

import p03_CarShopExtended.contracts.Car;
import p03_CarShopExtended.contracts.Rentable;
import p03_CarShopExtended.contracts.Sellable;
import p03_CarShopExtended.model.Audi;
import p03_CarShopExtended.model.Seat;

public class Main {


    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("Leon", "Gray", 110, "Spain", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }
}
