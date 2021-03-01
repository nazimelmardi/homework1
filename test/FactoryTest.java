import logic.TipCreatorFactory;
import logic.tipcreator.TipCreator;
import logic.tipcreator.impl.TipCreatorOne;
import logic.tipcreator.impl.TipCreatorThree;
import logic.tipcreator.impl.TipCreatorTwo;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    TipCreatorFactory tipCreatorFactory = new TipCreatorFactory();

    @Test
    public void testFactoryTypes() {
        //Given
        int type1 = 1;
        int type2 = 2;
        int type3 = 3;

        //When
        TipCreator tipCreatorOne = tipCreatorFactory.getTipCreator(type1);
        TipCreator tipCreatorTwo = tipCreatorFactory.getTipCreator(type2);
        TipCreator tipCreatorThree = tipCreatorFactory.getTipCreator(type3);

        //Then
        Assert.assertTrue(tipCreatorOne instanceof TipCreatorOne);
        Assert.assertTrue(tipCreatorTwo instanceof TipCreatorTwo);
        Assert.assertTrue(tipCreatorThree instanceof TipCreatorThree);
    }
}
