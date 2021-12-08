package racingcar_third.view;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    void 자동차이름_정상_입력_테스트() throws NoSuchFieldException {
        InputView inputView = new InputView(new Scanner("java1,java2"));
        assertThat(inputView.askCarNames()).isEqualTo("java1,java2");
    }

    @Test
    void 횟수_정상_입력_테스트() {
        InputView inputView = new InputView(new Scanner("2"));
        assertThat(inputView.askAttemptNum()).isEqualTo(2);
    }

    @Test
    void 자동차이름_비정상_입력_예외_테스트() {
        InputView inputView = new InputView(new Scanner(""));
        assertThatThrownBy(() -> inputView.askCarNames()).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void 횟수_비정상_입력_예외_테스트() {
        InputView inputView = new InputView(new Scanner("0"));
        assertThatThrownBy(() -> inputView.askAttemptNum()).isInstanceOf(IllegalArgumentException.class);
    }
}
