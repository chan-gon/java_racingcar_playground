package racingcar_third.domain;

import java.util.Objects;

public class RacingCar {

    private static final int MOVE_THRESHHOLD = 4;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 9;

    private String carName;
    private int carPosition;

    public RacingCar(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
        this.carPosition = 0;
    }

    public void moveForward(int carPosition) {
        checkRandom(carPosition);
        if (isMovable(carPosition)) {
            this.carPosition++;
        }
    }

    public boolean isMovable(int carPosition) {
        return carPosition >= MOVE_THRESHHOLD;
    }

    private void checkRandom(int rand) {
        if (rand < MIN_VALUE || rand > MAX_VALUE) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isSamePosition(RacingCar other) {
        return this.getCarPosition() == other.getCarPosition();
    }

    public int getCarPosition() {
        return carPosition;
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar racingCar = (RacingCar) o;
        return carPosition == racingCar.carPosition && Objects.equals(carName, racingCar.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carPosition);
    }
}
