package racingcar_third.domain;

public class Car {

    private static final int MOVE_THRESHHOLD = 4;
    private static final int MIN_CARNAME_LENGTH = 5;

    private String carName;
    private int carPosition;

    public Car(String carName) {
        if (carName.length() > MIN_CARNAME_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
    }

    public void move(int carStatusNum) {
        if (carStatusNum >= MOVE_THRESHHOLD) {
            this.carPosition++;
        }
    }

    public int getCarPosition() {
        return carPosition;
    }

    public String getCarName() {
        return carName;
    }
}
