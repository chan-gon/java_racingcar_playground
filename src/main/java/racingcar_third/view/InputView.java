package racingcar_third.view;

import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String askCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();
        return carNames;
    }

    public int askAttemptNum() {
        System.out.println("시도할 회수는 몇회인가요?");
        int attemptNum = scanner.nextInt();
        checkValidAttemptNum(attemptNum);
        return attemptNum;
    }

    private void checkValidAttemptNum(int attemptNum) {
        if (attemptNum == 0) {
            throw new IllegalArgumentException("0회 이상의 시도 회수를 입력하세요.");
        }
    }
}
