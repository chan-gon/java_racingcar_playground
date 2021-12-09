package racingcar_third.domain;

import java.util.Arrays;
import java.util.List;

public class RacingCar {

    private static final int MOVE_THRESHHOLD = 4;

    private List<String> carName;
    private int carPosition;

    public RacingCar() {
    }

    public RacingCar(List<String> carName) {
        if (carName.size() > 5) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
        this.carPosition = 0;
    }

    public void move(int carPosition) {
        if (isMovable(carPosition)) {
            this.carPosition++;
        }
    }

    public boolean isMovable(int carPosition) {
        return carPosition >= MOVE_THRESHHOLD;
    }

    public List<String> createCarList(String input) {
        this.carName = Arrays.asList(input.split(","));
        return carName;
    }

    public int getCarPosition() {
        return carPosition;
    }
    public List<String> getCarName() {
        return carName;
    }
}
