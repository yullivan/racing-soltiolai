package racing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static racing.Car.*;
import static racing.GameResult.*;

class ApplicationTests {

    @Test
    void playersTest() {
        String test = "Hyundai,Porsche,Toyota";

        System.out.println(players(test));
    }

}
