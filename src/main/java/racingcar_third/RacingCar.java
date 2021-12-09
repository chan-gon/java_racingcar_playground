package racingcar_third;

import java.util.Arrays;
import java.util.List;

public class RacingCar {

    private static final int MOVE_THRESHHOLD = 4;

    private String carName;
    private int carPosition;

    public RacingCar() {
    }

    public RacingCar(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
        this.carPosition = 0;
    }

    public void move(int carPosition) {
        if (carPosition >= MOVE_THRESHHOLD) {
            this.carPosition++;
        }
    }

    public List<String> createCarList(String input) {
        return Arrays.asList(input.split(","));
    }

    public int getCarPosition() {
        return carPosition;
    }

    public String getCarName() {
        return carName;
    }

}
