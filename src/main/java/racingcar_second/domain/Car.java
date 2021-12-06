package racingcar_second.domain;

import java.util.List;

public class Car {
    private final int MOVE_THRESHHOLD = 4;

    private Name name;
    private int position;

    public Car() {
    }

    public Car(Name name, int position) {
        this.name = name;
        this.position = position;
    }

    public List<String> createNameList(String input) {
        Name name = new Name();
        List<String> nameList = name.separateByComma(input);
        return nameList;
    }

    public void drive(int input) {
        if (input < MOVE_THRESHHOLD) {
            throw new IllegalArgumentException();
        }
        if (input >= MOVE_THRESHHOLD) {
            moveForward();
        }
    }
    public void moveForward() {
        position++;
    }
}
