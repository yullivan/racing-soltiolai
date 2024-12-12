package racing;

import java.util.*;

public class GameCount {
    int count;

    public GameCount(int count) {
        if(count<0){
            throw new IllegalArgumentException("[ERROR] 실행 횟수는 양수");
        }
        this.count = count;
    }

    public static int rollDice(){
        List<Integer> dice = Arrays.asList(1,2,3,4,5,6);
        Collections.shuffle(dice);
        return dice.get(0);
    }

    public static void oneTurn(Car player){
            if(rollDice()>2) {
                player.move++;
            }
    }


}
