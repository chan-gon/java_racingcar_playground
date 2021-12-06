package racingcar_second.domain;

import racingcar_second.domain.exception.NameLengthException;
import racingcar_second.domain.exception.NotMoveableException;

public class Car {
    private final int MOVE_THRESHHOLD = 4;
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 10;

    private String name;
    private int position;

    public Car(String name) {
        if (name.length() > 5) {
            throw new NameLengthException();
        }
        this.name = name;
    }

    public void moveForward(int randomNumber) {
        if (isDrivable(randomNumber) && isValidRandom(randomNumber)) {
            position++;
        }
    }

    public boolean isDrivable(int input) {
        return input >= MOVE_THRESHHOLD;
    }

    public boolean isValidRandom(int input) {
        if (input < MIN_VALUE || input > MAX_VALUE) {
            throw new NotMoveableException();
        }
        return input > MIN_VALUE || input < MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
