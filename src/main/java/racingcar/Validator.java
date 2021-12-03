package racingcar;

public class Validator {

    public boolean carNameLengthCheck(String carName) {
        if (carName.length() > 6) {
            throw new IllegalArgumentException();
        }
        return carName.length() < 6;
    }
}
