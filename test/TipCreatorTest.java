import logic.tipcreator.impl.TipCreatorOne;
import logic.tipcreator.impl.TipCreatorThree;
import logic.tipcreator.impl.TipCreatorTwo;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TipCreatorTest {

    TipCreatorOne tipCreatorOne = new TipCreatorOne();
    TipCreatorTwo tipCreatorTwo = new TipCreatorTwo();
    TipCreatorThree tipCreatorThree = new TipCreatorThree();

    @Test
    public void testTipCreatorOne() {
        //Given
        Map<Integer, List<Integer>> result = new HashMap<>();

        //When
        result = tipCreatorOne.createTip(80,5,null);

        //Then
        List<Integer> value = result.get(1);
        Assert.assertTrue(value.size() == 5);
        Assert.assertTrue(value.get(0) <81);
    }

    @Test
    public void testTipCreatorTwo() {
        //Given
        Map<Integer, List<Integer>> result = new HashMap<>();

        //When
        result = tipCreatorTwo.createTip(3,5,null);

        //Then
        List<Integer> value = result.get(0);
        Assert.assertTrue(result.size() == 3);
        Assert.assertTrue(value.size() == 5);
        Assert.assertTrue(value.get(0) < 91);
    }

    @Test
    public void testTipCreatorThree() {
        //Given
        Map<Integer, List<Integer>> result = new HashMap<>();

        //When
        result = tipCreatorThree.createTip(3,80,5);

        //Then
        List<Integer> value = result.get(0);
        Assert.assertTrue(value.size() == 5);
        Assert.assertTrue(value.get(0) < 81);
        Assert.assertTrue(result.size() == 3);
    }
}
