package racingcar_second.domain.exception;

public class EmptyCarNameException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "자동차 이름을 입력해주세요.";
    public EmptyCarNameException() {
        super(ERROR_MESSAGE);
    }
}
