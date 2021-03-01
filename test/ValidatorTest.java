import org.junit.Assert;
import org.junit.Test;
import util.XmlValidator;

public class ValidatorTest {
    XmlValidator validator = new XmlValidator();

    @Test
    public void testNormal() {
        Assert.assertTrue(validator.isValid("<a></a>"));
    }

    @Test
    public void testTwo() {
        Assert.assertTrue(validator.isValid("<a></a><b></b>"));
    }

    @Test
    public void testEmbedded() {
        Assert.assertTrue(validator.isValid("<a><b></b></a>"));
    }

    @Test
    public void testTwoEmbedded() {
        Assert.assertTrue(validator.isValid("<a><b><c></c><d></d></b></a>"));
    }

    @Test
    public void testInvalid0() {
        Assert.assertFalse(validator.isValid("<a><"));
    }

    @Test
    public void testInvalid1() {
        Assert.assertFalse(validator.isValid("<a>"));
    }

    @Test
    public void testInvalid2() {
        Assert.assertFalse(validator.isValid("<a></"));
    }

    @Test
    public void testInvalid3() {
        Assert.assertFalse(validator.isValid("<a></a"));
    }

    @Test
    public void testInvalid4() {
        Assert.assertFalse(validator.isValid("<a></b>"));
    }

    @Test
    public void testInvalid5() {
        Assert.assertFalse(validator.isValid("<a><b></a>"));
    }
}
