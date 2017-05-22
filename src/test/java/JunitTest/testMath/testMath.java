package JunitTest.testMath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 public class testMath {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7, 10);
    }

    @Test
    public void testPositiveNegativeAddition() { 
        math = new Math(7, -3);
        Assert.assertEquals(4, math.add());
    }

    @Test
    public void testNegativePositiveAddition() {
        math = new Math(-7, 14);
        Assert.assertEquals(7, math.add());
    }


    @Test
    public void testNegativeAddition() {
        math = new Math(-7, -3);
        Assert.assertEquals(-10, math.add());
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    } 

    @Test
    public void testMult() {
        Assert.assertEquals(70, math.mult());
    } 
}
