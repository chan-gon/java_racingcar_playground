package racingcar;

public class Validator {

    public boolean carNameLengthCheck(String carName) {
        return carName.length() < 6;
    }
}
