package racingcar;

import java.util.List;
import java.util.Scanner;

public class PlayGame {

    Car car = new Car();
    Validator validator = new Validator();

    /*
    * 211203
    * - 현재 메소드는 두 개 이상 입력하면 하나씩 수행함. 동시에 수행되도록 수정해야 한다.
    * -
    * */
    public void playGame() {
        askCarName().stream()
                .forEach(result -> System.out.println("실행 결과\n" + result + " : " + car.getRacingByLength(askHowMany())));
    }

    public List<String> askCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<String> carList = car.seperateCarName(input);
        return carList;
    }

    public int askHowMany() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
