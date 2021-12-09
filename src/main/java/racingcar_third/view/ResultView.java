package racingcar_third.view;

import racingcar_third.domain.RacingCar;
import racingcar_third.utils.RandomNumUtils;

import java.util.List;
import java.util.Scanner;

public class ResultView {

    public void showResult() {
        RacingCar racingCar = new RacingCar();
        InputView inputView = new InputView(new Scanner(System.in));

        List<String> carList = racingCar.createCarList(inputView.askCarName());
        System.out.println("carlist = " + carList);
        int cnt = inputView.askAttemptNum();
        String moveMark = "-";
        System.out.println("실행 결과");
        for (int i = 0; i < carList.size(); i++) {
            racingCar.move(RandomNumUtils.generateRandomNum());
            System.out.println(racingCar.getCarName() + " : " + moveMark);
            moveMark += "-";
            if (racingCar.getCarPosition() == moveMark.length()) {
                System.out.println(racingCar.getCarName() + "가 최종 우승했습니다.");
            }
        }
    }
}
