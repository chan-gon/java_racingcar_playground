package racingcar_second.domain.exception;

public class NotMoveableException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "0과 9 사이의 값이어야 합니다.";
    public NotMoveableException() {
        super(ERROR_MESSAGE);
    }
}
