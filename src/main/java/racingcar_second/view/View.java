package racingcar_second.view;

import racingcar_second.domain.Car;
import racingcar_second.utils.RandomUtils;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class View {
    private static final String ASK_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String ASK_HOW_MANY = "시도할 회수는 몇회인가요?";

    private List<Car> cars;

    public List<String> inputCarName() {
        System.out.println(ASK_CAR_NAME);
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        return car.createNameList(scanner.next());
    }

    public int inputHowMany() {
        System.out.println(ASK_HOW_MANY);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public List<Car> getMoveableCar() {
        cars.forEach(car -> car.drive(RandomUtils.generateRandomNum()));
        return getCars();
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public void showRaceResult() {

    }

    public void showWinner() {

    }
}
