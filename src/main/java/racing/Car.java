package racing;

import java.util.*;


public class Car {
    String name;
    int move;

    public Car(String name, int move) {
        if(name.length()>10){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10자 이하");
        }
        this.name = name;
        this.move = move;
    }

    @Override
    public String toString() {
        return "" + name;
    }

    public String getName() {
        return name;
    }

    public static List<Car> playerSetting(String input){
        String[] test = input.split(",");
        List<Car> result = new ArrayList<>();
        for (String car : test) {
            result.add(new Car(car,0));
        }
        return result;
    }

    public static List<Car> pickWinner(List<Car> players){
        List<Car> winners = new ArrayList<>();
        int maxMove = players.get(0).move;
        for (Car player : players) {
            if(player.move>maxMove){
                winners.clear();
                winners.add(player);
            } if(player.move==maxMove){
                winners.add(player);
            }
        }
        return winners;
    }
}
