package racingcar_second.domain.exception;

public class MoveThreshHoldException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "값이 4 이상일 경우에만 움직입니다.";
    public MoveThreshHoldException() {
        super(ERROR_MESSAGE);
    }
}
