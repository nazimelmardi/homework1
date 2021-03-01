package logic;

import logic.tipcreator.TipCreator;
import logic.tipcreator.impl.TipCreatorOne;
import logic.tipcreator.impl.TipCreatorThree;
import logic.tipcreator.impl.TipCreatorTwo;

public class TipCreatorFactory {

    public static TipCreator getTipCreator(int type) {
        if (type == 1) {
            return new TipCreatorOne();
        }
        if (type == 2) {
            return new TipCreatorTwo();
        }
        if (type == 3) {
            return new TipCreatorThree();
        }
        return null;
    }
}
