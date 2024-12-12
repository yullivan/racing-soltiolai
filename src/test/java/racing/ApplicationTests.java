package racing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static racing.Car.*;
import static racing.GameCount.*;
import static racing.GameResult.*;

class ApplicationTests {

    @Test
    void playersTest() {
        String test = "Hyundai,Porsche,Toyota";

        System.out.println(playerSetting(test));
    }

    @Test
    void rollDiceTest(){
        System.out.println(rollDice());
    }


    @Test
    void oneTurnTest() {
        List<Car> playerList = new ArrayList<>();
        playerList.add(new Car("Hyundai",0));
        playerList.add(new Car("Porsche",0));
        playerList.add(new Car("Toyota",0));

        for (int i = 0; i < 5 ; i++) {
            oneTurn(playerList.get(0));
        }
        System.out.println(playerList.get(0).name+" "+playerList.get(0).move);
    }


}
