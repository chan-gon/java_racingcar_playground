package racingcar_third.controller;

import racingcar_third.domain.RacingCars;
import racingcar_third.view.InputView;
import racingcar_third.view.ResultView;

import java.util.Scanner;

public class RaceController {

    public void startGame() {
        InputView inputView = new InputView(new Scanner(System.in));
        ResultView resultView = new ResultView();

        String carNames = inputView.askCarName();
        RacingCars cars = new RacingCars(carNames.split(","));

        int cnt = inputView.askAttemptNum();

        System.out.println("실행 결과");

        for (int i = 0; i < cnt; i++) {
            cars.move();
            resultView.printCarPosition(cars.getCars());
        }
        resultView.printWinner(cars.getWinners());
    }
}
