import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeneralStringTest {


        private Strings1 stringtesting;

        @Before

        public  void setup() {

            this.stringtesting = new Strings1();
        }
        @Test
        public void sumLimitTest(){
            Strings1 sumLimittest = new Strings1();

            int a=2; int b=13;
            int expected = 2;

            int actual = stringtesting.sumlimit(a,b);
            System.out.println(actual);

            Assert.assertEquals(expected, actual);
        }


        @Test
    public void fizzString2Test(){
            Strings1 fizzttest = new Strings1();

         Assert.assertEquals("1!", fizzttest.fizzString2(1));
        }


@Test
    public void fizzTest(){
    Strings1 fizzttest = new Strings1();
    Assert.assertEquals("Fizz", fizzttest.fizzString2(3));
    System.out.println(fizzttest.fizzString2(3));

}


   @Test
    public void fizzTest1(){
        Strings1 fizzttest = new Strings1();
        Assert.assertEquals("Buzz!", fizzttest.fizzString2(5));
        System.out.println(fizzttest.fizzString2(5));

    }

    @Test
    public void lastDigitTest(){

            Strings1 lastdigittest = new Strings1();
            Assert.assertTrue(lastdigittest.lastdigit(20,33,50));
        System.out.println(lastdigittest.lastdigit(20,33,50));
    }
    }

