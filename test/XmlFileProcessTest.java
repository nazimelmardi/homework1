import org.junit.Assert;
import org.junit.Test;
import util.XmlFileProcess;

import java.util.ArrayList;
import java.util.List;

public class XmlFileProcessTest {

    XmlFileProcess xmlFileProcess = new XmlFileProcess();

    final String TEXT = "<numbers><paramOne>2</paramOne><paramTwo>3</paramTwo><paramThree>10</paramThree></numbers>";

    @Test
    public void testXmlFileReader() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

        //When
        List<Integer> result = xmlFileProcess.getParamNumbers(TEXT);

        //Then
        Assert.assertEquals(result, numbers);
    }
}
