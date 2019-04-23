import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class ArraysTest {

    private Array2 arrayTest;
    @Before
    public void setup(){
        this.arrayTest = new Array2();
    }


    @Test
    public void firstLastTest(){
        Integer inputValue = 6;
        Integer[] inputArray = {1,2,6};

        Boolean actual = arrayTest.firstLast(inputValue, inputArray);
        System.out.println(actual);
        Assert.assertTrue(actual);
    }


    @Test
    public void midThree3(){
        Integer[] inputArray = {8, 6, 7, 5, 3, 0, 9};
        Integer[] expected = {7, 5,3};
        Integer[] actual = arrayTest.middleThree(inputArray);
        System.out.println(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test

    public void middleWayTest3(){
        Integer[] inputArray1 = {5,6,7,4,5};
        Integer[] inputArray2 = {2,33,4,5,5};
        Integer[] expected = {7,4};
        System.out.println(expected);
        Integer[] actual = arrayTest.middleWay(inputArray1, inputArray2);
        System.out.println(actual);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test

    public void middlewatTest1(){

        Integer[] inputarray1test = {1, 2, 3};
        Integer[] inputarray2test = {2, 3, 4, 5};

        Integer[] expected = {2,7};
        System.out.println(expected);

        Integer[] actual = arrayTest.middleWay(inputarray1test, inputarray2test);
        //System.out.println(actual);
        Assert.assertArrayEquals(expected,actual);

        }


     @Test
    public void searchTest(){

        LinearSearch1 search1 = new LinearSearch1();

        int arr[] = {4,7,9,2,4};
        int x = 3;
        int expected = -1;
        int result = search1.search(arr, x);

        Assert.assertEquals(expected, result);
         System.out.println(result);

     }

//    @Test
//    public void arrayArrangeTest(){
//
//        LinearSearch1 search1 = new LinearSearch1();
//
//        int arr[] = { 2, 5, -55, 8, -72, -1, 53 };
//        int expected[] = { -72, -55, -1, 2, 5, 8, 53 };
//        int result[] = search1.sortArray(arr);
//
//        Assert.assertArrayEquals(expected, result);
//        //System.out.println(result);
//
//    }




    @Test
    public void arrayArrangeTest(){

        LinearSearch1 search1 = new LinearSearch1();

        int arr[] = { 2, 5, -55, 8, -72, -1, 53 };

        int expected []= { -55, -72, -1, 2, 5, 8, 53 };
        //int expected []= { -72, -55, -1, 2, 5, 8, 53 };
        int result[] = search1.rearrange(arr);

        Assert.assertArrayEquals(expected, result);
        System.out.println(result.toString());
      //  System.out.println(Arrays.toString(a));
        //System.out.println(result);

    }


}







