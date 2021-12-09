package racingcar_third.utils;

import java.util.Random;

public class RandomNumUtils {

    public static int generateRandomNum() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
