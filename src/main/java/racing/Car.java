package racing;

import java.util.*;

import static racing.GameResult.*;

public class Car {
    String name;
    GameResult result;

    public Car(String name, GameResult result) {
        if(name.length()>10){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10자 이하");
        }
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public GameResult getResult() {
        return result;
    }

    public List<Car> players(String input){
        String[] test = input.split(",");
        List<Car> result = new ArrayList<>();
        for (String car : test) {
            result.add(new Car(car, LOSE));
        }
        return result;
    }
}
