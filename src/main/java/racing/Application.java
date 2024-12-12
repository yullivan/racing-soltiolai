package racing;

import java.util.*;

import static racing.Car.pickWinner;
import static racing.Car.playerSetting;
import static racing.GameCount.oneTurn;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //자동차 이름 입력
        System.out.println("\n레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
        String playerStr = scanner.nextLine();

        System.out.println("\n몇 회 시행할까요?");
        GameCount playerCount = new GameCount(scanner.nextInt());

        System.out.println("");
        //자동차 생성
        List<Car> playerList = playerSetting(playerStr);

        //게임 반복
        for (int i = 0; i < playerCount.count ; i++) {
            System.out.println("("+(i+1)+")");
            for (Car car : playerList) {
                oneTurn(car);
                System.out.println(car.name+" 🚗 "+"-".repeat(car.move));
            }
        }

        //우승자 선정
        System.out.println("");
        System.out.println("우승자는 "+pickWinner(playerList)+"! 🥇");

    }

}
