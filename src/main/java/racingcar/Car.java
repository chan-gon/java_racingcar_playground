package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    public List<String> seperateCarName(String input) {
        List<String> carNames = Arrays.asList(input.split(","));
        return carNames;
    }

    public String getRacingByLength(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
