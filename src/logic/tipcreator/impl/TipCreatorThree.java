package logic.tipcreator.impl;

import logic.tipcreator.TipCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TipCreatorThree implements TipCreator {

    @Override
    public Map<Integer, List<Integer>> createTip(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Map<Integer,List<Integer>> result = new HashMap<>();
        for (int i = 0; i < numberOne; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < numberThree; j++) {
                numbers.add(getRandomNumber(numberTwo));
            }
            result.put(i,numbers);
        }

        return result;
    }
}
