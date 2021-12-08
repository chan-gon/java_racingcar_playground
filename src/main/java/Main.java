import racingcar_third.controller.CarController;
import racingcar_third.view.InputView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  InputView inputView = new InputView(new Scanner(System.in));
        RacingController racingController = new RacingController();
        racingController.startGame(inputView.getAskCarNames(), inputView.getAskHowManyTimes());*/

        InputView inputView = new InputView(new Scanner(System.in));
        CarController controller = new CarController();
        controller.startGame(inputView.askCarNames(), inputView.askAttemptNum());

    }
}
