package p05_RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randArr = new RandomArrayList();
        for (int i = 0; i < 1000; i++) {
            randArr.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("removed = " + randArr.getRandomElement() + "; remaining elements = " + randArr.size());
        }

    }
}
