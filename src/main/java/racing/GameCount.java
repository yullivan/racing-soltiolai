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
}
