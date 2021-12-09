package racingcar_third.view;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String askCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carName = scanner.nextLine();
        if (carName.isEmpty()) {
            throw new NoSuchElementException();
        }
        return carName;
    }

    public int askAttemptNum() {
        System.out.println("시도할 회수는 몇회인가요?");
        int attemptNum = scanner.nextInt();
        if (attemptNum <= 0) {
            throw new InputMismatchException("숫자만 입력하세요.");
        }
        return attemptNum;
    }
}
