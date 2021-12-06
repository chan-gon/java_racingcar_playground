import racingcar_second.controller.RacingController;
import racingcar_second.view.InputView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView(new Scanner(System.in));
        RacingController racingController = new RacingController();
        racingController.startGame(inputView.getAskCarNames(), inputView.getAskHowManyTimes());
    }
}
