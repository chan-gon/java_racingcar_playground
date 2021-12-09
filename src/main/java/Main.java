import racingcar_third.view.ResultView;

public class Main {
    public static void main(String[] args) {
      /*  InputView inputView = new InputView(new Scanner(System.in));
        RacingController racingController = new RacingController();
        racingController.startGame(inputView.getAskCarNames(), inputView.getAskHowManyTimes());*/

        ResultView resultView = new ResultView();
        resultView.showResult();

    }
}
