import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UTS {
    public static void main(String[] args) {
        List<Integer> checkPoints = new ArrayList<>();
        int totalDistance = 25;
        int distancePerCheckPoint = 2;

        for (int i = 0; i <= totalDistance; i += distancePerCheckPoint) {
            checkPoints.add(getRandomPrimeNumber());
        }

        System.out.println("Check Points: " + checkPoints);
    }

    public static int getRandomPrimeNumber() {
        int randomInt;
        int MAX_SIZE = 1000000;
        boolean found;
        Random rand = new Random();

        do {
            found = true;
            randomInt = rand.nextInt(MAX_SIZE) + 2; // number 2 or more

            for (int i = 2; i <= Math.sqrt(randomInt); i++) {
                if (randomInt % i == 0) {
                    found = false;
                    break;
                }
            }
        } while (!found);

        return randomInt;
    }
}
