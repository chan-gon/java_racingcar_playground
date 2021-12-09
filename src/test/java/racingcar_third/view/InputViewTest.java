package racingcar_third.view;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    void 자동차이름_입력_테스트() {
        InputView inputView = new InputView(new Scanner("java1,java2,java3"));
        assertThat(inputView.askCarName()).isEqualTo("java1,java2,java3");
    }

    @Test
    void 횟수_입력_테스트() {
        InputView inputView = new InputView(new Scanner("5"));
        assertThat(inputView.askAttemptNum()).isEqualTo(5);
    }

    @Test
    void 자동차이름_입력_오류_테스트() {
        InputView inputView = new InputView(new Scanner(""));
        assertThatThrownBy(() -> inputView.askCarName())
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void 횟수_입력_오류_테스트() {
        InputView inputView = new InputView(new Scanner("abc"));
        assertThatThrownBy(() -> inputView.askAttemptNum())
                .isInstanceOf(InputMismatchException.class);
    }
}
