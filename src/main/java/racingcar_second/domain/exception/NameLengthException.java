package racingcar_second.domain.exception;

public class NameLengthException extends NameException {

    private static final String ERROR_MESSAGE = "자동차 이름은 5글자를 초과할 수 없습니다.";

    public NameLengthException() {
        super(ERROR_MESSAGE);
    }
}
