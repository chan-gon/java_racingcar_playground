package racingcar_second.view;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {

    @Test
    void 자동차이름_입력_테스트() {
        InputView inputView = new InputView(new Scanner("java1,java2"));
        String carNames = inputView.getAskCarNames();
        assertThat(carNames).isEqualTo("java1,java2");
    }

    @Test
    void 시도회수_입력_테스트() {
        InputView inputView = new InputView(new Scanner("5"));
        int cnt = inputView.getAskHowManyTimes();
        assertThat(cnt).isEqualTo(5);
    }

}