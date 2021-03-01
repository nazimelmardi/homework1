package logic.tipcreator.impl;

import logic.tipcreator.TipCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TipCreatorTwo implements TipCreator {

    @Override
    public Map<Integer, List<Integer>> createTip(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Map<Integer,List<Integer>> result = new HashMap<>();
        for (int i = 0; i < numberOne; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < numberTwo; j++) {
                numbers.add(getRandomNumber(90));
            }
            result.put(i,numbers);
        }

        return result;
    }
}
