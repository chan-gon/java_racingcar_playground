package racingcar_third.view;

import racingcar_third.domain.RacingCar;
import racingcar_third.utils.RandomNumUtils;

import java.util.Scanner;

public class ResultView {

    InputView inputView = new InputView(new Scanner(System.in));

    public void showResult() {
        RacingCar racingCar = new RacingCar();
        racingCar.createCarList(inputView.askCarName());
        System.out.println("racingcar = " + racingCar.getCarName());
        int cnt = inputView.askAttemptNum();

        System.out.println("실행 결과");

        for (int i = 0; i < cnt; i++) {
            racingCar.move(RandomNumUtils.generateRandomNum());
            System.out.println(racingCar.getCarName() + " : " + showCarPosition(racingCar.getCarPosition()));
        }
        StringBuilder sb = new StringBuilder();
        if (racingCar.getCarPosition() == cnt) {
            sb.append(String.join(",", racingCar.getCarName()));
        }
        System.out.println(sb.toString() + "가 최종 우승했습니다.");
    }

    private String showCarPosition(int carPosition) {
        String moveStr = "";
        for (int i = 0; i < carPosition; i++) {
            moveStr += "-";
        }
        return moveStr;
    }
}
