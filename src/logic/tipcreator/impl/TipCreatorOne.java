package logic.tipcreator.impl;

import logic.tipcreator.TipCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TipCreatorOne implements TipCreator {
    @Override
    public Map<Integer, List<Integer>> createTip(Integer number1, Integer number2, Integer number3) {
        List<Integer> numbers = new ArrayList<>();
        Map<Integer, List<Integer>> result = new HashMap<>();
        for (int i = 0; i < number2; i++) {
            numbers.add(getRandomNumber(number1));
        }
        result.put(0,numbers);
        return result;
    }
}
