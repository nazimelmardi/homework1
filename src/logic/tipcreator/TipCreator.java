package logic.tipcreator;

import java.util.List;
import java.util.Map;
import java.util.Random;

public interface TipCreator {

    Map<Integer, List<Integer>> createTip(Integer numberOne, Integer numberTwo, Integer numberThree);

    default Integer getRandomNumber(Integer max) {
        Random random = new Random();
        return random.ints(1, max)
                .findFirst()
                .getAsInt();
    }
}
