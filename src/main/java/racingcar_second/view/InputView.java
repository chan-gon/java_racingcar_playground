package racingcar_second.view;

import racingcar_second.domain.exception.EmptyCarNameException;

import java.util.Scanner;

public class InputView {

    private static final String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String ASK_HOW_MANY_TIMES = "시도할 회수는 몇회인가요?";

    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getAskCarNames() {
        System.out.println(ASK_CAR_NAMES);
        String carNames = scanner.nextLine();
        isCarNameEmptyOrNot(carNames);
        return scanner.next();
    }

    private void isCarNameEmptyOrNot(String carNames) {
        if (carNames.isEmpty()) {
            throw new EmptyCarNameException();
        }
    }

    public int getAskHowManyTimes() {
        System.out.println(ASK_HOW_MANY_TIMES);
        int counts = scanner.nextInt();
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        return counts;
    }
}
